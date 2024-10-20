package deob;

@ObfuscatedName("dj")
public final class class114 extends class111 {

    @ObfuscatedName("dj.i")
    public class115 field1858;

    @ObfuscatedName("dj.r")
    public static final int[] field1855 = new int[] { 0, 1, 3, 7, 15, 31, 63, 127, 255, 511, 1023, 2047, 4095, 8191, 16383, 32767, 65535, 131071, 262143, 524287, 1048575, 2097151, 4194303, 8388607, 16777215, 33554431, 67108863, 134217727, 268435455, 536870911, 1073741823, Integer.MAX_VALUE, -1 };

    @ObfuscatedName("dj.f")
    public int field1856;

    public class114(int arg0) {
        super(arg0);
    }

    @ObfuscatedName("dj.hx([II)V")
    public void method2437(int[] arg0) {
        this.field1858 = new class115(arg0);
    }

    @ObfuscatedName("dj.hl(II)V")
    public void method2438(int arg0) {
        this.field1835[++this.field1834 - 1] = (byte) (arg0 + this.field1858.method2479());
    }

    @ObfuscatedName("dj.ho(I)I")
    public int method2457() {
        return this.field1835[++this.field1834 - 1] - this.field1858.method2479() & 0xFF;
    }

    @ObfuscatedName("dj.hi(B)V")
    public void method2456() {
        this.field1856 = this.field1834 * 8;
    }

    @ObfuscatedName("dj.hs(II)I")
    public int method2443(int arg0) {
        int var2 = this.field1856 >> 3;
        int var3 = 8 - (this.field1856 & 0x7);
        int var4 = 0;
        this.field1856 += arg0;
        while (arg0 > var3) {
            var4 += (this.field1835[var2++] & field1855[var3]) << arg0 - var3;
            arg0 -= var3;
            var3 = 8;
        }
        int var5;
        if (arg0 == var3) {
            var5 = (this.field1835[var2] & field1855[var3]) + var4;
        } else {
            var5 = (this.field1835[var2] >> var3 - arg0 & field1855[arg0]) + var4;
        }
        return var5;
    }

    @ObfuscatedName("dj.hu(B)V")
    public void method2442() {
        this.field1834 = (this.field1856 + 7) / 8;
    }

    @ObfuscatedName("dj.hj(II)I")
    public int method2464(int arg0) {
        return arg0 * 8 - this.field1856;
    }
}
