package deob;

@ObfuscatedName("dl")
public final class class126 extends class123 {

    @ObfuscatedName("dl.c")
    public class127 field2070;

    @ObfuscatedName("dl.w")
    public static final int[] field2071 = new int[] { 0, 1, 3, 7, 15, 31, 63, 127, 255, 511, 1023, 2047, 4095, 8191, 16383, 32767, 65535, 131071, 262143, 524287, 1048575, 2097151, 4194303, 8388607, 16777215, 33554431, 67108863, 134217727, 268435455, 536870911, 1073741823, Integer.MAX_VALUE, -1 };

    @ObfuscatedName("dl.l")
    public int field2072;

    public class126(int arg0) {
        super(arg0);
    }

    @ObfuscatedName("dl.hd([II)V")
    public void method2633(int[] arg0) {
        this.field2070 = new class127(arg0);
    }

    @ObfuscatedName("dl.ht(II)V")
    public void method2634(int arg0) {
        this.field2053[++this.field2052 - 1] = (byte) (arg0 + this.field2070.method2658());
    }

    @ObfuscatedName("dl.hf(B)I")
    public int method2648() {
        return this.field2053[++this.field2052 - 1] - this.field2070.method2658() & 0xFF;
    }

    @ObfuscatedName("dl.hw(I)V")
    public void method2636() {
        this.field2072 = this.field2052 * 8;
    }

    @ObfuscatedName("dl.hj(IB)I")
    public int method2637(int arg0) {
        int var2 = this.field2072 >> 3;
        int var3 = 8 - (this.field2072 & 0x7);
        int var4 = 0;
        this.field2072 += arg0;
        while (arg0 > var3) {
            var4 += (this.field2053[var2++] & field2071[var3]) << arg0 - var3;
            arg0 -= var3;
            var3 = 8;
        }
        int var5;
        if (arg0 == var3) {
            var5 = (this.field2053[var2] & field2071[var3]) + var4;
        } else {
            var5 = (this.field2053[var2] >> var3 - arg0 & field2071[arg0]) + var4;
        }
        return var5;
    }

    @ObfuscatedName("dl.hk(I)V")
    public void method2644() {
        this.field2052 = (this.field2072 + 7) / 8;
    }

    @ObfuscatedName("dl.hv(IB)I")
    public int method2653(int arg0) {
        return arg0 * 8 - this.field2072;
    }
}
