package deob;

@ObfuscatedName("dq")
public final class class126 extends class123 {

    @ObfuscatedName("dq.o")
    public class127 field2074;

    @ObfuscatedName("dq.p")
    public static final int[] field2073 = new int[] { 0, 1, 3, 7, 15, 31, 63, 127, 255, 511, 1023, 2047, 4095, 8191, 16383, 32767, 65535, 131071, 262143, 524287, 1048575, 2097151, 4194303, 8388607, 16777215, 33554431, 67108863, 134217727, 268435455, 536870911, 1073741823, Integer.MAX_VALUE, -1 };

    @ObfuscatedName("dq.i")
    public int field2075;

    public class126(int arg0) {
        super(arg0);
    }

    @ObfuscatedName("dq.hb([II)V")
    public void method2709(int[] arg0) {
        this.field2074 = new class127(arg0);
    }

    @ObfuscatedName("dq.hh(II)V")
    public void method2708(int arg0) {
        this.field2055[++this.field2062 - 1] = (byte) (arg0 + this.field2074.method2743());
    }

    @ObfuscatedName("dq.hi(I)I")
    public int method2719() {
        return this.field2055[++this.field2062 - 1] - this.field2074.method2743() & 0xFF;
    }

    @ObfuscatedName("dq.hk(I)V")
    public void method2732() {
        this.field2075 = this.field2062 * 8;
    }

    @ObfuscatedName("dq.hr(II)I")
    public int method2713(int arg0) {
        int var2 = this.field2075 >> 3;
        int var3 = 8 - (this.field2075 & 0x7);
        int var4 = 0;
        this.field2075 += arg0;
        while (arg0 > var3) {
            var4 += (this.field2055[var2++] & field2073[var3]) << arg0 - var3;
            arg0 -= var3;
            var3 = 8;
        }
        int var5;
        if (arg0 == var3) {
            var5 = (this.field2055[var2] & field2073[var3]) + var4;
        } else {
            var5 = (this.field2055[var2] >> var3 - arg0 & field2073[arg0]) + var4;
        }
        return var5;
    }

    @ObfuscatedName("dq.ho(I)V")
    public void method2714() {
        this.field2062 = (this.field2075 + 7) / 8;
    }

    @ObfuscatedName("dq.hf(II)I")
    public int method2715(int arg0) {
        return arg0 * 8 - this.field2075;
    }
}
