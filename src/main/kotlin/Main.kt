fun main(){
  printWords("akirachix")
   ageName("chris", 12)
    takeString("lenghty")
    printName("Chris")
}
fun printWords(name: String){
//  println(name[7])
}
fun ageName(name:String, age:Int){
    var name = "chris"
    var age = 12
    var sentence = "Hi, my name is $name and I am $age years old"
    println(sentence)

}
fun takeString(name:String):Int {
    var length = name.length
    return length

}
fun printName(name:String){
    if (name == "Waluse"){
        println("Thats me")
    }else{
        println("I don't know who that is")
    }
}