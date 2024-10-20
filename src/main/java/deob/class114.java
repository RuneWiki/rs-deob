package deob;

@ObfuscatedName("df")
public final class class114 extends class111 {

    @ObfuscatedName("df.f")
    public class115 field1914;

    @ObfuscatedName("df.b")
    public static final int[] field1915 = new int[] { 0, 1, 3, 7, 15, 31, 63, 127, 255, 511, 1023, 2047, 4095, 8191, 16383, 32767, 65535, 131071, 262143, 524287, 1048575, 2097151, 4194303, 8388607, 16777215, 33554431, 67108863, 134217727, 268435455, 536870911, 1073741823, Integer.MAX_VALUE, -1 };

    @ObfuscatedName("df.t")
    public int field1917;

    public class114(int arg0) {
        super(arg0);
    }

    @ObfuscatedName("df.ga([IB)V")
    public void method2445(int[] arg0) {
        this.field1914 = new class115(arg0);
    }

    @ObfuscatedName("df.gr(IS)V")
    public void method2453(int arg0) {
        this.field1904[++this.field1896 - 1] = (byte) (arg0 + this.field1914.method2470());
    }

    @ObfuscatedName("df.gv(S)I")
    public int method2446() {
        return this.field1904[++this.field1896 - 1] - this.field1914.method2470() & 0xFF;
    }

    @ObfuscatedName("df.gy(I)V")
    public void method2457() {
        this.field1917 = this.field1896 * 8;
    }

    @ObfuscatedName("df.gs(II)I")
    public int method2459(int arg0) {
        int var2 = this.field1917 >> 3;
        int var3 = 8 - (this.field1917 & 0x7);
        int var4 = 0;
        this.field1917 += arg0;
        while (arg0 > var3) {
            var4 += (this.field1904[var2++] & field1915[var3]) << arg0 - var3;
            arg0 -= var3;
            var3 = 8;
        }
        int var5;
        if (arg0 == var3) {
            var5 = (this.field1904[var2] & field1915[var3]) + var4;
        } else {
            var5 = (this.field1904[var2] >> var3 - arg0 & field1915[arg0]) + var4;
        }
        return var5;
    }

    @ObfuscatedName("df.gw(I)V")
    public void method2449() {
        this.field1896 = (this.field1917 + 7) / 8;
    }

    @ObfuscatedName("df.gh(II)I")
    public int method2450(int arg0) {
        return arg0 * 8 - this.field1917;
    }
}
