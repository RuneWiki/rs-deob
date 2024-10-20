package deob;

@ObfuscatedName("dg")
public final class class113 extends class110 {

    @ObfuscatedName("dg.k")
    public class114 field1871;

    @ObfuscatedName("dg.p")
    public static final int[] field1870 = new int[] { 0, 1, 3, 7, 15, 31, 63, 127, 255, 511, 1023, 2047, 4095, 8191, 16383, 32767, 65535, 131071, 262143, 524287, 1048575, 2097151, 4194303, 8388607, 16777215, 33554431, 67108863, 134217727, 268435455, 536870911, 1073741823, Integer.MAX_VALUE, -1 };

    @ObfuscatedName("dg.y")
    public int field1869;

    public class113(int arg0) {
        super(arg0);
    }

    @ObfuscatedName("dg.hr([II)V")
    public void method2397(int[] arg0) {
        this.field1871 = new class114(arg0);
    }

    @ObfuscatedName("dg.hv(IB)V")
    public void method2414(int arg0) {
        this.field1853[++this.field1847 - 1] = (byte) (arg0 + this.field1871.method2427());
    }

    @ObfuscatedName("dg.hm(I)I")
    public int method2399() {
        return this.field1853[++this.field1847 - 1] - this.field1871.method2427() & 0xFF;
    }

    @ObfuscatedName("dg.hx(I)V")
    public void method2400() {
        this.field1869 = this.field1847 * 8;
    }

    @ObfuscatedName("dg.hh(II)I")
    public int method2401(int arg0) {
        int var2 = this.field1869 >> 3;
        int var3 = 8 - (this.field1869 & 0x7);
        int var4 = 0;
        this.field1869 += arg0;
        while (arg0 > var3) {
            var4 += (this.field1853[var2++] & field1870[var3]) << arg0 - var3;
            arg0 -= var3;
            var3 = 8;
        }
        int var5;
        if (arg0 == var3) {
            var5 = (this.field1853[var2] & field1870[var3]) + var4;
        } else {
            var5 = (this.field1853[var2] >> var3 - arg0 & field1870[arg0]) + var4;
        }
        return var5;
    }

    @ObfuscatedName("dg.ha(I)V")
    public void method2402() {
        this.field1847 = (this.field1869 + 7) / 8;
    }

    @ObfuscatedName("dg.hq(IB)I")
    public int method2403(int arg0) {
        return arg0 * 8 - this.field1869;
    }
}
