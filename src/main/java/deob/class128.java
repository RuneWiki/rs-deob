package deob;

@ObfuscatedName("dd")
public class class128 extends class130 {

    // $FF: synthetic field
    public final class133 this$0;

    @ObfuscatedName("dd.c")
    public long field1554;

    @ObfuscatedName("dd.p")
    public String field1553;

    public class128(class133 arg0) {
        this.this$0 = arg0;
        this.field1554 = -1L;
        this.field1553 = null;
    }

    @ObfuscatedName("dd.c(Lqq;B)V")
    public void method2833(class445 arg0) {
        if (arg0.method7196() != 255) {
            arg0.field4735--;
            this.field1554 = arg0.method7319();
        }
        this.field1553 = arg0.method7205();
    }

    @ObfuscatedName("dd.p(Led;I)V")
    public void method2837(class141 arg0) {
        arg0.method2887(this.field1554, this.field1553, 0);
    }
}
