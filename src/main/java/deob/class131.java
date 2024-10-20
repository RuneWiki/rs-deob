package deob;

@ObfuscatedName("ek")
public class class131 extends class117 {

    @ObfuscatedName("ek.z")
    public long field2060 = System.nanoTime();

    @ObfuscatedName("ek.z(B)V")
    public void method2471() {
        this.field2060 = System.nanoTime();
    }

    @ObfuscatedName("ek.n(IIB)I")
    public int method2478(int arg0, int arg1) {
        long var3 = (long) arg1 * 1000000L;
        long var5 = this.field2060 - System.nanoTime();
        if (var5 < var3) {
            var5 = var3;
        }
        class111.method1306(var5 / 1000000L);
        long var7 = System.nanoTime();
        int var9 = 0;
        while (var9 < 10 && (var9 < 1 || this.field2060 < var7)) {
            var9++;
            this.field2060 += (long) arg0 * 1000000L;
        }
        if (this.field2060 < var7) {
            this.field2060 = var7;
        }
        return var9;
    }
}
