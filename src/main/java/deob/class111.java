package deob;

@ObfuscatedName("df")
public final class class111 extends class108 {

    @ObfuscatedName("df.a")
    public class112 field1867;

    @ObfuscatedName("df.b")
    public static final int[] field1861 = new int[] { 0, 1, 3, 7, 15, 31, 63, 127, 255, 511, 1023, 2047, 4095, 8191, 16383, 32767, 65535, 131071, 262143, 524287, 1048575, 2097151, 4194303, 8388607, 16777215, 33554431, 67108863, 134217727, 268435455, 536870911, 1073741823, Integer.MAX_VALUE, -1 };

    @ObfuscatedName("df.z")
    public int field1862;

    public class111(int arg0) {
        super(arg0);
    }

    @ObfuscatedName("df.hv([IS)V")
    public void method2358(int[] arg0) {
        this.field1867 = new class112(arg0);
    }

    @ObfuscatedName("df.hc(IB)V")
    public void method2357(int arg0) {
        this.field1842[++this.field1841 - 1] = (byte) (arg0 + this.field1867.method2384());
    }

    @ObfuscatedName("df.ho(B)I")
    public int method2359() {
        return this.field1842[++this.field1841 - 1] - this.field1867.method2384() & 0xFF;
    }

    @ObfuscatedName("df.hz(B)V")
    public void method2383() {
        this.field1862 = this.field1841 * 8;
    }

    @ObfuscatedName("df.hu(II)I")
    public int method2366(int arg0) {
        int var2 = this.field1862 >> 3;
        int var3 = 8 - (this.field1862 & 0x7);
        int var4 = 0;
        this.field1862 += arg0;
        while (arg0 > var3) {
            var4 += (this.field1842[var2++] & field1861[var3]) << arg0 - var3;
            arg0 -= var3;
            var3 = 8;
        }
        int var5;
        if (arg0 == var3) {
            var5 = (this.field1842[var2] & field1861[var3]) + var4;
        } else {
            var5 = (this.field1842[var2] >> var3 - arg0 & field1861[arg0]) + var4;
        }
        return var5;
    }

    @ObfuscatedName("df.ha(I)V")
    public void method2361() {
        this.field1841 = (this.field1862 + 7) / 8;
    }

    @ObfuscatedName("df.hy(II)I")
    public int method2362(int arg0) {
        return arg0 * 8 - this.field1862;
    }
}
