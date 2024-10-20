package deob;

@ObfuscatedName("dl")
public class class115 extends class117 {

    // $FF: synthetic field
    public final class120 this$0;

    @ObfuscatedName("dl.n")
    public long field1372;

    @ObfuscatedName("dl.c")
    public String field1371;

    public class115(class120 arg0) {
        this.this$0 = arg0;
        this.field1372 = -1L;
        this.field1371 = null;
    }

    @ObfuscatedName("dl.n(Lot;I)V")
    public void method2345(class400 arg0) {
        if (arg0.method6217() != 255) {
            arg0.field4272--;
            this.field1372 = arg0.method6223();
        }
        this.field1371 = arg0.method6198();
    }

    @ObfuscatedName("dl.c(Ldi;I)V")
    public void method2348(class128 arg0) {
        arg0.method2389(this.field1372, this.field1371, 0);
    }
}
