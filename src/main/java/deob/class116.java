package deob;

@ObfuscatedName("dr")
public final class class116 extends class127 {

    @ObfuscatedName("dr.p")
    public class117 field1971;

    @ObfuscatedName("dr.l")
    public static final int[] field1974 = new int[] { 0, 1, 3, 7, 15, 31, 63, 127, 255, 511, 1023, 2047, 4095, 8191, 16383, 32767, 65535, 131071, 262143, 524287, 1048575, 2097151, 4194303, 8388607, 16777215, 33554431, 67108863, 134217727, 268435455, 536870911, 1073741823, Integer.MAX_VALUE, -1 };

    @ObfuscatedName("dr.d")
    public int field1973;

    public class116(int arg0) {
        super(arg0);
    }

    @ObfuscatedName("dr.p([II)V")
    public void method2370(int[] arg0) {
        this.field1971 = new class117(arg0);
    }

    @ObfuscatedName("dr.l(II)V")
    public void method2355(int arg0) {
        this.field2036[++this.field2030 - 1] = (byte) (arg0 + this.field1971.method2382());
    }

    @ObfuscatedName("dr.d(I)I")
    public int method2354() {
        return this.field2036[++this.field2030 - 1] - this.field1971.method2382() & 0xFF;
    }

    @ObfuscatedName("dr.x(B)V")
    public void method2361() {
        this.field1973 = this.field2030 * 8;
    }

    @ObfuscatedName("dr.o(II)I")
    public int method2379(int arg0) {
        int var2 = this.field1973 >> 3;
        int var3 = 8 - (this.field1973 & 0x7);
        int var4 = 0;
        this.field1973 += arg0;
        while (arg0 > var3) {
            var4 += (this.field2036[var2++] & field1974[var3]) << arg0 - var3;
            arg0 -= var3;
            var3 = 8;
        }
        int var5;
        if (arg0 == var3) {
            var5 = (this.field2036[var2] & field1974[var3]) + var4;
        } else {
            var5 = (this.field2036[var2] >> var3 - arg0 & field1974[arg0]) + var4;
        }
        return var5;
    }

    @ObfuscatedName("dr.a(I)V")
    public void method2357() {
        this.field2030 = (this.field1973 + 7) / 8;
    }

    @ObfuscatedName("dr.w(IB)I")
    public int method2358(int arg0) {
        return arg0 * 8 - this.field1973;
    }
}
