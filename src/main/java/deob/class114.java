package deob;

@ObfuscatedName("dv")
public final class class114 extends class111 {

    @ObfuscatedName("dv.i")
    public class115 field1913;

    @ObfuscatedName("dv.r")
    public static final int[] field1910 = new int[] { 0, 1, 3, 7, 15, 31, 63, 127, 255, 511, 1023, 2047, 4095, 8191, 16383, 32767, 65535, 131071, 262143, 524287, 1048575, 2097151, 4194303, 8388607, 16777215, 33554431, 67108863, 134217727, 268435455, 536870911, 1073741823, Integer.MAX_VALUE, -1 };

    @ObfuscatedName("dv.l")
    public int field1912;

    public class114(int arg0) {
        super(arg0);
    }

    @ObfuscatedName("dv.ir([II)V")
    public void method2492(int[] arg0) {
        this.field1913 = new class115(arg0);
    }

    @ObfuscatedName("dv.is(II)V")
    public void method2493(int arg0) {
        this.field1889[++this.field1890 - 1] = (byte) (arg0 + this.field1913.method2513());
    }

    @ObfuscatedName("dv.ij(B)I")
    public int method2494() {
        return this.field1889[++this.field1890 - 1] - this.field1913.method2513() & 0xFF;
    }

    @ObfuscatedName("dv.in(I)V")
    public void method2495() {
        this.field1912 = this.field1890 * 8;
    }

    @ObfuscatedName("dv.ix(IB)I")
    public int method2496(int arg0) {
        int var2 = this.field1912 >> 3;
        int var3 = 8 - (this.field1912 & 0x7);
        int var4 = 0;
        this.field1912 += arg0;
        while (arg0 > var3) {
            var4 += (this.field1889[var2++] & field1910[var3]) << arg0 - var3;
            arg0 -= var3;
            var3 = 8;
        }
        int var5;
        if (arg0 == var3) {
            var5 = (this.field1889[var2] & field1910[var3]) + var4;
        } else {
            var5 = (this.field1889[var2] >> var3 - arg0 & field1910[arg0]) + var4;
        }
        return var5;
    }

    @ObfuscatedName("dv.il(I)V")
    public void method2497() {
        this.field1890 = (this.field1912 + 7) / 8;
    }

    @ObfuscatedName("dv.ii(IB)I")
    public int method2498(int arg0) {
        return arg0 * 8 - this.field1912;
    }
}
