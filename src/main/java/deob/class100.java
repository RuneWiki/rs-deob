package deob;

@ObfuscatedName("co")
public class class100 extends class110 {

    @ObfuscatedName("co.b")
    public long[] field1643 = new long[10];

    @ObfuscatedName("co.l")
    public int field1642 = 256;

    @ObfuscatedName("co.i")
    public int field1638 = 1;

    @ObfuscatedName("co.t")
    public long field1639 = class156.method910();

    @ObfuscatedName("co.k")
    public int field1636 = 0;

    @ObfuscatedName("co.h")
    public int field1640;

    public class100() {
        for (int var1 = 0; var1 < 10; var1++) {
            this.field1643[var1] = this.field1639;
        }
    }

    @ObfuscatedName("co.b(B)V")
    public void method1886() {
        for (int var1 = 0; var1 < 10; var1++) {
            this.field1643[var1] = 0L;
        }
    }

    @ObfuscatedName("co.l(IIB)I")
    public int method1887(int arg0, int arg1) {
        int var3 = this.field1642;
        int var4 = this.field1638;
        this.field1642 = 300;
        this.field1638 = 1;
        this.field1639 = class156.method910();
        if (this.field1643[this.field1640] == 0L) {
            this.field1642 = var3;
            this.field1638 = var4;
        } else if (this.field1639 > this.field1643[this.field1640]) {
            this.field1642 = (int) ((long) (arg0 * 2560) / (this.field1639 - this.field1643[this.field1640]));
        }
        if (this.field1642 < 25) {
            this.field1642 = 25;
        }
        if (this.field1642 > 256) {
            this.field1642 = 256;
            this.field1638 = (int) ((long) arg0 - (this.field1639 - this.field1643[this.field1640]) / 10L);
        }
        if (this.field1638 > arg0) {
            this.field1638 = arg0;
        }
        this.field1643[this.field1640] = this.field1639;
        this.field1640 = (this.field1640 + 1) % 10;
        if (this.field1638 > 1) {
            for (int var5 = 0; var5 < 10; var5++) {
                if (this.field1643[var5] != 0L) {
                    this.field1643[var5] += (long) this.field1638;
                }
            }
        }
        if (this.field1638 < arg1) {
            this.field1638 = arg1;
        }
        class162.method2157((long) this.field1638);
        int var6 = 0;
        while (this.field1636 < 256) {
            var6++;
            this.field1636 += this.field1642;
        }
        this.field1636 &= 0xFF;
        return var6;
    }
}
