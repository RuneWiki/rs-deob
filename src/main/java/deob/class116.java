package deob;

@ObfuscatedName("dy")
public final class class116 extends class126 {

    @ObfuscatedName("dy.a")
    public class117 field1966;

    @ObfuscatedName("dy.r")
    public static final int[] field1967 = new int[] { 0, 1, 3, 7, 15, 31, 63, 127, 255, 511, 1023, 2047, 4095, 8191, 16383, 32767, 65535, 131071, 262143, 524287, 1048575, 2097151, 4194303, 8388607, 16777215, 33554431, 67108863, 134217727, 268435455, 536870911, 1073741823, Integer.MAX_VALUE, -1 };

    @ObfuscatedName("dy.u")
    public int field1965;

    public class116(int arg0) {
        super(arg0);
    }

    @ObfuscatedName("dy.a([IB)V")
    public void method2255(int[] arg0) {
        this.field1966 = new class117(arg0);
    }

    @ObfuscatedName("dy.r(II)V")
    public void method2256(int arg0) {
        this.field2015[++this.field2016 - 1] = (byte) (arg0 + this.field1966.method2288());
    }

    @ObfuscatedName("dy.u(S)I")
    public int method2257() {
        return this.field2015[++this.field2016 - 1] - this.field1966.method2288() & 0xFF;
    }

    @ObfuscatedName("dy.t(B)V")
    public void method2258() {
        this.field1965 = this.field2016 * 8;
    }

    @ObfuscatedName("dy.k(II)I")
    public int method2268(int arg0) {
        int var2 = this.field1965 >> 3;
        int var3 = 8 - (this.field1965 & 0x7);
        int var4 = 0;
        this.field1965 += arg0;
        while (arg0 > var3) {
            var4 += (this.field2015[var2++] & field1967[var3]) << arg0 - var3;
            arg0 -= var3;
            var3 = 8;
        }
        int var5;
        if (arg0 == var3) {
            var5 = (this.field2015[var2] & field1967[var3]) + var4;
        } else {
            var5 = (this.field2015[var2] >> var3 - arg0 & field1967[arg0]) + var4;
        }
        return var5;
    }

    @ObfuscatedName("dy.x(I)V")
    public void method2260() {
        this.field2016 = (this.field1965 + 7) / 8;
    }

    @ObfuscatedName("dy.v(IB)I")
    public int method2261(int arg0) {
        return arg0 * 8 - this.field1965;
    }
}
