package deob;

@ObfuscatedName("dc")
public final class class116 extends class127 {

    @ObfuscatedName("dc.d")
    public class117 field1979;

    @ObfuscatedName("dc.g")
    public static final int[] field1976 = new int[] { 0, 1, 3, 7, 15, 31, 63, 127, 255, 511, 1023, 2047, 4095, 8191, 16383, 32767, 65535, 131071, 262143, 524287, 1048575, 2097151, 4194303, 8388607, 16777215, 33554431, 67108863, 134217727, 268435455, 536870911, 1073741823, Integer.MAX_VALUE, -1 };

    @ObfuscatedName("dc.a")
    public int field1977;

    public class116(int arg0) {
        super(arg0);
    }

    @ObfuscatedName("dc.d([II)V")
    public void method2266(int[] arg0) {
        this.field1979 = new class117(arg0);
    }

    @ObfuscatedName("dc.g(IB)V")
    public void method2265(int arg0) {
        this.field2035[++this.field2042 - 1] = (byte) (arg0 + this.field1979.method2288());
    }

    @ObfuscatedName("dc.a(I)I")
    public int method2277() {
        return this.field2035[++this.field2042 - 1] - this.field1979.method2288() & 0xFF;
    }

    @ObfuscatedName("dc.t(B)V")
    public void method2268() {
        this.field1977 = this.field2042 * 8;
    }

    @ObfuscatedName("dc.f(II)I")
    public int method2274(int arg0) {
        int var2 = this.field1977 >> 3;
        int var3 = 8 - (this.field1977 & 0x7);
        int var4 = 0;
        this.field1977 += arg0;
        while (arg0 > var3) {
            var4 += (this.field2035[var2++] & field1976[var3]) << arg0 - var3;
            arg0 -= var3;
            var3 = 8;
        }
        int var5;
        if (arg0 == var3) {
            var5 = (this.field2035[var2] & field1976[var3]) + var4;
        } else {
            var5 = (this.field2035[var2] >> var3 - arg0 & field1976[arg0]) + var4;
        }
        return var5;
    }

    @ObfuscatedName("dc.c(I)V")
    public void method2276() {
        this.field2042 = (this.field1977 + 7) / 8;
    }

    @ObfuscatedName("dc.p(II)I")
    public int method2275(int arg0) {
        return arg0 * 8 - this.field1977;
    }
}
