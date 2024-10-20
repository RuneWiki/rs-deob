package deob;

@ObfuscatedName("dm")
public final class class110 extends class107 {

    @ObfuscatedName("dm.m")
    public class111 field1851;

    @ObfuscatedName("dm.a")
    public static final int[] field1850 = new int[] { 0, 1, 3, 7, 15, 31, 63, 127, 255, 511, 1023, 2047, 4095, 8191, 16383, 32767, 65535, 131071, 262143, 524287, 1048575, 2097151, 4194303, 8388607, 16777215, 33554431, 67108863, 134217727, 268435455, 536870911, 1073741823, Integer.MAX_VALUE, -1 };

    @ObfuscatedName("dm.w")
    public int field1849;

    public class110(int arg0) {
        super(arg0);
    }

    @ObfuscatedName("dm.gn([II)V")
    public void method2353(int[] arg0) {
        this.field1851 = new class111(arg0);
    }

    @ObfuscatedName("dm.go(II)V")
    public void method2355(int arg0) {
        this.field1829[++this.field1826 - 1] = (byte) (arg0 + this.field1851.method2371());
    }

    @ObfuscatedName("dm.gt(I)I")
    public int method2347() {
        return this.field1829[++this.field1826 - 1] - this.field1851.method2371() & 0xFF;
    }

    @ObfuscatedName("dm.gl(I)V")
    public void method2348() {
        this.field1849 = this.field1826 * 8;
    }

    @ObfuscatedName("dm.gu(IB)I")
    public int method2349(int arg0) {
        int var2 = this.field1849 >> 3;
        int var3 = 8 - (this.field1849 & 0x7);
        int var4 = 0;
        this.field1849 += arg0;
        while (arg0 > var3) {
            var4 += (this.field1829[var2++] & field1850[var3]) << arg0 - var3;
            arg0 -= var3;
            var3 = 8;
        }
        int var5;
        if (arg0 == var3) {
            var5 = (this.field1829[var2] & field1850[var3]) + var4;
        } else {
            var5 = (this.field1829[var2] >> var3 - arg0 & field1850[arg0]) + var4;
        }
        return var5;
    }

    @ObfuscatedName("dm.gg(I)V")
    public void method2350() {
        this.field1826 = (this.field1849 + 7) / 8;
    }

    @ObfuscatedName("dm.gv(IB)I")
    public int method2351(int arg0) {
        return arg0 * 8 - this.field1849;
    }
}
