package deob;

@ObfuscatedName("dg")
public final class class122 extends class119 {

    @ObfuscatedName("dg.j")
    public class123 field2003;

    @ObfuscatedName("dg.n")
    public static final int[] field1999 = new int[] { 0, 1, 3, 7, 15, 31, 63, 127, 255, 511, 1023, 2047, 4095, 8191, 16383, 32767, 65535, 131071, 262143, 524287, 1048575, 2097151, 4194303, 8388607, 16777215, 33554431, 67108863, 134217727, 268435455, 536870911, 1073741823, Integer.MAX_VALUE, -1 };

    @ObfuscatedName("dg.l")
    public int field1998;

    public class122(int arg0) {
        super(arg0);
    }

    @ObfuscatedName("dg.he([II)V")
    public void method2584(int[] arg0) {
        this.field2003 = new class123(arg0);
    }

    @ObfuscatedName("dg.hy(II)V")
    public void method2586(int arg0) {
        this.field1981[++this.field1980 - 1] = (byte) (arg0 + this.field2003.method2614());
    }

    @ObfuscatedName("dg.hr(I)I")
    public int method2585() {
        return this.field1981[++this.field1980 - 1] - this.field2003.method2614() & 0xFF;
    }

    @ObfuscatedName("dg.ha(I)V")
    public void method2587() {
        this.field1998 = this.field1980 * 8;
    }

    @ObfuscatedName("dg.hp(IB)I")
    public int method2583(int arg0) {
        int var2 = this.field1998 >> 3;
        int var3 = 8 - (this.field1998 & 0x7);
        int var4 = 0;
        this.field1998 += arg0;
        while (arg0 > var3) {
            var4 += (this.field1981[var2++] & field1999[var3]) << arg0 - var3;
            arg0 -= var3;
            var3 = 8;
        }
        int var5;
        if (arg0 == var3) {
            var5 = (this.field1981[var2] & field1999[var3]) + var4;
        } else {
            var5 = (this.field1981[var2] >> var3 - arg0 & field1999[arg0]) + var4;
        }
        return var5;
    }

    @ObfuscatedName("dg.hq(I)V")
    public void method2588() {
        this.field1980 = (this.field1998 + 7) / 8;
    }

    @ObfuscatedName("dg.hl(II)I")
    public int method2589(int arg0) {
        return arg0 * 8 - this.field1998;
    }
}
