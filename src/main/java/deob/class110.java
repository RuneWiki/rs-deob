package deob;

@ObfuscatedName("dr")
public final class class110 extends class107 {

    @ObfuscatedName("dr.s")
    public class111 field1839;

    @ObfuscatedName("dr.q")
    public static final int[] field1843 = new int[] { 0, 1, 3, 7, 15, 31, 63, 127, 255, 511, 1023, 2047, 4095, 8191, 16383, 32767, 65535, 131071, 262143, 524287, 1048575, 2097151, 4194303, 8388607, 16777215, 33554431, 67108863, 134217727, 268435455, 536870911, 1073741823, Integer.MAX_VALUE, -1 };

    @ObfuscatedName("dr.p")
    public int field1841;

    public class110(int arg0) {
        super(arg0);
    }

    @ObfuscatedName("dr.hh([IB)V")
    public void method2363(int[] arg0) {
        this.field1839 = new class111(arg0);
    }

    @ObfuscatedName("dr.hq(II)V")
    public void method2364(int arg0) {
        this.field1823[++this.field1819 - 1] = (byte) (arg0 + this.field1839.method2393());
    }

    @ObfuscatedName("dr.hi(I)I")
    public int method2377() {
        return this.field1823[++this.field1819 - 1] - this.field1839.method2393() & 0xFF;
    }

    @ObfuscatedName("dr.hj(I)V")
    public void method2381() {
        this.field1841 = this.field1819 * 8;
    }

    @ObfuscatedName("dr.hk(II)I")
    public int method2368(int arg0) {
        int var2 = this.field1841 >> 3;
        int var3 = 8 - (this.field1841 & 0x7);
        int var4 = 0;
        this.field1841 += arg0;
        while (arg0 > var3) {
            var4 += (this.field1823[var2++] & field1843[var3]) << arg0 - var3;
            arg0 -= var3;
            var3 = 8;
        }
        int var5;
        if (arg0 == var3) {
            var5 = (this.field1823[var2] & field1843[var3]) + var4;
        } else {
            var5 = (this.field1823[var2] >> var3 - arg0 & field1843[arg0]) + var4;
        }
        return var5;
    }

    @ObfuscatedName("dr.hf(I)V")
    public void method2369() {
        this.field1819 = (this.field1841 + 7) / 8;
    }

    @ObfuscatedName("dr.hw(II)I")
    public int method2367(int arg0) {
        return arg0 * 8 - this.field1841;
    }
}
