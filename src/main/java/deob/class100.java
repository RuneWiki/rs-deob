package deob;

@ObfuscatedName("ct")
public class class100 extends class110 {

    @ObfuscatedName("ct.n")
    public long[] field1635 = new long[10];

    @ObfuscatedName("ct.d")
    public int field1636 = 256;

    @ObfuscatedName("ct.m")
    public int field1637 = 1;

    @ObfuscatedName("ct.h")
    public long field1638 = class163.method3594();

    @ObfuscatedName("ct.w")
    public int field1643 = 0;

    @ObfuscatedName("ct.r")
    public int field1640;

    public class100() {
        for (int var1 = 0; var1 < 10; var1++) {
            this.field1635[var1] = this.field1638;
        }
    }

    @ObfuscatedName("ct.n(I)V")
    public void method1840() {
        for (int var1 = 0; var1 < 10; var1++) {
            this.field1635[var1] = 0L;
        }
    }

    @ObfuscatedName("ct.d(III)I")
    public int method1841(int arg0, int arg1) {
        int var3 = this.field1636;
        int var4 = this.field1637;
        this.field1636 = 300;
        this.field1637 = 1;
        this.field1638 = class163.method3594();
        if (this.field1635[this.field1640] == 0L) {
            this.field1636 = var3;
            this.field1637 = var4;
        } else if (this.field1638 > this.field1635[this.field1640]) {
            this.field1636 = (int) ((long) (arg0 * 2560) / (this.field1638 - this.field1635[this.field1640]));
        }
        if (this.field1636 < 25) {
            this.field1636 = 25;
        }
        if (this.field1636 > 256) {
            this.field1636 = 256;
            this.field1637 = (int) ((long) arg0 - (this.field1638 - this.field1635[this.field1640]) / 10L);
        }
        if (this.field1637 > arg0) {
            this.field1637 = arg0;
        }
        this.field1635[this.field1640] = this.field1638;
        this.field1640 = (this.field1640 + 1) % 10;
        if (this.field1637 > 1) {
            for (int var5 = 0; var5 < 10; var5++) {
                if (this.field1635[var5] != 0L) {
                    this.field1635[var5] += (long) this.field1637;
                }
            }
        }
        if (this.field1637 < arg1) {
            this.field1637 = arg1;
        }
        Statics.method13((long) this.field1637);
        int var6 = 0;
        while (this.field1643 < 256) {
            var6++;
            this.field1643 += this.field1636;
        }
        this.field1643 &= 0xFF;
        return var6;
    }
}
