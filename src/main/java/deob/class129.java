package deob;

@ObfuscatedName("dd")
public class class129 extends class137 {

    @ObfuscatedName("dd.s")
    public long field1461 = System.nanoTime();

    @ObfuscatedName("dd.s(I)V")
    public void method2281() {
        this.field1461 = System.nanoTime();
    }

    @ObfuscatedName("dd.t(III)I")
    public int method2283(int arg0, int arg1) {
        long var3 = (long) arg1 * 1000000L;
        long var5 = this.field1461 - System.nanoTime();
        if (var5 < var3) {
            var5 = var3;
        }
        class383.method3882(var5 / 1000000L);
        long var7 = System.nanoTime();
        int var9 = 0;
        while (var9 < 10 && (var9 < 1 || this.field1461 < var7)) {
            var9++;
            this.field1461 += (long) arg0 * 1000000L;
        }
        if (this.field1461 < var7) {
            this.field1461 = var7;
        }
        return var9;
    }
}
