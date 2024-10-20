package deob;

@ObfuscatedName("dr")
public final class class116 extends class127 {

    @ObfuscatedName("dr.t")
    public class117 field2000;

    @ObfuscatedName("dr.l")
    public static final int[] field2001 = new int[] { 0, 1, 3, 7, 15, 31, 63, 127, 255, 511, 1023, 2047, 4095, 8191, 16383, 32767, 65535, 131071, 262143, 524287, 1048575, 2097151, 4194303, 8388607, 16777215, 33554431, 67108863, 134217727, 268435455, 536870911, 1073741823, Integer.MAX_VALUE, -1 };

    @ObfuscatedName("dr.c")
    public int field1999;

    public class116(int arg0) {
        super(arg0);
    }

    @ObfuscatedName("dr.t([II)V")
    public void method2316(int[] arg0) {
        this.field2000 = new class117(arg0);
    }

    @ObfuscatedName("dr.l(II)V")
    public void method2317(int arg0) {
        this.field2061[++this.field2059 - 1] = (byte) (arg0 + this.field2000.method2337());
    }

    @ObfuscatedName("dr.c(I)I")
    public int method2330() {
        return this.field2061[++this.field2059 - 1] - this.field2000.method2337() & 0xFF;
    }

    @ObfuscatedName("dr.d(B)V")
    public void method2324() {
        this.field1999 = this.field2059 * 8;
    }

    @ObfuscatedName("dr.b(II)I")
    public int method2320(int arg0) {
        int var2 = this.field1999 >> 3;
        int var3 = 8 - (this.field1999 & 0x7);
        int var4 = 0;
        this.field1999 += arg0;
        while (arg0 > var3) {
            var4 += (this.field2061[var2++] & field2001[var3]) << arg0 - var3;
            arg0 -= var3;
            var3 = 8;
        }
        int var5;
        if (arg0 == var3) {
            var5 = (this.field2061[var2] & field2001[var3]) + var4;
        } else {
            var5 = (this.field2061[var2] >> var3 - arg0 & field2001[arg0]) + var4;
        }
        return var5;
    }

    @ObfuscatedName("dr.i(I)V")
    public void method2321() {
        this.field2059 = (this.field1999 + 7) / 8;
    }

    @ObfuscatedName("dr.p(IB)I")
    public int method2319(int arg0) {
        return arg0 * 8 - this.field1999;
    }
}
