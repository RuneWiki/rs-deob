package deob;

@ObfuscatedName("ds")
public final class class123 extends class120 {

    @ObfuscatedName("ds.v")
    public class124 field2025;

    @ObfuscatedName("ds.l")
    public static final int[] field2024 = new int[] { 0, 1, 3, 7, 15, 31, 63, 127, 255, 511, 1023, 2047, 4095, 8191, 16383, 32767, 65535, 131071, 262143, 524287, 1048575, 2097151, 4194303, 8388607, 16777215, 33554431, 67108863, 134217727, 268435455, 536870911, 1073741823, Integer.MAX_VALUE, -1 };

    @ObfuscatedName("ds.z")
    public int field2023;

    public class123(int arg0) {
        super(arg0);
    }

    @ObfuscatedName("ds.hh([II)V")
    public void method2606(int[] arg0) {
        this.field2025 = new class124(arg0);
    }

    @ObfuscatedName("ds.hv(II)V")
    public void method2614(int arg0) {
        this.field2013[++this.field2012 - 1] = (byte) (arg0 + this.field2025.method2638());
    }

    @ObfuscatedName("ds.hp(B)I")
    public int method2608() {
        return this.field2013[++this.field2012 - 1] - this.field2025.method2638() & 0xFF;
    }

    @ObfuscatedName("ds.hz(B)V")
    public void method2605() {
        this.field2023 = this.field2012 * 8;
    }

    @ObfuscatedName("ds.hu(II)I")
    public int method2634(int arg0) {
        int var2 = this.field2023 >> 3;
        int var3 = 8 - (this.field2023 & 0x7);
        int var4 = 0;
        this.field2023 += arg0;
        while (arg0 > var3) {
            var4 += (this.field2013[var2++] & field2024[var3]) << arg0 - var3;
            arg0 -= var3;
            var3 = 8;
        }
        int var5;
        if (arg0 == var3) {
            var5 = (this.field2013[var2] & field2024[var3]) + var4;
        } else {
            var5 = (this.field2013[var2] >> var3 - arg0 & field2024[arg0]) + var4;
        }
        return var5;
    }

    @ObfuscatedName("ds.hc(I)V")
    public void method2609() {
        this.field2012 = (this.field2023 + 7) / 8;
    }

    @ObfuscatedName("ds.hg(II)I")
    public int method2611(int arg0) {
        return arg0 * 8 - this.field2023;
    }
}
