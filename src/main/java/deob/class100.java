package deob;

@ObfuscatedName("ce")
public class class100 extends class110 {

    @ObfuscatedName("ce.k")
    public long[] field1648 = new long[10];

    @ObfuscatedName("ce.y")
    public int field1642 = 256;

    @ObfuscatedName("ce.o")
    public int field1644 = 1;

    @ObfuscatedName("ce.r")
    public long field1645 = class163.method225();

    @ObfuscatedName("ce.w")
    public int field1646 = 0;

    @ObfuscatedName("ce.j")
    public int field1651;

    public class100() {
        for (int var1 = 0; var1 < 10; var1++) {
            this.field1648[var1] = this.field1645;
        }
    }

    @ObfuscatedName("ce.k(I)V")
    public void method1808() {
        for (int var1 = 0; var1 < 10; var1++) {
            this.field1648[var1] = 0L;
        }
    }

    @ObfuscatedName("ce.y(IIB)I")
    public int method1807(int arg0, int arg1) {
        int var3 = this.field1642;
        int var4 = this.field1644;
        this.field1642 = 300;
        this.field1644 = 1;
        this.field1645 = class163.method225();
        if (this.field1648[this.field1651] == 0L) {
            this.field1642 = var3;
            this.field1644 = var4;
        } else if (this.field1645 > this.field1648[this.field1651]) {
            this.field1642 = (int) ((long) (arg0 * 2560) / (this.field1645 - this.field1648[this.field1651]));
        }
        if (this.field1642 < 25) {
            this.field1642 = 25;
        }
        if (this.field1642 > 256) {
            this.field1642 = 256;
            this.field1644 = (int) ((long) arg0 - (this.field1645 - this.field1648[this.field1651]) / 10L);
        }
        if (this.field1644 > arg0) {
            this.field1644 = arg0;
        }
        this.field1648[this.field1651] = this.field1645;
        this.field1651 = (this.field1651 + 1) % 10;
        if (this.field1644 > 1) {
            for (int var5 = 0; var5 < 10; var5++) {
                if (this.field1648[var5] != 0L) {
                    this.field1648[var5] += (long) this.field1644;
                }
            }
        }
        if (this.field1644 < arg1) {
            this.field1644 = arg1;
        }
        class169.method3344((long) this.field1644);
        int var6 = 0;
        while (this.field1646 < 256) {
            var6++;
            this.field1646 += this.field1642;
        }
        this.field1646 &= 0xFF;
        return var6;
    }
}
