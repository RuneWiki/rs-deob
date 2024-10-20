package deob;

@ObfuscatedName("dp")
public final class class116 extends class127 {

    @ObfuscatedName("dp.q")
    public class117 field1984;

    @ObfuscatedName("dp.c")
    public static final int[] field1977 = new int[] { 0, 1, 3, 7, 15, 31, 63, 127, 255, 511, 1023, 2047, 4095, 8191, 16383, 32767, 65535, 131071, 262143, 524287, 1048575, 2097151, 4194303, 8388607, 16777215, 33554431, 67108863, 134217727, 268435455, 536870911, 1073741823, Integer.MAX_VALUE, -1 };

    @ObfuscatedName("dp.p")
    public int field1976;

    public class116(int arg0) {
        super(arg0);
    }

    @ObfuscatedName("dp.q([II)V")
    public void method2293(int[] arg0) {
        this.field1984 = new class117(arg0);
    }

    @ObfuscatedName("dp.c(IS)V")
    public void method2300(int arg0) {
        this.field2042[++this.field2039 - 1] = (byte) (arg0 + this.field1984.method2315());
    }

    @ObfuscatedName("dp.p(B)I")
    public int method2302() {
        return this.field2042[++this.field2039 - 1] - this.field1984.method2315() & 0xFF;
    }

    @ObfuscatedName("dp.z(I)V")
    public void method2296() {
        this.field1976 = this.field2039 * 8;
    }

    @ObfuscatedName("dp.m(II)I")
    public int method2297(int arg0) {
        int var2 = this.field1976 >> 3;
        int var3 = 8 - (this.field1976 & 0x7);
        int var4 = 0;
        this.field1976 += arg0;
        while (arg0 > var3) {
            var4 += (this.field2042[var2++] & field1977[var3]) << arg0 - var3;
            arg0 -= var3;
            var3 = 8;
        }
        int var5;
        if (arg0 == var3) {
            var5 = (this.field2042[var2] & field1977[var3]) + var4;
        } else {
            var5 = (this.field2042[var2] >> var3 - arg0 & field1977[arg0]) + var4;
        }
        return var5;
    }

    @ObfuscatedName("dp.k(I)V")
    public void method2298() {
        this.field2039 = (this.field1976 + 7) / 8;
    }

    @ObfuscatedName("dp.v(II)I")
    public int method2299(int arg0) {
        return arg0 * 8 - this.field1976;
    }
}
