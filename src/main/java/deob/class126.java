package deob;

@ObfuscatedName("dt")
public final class class126 extends class123 {

    @ObfuscatedName("dt.u")
    public class127 field2076;

    @ObfuscatedName("dt.h")
    public static final int[] field2074 = new int[] { 0, 1, 3, 7, 15, 31, 63, 127, 255, 511, 1023, 2047, 4095, 8191, 16383, 32767, 65535, 131071, 262143, 524287, 1048575, 2097151, 4194303, 8388607, 16777215, 33554431, 67108863, 134217727, 268435455, 536870911, 1073741823, Integer.MAX_VALUE, -1 };

    @ObfuscatedName("dt.l")
    public int field2073;

    public class126(int arg0) {
        super(arg0);
    }

    @ObfuscatedName("dt.hp([IB)V")
    public void method2660(int[] arg0) {
        this.field2076 = new class127(arg0);
    }

    @ObfuscatedName("dt.hn(IB)V")
    public void method2684(int arg0) {
        this.field2054[++this.field2060 - 1] = (byte) (arg0 + this.field2076.method2700());
    }

    @ObfuscatedName("dt.hx(I)I")
    public int method2676() {
        return this.field2054[++this.field2060 - 1] - this.field2076.method2700() & 0xFF;
    }

    @ObfuscatedName("dt.hw(I)V")
    public void method2662() {
        this.field2073 = this.field2060 * 8;
    }

    @ObfuscatedName("dt.he(II)I")
    public int method2663(int arg0) {
        int var2 = this.field2073 >> 3;
        int var3 = 8 - (this.field2073 & 0x7);
        int var4 = 0;
        this.field2073 += arg0;
        while (arg0 > var3) {
            var4 += (this.field2054[var2++] & field2074[var3]) << arg0 - var3;
            arg0 -= var3;
            var3 = 8;
        }
        int var5;
        if (arg0 == var3) {
            var5 = (this.field2054[var2] & field2074[var3]) + var4;
        } else {
            var5 = (this.field2054[var2] >> var3 - arg0 & field2074[arg0]) + var4;
        }
        return var5;
    }

    @ObfuscatedName("dt.ha(I)V")
    public void method2683() {
        this.field2060 = (this.field2073 + 7) / 8;
    }

    @ObfuscatedName("dt.hs(II)I")
    public int method2680(int arg0) {
        return arg0 * 8 - this.field2073;
    }
}
