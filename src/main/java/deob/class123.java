package deob;

@ObfuscatedName("dl")
public final class class123 extends class120 {

    @ObfuscatedName("dl.q")
    public class124 field2018;

    @ObfuscatedName("dl.m")
    public static final int[] field2017 = new int[] { 0, 1, 3, 7, 15, 31, 63, 127, 255, 511, 1023, 2047, 4095, 8191, 16383, 32767, 65535, 131071, 262143, 524287, 1048575, 2097151, 4194303, 8388607, 16777215, 33554431, 67108863, 134217727, 268435455, 536870911, 1073741823, Integer.MAX_VALUE, -1 };

    @ObfuscatedName("dl.e")
    public int field2016;

    public class123(int arg0) {
        super(arg0);
    }

    @ObfuscatedName("dl.he([II)V")
    public void method2727(int[] arg0) {
        this.field2018 = new class124(arg0);
    }

    @ObfuscatedName("dl.hb(II)V")
    public void method2722(int arg0) {
        this.field1994[++this.field1993 - 1] = (byte) (arg0 + this.field2018.method2742());
    }

    @ObfuscatedName("dl.hv(I)I")
    public int method2714() {
        return this.field1994[++this.field1993 - 1] - this.field2018.method2742() & 0xFF;
    }

    @ObfuscatedName("dl.ii(I)V")
    public void method2715() {
        this.field2016 = this.field1993 * 8;
    }

    @ObfuscatedName("dl.iu(IB)I")
    public int method2712(int arg0) {
        int var2 = this.field2016 >> 3;
        int var3 = 8 - (this.field2016 & 0x7);
        int var4 = 0;
        this.field2016 += arg0;
        while (arg0 > var3) {
            var4 += (this.field1994[var2++] & field2017[var3]) << arg0 - var3;
            arg0 -= var3;
            var3 = 8;
        }
        int var5;
        if (arg0 == var3) {
            var5 = (this.field1994[var2] & field2017[var3]) + var4;
        } else {
            var5 = (this.field1994[var2] >> var3 - arg0 & field2017[arg0]) + var4;
        }
        return var5;
    }

    @ObfuscatedName("dl.ik(I)V")
    public void method2717() {
        this.field1993 = (this.field2016 + 7) / 8;
    }

    @ObfuscatedName("dl.ij(II)I")
    public int method2741(int arg0) {
        return arg0 * 8 - this.field2016;
    }
}
