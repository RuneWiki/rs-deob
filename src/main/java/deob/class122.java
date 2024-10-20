package deob;

@ObfuscatedName("dx")
public final class class122 extends class119 {

    @ObfuscatedName("dx.t")
    public class123 field2012;

    @ObfuscatedName("dx.w")
    public static final int[] field2007 = new int[] { 0, 1, 3, 7, 15, 31, 63, 127, 255, 511, 1023, 2047, 4095, 8191, 16383, 32767, 65535, 131071, 262143, 524287, 1048575, 2097151, 4194303, 8388607, 16777215, 33554431, 67108863, 134217727, 268435455, 536870911, 1073741823, Integer.MAX_VALUE, -1 };

    @ObfuscatedName("dx.x")
    public int field2008;

    public class122(int arg0) {
        super(arg0);
    }

    @ObfuscatedName("dx.hn([II)V")
    public void method2626(int[] arg0) {
        this.field2012 = new class123(arg0);
    }

    @ObfuscatedName("dx.hk(II)V")
    public void method2622(int arg0) {
        this.field1986[++this.field1988 - 1] = (byte) (arg0 + this.field2012.method2650());
    }

    @ObfuscatedName("dx.ha(B)I")
    public int method2623() {
        return this.field1986[++this.field1988 - 1] - this.field2012.method2650() & 0xFF;
    }

    @ObfuscatedName("dx.hi(I)V")
    public void method2624() {
        this.field2008 = this.field1988 * 8;
    }

    @ObfuscatedName("dx.hh(II)I")
    public int method2625(int arg0) {
        int var2 = this.field2008 >> 3;
        int var3 = 8 - (this.field2008 & 0x7);
        int var4 = 0;
        this.field2008 += arg0;
        while (arg0 > var3) {
            var4 += (this.field1986[var2++] & field2007[var3]) << arg0 - var3;
            arg0 -= var3;
            var3 = 8;
        }
        int var5;
        if (arg0 == var3) {
            var5 = (this.field1986[var2] & field2007[var3]) + var4;
        } else {
            var5 = (this.field1986[var2] >> var3 - arg0 & field2007[arg0]) + var4;
        }
        return var5;
    }

    @ObfuscatedName("dx.hl(I)V")
    public void method2636() {
        this.field1988 = (this.field2008 + 7) / 8;
    }

    @ObfuscatedName("dx.hf(II)I")
    public int method2627(int arg0) {
        return arg0 * 8 - this.field2008;
    }
}
