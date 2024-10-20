package deob;

@ObfuscatedName("dp")
public final class class126 extends class123 {

    @ObfuscatedName("dp.k")
    public class127 field2056;

    @ObfuscatedName("dp.h")
    public static final int[] field2055 = new int[] { 0, 1, 3, 7, 15, 31, 63, 127, 255, 511, 1023, 2047, 4095, 8191, 16383, 32767, 65535, 131071, 262143, 524287, 1048575, 2097151, 4194303, 8388607, 16777215, 33554431, 67108863, 134217727, 268435455, 536870911, 1073741823, Integer.MAX_VALUE, -1 };

    @ObfuscatedName("dp.r")
    public int field2054;

    public class126(int arg0) {
        super(arg0);
    }

    @ObfuscatedName("dp.hx([IB)V")
    public void method2629(int[] arg0) {
        this.field2056 = new class127(arg0);
    }

    @ObfuscatedName("dp.ih(II)V")
    public void method2630(int arg0) {
        this.field2033[++this.field2028 - 1] = (byte) (arg0 + this.field2056.method2664());
    }

    @ObfuscatedName("dp.iq(I)I")
    public int method2631() {
        return this.field2033[++this.field2028 - 1] - this.field2056.method2664() & 0xFF;
    }

    @ObfuscatedName("dp.ia(S)V")
    public void method2632() {
        this.field2054 = this.field2028 * 8;
    }

    @ObfuscatedName("dp.io(IB)I")
    public int method2644(int arg0) {
        int var2 = this.field2054 >> 3;
        int var3 = 8 - (this.field2054 & 0x7);
        int var4 = 0;
        this.field2054 += arg0;
        while (arg0 > var3) {
            var4 += (this.field2033[var2++] & field2055[var3]) << arg0 - var3;
            arg0 -= var3;
            var3 = 8;
        }
        int var5;
        if (arg0 == var3) {
            var5 = (this.field2033[var2] & field2055[var3]) + var4;
        } else {
            var5 = (this.field2033[var2] >> var3 - arg0 & field2055[arg0]) + var4;
        }
        return var5;
    }

    @ObfuscatedName("dp.ij(I)V")
    public void method2633() {
        this.field2028 = (this.field2054 + 7) / 8;
    }

    @ObfuscatedName("dp.il(IB)I")
    public int method2635(int arg0) {
        return arg0 * 8 - this.field2054;
    }
}
