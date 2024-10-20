package deob;

@ObfuscatedName("dy")
public class class130 extends class129 {

    // $FF: synthetic field
    public final class132 this$0;

    @ObfuscatedName("dy.v")
    public int field1527;

    @ObfuscatedName("dy.c")
    public boolean field1523;

    public class130(class132 arg0) {
        this.this$0 = arg0;
        this.field1527 = -1;
    }

    @ObfuscatedName("dy.v(Lpi;I)V")
    public void method2678(class438 arg0) {
        this.field1527 = arg0.method7148();
        this.field1523 = arg0.method6971() == 1;
    }

    @ObfuscatedName("dy.c(Lex;S)V")
    public void method2679(class140 arg0) {
        arg0.method2802(this.field1527, this.field1523);
    }
}
