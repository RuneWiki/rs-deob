package deob;

@ObfuscatedName("di")
public final class class123 extends class120 {

    @ObfuscatedName("di.k")
    public class124 field2028;

    @ObfuscatedName("di.c")
    public static final int[] field2024 = new int[] { 0, 1, 3, 7, 15, 31, 63, 127, 255, 511, 1023, 2047, 4095, 8191, 16383, 32767, 65535, 131071, 262143, 524287, 1048575, 2097151, 4194303, 8388607, 16777215, 33554431, 67108863, 134217727, 268435455, 536870911, 1073741823, Integer.MAX_VALUE, -1 };

    @ObfuscatedName("di.l")
    public int field2023;

    public class123(int arg0) {
        super(arg0);
    }

    @ObfuscatedName("di.hx([IB)V")
    public void method2582(int[] arg0) {
        this.field2028 = new class124(arg0);
    }

    @ObfuscatedName("di.ho(IB)V")
    public void method2583(int arg0) {
        this.field2008[++this.field2006 - 1] = (byte) (arg0 + this.field2028.method2610());
    }

    @ObfuscatedName("di.hf(I)I")
    public int method2584() {
        return this.field2008[++this.field2006 - 1] - this.field2028.method2610() & 0xFF;
    }

    @ObfuscatedName("di.hz(I)V")
    public void method2585() {
        this.field2023 = this.field2006 * 8;
    }

    @ObfuscatedName("di.hs(II)I")
    public int method2596(int arg0) {
        int var2 = this.field2023 >> 3;
        int var3 = 8 - (this.field2023 & 0x7);
        int var4 = 0;
        this.field2023 += arg0;
        while (arg0 > var3) {
            var4 += (this.field2008[var2++] & field2024[var3]) << arg0 - var3;
            arg0 -= var3;
            var3 = 8;
        }
        int var5;
        if (arg0 == var3) {
            var5 = (this.field2008[var2] & field2024[var3]) + var4;
        } else {
            var5 = (this.field2008[var2] >> var3 - arg0 & field2024[arg0]) + var4;
        }
        return var5;
    }

    @ObfuscatedName("di.hn(I)V")
    public void method2586() {
        this.field2006 = (this.field2023 + 7) / 8;
    }

    @ObfuscatedName("di.hm(II)I")
    public int method2587(int arg0) {
        return arg0 * 8 - this.field2023;
    }
}
