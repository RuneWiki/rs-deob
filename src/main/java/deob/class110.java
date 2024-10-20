package deob;

@ObfuscatedName("dz")
public final class class110 extends class107 {

    @ObfuscatedName("dz.r")
    public class111 field1855;

    @ObfuscatedName("dz.w")
    public static final int[] field1854 = new int[] { 0, 1, 3, 7, 15, 31, 63, 127, 255, 511, 1023, 2047, 4095, 8191, 16383, 32767, 65535, 131071, 262143, 524287, 1048575, 2097151, 4194303, 8388607, 16777215, 33554431, 67108863, 134217727, 268435455, 536870911, 1073741823, Integer.MAX_VALUE, -1 };

    @ObfuscatedName("dz.u")
    public int field1856;

    public class110(int arg0) {
        super(arg0);
    }

    @ObfuscatedName("dz.hy([II)V")
    public void method2407(int[] arg0) {
        this.field1855 = new class111(arg0);
    }

    @ObfuscatedName("dz.hb(IB)V")
    public void method2408(int arg0) {
        this.field1838[++this.field1837 - 1] = (byte) (arg0 + this.field1855.method2434());
    }

    @ObfuscatedName("dz.hv(B)I")
    public int method2428() {
        return this.field1838[++this.field1837 - 1] - this.field1855.method2434() & 0xFF;
    }

    @ObfuscatedName("dz.hh(I)V")
    public void method2425() {
        this.field1856 = this.field1837 * 8;
    }

    @ObfuscatedName("dz.hi(II)I")
    public int method2409(int arg0) {
        int var2 = this.field1856 >> 3;
        int var3 = 8 - (this.field1856 & 0x7);
        int var4 = 0;
        this.field1856 += arg0;
        while (arg0 > var3) {
            var4 += (this.field1838[var2++] & field1854[var3]) << arg0 - var3;
            arg0 -= var3;
            var3 = 8;
        }
        int var5;
        if (arg0 == var3) {
            var5 = (this.field1838[var2] & field1854[var3]) + var4;
        } else {
            var5 = (this.field1838[var2] >> var3 - arg0 & field1854[arg0]) + var4;
        }
        return var5;
    }

    @ObfuscatedName("dz.hw(I)V")
    public void method2410() {
        this.field1837 = (this.field1856 + 7) / 8;
    }

    @ObfuscatedName("dz.ha(II)I")
    public int method2411(int arg0) {
        return arg0 * 8 - this.field1856;
    }
}
