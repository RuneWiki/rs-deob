package deob;

@ObfuscatedName("db")
public final class class111 extends class108 {

    @ObfuscatedName("db.x")
    public class112 field1842;

    @ObfuscatedName("db.f")
    public static final int[] field1844 = new int[] { 0, 1, 3, 7, 15, 31, 63, 127, 255, 511, 1023, 2047, 4095, 8191, 16383, 32767, 65535, 131071, 262143, 524287, 1048575, 2097151, 4194303, 8388607, 16777215, 33554431, 67108863, 134217727, 268435455, 536870911, 1073741823, Integer.MAX_VALUE, -1 };

    @ObfuscatedName("db.t")
    public int field1841;

    public class111(int arg0) {
        super(arg0);
    }

    @ObfuscatedName("db.gn([II)V")
    public void method2382(int[] arg0) {
        this.field1842 = new class112(arg0);
    }

    @ObfuscatedName("db.gy(II)V")
    public void method2391(int arg0) {
        this.field1828[++this.field1823 - 1] = (byte) (arg0 + this.field1842.method2405());
    }

    @ObfuscatedName("db.gd(B)I")
    public int method2402() {
        return this.field1828[++this.field1823 - 1] - this.field1842.method2405() & 0xFF;
    }

    @ObfuscatedName("db.gj(I)V")
    public void method2384() {
        this.field1841 = this.field1823 * 8;
    }

    @ObfuscatedName("db.gt(IB)I")
    public int method2385(int arg0) {
        int var2 = this.field1841 >> 3;
        int var3 = 8 - (this.field1841 & 0x7);
        int var4 = 0;
        this.field1841 += arg0;
        while (arg0 > var3) {
            var4 += (this.field1828[var2++] & field1844[var3]) << arg0 - var3;
            arg0 -= var3;
            var3 = 8;
        }
        int var5;
        if (arg0 == var3) {
            var5 = (this.field1828[var2] & field1844[var3]) + var4;
        } else {
            var5 = (this.field1828[var2] >> var3 - arg0 & field1844[arg0]) + var4;
        }
        return var5;
    }

    @ObfuscatedName("db.gz(I)V")
    public void method2386() {
        this.field1823 = (this.field1841 + 7) / 8;
    }

    @ObfuscatedName("db.gw(II)I")
    public int method2397(int arg0) {
        return arg0 * 8 - this.field1841;
    }
}
