package deob;

@ObfuscatedName("dh")
public final class class126 extends class123 {

    @ObfuscatedName("dh.m")
    public class127 field2065;

    @ObfuscatedName("dh.j")
    public static final int[] field2067 = new int[] { 0, 1, 3, 7, 15, 31, 63, 127, 255, 511, 1023, 2047, 4095, 8191, 16383, 32767, 65535, 131071, 262143, 524287, 1048575, 2097151, 4194303, 8388607, 16777215, 33554431, 67108863, 134217727, 268435455, 536870911, 1073741823, Integer.MAX_VALUE, -1 };

    @ObfuscatedName("dh.y")
    public int field2064;

    public class126(int arg0) {
        super(arg0);
    }

    @ObfuscatedName("dh.hl([II)V")
    public void method2643(int[] arg0) {
        this.field2065 = new class127(arg0);
    }

    @ObfuscatedName("dh.ho(IB)V")
    public void method2661(int arg0) {
        this.field2049[++this.field2046 - 1] = (byte) (arg0 + this.field2065.method2668());
    }

    @ObfuscatedName("dh.hc(B)I")
    public int method2648() {
        return this.field2049[++this.field2046 - 1] - this.field2065.method2668() & 0xFF;
    }

    @ObfuscatedName("dh.hn(I)V")
    public void method2646() {
        this.field2064 = this.field2046 * 8;
    }

    @ObfuscatedName("dh.hj(II)I")
    public int method2647(int arg0) {
        int var2 = this.field2064 >> 3;
        int var3 = 8 - (this.field2064 & 0x7);
        int var4 = 0;
        this.field2064 += arg0;
        while (arg0 > var3) {
            var4 += (this.field2049[var2++] & field2067[var3]) << arg0 - var3;
            arg0 -= var3;
            var3 = 8;
        }
        int var5;
        if (arg0 == var3) {
            var5 = (this.field2049[var2] & field2067[var3]) + var4;
        } else {
            var5 = (this.field2049[var2] >> var3 - arg0 & field2067[arg0]) + var4;
        }
        return var5;
    }

    @ObfuscatedName("dh.hq(B)V")
    public void method2650() {
        this.field2046 = (this.field2064 + 7) / 8;
    }

    @ObfuscatedName("dh.ha(IB)I")
    public int method2649(int arg0) {
        return arg0 * 8 - this.field2064;
    }
}
