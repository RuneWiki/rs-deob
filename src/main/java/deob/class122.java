package deob;

@ObfuscatedName("dd")
public final class class122 extends class119 {

    @ObfuscatedName("dd.f")
    public class123 field2009;

    @ObfuscatedName("dd.y")
    public static final int[] field2008 = new int[] { 0, 1, 3, 7, 15, 31, 63, 127, 255, 511, 1023, 2047, 4095, 8191, 16383, 32767, 65535, 131071, 262143, 524287, 1048575, 2097151, 4194303, 8388607, 16777215, 33554431, 67108863, 134217727, 268435455, 536870911, 1073741823, Integer.MAX_VALUE, -1 };

    @ObfuscatedName("dd.w")
    public int field2011;

    public class122(int arg0) {
        super(arg0);
    }

    @ObfuscatedName("dd.ht([II)V")
    public void method2564(int[] arg0) {
        this.field2009 = new class123(arg0);
    }

    @ObfuscatedName("dd.hp(II)V")
    public void method2565(int arg0) {
        this.field1989[++this.field1988 - 1] = (byte) (arg0 + this.field2009.method2596());
    }

    @ObfuscatedName("dd.hb(I)I")
    public int method2579() {
        return this.field1989[++this.field1988 - 1] - this.field2009.method2596() & 0xFF;
    }

    @ObfuscatedName("dd.hl(I)V")
    public void method2574() {
        this.field2011 = this.field1988 * 8;
    }

    @ObfuscatedName("dd.hk(IB)I")
    public int method2594(int arg0) {
        int var2 = this.field2011 >> 3;
        int var3 = 8 - (this.field2011 & 0x7);
        int var4 = 0;
        this.field2011 += arg0;
        while (arg0 > var3) {
            var4 += (this.field1989[var2++] & field2008[var3]) << arg0 - var3;
            arg0 -= var3;
            var3 = 8;
        }
        int var5;
        if (arg0 == var3) {
            var5 = (this.field1989[var2] & field2008[var3]) + var4;
        } else {
            var5 = (this.field1989[var2] >> var3 - arg0 & field2008[arg0]) + var4;
        }
        return var5;
    }

    @ObfuscatedName("dd.hf(I)V")
    public void method2569() {
        this.field1988 = (this.field2011 + 7) / 8;
    }

    @ObfuscatedName("dd.hs(II)I")
    public int method2570(int arg0) {
        return arg0 * 8 - this.field2011;
    }
}
