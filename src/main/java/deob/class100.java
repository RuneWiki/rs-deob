package deob;

@ObfuscatedName("cp")
public class class100 extends class110 {

    @ObfuscatedName("cp.d")
    public long[] field1638 = new long[10];

    @ObfuscatedName("cp.c")
    public int field1632 = 256;

    @ObfuscatedName("cp.n")
    public int field1635 = 1;

    @ObfuscatedName("cp.q")
    public long field1631 = class132.method1336();

    @ObfuscatedName("cp.t")
    public int field1634 = 0;

    @ObfuscatedName("cp.p")
    public int field1636;

    public class100() {
        for (int var1 = 0; var1 < 10; var1++) {
            this.field1638[var1] = this.field1631;
        }
    }

    @ObfuscatedName("cp.d(B)V")
    public void method1824() {
        for (int var1 = 0; var1 < 10; var1++) {
            this.field1638[var1] = 0L;
        }
    }

    @ObfuscatedName("cp.c(IIB)I")
    public int method1826(int arg0, int arg1) {
        int var3 = this.field1632;
        int var4 = this.field1635;
        this.field1632 = 300;
        this.field1635 = 1;
        this.field1631 = class132.method1336();
        if (this.field1638[this.field1636] == 0L) {
            this.field1632 = var3;
            this.field1635 = var4;
        } else if (this.field1631 > this.field1638[this.field1636]) {
            this.field1632 = (int) ((long) (arg0 * 2560) / (this.field1631 - this.field1638[this.field1636]));
        }
        if (this.field1632 < 25) {
            this.field1632 = 25;
        }
        if (this.field1632 > 256) {
            this.field1632 = 256;
            this.field1635 = (int) ((long) arg0 - (this.field1631 - this.field1638[this.field1636]) / 10L);
        }
        if (this.field1635 > arg0) {
            this.field1635 = arg0;
        }
        this.field1638[this.field1636] = this.field1631;
        this.field1636 = (this.field1636 + 1) % 10;
        if (this.field1635 > 1) {
            for (int var5 = 0; var5 < 10; var5++) {
                if (this.field1638[var5] != 0L) {
                    this.field1638[var5] += (long) this.field1635;
                }
            }
        }
        if (this.field1635 < arg1) {
            this.field1635 = arg1;
        }
        class138.method15((long) this.field1635);
        int var6 = 0;
        while (this.field1634 < 256) {
            var6++;
            this.field1634 += this.field1632;
        }
        this.field1634 &= 0xFF;
        return var6;
    }
}
