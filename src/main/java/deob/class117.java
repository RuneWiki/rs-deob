package deob;

@ObfuscatedName("dr")
public final class class117 extends class128 {

    @ObfuscatedName("dr.e")
    public class118 field1978;

    @ObfuscatedName("dr.i")
    public static final int[] field1981 = new int[] { 0, 1, 3, 7, 15, 31, 63, 127, 255, 511, 1023, 2047, 4095, 8191, 16383, 32767, 65535, 131071, 262143, 524287, 1048575, 2097151, 4194303, 8388607, 16777215, 33554431, 67108863, 134217727, 268435455, 536870911, 1073741823, Integer.MAX_VALUE, -1 };

    @ObfuscatedName("dr.k")
    public int field1979;

    public class117(int arg0) {
        super(arg0);
    }

    @ObfuscatedName("dr.e([IB)V")
    public void method2329(int[] arg0) {
        this.field1978 = new class118(arg0);
    }

    @ObfuscatedName("dr.i(II)V")
    public void method2333(int arg0) {
        this.field2043[++this.field2045 - 1] = (byte) (arg0 + this.field1978.method2360());
    }

    @ObfuscatedName("dr.k(B)I")
    public int method2330() {
        return this.field2043[++this.field2045 - 1] - this.field1978.method2360() & 0xFF;
    }

    @ObfuscatedName("dr.q(B)V")
    public void method2332() {
        this.field1979 = this.field2045 * 8;
    }

    @ObfuscatedName("dr.j(II)I")
    public int method2337(int arg0) {
        int var2 = this.field1979 >> 3;
        int var3 = 8 - (this.field1979 & 0x7);
        int var4 = 0;
        this.field1979 += arg0;
        while (arg0 > var3) {
            var4 += (this.field2043[var2++] & field1981[var3]) << arg0 - var3;
            arg0 -= var3;
            var3 = 8;
        }
        int var5;
        if (arg0 == var3) {
            var5 = (this.field2043[var2] & field1981[var3]) + var4;
        } else {
            var5 = (this.field2043[var2] >> var3 - arg0 & field1981[arg0]) + var4;
        }
        return var5;
    }

    @ObfuscatedName("dr.z(I)V")
    public void method2334() {
        this.field2045 = (this.field1979 + 7) / 8;
    }

    @ObfuscatedName("dr.m(II)I")
    public int method2335(int arg0) {
        return arg0 * 8 - this.field1979;
    }
}
