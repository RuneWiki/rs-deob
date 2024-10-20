package deob;

@ObfuscatedName("dk")
public final class class111 extends class108 {

    @ObfuscatedName("dk.j")
    public class112 field1864;

    @ObfuscatedName("dk.i")
    public static final int[] field1866 = new int[] { 0, 1, 3, 7, 15, 31, 63, 127, 255, 511, 1023, 2047, 4095, 8191, 16383, 32767, 65535, 131071, 262143, 524287, 1048575, 2097151, 4194303, 8388607, 16777215, 33554431, 67108863, 134217727, 268435455, 536870911, 1073741823, Integer.MAX_VALUE, -1 };

    @ObfuscatedName("dk.u")
    public int field1863;

    public class111(int arg0) {
        super(arg0);
    }

    @ObfuscatedName("dk.hn([II)V")
    public void method2374(int[] arg0) {
        this.field1864 = new class112(arg0);
    }

    @ObfuscatedName("dk.hl(II)V")
    public void method2364(int arg0) {
        this.field1839[++this.field1841 - 1] = (byte) (arg0 + this.field1864.method2390());
    }

    @ObfuscatedName("dk.hx(B)I")
    public int method2365() {
        return this.field1839[++this.field1841 - 1] - this.field1864.method2390() & 0xFF;
    }

    @ObfuscatedName("dk.hg(I)V")
    public void method2381() {
        this.field1863 = this.field1841 * 8;
    }

    @ObfuscatedName("dk.ha(II)I")
    public int method2366(int arg0) {
        int var2 = this.field1863 >> 3;
        int var3 = 8 - (this.field1863 & 0x7);
        int var4 = 0;
        this.field1863 += arg0;
        while (arg0 > var3) {
            var4 += (this.field1839[var2++] & field1866[var3]) << arg0 - var3;
            arg0 -= var3;
            var3 = 8;
        }
        int var5;
        if (arg0 == var3) {
            var5 = (this.field1839[var2] & field1866[var3]) + var4;
        } else {
            var5 = (this.field1839[var2] >> var3 - arg0 & field1866[arg0]) + var4;
        }
        return var5;
    }

    @ObfuscatedName("dk.hj(I)V")
    public void method2367() {
        this.field1841 = (this.field1863 + 7) / 8;
    }

    @ObfuscatedName("dk.hk(II)I")
    public int method2368(int arg0) {
        return arg0 * 8 - this.field1863;
    }
}
