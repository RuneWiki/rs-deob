package deob;

@ObfuscatedName("dg")
public class class125 extends class127 {

    // $FF: synthetic field
    public final class130 this$0;

    @ObfuscatedName("dg.c")
    public long field1512;

    @ObfuscatedName("dg.l")
    public String field1511;

    public class125(class130 arg0) {
        this.this$0 = arg0;
        this.field1512 = -1L;
        this.field1511 = null;
    }

    @ObfuscatedName("dg.c(Lpi;I)V")
    public void method2583(class421 arg0) {
        if (arg0.method6686() != 255) {
            arg0.field4512--;
            this.field1512 = arg0.method6670();
        }
        this.field1511 = arg0.method6721();
    }

    @ObfuscatedName("dg.l(Ley;I)V")
    public void method2576(class138 arg0) {
        arg0.method2648(this.field1512, this.field1511, 0);
    }
}
