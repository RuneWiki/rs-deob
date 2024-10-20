package deob;

@ObfuscatedName("dw")
public final class class122 extends class119 {

    @ObfuscatedName("dw.a")
    public class123 field2007;

    @ObfuscatedName("dw.y")
    public static final int[] field2004 = new int[] { 0, 1, 3, 7, 15, 31, 63, 127, 255, 511, 1023, 2047, 4095, 8191, 16383, 32767, 65535, 131071, 262143, 524287, 1048575, 2097151, 4194303, 8388607, 16777215, 33554431, 67108863, 134217727, 268435455, 536870911, 1073741823, Integer.MAX_VALUE, -1 };

    @ObfuscatedName("dw.h")
    public int field2005;

    public class122(int arg0) {
        super(arg0);
    }

    @ObfuscatedName("dw.hs([II)V")
    public void method2604(int[] arg0) {
        this.field2007 = new class123(arg0);
    }

    @ObfuscatedName("dw.ht(IB)V")
    public void method2599(int arg0) {
        this.field1988[++this.field1984 - 1] = (byte) (arg0 + this.field2007.method2637());
    }

    @ObfuscatedName("dw.hl(I)I")
    public int method2600() {
        return this.field1988[++this.field1984 - 1] - this.field2007.method2637() & 0xFF;
    }

    @ObfuscatedName("dw.hx(I)V")
    public void method2619() {
        this.field2005 = this.field1984 * 8;
    }

    @ObfuscatedName("dw.hb(II)I")
    public int method2602(int arg0) {
        int var2 = this.field2005 >> 3;
        int var3 = 8 - (this.field2005 & 0x7);
        int var4 = 0;
        this.field2005 += arg0;
        while (arg0 > var3) {
            var4 += (this.field1988[var2++] & field2004[var3]) << arg0 - var3;
            arg0 -= var3;
            var3 = 8;
        }
        int var5;
        if (arg0 == var3) {
            var5 = (this.field1988[var2] & field2004[var3]) + var4;
        } else {
            var5 = (this.field1988[var2] >> var3 - arg0 & field2004[arg0]) + var4;
        }
        return var5;
    }

    @ObfuscatedName("dw.hv(I)V")
    public void method2603() {
        this.field1984 = (this.field2005 + 7) / 8;
    }

    @ObfuscatedName("dw.hh(II)I")
    public int method2609(int arg0) {
        return arg0 * 8 - this.field2005;
    }
}
