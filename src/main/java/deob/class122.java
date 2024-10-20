package deob;

@ObfuscatedName("dv")
public final class class122 extends class119 {

    @ObfuscatedName("dv.h")
    public class123 field2007;

    @ObfuscatedName("dv.d")
    public static final int[] field2002 = new int[] { 0, 1, 3, 7, 15, 31, 63, 127, 255, 511, 1023, 2047, 4095, 8191, 16383, 32767, 65535, 131071, 262143, 524287, 1048575, 2097151, 4194303, 8388607, 16777215, 33554431, 67108863, 134217727, 268435455, 536870911, 1073741823, Integer.MAX_VALUE, -1 };

    @ObfuscatedName("dv.c")
    public int field2003;

    public class122(int arg0) {
        super(arg0);
    }

    @ObfuscatedName("dv.gr([II)V")
    public void method2577(int[] arg0) {
        this.field2007 = new class123(arg0);
    }

    @ObfuscatedName("dv.gw(II)V")
    public void method2578(int arg0) {
        this.field1982[++this.field1980 - 1] = (byte) (arg0 + this.field2007.method2600());
    }

    @ObfuscatedName("dv.gs(I)I")
    public int method2593() {
        return this.field1982[++this.field1980 - 1] - this.field2007.method2600() & 0xFF;
    }

    @ObfuscatedName("dv.go(I)V")
    public void method2580() {
        this.field2003 = this.field1980 * 8;
    }

    @ObfuscatedName("dv.hz(II)I")
    public int method2589(int arg0) {
        int var2 = this.field2003 >> 3;
        int var3 = 8 - (this.field2003 & 0x7);
        int var4 = 0;
        this.field2003 += arg0;
        while (arg0 > var3) {
            var4 += (this.field1982[var2++] & field2002[var3]) << arg0 - var3;
            arg0 -= var3;
            var3 = 8;
        }
        int var5;
        if (arg0 == var3) {
            var5 = (this.field1982[var2] & field2002[var3]) + var4;
        } else {
            var5 = (this.field1982[var2] >> var3 - arg0 & field2002[arg0]) + var4;
        }
        return var5;
    }

    @ObfuscatedName("dv.hg(I)V")
    public void method2582() {
        this.field1980 = (this.field2003 + 7) / 8;
    }

    @ObfuscatedName("dv.hh(II)I")
    public int method2583(int arg0) {
        return arg0 * 8 - this.field2003;
    }
}
