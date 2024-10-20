package deob;

@ObfuscatedName("db")
public class class127 extends class129 {

    // $FF: synthetic field
    public final class132 this$0;

    @ObfuscatedName("db.v")
    public long field1512;

    @ObfuscatedName("db.c")
    public String field1509;

    public class127(class132 arg0) {
        this.this$0 = arg0;
        this.field1512 = -1L;
        this.field1509 = null;
    }

    @ObfuscatedName("db.v(Lpi;I)V")
    public void method2678(class438 arg0) {
        if (arg0.method6971() != 255) {
            arg0.field4621--;
            this.field1512 = arg0.method7003();
        }
        this.field1509 = arg0.method6980();
    }

    @ObfuscatedName("db.c(Lex;S)V")
    public void method2679(class140 arg0) {
        arg0.method2734(this.field1512, this.field1509, 0);
    }
}
