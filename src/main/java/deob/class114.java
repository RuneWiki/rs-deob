package deob;

@ObfuscatedName("dy")
public final class class114 extends class111 {

    @ObfuscatedName("dy.l")
    public class115 field1909;

    @ObfuscatedName("dy.c")
    public static final int[] field1910 = new int[] { 0, 1, 3, 7, 15, 31, 63, 127, 255, 511, 1023, 2047, 4095, 8191, 16383, 32767, 65535, 131071, 262143, 524287, 1048575, 2097151, 4194303, 8388607, 16777215, 33554431, 67108863, 134217727, 268435455, 536870911, 1073741823, Integer.MAX_VALUE, -1 };

    @ObfuscatedName("dy.f")
    public int field1904;

    public class114(int arg0) {
        super(arg0);
    }

    @ObfuscatedName("dy.hf([IB)V")
    public void method2401(int[] arg0) {
        this.field1909 = new class115(arg0);
    }

    @ObfuscatedName("dy.hm(IB)V")
    public void method2402(int arg0) {
        this.field1886[++this.field1888 - 1] = (byte) (arg0 + this.field1909.method2432());
    }

    @ObfuscatedName("dy.hb(I)I")
    public int method2419() {
        return this.field1886[++this.field1888 - 1] - this.field1909.method2432() & 0xFF;
    }

    @ObfuscatedName("dy.hi(I)V")
    public void method2403() {
        this.field1904 = this.field1888 * 8;
    }

    @ObfuscatedName("dy.hy(II)I")
    public int method2421(int arg0) {
        int var2 = this.field1904 >> 3;
        int var3 = 8 - (this.field1904 & 0x7);
        int var4 = 0;
        this.field1904 += arg0;
        while (arg0 > var3) {
            var4 += (this.field1886[var2++] & field1910[var3]) << arg0 - var3;
            arg0 -= var3;
            var3 = 8;
        }
        int var5;
        if (arg0 == var3) {
            var5 = (this.field1886[var2] & field1910[var3]) + var4;
        } else {
            var5 = (this.field1886[var2] >> var3 - arg0 & field1910[arg0]) + var4;
        }
        return var5;
    }

    @ObfuscatedName("dy.hu(B)V")
    public void method2406() {
        this.field1888 = (this.field1904 + 7) / 8;
    }

    @ObfuscatedName("dy.hw(II)I")
    public int method2407(int arg0) {
        return arg0 * 8 - this.field1904;
    }
}
