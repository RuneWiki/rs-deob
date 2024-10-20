package deob;

@ObfuscatedName("dj")
public final class class110 extends class107 {

    @ObfuscatedName("dj.e")
    public class111 field1862;

    @ObfuscatedName("dj.j")
    public static final int[] field1857 = new int[] { 0, 1, 3, 7, 15, 31, 63, 127, 255, 511, 1023, 2047, 4095, 8191, 16383, 32767, 65535, 131071, 262143, 524287, 1048575, 2097151, 4194303, 8388607, 16777215, 33554431, 67108863, 134217727, 268435455, 536870911, 1073741823, Integer.MAX_VALUE, -1 };

    @ObfuscatedName("dj.n")
    public int field1858;

    public class110(int arg0) {
        super(arg0);
    }

    @ObfuscatedName("dj.gz([II)V")
    public void method2363(int[] arg0) {
        this.field1862 = new class111(arg0);
    }

    @ObfuscatedName("dj.gd(II)V")
    public void method2354(int arg0) {
        this.field1840[++this.field1839 - 1] = (byte) (arg0 + this.field1862.method2385());
    }

    @ObfuscatedName("dj.gn(I)I")
    public int method2369() {
        return this.field1840[++this.field1839 - 1] - this.field1862.method2385() & 0xFF;
    }

    @ObfuscatedName("dj.ge(I)V")
    public void method2352() {
        this.field1858 = this.field1839 * 8;
    }

    @ObfuscatedName("dj.gb(II)I")
    public int method2353(int arg0) {
        int var2 = this.field1858 >> 3;
        int var3 = 8 - (this.field1858 & 0x7);
        int var4 = 0;
        this.field1858 += arg0;
        while (arg0 > var3) {
            var4 += (this.field1840[var2++] & field1857[var3]) << arg0 - var3;
            arg0 -= var3;
            var3 = 8;
        }
        int var5;
        if (arg0 == var3) {
            var5 = (this.field1840[var2] & field1857[var3]) + var4;
        } else {
            var5 = (this.field1840[var2] >> var3 - arg0 & field1857[arg0]) + var4;
        }
        return var5;
    }

    @ObfuscatedName("dj.gj(B)V")
    public void method2358() {
        this.field1839 = (this.field1858 + 7) / 8;
    }

    @ObfuscatedName("dj.gf(II)I")
    public int method2350(int arg0) {
        return arg0 * 8 - this.field1858;
    }
}
