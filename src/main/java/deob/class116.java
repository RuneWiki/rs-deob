package deob;

@ObfuscatedName("dg")
public final class class116 extends class127 {

    @ObfuscatedName("dg.j")
    public class117 field1977;

    @ObfuscatedName("dg.f")
    public static final int[] field1976 = new int[] { 0, 1, 3, 7, 15, 31, 63, 127, 255, 511, 1023, 2047, 4095, 8191, 16383, 32767, 65535, 131071, 262143, 524287, 1048575, 2097151, 4194303, 8388607, 16777215, 33554431, 67108863, 134217727, 268435455, 536870911, 1073741823, Integer.MAX_VALUE, -1 };

    @ObfuscatedName("dg.o")
    public int field1975;

    public class116(int arg0) {
        super(arg0);
    }

    @ObfuscatedName("dg.j([II)V")
    public void method2326(int[] arg0) {
        this.field1977 = new class117(arg0);
    }

    @ObfuscatedName("dg.f(II)V")
    public void method2345(int arg0) {
        this.field2037[++this.field2035 - 1] = (byte) (arg0 + this.field1977.method2358());
    }

    @ObfuscatedName("dg.o(S)I")
    public int method2348() {
        return this.field2037[++this.field2035 - 1] - this.field1977.method2358() & 0xFF;
    }

    @ObfuscatedName("dg.h(I)V")
    public void method2339() {
        this.field1975 = this.field2035 * 8;
    }

    @ObfuscatedName("dg.u(II)I")
    public int method2353(int arg0) {
        int var2 = this.field1975 >> 3;
        int var3 = 8 - (this.field1975 & 0x7);
        int var4 = 0;
        this.field1975 += arg0;
        while (arg0 > var3) {
            var4 += (this.field2037[var2++] & field1976[var3]) << arg0 - var3;
            arg0 -= var3;
            var3 = 8;
        }
        int var5;
        if (arg0 == var3) {
            var5 = (this.field2037[var2] & field1976[var3]) + var4;
        } else {
            var5 = (this.field2037[var2] >> var3 - arg0 & field1976[arg0]) + var4;
        }
        return var5;
    }

    @ObfuscatedName("dg.a(I)V")
    public void method2330() {
        this.field2035 = (this.field1975 + 7) / 8;
    }

    @ObfuscatedName("dg.q(II)I")
    public int method2331(int arg0) {
        return arg0 * 8 - this.field1975;
    }
}
