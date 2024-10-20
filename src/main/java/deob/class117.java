package deob;

@ObfuscatedName("do")
public class class117 extends class30 {

    @ObfuscatedName("do.q")
    public long field1571 = System.nanoTime();

    @ObfuscatedName("do.q(I)V")
    public void method352() {
        this.field1571 = System.nanoTime();
    }

    @ObfuscatedName("do.l(IIB)I")
    public int method353(int arg0, int arg1) {
        long var3 = (long) arg1 * 1000000L;
        long var5 = this.field1571 - System.nanoTime();
        if (var5 < var3) {
            var5 = var3;
        }
        class68.method86(var5 / 1000000L);
        long var7 = System.nanoTime();
        int var9 = 0;
        while (var9 < 10 && (var9 < 1 || this.field1571 < var7)) {
            var9++;
            this.field1571 += (long) arg0 * 1000000L;
        }
        if (this.field1571 < var7) {
            this.field1571 = var7;
        }
        return var9;
    }
}
