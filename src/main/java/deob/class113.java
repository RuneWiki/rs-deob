package deob;

@ObfuscatedName("dp")
public final class class113 extends class110 {

    @ObfuscatedName("dp.z")
    public class114 field1864;

    @ObfuscatedName("dp.o")
    public static final int[] field1862 = new int[] { 0, 1, 3, 7, 15, 31, 63, 127, 255, 511, 1023, 2047, 4095, 8191, 16383, 32767, 65535, 131071, 262143, 524287, 1048575, 2097151, 4194303, 8388607, 16777215, 33554431, 67108863, 134217727, 268435455, 536870911, 1073741823, Integer.MAX_VALUE, -1 };

    @ObfuscatedName("dp.k")
    public int field1863;

    public class113(int arg0) {
        super(arg0);
    }

    @ObfuscatedName("dp.hv([II)V")
    public void method2366(int[] arg0) {
        this.field1864 = new class114(arg0);
    }

    @ObfuscatedName("dp.hr(IS)V")
    public void method2367(int arg0) {
        this.field1844[++this.field1842 - 1] = (byte) (arg0 + this.field1864.method2396());
    }

    @ObfuscatedName("dp.hj(B)I")
    public int method2368() {
        return this.field1844[++this.field1842 - 1] - this.field1864.method2396() & 0xFF;
    }

    @ObfuscatedName("dp.hn(I)V")
    public void method2393() {
        this.field1863 = this.field1842 * 8;
    }

    @ObfuscatedName("dp.ha(II)I")
    public int method2370(int arg0) {
        int var2 = this.field1863 >> 3;
        int var3 = 8 - (this.field1863 & 0x7);
        int var4 = 0;
        this.field1863 += arg0;
        while (arg0 > var3) {
            var4 += (this.field1844[var2++] & field1862[var3]) << arg0 - var3;
            arg0 -= var3;
            var3 = 8;
        }
        int var5;
        if (arg0 == var3) {
            var5 = (this.field1844[var2] & field1862[var3]) + var4;
        } else {
            var5 = (this.field1844[var2] >> var3 - arg0 & field1862[arg0]) + var4;
        }
        return var5;
    }

    @ObfuscatedName("dp.hp(S)V")
    public void method2371() {
        this.field1842 = (this.field1863 + 7) / 8;
    }

    @ObfuscatedName("dp.hs(IB)I")
    public int method2372(int arg0) {
        return arg0 * 8 - this.field1863;
    }
}
