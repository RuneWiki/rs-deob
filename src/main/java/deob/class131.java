package deob;

@ObfuscatedName("ee")
public class class131 extends class130 {

    // $FF: synthetic field
    public final class133 this$0;

    @ObfuscatedName("ee.c")
    public int field1570;

    @ObfuscatedName("ee.p")
    public boolean field1565;

    public class131(class133 arg0) {
        this.this$0 = arg0;
        this.field1570 = -1;
    }

    @ObfuscatedName("ee.c(Lqq;B)V")
    public void method2833(class445 arg0) {
        this.field1570 = arg0.method7198();
        this.field1565 = arg0.method7196() == 1;
    }

    @ObfuscatedName("ee.p(Led;I)V")
    public void method2837(class141 arg0) {
        arg0.method2940(this.field1570, this.field1565);
    }
}
