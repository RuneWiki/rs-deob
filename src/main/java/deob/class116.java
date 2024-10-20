package deob;

@ObfuscatedName("dd")
public final class class116 extends class127 {

    @ObfuscatedName("dd.p")
    public class117 field1980;

    @ObfuscatedName("dd.i")
    public static final int[] field1978 = new int[] { 0, 1, 3, 7, 15, 31, 63, 127, 255, 511, 1023, 2047, 4095, 8191, 16383, 32767, 65535, 131071, 262143, 524287, 1048575, 2097151, 4194303, 8388607, 16777215, 33554431, 67108863, 134217727, 268435455, 536870911, 1073741823, Integer.MAX_VALUE, -1 };

    @ObfuscatedName("dd.o")
    public int field1979;

    public class116(int arg0) {
        super(arg0);
    }

    @ObfuscatedName("dd.p([II)V")
    public void method2355(int[] arg0) {
        this.field1980 = new class117(arg0);
    }

    @ObfuscatedName("dd.i(II)V")
    public void method2356(int arg0) {
        this.field2037[++this.field2038 - 1] = (byte) (arg0 + this.field1980.method2380());
    }

    @ObfuscatedName("dd.o(I)I")
    public int method2357() {
        return this.field2037[++this.field2038 - 1] - this.field1980.method2380() & 0xFF;
    }

    @ObfuscatedName("dd.n(I)V")
    public void method2358() {
        this.field1979 = this.field2038 * 8;
    }

    @ObfuscatedName("dd.l(IB)I")
    public int method2359(int arg0) {
        int var2 = this.field1979 >> 3;
        int var3 = 8 - (this.field1979 & 0x7);
        int var4 = 0;
        this.field1979 += arg0;
        while (arg0 > var3) {
            var4 += (this.field2037[var2++] & field1978[var3]) << arg0 - var3;
            arg0 -= var3;
            var3 = 8;
        }
        int var5;
        if (arg0 == var3) {
            var5 = (this.field2037[var2] & field1978[var3]) + var4;
        } else {
            var5 = (this.field2037[var2] >> var3 - arg0 & field1978[arg0]) + var4;
        }
        return var5;
    }

    @ObfuscatedName("dd.v(I)V")
    public void method2360() {
        this.field2038 = (this.field1979 + 7) / 8;
    }

    @ObfuscatedName("dd.g(IB)I")
    public int method2363(int arg0) {
        return arg0 * 8 - this.field1979;
    }
}
