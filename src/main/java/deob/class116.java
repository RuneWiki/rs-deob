package deob;

@ObfuscatedName("dj")
public final class class116 extends class127 {

    @ObfuscatedName("dj.f")
    public class117 field1972;

    @ObfuscatedName("dj.t")
    public static final int[] field1967 = new int[] { 0, 1, 3, 7, 15, 31, 63, 127, 255, 511, 1023, 2047, 4095, 8191, 16383, 32767, 65535, 131071, 262143, 524287, 1048575, 2097151, 4194303, 8388607, 16777215, 33554431, 67108863, 134217727, 268435455, 536870911, 1073741823, Integer.MAX_VALUE, -1 };

    @ObfuscatedName("dj.n")
    public int field1968;

    public class116(int arg0) {
        super(arg0);
    }

    @ObfuscatedName("dj.f([IS)V")
    public void method2327(int[] arg0) {
        this.field1972 = new class117(arg0);
    }

    @ObfuscatedName("dj.t(II)V")
    public void method2316(int arg0) {
        this.field2030[++this.field2033 - 1] = (byte) (arg0 + this.field1972.method2336());
    }

    @ObfuscatedName("dj.n(B)I")
    public int method2315() {
        return this.field2030[++this.field2033 - 1] - this.field1972.method2336() & 0xFF;
    }

    @ObfuscatedName("dj.e(B)V")
    public void method2318() {
        this.field1968 = this.field2033 * 8;
    }

    @ObfuscatedName("dj.l(II)I")
    public int method2319(int arg0) {
        int var2 = this.field1968 >> 3;
        int var3 = 8 - (this.field1968 & 0x7);
        int var4 = 0;
        this.field1968 += arg0;
        while (arg0 > var3) {
            var4 += (this.field2030[var2++] & field1967[var3]) << arg0 - var3;
            arg0 -= var3;
            var3 = 8;
        }
        int var5;
        if (arg0 == var3) {
            var5 = (this.field2030[var2] & field1967[var3]) + var4;
        } else {
            var5 = (this.field2030[var2] >> var3 - arg0 & field1967[arg0]) + var4;
        }
        return var5;
    }

    @ObfuscatedName("dj.d(I)V")
    public void method2332() {
        this.field2033 = (this.field1968 + 7) / 8;
    }

    @ObfuscatedName("dj.r(IB)I")
    public int method2328(int arg0) {
        return arg0 * 8 - this.field1968;
    }
}
