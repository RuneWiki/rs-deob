package deob;

@ObfuscatedName("dj")
public class class127 extends class135 {

    @ObfuscatedName("dj.f")
    public long field1465 = System.nanoTime();

    @ObfuscatedName("dj.f(S)V")
    public void method2208() {
        this.field1465 = System.nanoTime();
    }

    @ObfuscatedName("dj.o(III)I")
    public int method2209(int arg0, int arg1) {
        long var3 = (long) arg1 * 1000000L;
        long var5 = this.field1465 - System.nanoTime();
        if (var5 < var3) {
            var5 = var3;
        }
        class380.method4072(var5 / 1000000L);
        long var7 = System.nanoTime();
        int var9 = 0;
        while (var9 < 10 && (var9 < 1 || this.field1465 < var7)) {
            var9++;
            this.field1465 += (long) arg0 * 1000000L;
        }
        if (this.field1465 < var7) {
            this.field1465 = var7;
        }
        return var9;
    }
}
