package deob;

@ObfuscatedName("dw")
public final class class122 extends class119 {

    @ObfuscatedName("dw.i")
    public class123 field1974;

    @ObfuscatedName("dw.x")
    public static final int[] field1978 = new int[] { 0, 1, 3, 7, 15, 31, 63, 127, 255, 511, 1023, 2047, 4095, 8191, 16383, 32767, 65535, 131071, 262143, 524287, 1048575, 2097151, 4194303, 8388607, 16777215, 33554431, 67108863, 134217727, 268435455, 536870911, 1073741823, Integer.MAX_VALUE, -1 };

    @ObfuscatedName("dw.g")
    public int field1973;

    public class122(int arg0) {
        super(arg0);
    }

    @ObfuscatedName("dw.hs([IB)V")
    public void method2631(int[] arg0) {
        this.field1974 = new class123(arg0);
    }

    @ObfuscatedName("dw.hw(II)V")
    public void method2648(int arg0) {
        this.field1959[++this.field1955 - 1] = (byte) (arg0 + this.field1974.method2660());
    }

    @ObfuscatedName("dw.hb(B)I")
    public int method2633() {
        return this.field1959[++this.field1955 - 1] - this.field1974.method2660() & 0xFF;
    }

    @ObfuscatedName("dw.hr(B)V")
    public void method2637() {
        this.field1973 = this.field1955 * 8;
    }

    @ObfuscatedName("dw.hk(IB)I")
    public int method2640(int arg0) {
        int var2 = this.field1973 >> 3;
        int var3 = 8 - (this.field1973 & 0x7);
        int var4 = 0;
        this.field1973 += arg0;
        while (arg0 > var3) {
            var4 += (this.field1959[var2++] & field1978[var3]) << arg0 - var3;
            arg0 -= var3;
            var3 = 8;
        }
        int var5;
        if (arg0 == var3) {
            var5 = (this.field1959[var2] & field1978[var3]) + var4;
        } else {
            var5 = (this.field1959[var2] >> var3 - arg0 & field1978[arg0]) + var4;
        }
        return var5;
    }

    @ObfuscatedName("dw.hi(B)V")
    public void method2635() {
        this.field1955 = (this.field1973 + 7) / 8;
    }

    @ObfuscatedName("dw.it(IB)I")
    public int method2636(int arg0) {
        return arg0 * 8 - this.field1973;
    }
}
