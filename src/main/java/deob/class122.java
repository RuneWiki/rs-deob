package deob;

@ObfuscatedName("dt")
public final class class122 extends class119 {

    @ObfuscatedName("dt.k")
    public class123 field2006;

    @ObfuscatedName("dt.d")
    public static final int[] field2001 = new int[] { 0, 1, 3, 7, 15, 31, 63, 127, 255, 511, 1023, 2047, 4095, 8191, 16383, 32767, 65535, 131071, 262143, 524287, 1048575, 2097151, 4194303, 8388607, 16777215, 33554431, 67108863, 134217727, 268435455, 536870911, 1073741823, Integer.MAX_VALUE, -1 };

    @ObfuscatedName("dt.n")
    public int field2005;

    public class122(int arg0) {
        super(arg0);
    }

    @ObfuscatedName("dt.hk([II)V")
    public void method2548(int[] arg0) {
        this.field2006 = new class123(arg0);
    }

    @ObfuscatedName("dt.hg(II)V")
    public void method2549(int arg0) {
        this.field1988[++this.field1984 - 1] = (byte) (arg0 + this.field2006.method2571());
    }

    @ObfuscatedName("dt.hd(I)I")
    public int method2550() {
        return this.field1988[++this.field1984 - 1] - this.field2006.method2571() & 0xFF;
    }

    @ObfuscatedName("dt.ht(I)V")
    public void method2551() {
        this.field2005 = this.field1984 * 8;
    }

    @ObfuscatedName("dt.ha(II)I")
    public int method2567(int arg0) {
        int var2 = this.field2005 >> 3;
        int var3 = 8 - (this.field2005 & 0x7);
        int var4 = 0;
        this.field2005 += arg0;
        while (arg0 > var3) {
            var4 += (this.field1988[var2++] & field2001[var3]) << arg0 - var3;
            arg0 -= var3;
            var3 = 8;
        }
        int var5;
        if (arg0 == var3) {
            var5 = (this.field1988[var2] & field2001[var3]) + var4;
        } else {
            var5 = (this.field1988[var2] >> var3 - arg0 & field2001[arg0]) + var4;
        }
        return var5;
    }

    @ObfuscatedName("dt.hh(I)V")
    public void method2552() {
        this.field1984 = (this.field2005 + 7) / 8;
    }

    @ObfuscatedName("dt.hb(IB)I")
    public int method2554(int arg0) {
        return arg0 * 8 - this.field2005;
    }
}
