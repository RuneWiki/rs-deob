package deob;

@ObfuscatedName("dk")
public final class class115 extends class126 {

    @ObfuscatedName("dk.p")
    public class116 field1986;

    @ObfuscatedName("dk.j")
    public static final int[] field1987 = new int[] { 0, 1, 3, 7, 15, 31, 63, 127, 255, 511, 1023, 2047, 4095, 8191, 16383, 32767, 65535, 131071, 262143, 524287, 1048575, 2097151, 4194303, 8388607, 16777215, 33554431, 67108863, 134217727, 268435455, 536870911, 1073741823, Integer.MAX_VALUE, -1 };

    @ObfuscatedName("dk.w")
    public int field1988;

    public class115(int arg0) {
        super(arg0);
    }

    @ObfuscatedName("dk.p([II)V")
    public void method2254(int[] arg0) {
        this.field1986 = new class116(arg0);
    }

    @ObfuscatedName("dk.j(II)V")
    public void method2258(int arg0) {
        this.field2047[++this.field2043 - 1] = (byte) (arg0 + this.field1986.method2280());
    }

    @ObfuscatedName("dk.w(I)I")
    public int method2260() {
        return this.field2047[++this.field2043 - 1] - this.field1986.method2280() & 0xFF;
    }

    @ObfuscatedName("dk.h(I)V")
    public void method2273() {
        this.field1988 = this.field2043 * 8;
    }

    @ObfuscatedName("dk.v(IB)I")
    public int method2267(int arg0) {
        int var2 = this.field1988 >> 3;
        int var3 = 8 - (this.field1988 & 0x7);
        int var4 = 0;
        this.field1988 += arg0;
        while (arg0 > var3) {
            var4 += (this.field2047[var2++] & field1987[var3]) << arg0 - var3;
            arg0 -= var3;
            var3 = 8;
        }
        int var5;
        if (arg0 == var3) {
            var5 = (this.field2047[var2] & field1987[var3]) + var4;
        } else {
            var5 = (this.field2047[var2] >> var3 - arg0 & field1987[arg0]) + var4;
        }
        return var5;
    }

    @ObfuscatedName("dk.k(I)V")
    public void method2256() {
        this.field2043 = (this.field1988 + 7) / 8;
    }

    @ObfuscatedName("dk.g(II)I")
    public int method2253(int arg0) {
        return arg0 * 8 - this.field1988;
    }
}
