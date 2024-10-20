package deob;

@ObfuscatedName("di")
public final class class122 extends class119 {

    @ObfuscatedName("di.i")
    public class123 field1997;

    @ObfuscatedName("di.m")
    public static final int[] field1996 = new int[] { 0, 1, 3, 7, 15, 31, 63, 127, 255, 511, 1023, 2047, 4095, 8191, 16383, 32767, 65535, 131071, 262143, 524287, 1048575, 2097151, 4194303, 8388607, 16777215, 33554431, 67108863, 134217727, 268435455, 536870911, 1073741823, Integer.MAX_VALUE, -1 };

    @ObfuscatedName("di.p")
    public int field1994;

    public class122(int arg0) {
        super(arg0);
    }

    @ObfuscatedName("di.hk([II)V")
    public void method2596(int[] arg0) {
        this.field1997 = new class123(arg0);
    }

    @ObfuscatedName("di.hv(II)V")
    public void method2575(int arg0) {
        this.field1981[++this.field1977 - 1] = (byte) (arg0 + this.field1997.method2598());
    }

    @ObfuscatedName("di.he(I)I")
    public int method2577() {
        return this.field1981[++this.field1977 - 1] - this.field1997.method2598() & 0xFF;
    }

    @ObfuscatedName("di.hr(I)V")
    public void method2578() {
        this.field1994 = this.field1977 * 8;
    }

    @ObfuscatedName("di.hc(II)I")
    public int method2586(int arg0) {
        int var2 = this.field1994 >> 3;
        int var3 = 8 - (this.field1994 & 0x7);
        int var4 = 0;
        this.field1994 += arg0;
        while (arg0 > var3) {
            var4 += (this.field1981[var2++] & field1996[var3]) << arg0 - var3;
            arg0 -= var3;
            var3 = 8;
        }
        int var5;
        if (arg0 == var3) {
            var5 = (this.field1981[var2] & field1996[var3]) + var4;
        } else {
            var5 = (this.field1981[var2] >> var3 - arg0 & field1996[arg0]) + var4;
        }
        return var5;
    }

    @ObfuscatedName("di.hj(S)V")
    public void method2588() {
        this.field1977 = (this.field1994 + 7) / 8;
    }

    @ObfuscatedName("di.hz(IS)I")
    public int method2574(int arg0) {
        return arg0 * 8 - this.field1994;
    }
}
