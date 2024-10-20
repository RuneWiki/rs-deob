package deob;

@ObfuscatedName("dk")
public final class class123 extends class120 {

    @ObfuscatedName("dk.g")
    public class124 field2020;

    @ObfuscatedName("dk.s")
    public static final int[] field2023 = new int[] { 0, 1, 3, 7, 15, 31, 63, 127, 255, 511, 1023, 2047, 4095, 8191, 16383, 32767, 65535, 131071, 262143, 524287, 1048575, 2097151, 4194303, 8388607, 16777215, 33554431, 67108863, 134217727, 268435455, 536870911, 1073741823, Integer.MAX_VALUE, -1 };

    @ObfuscatedName("dk.r")
    public int field2021;

    public class123(int arg0) {
        super(arg0);
    }

    @ObfuscatedName("dk.ge([II)V")
    public void method2603(int[] arg0) {
        this.field2020 = new class124(arg0);
    }

    @ObfuscatedName("dk.gg(II)V")
    public void method2604(int arg0) {
        this.field2001[++this.field1999 - 1] = (byte) (arg0 + this.field2020.method2627());
    }

    @ObfuscatedName("dk.gx(I)I")
    public int method2618() {
        return this.field2001[++this.field1999 - 1] - this.field2020.method2627() & 0xFF;
    }

    @ObfuscatedName("dk.gu(B)V")
    public void method2606() {
        this.field2021 = this.field1999 * 8;
    }

    @ObfuscatedName("dk.gh(II)I")
    public int method2607(int arg0) {
        int var2 = this.field2021 >> 3;
        int var3 = 8 - (this.field2021 & 0x7);
        int var4 = 0;
        this.field2021 += arg0;
        while (arg0 > var3) {
            var4 += (this.field2001[var2++] & field2023[var3]) << arg0 - var3;
            arg0 -= var3;
            var3 = 8;
        }
        int var5;
        if (arg0 == var3) {
            var5 = (this.field2001[var2] & field2023[var3]) + var4;
        } else {
            var5 = (this.field2001[var2] >> var3 - arg0 & field2023[arg0]) + var4;
        }
        return var5;
    }

    @ObfuscatedName("dk.gt(I)V")
    public void method2622() {
        this.field1999 = (this.field2021 + 7) / 8;
    }

    @ObfuscatedName("dk.gn(II)I")
    public int method2610(int arg0) {
        return arg0 * 8 - this.field2021;
    }
}
