package deob;

@ObfuscatedName("dc")
public final class class110 extends class107 {

    @ObfuscatedName("dc.q")
    public class111 field1865;

    @ObfuscatedName("dc.l")
    public static final int[] field1862 = new int[] { 0, 1, 3, 7, 15, 31, 63, 127, 255, 511, 1023, 2047, 4095, 8191, 16383, 32767, 65535, 131071, 262143, 524287, 1048575, 2097151, 4194303, 8388607, 16777215, 33554431, 67108863, 134217727, 268435455, 536870911, 1073741823, Integer.MAX_VALUE, -1 };

    @ObfuscatedName("dc.m")
    public int field1864;

    public class110(int arg0) {
        super(arg0);
    }

    @ObfuscatedName("dc.hs([IB)V")
    public void method2360(int[] arg0) {
        this.field1865 = new class111(arg0);
    }

    @ObfuscatedName("dc.hg(II)V")
    public void method2361(int arg0) {
        this.field1849[++this.field1844 - 1] = (byte) (arg0 + this.field1865.method2390());
    }

    @ObfuscatedName("dc.hy(I)I")
    public int method2362() {
        return this.field1849[++this.field1844 - 1] - this.field1865.method2390() & 0xFF;
    }

    @ObfuscatedName("dc.hr(I)V")
    public void method2363() {
        this.field1864 = this.field1844 * 8;
    }

    @ObfuscatedName("dc.hx(II)I")
    public int method2364(int arg0) {
        int var2 = this.field1864 >> 3;
        int var3 = 8 - (this.field1864 & 0x7);
        int var4 = 0;
        this.field1864 += arg0;
        while (arg0 > var3) {
            var4 += (this.field1849[var2++] & field1862[var3]) << arg0 - var3;
            arg0 -= var3;
            var3 = 8;
        }
        int var5;
        if (arg0 == var3) {
            var5 = (this.field1849[var2] & field1862[var3]) + var4;
        } else {
            var5 = (this.field1849[var2] >> var3 - arg0 & field1862[arg0]) + var4;
        }
        return var5;
    }

    @ObfuscatedName("dc.hk(I)V")
    public void method2366() {
        this.field1844 = (this.field1864 + 7) / 8;
    }

    @ObfuscatedName("dc.hp(IB)I")
    public int method2376(int arg0) {
        return arg0 * 8 - this.field1864;
    }
}
