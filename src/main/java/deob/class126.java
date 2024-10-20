package deob;

@ObfuscatedName("dx")
public final class class126 extends class123 {

    @ObfuscatedName("dx.x")
    public class127 field2068;

    @ObfuscatedName("dx.k")
    public static final int[] field2069 = new int[] { 0, 1, 3, 7, 15, 31, 63, 127, 255, 511, 1023, 2047, 4095, 8191, 16383, 32767, 65535, 131071, 262143, 524287, 1048575, 2097151, 4194303, 8388607, 16777215, 33554431, 67108863, 134217727, 268435455, 536870911, 1073741823, Integer.MAX_VALUE, -1 };

    @ObfuscatedName("dx.v")
    public int field2070;

    public class126(int arg0) {
        super(arg0);
    }

    @ObfuscatedName("dx.gh([IB)V")
    public void method2638(int[] arg0) {
        this.field2068 = new class127(arg0);
    }

    @ObfuscatedName("dx.gm(IB)V")
    public void method2639(int arg0) {
        this.field2048[++this.field2046 - 1] = (byte) (arg0 + this.field2068.method2673());
    }

    @ObfuscatedName("dx.gv(B)I")
    public int method2647() {
        return this.field2048[++this.field2046 - 1] - this.field2068.method2673() & 0xFF;
    }

    @ObfuscatedName("dx.ga(I)V")
    public void method2641() {
        this.field2070 = this.field2046 * 8;
    }

    @ObfuscatedName("dx.gd(II)I")
    public int method2655(int arg0) {
        int var2 = this.field2070 >> 3;
        int var3 = 8 - (this.field2070 & 0x7);
        int var4 = 0;
        this.field2070 += arg0;
        while (arg0 > var3) {
            var4 += (this.field2048[var2++] & field2069[var3]) << arg0 - var3;
            arg0 -= var3;
            var3 = 8;
        }
        int var5;
        if (arg0 == var3) {
            var5 = (this.field2048[var2] & field2069[var3]) + var4;
        } else {
            var5 = (this.field2048[var2] >> var3 - arg0 & field2069[arg0]) + var4;
        }
        return var5;
    }

    @ObfuscatedName("dx.gs(B)V")
    public void method2642() {
        this.field2046 = (this.field2070 + 7) / 8;
    }

    @ObfuscatedName("dx.hg(IB)I")
    public int method2643(int arg0) {
        return arg0 * 8 - this.field2070;
    }
}
