package deob;

@ObfuscatedName("dg")
public final class class113 extends class110 {

    @ObfuscatedName("dg.n")
    public class114 field1880;

    @ObfuscatedName("dg.o")
    public static final int[] field1879 = new int[] { 0, 1, 3, 7, 15, 31, 63, 127, 255, 511, 1023, 2047, 4095, 8191, 16383, 32767, 65535, 131071, 262143, 524287, 1048575, 2097151, 4194303, 8388607, 16777215, 33554431, 67108863, 134217727, 268435455, 536870911, 1073741823, Integer.MAX_VALUE, -1 };

    @ObfuscatedName("dg.g")
    public int field1877;

    public class113(int arg0) {
        super(arg0);
    }

    @ObfuscatedName("dg.gz([II)V")
    public void method2365(int[] arg0) {
        this.field1880 = new class114(arg0);
    }

    @ObfuscatedName("dg.gd(II)V")
    public void method2381(int arg0) {
        this.field1862[++this.field1855 - 1] = (byte) (arg0 + this.field1880.method2387());
    }

    @ObfuscatedName("dg.gc(I)I")
    public int method2367() {
        return this.field1862[++this.field1855 - 1] - this.field1880.method2387() & 0xFF;
    }

    @ObfuscatedName("dg.gl(I)V")
    public void method2368() {
        this.field1877 = this.field1855 * 8;
    }

    @ObfuscatedName("dg.gu(II)I")
    public int method2375(int arg0) {
        int var2 = this.field1877 >> 3;
        int var3 = 8 - (this.field1877 & 0x7);
        int var4 = 0;
        this.field1877 += arg0;
        while (arg0 > var3) {
            var4 += (this.field1862[var2++] & field1879[var3]) << arg0 - var3;
            arg0 -= var3;
            var3 = 8;
        }
        int var5;
        if (arg0 == var3) {
            var5 = (this.field1862[var2] & field1879[var3]) + var4;
        } else {
            var5 = (this.field1862[var2] >> var3 - arg0 & field1879[arg0]) + var4;
        }
        return var5;
    }

    @ObfuscatedName("dg.hg(B)V")
    public void method2369() {
        this.field1855 = (this.field1877 + 7) / 8;
    }

    @ObfuscatedName("dg.hr(II)I")
    public int method2373(int arg0) {
        return arg0 * 8 - this.field1877;
    }
}
