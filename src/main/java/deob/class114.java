package deob;

@ObfuscatedName("do")
public final class class114 extends class111 {

    @ObfuscatedName("do.f")
    public class115 field1884;

    @ObfuscatedName("do.d")
    public static final int[] field1886 = new int[] { 0, 1, 3, 7, 15, 31, 63, 127, 255, 511, 1023, 2047, 4095, 8191, 16383, 32767, 65535, 131071, 262143, 524287, 1048575, 2097151, 4194303, 8388607, 16777215, 33554431, 67108863, 134217727, 268435455, 536870911, 1073741823, Integer.MAX_VALUE, -1 };

    @ObfuscatedName("do.j")
    public int field1883;

    public class114(int arg0) {
        super(arg0);
    }

    @ObfuscatedName("do.ho([IB)V")
    public void method2420(int[] arg0) {
        this.field1884 = new class115(arg0);
    }

    @ObfuscatedName("do.hn(IB)V")
    public void method2444(int arg0) {
        this.field1869[++this.field1867 - 1] = (byte) (arg0 + this.field1884.method2447());
    }

    @ObfuscatedName("do.hx(I)I")
    public int method2422() {
        return this.field1869[++this.field1867 - 1] - this.field1884.method2447() & 0xFF;
    }

    @ObfuscatedName("do.hr(I)V")
    public void method2423() {
        this.field1883 = this.field1867 * 8;
    }

    @ObfuscatedName("do.hl(II)I")
    public int method2439(int arg0) {
        int var2 = this.field1883 >> 3;
        int var3 = 8 - (this.field1883 & 0x7);
        int var4 = 0;
        this.field1883 += arg0;
        while (arg0 > var3) {
            var4 += (this.field1869[var2++] & field1886[var3]) << arg0 - var3;
            arg0 -= var3;
            var3 = 8;
        }
        int var5;
        if (arg0 == var3) {
            var5 = (this.field1869[var2] & field1886[var3]) + var4;
        } else {
            var5 = (this.field1869[var2] >> var3 - arg0 & field1886[arg0]) + var4;
        }
        return var5;
    }

    @ObfuscatedName("do.hz(I)V")
    public void method2425() {
        this.field1867 = (this.field1883 + 7) / 8;
    }

    @ObfuscatedName("do.hs(IB)I")
    public int method2426(int arg0) {
        return arg0 * 8 - this.field1883;
    }
}
