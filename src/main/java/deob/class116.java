package deob;

@ObfuscatedName("do")
public final class class116 extends class127 {

    @ObfuscatedName("do.g")
    public class117 field1967;

    @ObfuscatedName("do.m")
    public static final int[] field1965 = new int[] { 0, 1, 3, 7, 15, 31, 63, 127, 255, 511, 1023, 2047, 4095, 8191, 16383, 32767, 65535, 131071, 262143, 524287, 1048575, 2097151, 4194303, 8388607, 16777215, 33554431, 67108863, 134217727, 268435455, 536870911, 1073741823, Integer.MAX_VALUE, -1 };

    @ObfuscatedName("do.v")
    public int field1964;

    public class116(int arg0) {
        super(arg0);
    }

    @ObfuscatedName("do.g([II)V")
    public void method2292(int[] arg0) {
        this.field1967 = new class117(arg0);
    }

    @ObfuscatedName("do.m(IS)V")
    public void method2295(int arg0) {
        this.field2028[++this.field2023 - 1] = (byte) (arg0 + this.field1967.method2314());
    }

    @ObfuscatedName("do.v(I)I")
    public int method2294() {
        return this.field2028[++this.field2023 - 1] - this.field1967.method2314() & 0xFF;
    }

    @ObfuscatedName("do.r(I)V")
    public void method2308() {
        this.field1964 = this.field2023 * 8;
    }

    @ObfuscatedName("do.n(IB)I")
    public int method2291(int arg0) {
        int var2 = this.field1964 >> 3;
        int var3 = 8 - (this.field1964 & 0x7);
        int var4 = 0;
        this.field1964 += arg0;
        while (arg0 > var3) {
            var4 += (this.field2028[var2++] & field1965[var3]) << arg0 - var3;
            arg0 -= var3;
            var3 = 8;
        }
        int var5;
        if (arg0 == var3) {
            var5 = (this.field2028[var2] & field1965[var3]) + var4;
        } else {
            var5 = (this.field2028[var2] >> var3 - arg0 & field1965[arg0]) + var4;
        }
        return var5;
    }

    @ObfuscatedName("do.i(I)V")
    public void method2293() {
        this.field2023 = (this.field1964 + 7) / 8;
    }

    @ObfuscatedName("do.s(II)I")
    public int method2298(int arg0) {
        return arg0 * 8 - this.field1964;
    }
}
