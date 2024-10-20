package deob;

@ObfuscatedName("el")
public class class131 extends class117 {

    @ObfuscatedName("el.m")
    public long field2042 = System.nanoTime();

    @ObfuscatedName("el.k(B)V")
    public void method2445() {
        this.field2042 = System.nanoTime();
    }

    @ObfuscatedName("el.y(III)I")
    public int method2446(int arg0, int arg1) {
        long var3 = (long) arg1 * 1000000L;
        long var5 = this.field2042 - System.nanoTime();
        if (var5 < var3) {
            var5 = var3;
        }
        class111.method59(var5 / 1000000L);
        long var7 = System.nanoTime();
        int var9 = 0;
        while (var9 < 10 && (var9 < 1 || this.field2042 < var7)) {
            var9++;
            this.field2042 += (long) arg0 * 1000000L;
        }
        if (this.field2042 < var7) {
            this.field2042 = var7;
        }
        return var9;
    }
}
