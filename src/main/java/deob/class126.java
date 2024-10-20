package deob;

@ObfuscatedName("dz")
public final class class126 extends class123 {

    @ObfuscatedName("dz.g")
    public class127 field2088;

    @ObfuscatedName("dz.m")
    public static final int[] field2094 = new int[] { 0, 1, 3, 7, 15, 31, 63, 127, 255, 511, 1023, 2047, 4095, 8191, 16383, 32767, 65535, 131071, 262143, 524287, 1048575, 2097151, 4194303, 8388607, 16777215, 33554431, 67108863, 134217727, 268435455, 536870911, 1073741823, Integer.MAX_VALUE, -1 };

    @ObfuscatedName("dz.k")
    public int field2089;

    public class126(int arg0) {
        super(arg0);
    }

    @ObfuscatedName("dz.hz([IB)V")
    public void method2649(int[] arg0) {
        this.field2088 = new class127(arg0);
    }

    @ObfuscatedName("dz.iu(II)V")
    public void method2668(int arg0) {
        this.field2076[++this.field2071 - 1] = (byte) (arg0 + this.field2088.method2679());
    }

    @ObfuscatedName("dz.iw(I)I")
    public int method2660() {
        return this.field2076[++this.field2071 - 1] - this.field2088.method2679() & 0xFF;
    }

    @ObfuscatedName("dz.iq(B)V")
    public void method2651() {
        this.field2089 = this.field2071 * 8;
    }

    @ObfuscatedName("dz.ij(II)I")
    public int method2659(int arg0) {
        int var2 = this.field2089 >> 3;
        int var3 = 8 - (this.field2089 & 0x7);
        int var4 = 0;
        this.field2089 += arg0;
        while (arg0 > var3) {
            var4 += (this.field2076[var2++] & field2094[var3]) << arg0 - var3;
            arg0 -= var3;
            var3 = 8;
        }
        int var5;
        if (arg0 == var3) {
            var5 = (this.field2076[var2] & field2094[var3]) + var4;
        } else {
            var5 = (this.field2076[var2] >> var3 - arg0 & field2094[arg0]) + var4;
        }
        return var5;
    }

    @ObfuscatedName("dz.ix(B)V")
    public void method2672() {
        this.field2071 = (this.field2089 + 7) / 8;
    }

    @ObfuscatedName("dz.id(IB)I")
    public int method2654(int arg0) {
        return arg0 * 8 - this.field2089;
    }
}
