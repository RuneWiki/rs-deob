package deob;

@ObfuscatedName("db")
public final class class111 extends class108 {

    @ObfuscatedName("db.n")
    public class112 field1870;

    @ObfuscatedName("db.x")
    public static final int[] field1874 = new int[] { 0, 1, 3, 7, 15, 31, 63, 127, 255, 511, 1023, 2047, 4095, 8191, 16383, 32767, 65535, 131071, 262143, 524287, 1048575, 2097151, 4194303, 8388607, 16777215, 33554431, 67108863, 134217727, 268435455, 536870911, 1073741823, Integer.MAX_VALUE, -1 };

    @ObfuscatedName("db.g")
    public int field1872;

    public class111(int arg0) {
        super(arg0);
    }

    @ObfuscatedName("db.hk([II)V")
    public void method2401(int[] arg0) {
        this.field1870 = new class112(arg0);
    }

    @ObfuscatedName("db.hq(II)V")
    public void method2406(int arg0) {
        this.field1854[++this.field1859 - 1] = (byte) (arg0 + this.field1870.method2422());
    }

    @ObfuscatedName("db.hr(B)I")
    public int method2416() {
        return this.field1854[++this.field1859 - 1] - this.field1870.method2422() & 0xFF;
    }

    @ObfuscatedName("db.hl(B)V")
    public void method2396() {
        this.field1872 = this.field1859 * 8;
    }

    @ObfuscatedName("db.hy(IB)I")
    public int method2400(int arg0) {
        int var2 = this.field1872 >> 3;
        int var3 = 8 - (this.field1872 & 0x7);
        int var4 = 0;
        this.field1872 += arg0;
        while (arg0 > var3) {
            var4 += (this.field1854[var2++] & field1874[var3]) << arg0 - var3;
            arg0 -= var3;
            var3 = 8;
        }
        int var5;
        if (arg0 == var3) {
            var5 = (this.field1854[var2] & field1874[var3]) + var4;
        } else {
            var5 = (this.field1854[var2] >> var3 - arg0 & field1874[arg0]) + var4;
        }
        return var5;
    }

    @ObfuscatedName("db.ha(I)V")
    public void method2410() {
        this.field1859 = (this.field1872 + 7) / 8;
    }

    @ObfuscatedName("db.hw(IB)I")
    public int method2402(int arg0) {
        return arg0 * 8 - this.field1872;
    }
}
