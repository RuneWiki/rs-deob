package deob;

@ObfuscatedName("dx")
public final class class116 extends class127 {

    @ObfuscatedName("dx.i")
    public class117 field1975;

    @ObfuscatedName("dx.p")
    public static final int[] field1976 = new int[] { 0, 1, 3, 7, 15, 31, 63, 127, 255, 511, 1023, 2047, 4095, 8191, 16383, 32767, 65535, 131071, 262143, 524287, 1048575, 2097151, 4194303, 8388607, 16777215, 33554431, 67108863, 134217727, 268435455, 536870911, 1073741823, Integer.MAX_VALUE, -1 };

    @ObfuscatedName("dx.a")
    public int field1980;

    public class116(int arg0) {
        super(arg0);
    }

    @ObfuscatedName("dx.i([IB)V")
    public void method2264(int[] arg0) {
        this.field1975 = new class117(arg0);
    }

    @ObfuscatedName("dx.p(II)V")
    public void method2265(int arg0) {
        this.field2039[++this.field2037 - 1] = (byte) (arg0 + this.field1975.method2290());
    }

    @ObfuscatedName("dx.a(I)I")
    public int method2268() {
        return this.field2039[++this.field2037 - 1] - this.field1975.method2290() & 0xFF;
    }

    @ObfuscatedName("dx.l(I)V")
    public void method2280() {
        this.field1980 = this.field2037 * 8;
    }

    @ObfuscatedName("dx.q(II)I")
    public int method2267(int arg0) {
        int var2 = this.field1980 >> 3;
        int var3 = 8 - (this.field1980 & 0x7);
        int var4 = 0;
        this.field1980 += arg0;
        while (arg0 > var3) {
            var4 += (this.field2039[var2++] & field1976[var3]) << arg0 - var3;
            arg0 -= var3;
            var3 = 8;
        }
        int var5;
        if (arg0 == var3) {
            var5 = (this.field2039[var2] & field1976[var3]) + var4;
        } else {
            var5 = (this.field2039[var2] >> var3 - arg0 & field1976[arg0]) + var4;
        }
        return var5;
    }

    @ObfuscatedName("dx.b(I)V")
    public void method2269() {
        this.field2037 = (this.field1980 + 7) / 8;
    }

    @ObfuscatedName("dx.u(II)I")
    public int method2288(int arg0) {
        return arg0 * 8 - this.field1980;
    }
}
