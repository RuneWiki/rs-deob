package deob;

@ObfuscatedName("db")
public final class class122 extends class119 {

    @ObfuscatedName("db.n")
    public class123 field2014;

    @ObfuscatedName("db.k")
    public static final int[] field2010 = new int[] { 0, 1, 3, 7, 15, 31, 63, 127, 255, 511, 1023, 2047, 4095, 8191, 16383, 32767, 65535, 131071, 262143, 524287, 1048575, 2097151, 4194303, 8388607, 16777215, 33554431, 67108863, 134217727, 268435455, 536870911, 1073741823, Integer.MAX_VALUE, -1 };

    @ObfuscatedName("db.r")
    public int field2011;

    public class122(int arg0) {
        super(arg0);
    }

    @ObfuscatedName("db.hc([II)V")
    public void method2548(int[] arg0) {
        this.field2014 = new class123(arg0);
    }

    @ObfuscatedName("db.hp(IB)V")
    public void method2549(int arg0) {
        this.field1996[++this.field1999 - 1] = (byte) (arg0 + this.field2014.method2580());
    }

    @ObfuscatedName("db.hr(B)I")
    public int method2550() {
        return this.field1996[++this.field1999 - 1] - this.field2014.method2580() & 0xFF;
    }

    @ObfuscatedName("db.hj(B)V")
    public void method2551() {
        this.field2011 = this.field1999 * 8;
    }

    @ObfuscatedName("db.he(IB)I")
    public int method2552(int arg0) {
        int var2 = this.field2011 >> 3;
        int var3 = 8 - (this.field2011 & 0x7);
        int var4 = 0;
        this.field2011 += arg0;
        while (arg0 > var3) {
            var4 += (this.field1996[var2++] & field2010[var3]) << arg0 - var3;
            arg0 -= var3;
            var3 = 8;
        }
        int var5;
        if (arg0 == var3) {
            var5 = (this.field1996[var2] & field2010[var3]) + var4;
        } else {
            var5 = (this.field1996[var2] >> var3 - arg0 & field2010[arg0]) + var4;
        }
        return var5;
    }

    @ObfuscatedName("db.hs(S)V")
    public void method2553() {
        this.field1999 = (this.field2011 + 7) / 8;
    }

    @ObfuscatedName("db.hd(IB)I")
    public int method2554(int arg0) {
        return arg0 * 8 - this.field2011;
    }
}
