package org.tiagooliveira.answerme

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import kotlin.random.Random


class MainActivity : AppCompatActivity() {

    val res = arrayOf("Yes","Of course not","Maybe")
    val random = Random.Default


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button.setOnClickListener {
            if (editTextText.text.isEmpty()) {
                textView.text = "Ask your question"
            } else {
                val index = random.nextInt(3)
                textView.text = res[index]
            }
            }
        }
    }
