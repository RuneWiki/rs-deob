package deob;

@ObfuscatedName("dc")
public final class class122 extends class119 {

    @ObfuscatedName("dc.h")
    public class123 field2005;

    @ObfuscatedName("dc.n")
    public static final int[] field2006 = new int[] { 0, 1, 3, 7, 15, 31, 63, 127, 255, 511, 1023, 2047, 4095, 8191, 16383, 32767, 65535, 131071, 262143, 524287, 1048575, 2097151, 4194303, 8388607, 16777215, 33554431, 67108863, 134217727, 268435455, 536870911, 1073741823, Integer.MAX_VALUE, -1 };

    @ObfuscatedName("dc.j")
    public int field2004;

    public class122(int arg0) {
        super(arg0);
    }

    @ObfuscatedName("dc.hd([II)V")
    public void method2549(int[] arg0) {
        this.field2005 = new class123(arg0);
    }

    @ObfuscatedName("dc.hf(IB)V")
    public void method2547(int arg0) {
        this.field1987[++this.field1986 - 1] = (byte) (arg0 + this.field2005.method2573());
    }

    @ObfuscatedName("dc.hx(S)I")
    public int method2546() {
        return this.field1987[++this.field1986 - 1] - this.field2005.method2573() & 0xFF;
    }

    @ObfuscatedName("dc.hi(I)V")
    public void method2565() {
        this.field2004 = this.field1986 * 8;
    }

    @ObfuscatedName("dc.hq(IB)I")
    public int method2550(int arg0) {
        int var2 = this.field2004 >> 3;
        int var3 = 8 - (this.field2004 & 0x7);
        int var4 = 0;
        this.field2004 += arg0;
        while (arg0 > var3) {
            var4 += (this.field1987[var2++] & field2006[var3]) << arg0 - var3;
            arg0 -= var3;
            var3 = 8;
        }
        int var5;
        if (arg0 == var3) {
            var5 = (this.field1987[var2] & field2006[var3]) + var4;
        } else {
            var5 = (this.field1987[var2] >> var3 - arg0 & field2006[arg0]) + var4;
        }
        return var5;
    }

    @ObfuscatedName("dc.hs(B)V")
    public void method2551() {
        this.field1986 = (this.field2004 + 7) / 8;
    }

    @ObfuscatedName("dc.hr(II)I")
    public int method2554(int arg0) {
        return arg0 * 8 - this.field2004;
    }
}
