package deob;

@ObfuscatedName("dj")
public class class115 extends class117 {

    // $FF: synthetic field
    public final class120 this$0;

    @ObfuscatedName("dj.l")
    public long field1372;

    @ObfuscatedName("dj.q")
    public String field1371;

    public class115(class120 arg0) {
        this.this$0 = arg0;
        this.field1372 = -1L;
        this.field1371 = null;
    }

    @ObfuscatedName("dj.l(Lot;I)V")
    public void method2365(class401 arg0) {
        if (arg0.method6272() != 255) {
            arg0.field4292--;
            this.field1372 = arg0.method6275();
        }
        this.field1371 = arg0.method6280();
    }

    @ObfuscatedName("dj.q(Ldk;I)V")
    public void method2366(class128 arg0) {
        arg0.method2475(this.field1372, this.field1371, 0);
    }
}
