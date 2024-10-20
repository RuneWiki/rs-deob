package deob;

@ObfuscatedName("du")
public class class116 extends class29 {

    @ObfuscatedName("du.t")
    public long field1555 = System.nanoTime();

    @ObfuscatedName("du.t(I)V")
    public void method360() {
        this.field1555 = System.nanoTime();
    }

    @ObfuscatedName("du.n(III)I")
    public int method361(int arg0, int arg1) {
        long var3 = (long) arg1 * 1000000L;
        long var5 = this.field1555 - System.nanoTime();
        if (var5 < var3) {
            var5 = var3;
        }
        Statics.method101(var5 / 1000000L);
        long var7 = System.nanoTime();
        int var9 = 0;
        while (var9 < 10 && (var9 < 1 || this.field1555 < var7)) {
            var9++;
            this.field1555 += (long) arg0 * 1000000L;
        }
        if (this.field1555 < var7) {
            this.field1555 = var7;
        }
        return var9;
    }
}
