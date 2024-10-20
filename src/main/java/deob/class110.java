package deob;

@ObfuscatedName("du")
public final class class110 extends class107 {

    @ObfuscatedName("du.l")
    public class111 field1869;

    @ObfuscatedName("du.s")
    public static final int[] field1865 = new int[] { 0, 1, 3, 7, 15, 31, 63, 127, 255, 511, 1023, 2047, 4095, 8191, 16383, 32767, 65535, 131071, 262143, 524287, 1048575, 2097151, 4194303, 8388607, 16777215, 33554431, 67108863, 134217727, 268435455, 536870911, 1073741823, Integer.MAX_VALUE, -1 };

    @ObfuscatedName("du.f")
    public int field1866;

    public class110(int arg0) {
        super(arg0);
    }

    @ObfuscatedName("du.gi([IS)V")
    public void method2297(int[] arg0) {
        this.field1869 = new class111(arg0);
    }

    @ObfuscatedName("du.gu(II)V")
    public void method2319(int arg0) {
        this.field1840[++this.field1841 - 1] = (byte) (arg0 + this.field1869.method2330());
    }

    @ObfuscatedName("du.gx(I)I")
    public int method2296() {
        return this.field1840[++this.field1841 - 1] - this.field1869.method2330() & 0xFF;
    }

    @ObfuscatedName("du.hp(I)V")
    public void method2300() {
        this.field1866 = this.field1841 * 8;
    }

    @ObfuscatedName("du.hj(II)I")
    public int method2301(int arg0) {
        int var2 = this.field1866 >> 3;
        int var3 = 8 - (this.field1866 & 0x7);
        int var4 = 0;
        this.field1866 += arg0;
        while (arg0 > var3) {
            var4 += (this.field1840[var2++] & field1865[var3]) << arg0 - var3;
            arg0 -= var3;
            var3 = 8;
        }
        int var5;
        if (arg0 == var3) {
            var5 = (this.field1840[var2] & field1865[var3]) + var4;
        } else {
            var5 = (this.field1840[var2] >> var3 - arg0 & field1865[arg0]) + var4;
        }
        return var5;
    }

    @ObfuscatedName("du.hh(I)V")
    public void method2302() {
        this.field1841 = (this.field1866 + 7) / 8;
    }

    @ObfuscatedName("du.hz(II)I")
    public int method2303(int arg0) {
        return arg0 * 8 - this.field1866;
    }
}
