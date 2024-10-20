package deob;

@ObfuscatedName("dl")
public final class class110 extends class107 {

    @ObfuscatedName("dl.i")
    public class111 field1865;

    @ObfuscatedName("dl.t")
    public static final int[] field1866 = new int[] { 0, 1, 3, 7, 15, 31, 63, 127, 255, 511, 1023, 2047, 4095, 8191, 16383, 32767, 65535, 131071, 262143, 524287, 1048575, 2097151, 4194303, 8388607, 16777215, 33554431, 67108863, 134217727, 268435455, 536870911, 1073741823, Integer.MAX_VALUE, -1 };

    @ObfuscatedName("dl.l")
    public int field1870;

    public class110(int arg0) {
        super(arg0);
    }

    @ObfuscatedName("dl.ga([II)V")
    public void method2305(int[] arg0) {
        this.field1865 = new class111(arg0);
    }

    @ObfuscatedName("dl.gy(II)V")
    public void method2306(int arg0) {
        this.field1854[++this.field1851 - 1] = (byte) (arg0 + this.field1865.method2329());
    }

    @ObfuscatedName("dl.gp(B)I")
    public int method2307() {
        return this.field1854[++this.field1851 - 1] - this.field1865.method2329() & 0xFF;
    }

    @ObfuscatedName("dl.gn(I)V")
    public void method2312() {
        this.field1870 = this.field1851 * 8;
    }

    @ObfuscatedName("dl.gv(II)I")
    public int method2309(int arg0) {
        int var2 = this.field1870 >> 3;
        int var3 = 8 - (this.field1870 & 0x7);
        int var4 = 0;
        this.field1870 += arg0;
        while (arg0 > var3) {
            var4 += (this.field1854[var2++] & field1866[var3]) << arg0 - var3;
            arg0 -= var3;
            var3 = 8;
        }
        int var5;
        if (arg0 == var3) {
            var5 = (this.field1854[var2] & field1866[var3]) + var4;
        } else {
            var5 = (this.field1854[var2] >> var3 - arg0 & field1866[arg0]) + var4;
        }
        return var5;
    }

    @ObfuscatedName("dl.gl(I)V")
    public void method2319() {
        this.field1851 = (this.field1870 + 7) / 8;
    }

    @ObfuscatedName("dl.gc(II)I")
    public int method2311(int arg0) {
        return arg0 * 8 - this.field1870;
    }
}
