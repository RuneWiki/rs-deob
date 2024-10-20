package deob;

@ObfuscatedName("dp")
public final class class122 extends class119 {

    @ObfuscatedName("dp.o")
    public class123 field1992;

    @ObfuscatedName("dp.s")
    public static final int[] field1989 = new int[] { 0, 1, 3, 7, 15, 31, 63, 127, 255, 511, 1023, 2047, 4095, 8191, 16383, 32767, 65535, 131071, 262143, 524287, 1048575, 2097151, 4194303, 8388607, 16777215, 33554431, 67108863, 134217727, 268435455, 536870911, 1073741823, Integer.MAX_VALUE, -1 };

    @ObfuscatedName("dp.k")
    public int field1991;

    public class122(int arg0) {
        super(arg0);
    }

    @ObfuscatedName("dp.hi([II)V")
    public void method2634(int[] arg0) {
        this.field1992 = new class123(arg0);
    }

    @ObfuscatedName("dp.ha(II)V")
    public void method2631(int arg0) {
        this.field1978[++this.field1973 - 1] = (byte) (arg0 + this.field1992.method2661());
    }

    @ObfuscatedName("dp.hx(I)I")
    public int method2632() {
        return this.field1978[++this.field1973 - 1] - this.field1992.method2661() & 0xFF;
    }

    @ObfuscatedName("dp.hk(I)V")
    public void method2629() {
        this.field1991 = this.field1973 * 8;
    }

    @ObfuscatedName("dp.hj(II)I")
    public int method2630(int arg0) {
        int var2 = this.field1991 >> 3;
        int var3 = 8 - (this.field1991 & 0x7);
        int var4 = 0;
        this.field1991 += arg0;
        while (arg0 > var3) {
            var4 += (this.field1978[var2++] & field1989[var3]) << arg0 - var3;
            arg0 -= var3;
            var3 = 8;
        }
        int var5;
        if (arg0 == var3) {
            var5 = (this.field1978[var2] & field1989[var3]) + var4;
        } else {
            var5 = (this.field1978[var2] >> var3 - arg0 & field1989[arg0]) + var4;
        }
        return var5;
    }

    @ObfuscatedName("dp.hc(I)V")
    public void method2644() {
        this.field1973 = (this.field1991 + 7) / 8;
    }

    @ObfuscatedName("dp.hy(II)I")
    public int method2636(int arg0) {
        return arg0 * 8 - this.field1991;
    }
}
