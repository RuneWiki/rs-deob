package deob;

@ObfuscatedName("dy")
public class class128 extends class136 {

    @ObfuscatedName("dy.f")
    public long field1481 = System.nanoTime();

    @ObfuscatedName("dy.f(B)V")
    public void method2316() {
        this.field1481 = System.nanoTime();
    }

    @ObfuscatedName("dy.e(IIB)I")
    public int method2318(int arg0, int arg1) {
        long var3 = (long) arg1 * 1000000L;
        long var5 = this.field1481 - System.nanoTime();
        if (var5 < var3) {
            var5 = var3;
        }
        class382.method169(var5 / 1000000L);
        long var7 = System.nanoTime();
        int var9 = 0;
        while (var9 < 10 && (var9 < 1 || this.field1481 < var7)) {
            var9++;
            this.field1481 += (long) arg0 * 1000000L;
        }
        if (this.field1481 < var7) {
            this.field1481 = var7;
        }
        return var9;
    }
}
