package deob;

@ObfuscatedName("dn")
public final class class116 extends class127 {

    @ObfuscatedName("dn.a")
    public class117 field1973;

    @ObfuscatedName("dn.x")
    public static final int[] field1974 = new int[] { 0, 1, 3, 7, 15, 31, 63, 127, 255, 511, 1023, 2047, 4095, 8191, 16383, 32767, 65535, 131071, 262143, 524287, 1048575, 2097151, 4194303, 8388607, 16777215, 33554431, 67108863, 134217727, 268435455, 536870911, 1073741823, Integer.MAX_VALUE, -1 };

    @ObfuscatedName("dn.e")
    public int field1975;

    public class116(int arg0) {
        super(arg0);
    }

    @ObfuscatedName("dn.a([II)V")
    public void method2271(int[] arg0) {
        this.field1973 = new class117(arg0);
    }

    @ObfuscatedName("dn.x(II)V")
    public void method2272(int arg0) {
        this.field2036[++this.field2035 - 1] = (byte) (arg0 + this.field1973.method2302());
    }

    @ObfuscatedName("dn.e(I)I")
    public int method2273() {
        return this.field2036[++this.field2035 - 1] - this.field1973.method2302() & 0xFF;
    }

    @ObfuscatedName("dn.r(I)V")
    public void method2277() {
        this.field1975 = this.field2035 * 8;
    }

    @ObfuscatedName("dn.p(II)I")
    public int method2274(int arg0) {
        int var2 = this.field1975 >> 3;
        int var3 = 8 - (this.field1975 & 0x7);
        int var4 = 0;
        this.field1975 += arg0;
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

    @ObfuscatedName("dn.n(B)V")
    public void method2275() {
        this.field2035 = (this.field1975 + 7) / 8;
    }

    @ObfuscatedName("dn.o(II)I")
    public int method2283(int arg0) {
        return arg0 * 8 - this.field1975;
    }
}
