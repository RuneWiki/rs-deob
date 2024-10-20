package deob;

@ObfuscatedName("da")
public final class class122 extends class119 {

    @ObfuscatedName("da.l")
    public class123 field2016;

    @ObfuscatedName("da.i")
    public static final int[] field2018 = new int[] { 0, 1, 3, 7, 15, 31, 63, 127, 255, 511, 1023, 2047, 4095, 8191, 16383, 32767, 65535, 131071, 262143, 524287, 1048575, 2097151, 4194303, 8388607, 16777215, 33554431, 67108863, 134217727, 268435455, 536870911, 1073741823, Integer.MAX_VALUE, -1 };

    @ObfuscatedName("da.w")
    public int field2013;

    public class122(int arg0) {
        super(arg0);
    }

    @ObfuscatedName("da.hx([II)V")
    public void method2598(int[] arg0) {
        this.field2016 = new class123(arg0);
    }

    @ObfuscatedName("da.hr(IB)V")
    public void method2617(int arg0) {
        this.field2000[++this.field1994 - 1] = (byte) (arg0 + this.field2016.method2620());
    }

    @ObfuscatedName("da.hj(I)I")
    public int method2600() {
        return this.field2000[++this.field1994 - 1] - this.field2016.method2620() & 0xFF;
    }

    @ObfuscatedName("da.hl(I)V")
    public void method2601() {
        this.field2013 = this.field1994 * 8;
    }

    @ObfuscatedName("da.hq(II)I")
    public int method2602(int arg0) {
        int var2 = this.field2013 >> 3;
        int var3 = 8 - (this.field2013 & 0x7);
        int var4 = 0;
        this.field2013 += arg0;
        while (arg0 > var3) {
            var4 += (this.field2000[var2++] & field2018[var3]) << arg0 - var3;
            arg0 -= var3;
            var3 = 8;
        }
        int var5;
        if (arg0 == var3) {
            var5 = (this.field2000[var2] & field2018[var3]) + var4;
        } else {
            var5 = (this.field2000[var2] >> var3 - arg0 & field2018[arg0]) + var4;
        }
        return var5;
    }

    @ObfuscatedName("da.he(B)V")
    public void method2603() {
        this.field1994 = (this.field2013 + 7) / 8;
    }

    @ObfuscatedName("da.hi(IS)I")
    public int method2605(int arg0) {
        return arg0 * 8 - this.field2013;
    }
}
