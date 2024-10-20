package deob;

@ObfuscatedName("dn")
public final class class110 extends class107 {

    @ObfuscatedName("dn.k")
    public class111 field1873;

    @ObfuscatedName("dn.b")
    public static final int[] field1871 = new int[] { 0, 1, 3, 7, 15, 31, 63, 127, 255, 511, 1023, 2047, 4095, 8191, 16383, 32767, 65535, 131071, 262143, 524287, 1048575, 2097151, 4194303, 8388607, 16777215, 33554431, 67108863, 134217727, 268435455, 536870911, 1073741823, Integer.MAX_VALUE, -1 };

    @ObfuscatedName("dn.n")
    public int field1870;

    public class110(int arg0) {
        super(arg0);
    }

    @ObfuscatedName("dn.hi([IB)V")
    public void method2368(int[] arg0) {
        this.field1873 = new class111(arg0);
    }

    @ObfuscatedName("dn.hl(IB)V")
    public void method2369(int arg0) {
        this.field1849[++this.field1847 - 1] = (byte) (arg0 + this.field1873.method2394());
    }

    @ObfuscatedName("dn.ht(B)I")
    public int method2370() {
        return this.field1849[++this.field1847 - 1] - this.field1873.method2394() & 0xFF;
    }

    @ObfuscatedName("dn.hj(I)V")
    public void method2371() {
        this.field1870 = this.field1847 * 8;
    }

    @ObfuscatedName("dn.hv(II)I")
    public int method2388(int arg0) {
        int var2 = this.field1870 >> 3;
        int var3 = 8 - (this.field1870 & 0x7);
        int var4 = 0;
        this.field1870 += arg0;
        while (arg0 > var3) {
            var4 += (this.field1849[var2++] & field1871[var3]) << arg0 - var3;
            arg0 -= var3;
            var3 = 8;
        }
        int var5;
        if (arg0 == var3) {
            var5 = (this.field1849[var2] & field1871[var3]) + var4;
        } else {
            var5 = (this.field1849[var2] >> var3 - arg0 & field1871[arg0]) + var4;
        }
        return var5;
    }

    @ObfuscatedName("dn.hw(I)V")
    public void method2373() {
        this.field1847 = (this.field1870 + 7) / 8;
    }

    @ObfuscatedName("dn.hc(IB)I")
    public int method2375(int arg0) {
        return arg0 * 8 - this.field1870;
    }
}
