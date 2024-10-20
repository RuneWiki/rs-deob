package deob;

@ObfuscatedName("do")
public final class class117 extends class114 {

    @ObfuscatedName("do.f")
    public class118 field1908;

    @ObfuscatedName("do.i")
    public static final int[] field1909 = new int[] { 0, 1, 3, 7, 15, 31, 63, 127, 255, 511, 1023, 2047, 4095, 8191, 16383, 32767, 65535, 131071, 262143, 524287, 1048575, 2097151, 4194303, 8388607, 16777215, 33554431, 67108863, 134217727, 268435455, 536870911, 1073741823, Integer.MAX_VALUE, -1 };

    @ObfuscatedName("do.a")
    public int field1910;

    public class117(int arg0) {
        super(arg0);
    }

    @ObfuscatedName("do.hy([II)V")
    public void method2573(int[] arg0) {
        this.field1908 = new class118(arg0);
    }

    @ObfuscatedName("do.hg(II)V")
    public void method2574(int arg0) {
        this.field1891[++this.field1894 - 1] = (byte) (arg0 + this.field1908.method2595());
    }

    @ObfuscatedName("do.hz(I)I")
    public int method2575() {
        return this.field1891[++this.field1894 - 1] - this.field1908.method2595() & 0xFF;
    }

    @ObfuscatedName("do.hd(S)V")
    public void method2590() {
        this.field1910 = this.field1894 * 8;
    }

    @ObfuscatedName("do.hl(II)I")
    public int method2576(int arg0) {
        int var2 = this.field1910 >> 3;
        int var3 = 8 - (this.field1910 & 0x7);
        int var4 = 0;
        this.field1910 += arg0;
        while (arg0 > var3) {
            var4 += (this.field1891[var2++] & field1909[var3]) << arg0 - var3;
            arg0 -= var3;
            var3 = 8;
        }
        int var5;
        if (arg0 == var3) {
            var5 = (this.field1891[var2] & field1909[var3]) + var4;
        } else {
            var5 = (this.field1891[var2] >> var3 - arg0 & field1909[arg0]) + var4;
        }
        return var5;
    }

    @ObfuscatedName("do.hi(B)V")
    public void method2577() {
        this.field1894 = (this.field1910 + 7) / 8;
    }

    @ObfuscatedName("do.hs(II)I")
    public int method2592(int arg0) {
        return arg0 * 8 - this.field1910;
    }
}
