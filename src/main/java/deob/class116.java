package deob;

@ObfuscatedName("dx")
public final class class116 extends class127 {

    @ObfuscatedName("dx.y")
    public class117 field1974;

    @ObfuscatedName("dx.m")
    public static final int[] field1972 = new int[] { 0, 1, 3, 7, 15, 31, 63, 127, 255, 511, 1023, 2047, 4095, 8191, 16383, 32767, 65535, 131071, 262143, 524287, 1048575, 2097151, 4194303, 8388607, 16777215, 33554431, 67108863, 134217727, 268435455, 536870911, 1073741823, Integer.MAX_VALUE, -1 };

    @ObfuscatedName("dx.d")
    public int field1979;

    public class116(int arg0) {
        super(arg0);
    }

    @ObfuscatedName("dx.y([IB)V")
    public void method2338(int[] arg0) {
        this.field1974 = new class117(arg0);
    }

    @ObfuscatedName("dx.m(II)V")
    public void method2337(int arg0) {
        this.field2037[++this.field2036 - 1] = (byte) (arg0 + this.field1974.method2360());
    }

    @ObfuscatedName("dx.d(B)I")
    public int method2335() {
        return this.field2037[++this.field2036 - 1] - this.field1974.method2360() & 0xFF;
    }

    @ObfuscatedName("dx.k(I)V")
    public void method2339() {
        this.field1979 = this.field2036 * 8;
    }

    @ObfuscatedName("dx.n(II)I")
    public int method2354(int arg0) {
        int var2 = this.field1979 >> 3;
        int var3 = 8 - (this.field1979 & 0x7);
        int var4 = 0;
        this.field1979 += arg0;
        while (arg0 > var3) {
            var4 += (this.field2037[var2++] & field1972[var3]) << arg0 - var3;
            arg0 -= var3;
            var3 = 8;
        }
        int var5;
        if (arg0 == var3) {
            var5 = (this.field2037[var2] & field1972[var3]) + var4;
        } else {
            var5 = (this.field2037[var2] >> var3 - arg0 & field1972[arg0]) + var4;
        }
        return var5;
    }

    @ObfuscatedName("dx.s(I)V")
    public void method2341() {
        this.field2036 = (this.field1979 + 7) / 8;
    }

    @ObfuscatedName("dx.x(II)I")
    public int method2342(int arg0) {
        return arg0 * 8 - this.field1979;
    }
}
