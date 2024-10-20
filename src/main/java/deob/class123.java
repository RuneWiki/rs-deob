package deob;

@ObfuscatedName("dc")
public final class class123 extends class120 {

    @ObfuscatedName("dc.n")
    public class124 field1997;

    @ObfuscatedName("dc.l")
    public static final int[] field1991 = new int[] { 0, 1, 3, 7, 15, 31, 63, 127, 255, 511, 1023, 2047, 4095, 8191, 16383, 32767, 65535, 131071, 262143, 524287, 1048575, 2097151, 4194303, 8388607, 16777215, 33554431, 67108863, 134217727, 268435455, 536870911, 1073741823, Integer.MAX_VALUE, -1 };

    @ObfuscatedName("dc.u")
    public int field1996;

    public class123(int arg0) {
        super(arg0);
    }

    @ObfuscatedName("dc.hs([II)V")
    public void method2595(int[] arg0) {
        this.field1997 = new class124(arg0);
    }

    @ObfuscatedName("dc.ht(IB)V")
    public void method2596(int arg0) {
        this.field1974[++this.field1972 - 1] = (byte) (arg0 + this.field1997.method2616());
    }

    @ObfuscatedName("dc.hv(I)I")
    public int method2602() {
        return this.field1974[++this.field1972 - 1] - this.field1997.method2616() & 0xFF;
    }

    @ObfuscatedName("dc.hj(I)V")
    public void method2597() {
        this.field1996 = this.field1972 * 8;
    }

    @ObfuscatedName("dc.hq(IB)I")
    public int method2598(int arg0) {
        int var2 = this.field1996 >> 3;
        int var3 = 8 - (this.field1996 & 0x7);
        int var4 = 0;
        this.field1996 += arg0;
        while (arg0 > var3) {
            var4 += (this.field1974[var2++] & field1991[var3]) << arg0 - var3;
            arg0 -= var3;
            var3 = 8;
        }
        int var5;
        if (arg0 == var3) {
            var5 = (this.field1974[var2] & field1991[var3]) + var4;
        } else {
            var5 = (this.field1974[var2] >> var3 - arg0 & field1991[arg0]) + var4;
        }
        return var5;
    }

    @ObfuscatedName("dc.hb(B)V")
    public void method2594() {
        this.field1972 = (this.field1996 + 7) / 8;
    }

    @ObfuscatedName("dc.hf(II)I")
    public int method2600(int arg0) {
        return arg0 * 8 - this.field1996;
    }
}
