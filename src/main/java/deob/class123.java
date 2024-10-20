package deob;

@ObfuscatedName("dx")
public final class class123 extends class120 {

    @ObfuscatedName("dx.d")
    public class124 field2023;

    @ObfuscatedName("dx.l")
    public static final int[] field2024 = new int[] { 0, 1, 3, 7, 15, 31, 63, 127, 255, 511, 1023, 2047, 4095, 8191, 16383, 32767, 65535, 131071, 262143, 524287, 1048575, 2097151, 4194303, 8388607, 16777215, 33554431, 67108863, 134217727, 268435455, 536870911, 1073741823, Integer.MAX_VALUE, -1 };

    @ObfuscatedName("dx.y")
    public int field2025;

    public class123(int arg0) {
        super(arg0);
    }

    @ObfuscatedName("dx.hb([II)V")
    public void method2549(int[] arg0) {
        this.field2023 = new class124(arg0);
    }

    @ObfuscatedName("dx.hq(II)V")
    public void method2573(int arg0) {
        this.field2002[++this.field2001 - 1] = (byte) (arg0 + this.field2023.method2575());
    }

    @ObfuscatedName("dx.hi(I)I")
    public int method2568() {
        return this.field2002[++this.field2001 - 1] - this.field2023.method2575() & 0xFF;
    }

    @ObfuscatedName("dx.hu(I)V")
    public void method2566() {
        this.field2025 = this.field2001 * 8;
    }

    @ObfuscatedName("dx.ho(II)I")
    public int method2553(int arg0) {
        int var2 = this.field2025 >> 3;
        int var3 = 8 - (this.field2025 & 0x7);
        int var4 = 0;
        this.field2025 += arg0;
        while (arg0 > var3) {
            var4 += (this.field2002[var2++] & field2024[var3]) << arg0 - var3;
            arg0 -= var3;
            var3 = 8;
        }
        int var5;
        if (arg0 == var3) {
            var5 = (this.field2002[var2] & field2024[var3]) + var4;
        } else {
            var5 = (this.field2002[var2] >> var3 - arg0 & field2024[arg0]) + var4;
        }
        return var5;
    }

    @ObfuscatedName("dx.hm(B)V")
    public void method2554() {
        this.field2001 = (this.field2025 + 7) / 8;
    }

    @ObfuscatedName("dx.hs(II)I")
    public int method2555(int arg0) {
        return arg0 * 8 - this.field2025;
    }
}
