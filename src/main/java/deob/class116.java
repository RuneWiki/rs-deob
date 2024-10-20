package deob;

@ObfuscatedName("dd")
public final class class116 extends class127 {

    @ObfuscatedName("dd.b")
    public class117 field1994;

    @ObfuscatedName("dd.c")
    public static final int[] field1992 = new int[] { 0, 1, 3, 7, 15, 31, 63, 127, 255, 511, 1023, 2047, 4095, 8191, 16383, 32767, 65535, 131071, 262143, 524287, 1048575, 2097151, 4194303, 8388607, 16777215, 33554431, 67108863, 134217727, 268435455, 536870911, 1073741823, Integer.MAX_VALUE, -1 };

    @ObfuscatedName("dd.j")
    public int field1993;

    public class116(int arg0) {
        super(arg0);
    }

    @ObfuscatedName("dd.b([II)V")
    public void method2277(int[] arg0) {
        this.field1994 = new class117(arg0);
    }

    @ObfuscatedName("dd.c(II)V")
    public void method2273(int arg0) {
        this.field2056[++this.field2051 - 1] = (byte) (arg0 + this.field1994.method2300());
    }

    @ObfuscatedName("dd.j(B)I")
    public int method2274() {
        return this.field2056[++this.field2051 - 1] - this.field1994.method2300() & 0xFF;
    }

    @ObfuscatedName("dd.i(B)V")
    public void method2292() {
        this.field1993 = this.field2051 * 8;
    }

    @ObfuscatedName("dd.k(II)I")
    public int method2276(int arg0) {
        int var2 = this.field1993 >> 3;
        int var3 = 8 - (this.field1993 & 0x7);
        int var4 = 0;
        this.field1993 += arg0;
        while (arg0 > var3) {
            var4 += (this.field2056[var2++] & field1992[var3]) << arg0 - var3;
            arg0 -= var3;
            var3 = 8;
        }
        int var5;
        if (arg0 == var3) {
            var5 = (this.field2056[var2] & field1992[var3]) + var4;
        } else {
            var5 = (this.field2056[var2] >> var3 - arg0 & field1992[arg0]) + var4;
        }
        return var5;
    }

    @ObfuscatedName("dd.q(I)V")
    public void method2288() {
        this.field2051 = (this.field1993 + 7) / 8;
    }

    @ObfuscatedName("dd.t(II)I")
    public int method2278(int arg0) {
        return arg0 * 8 - this.field1993;
    }
}
