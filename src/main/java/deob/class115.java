package deob;

@ObfuscatedName("dg")
public final class class115 extends class126 {

    @ObfuscatedName("dg.z")
    public class116 field1958;

    @ObfuscatedName("dg.h")
    public static final int[] field1960 = new int[] { 0, 1, 3, 7, 15, 31, 63, 127, 255, 511, 1023, 2047, 4095, 8191, 16383, 32767, 65535, 131071, 262143, 524287, 1048575, 2097151, 4194303, 8388607, 16777215, 33554431, 67108863, 134217727, 268435455, 536870911, 1073741823, Integer.MAX_VALUE, -1 };

    @ObfuscatedName("dg.c")
    public int field1959;

    public class115(int arg0) {
        super(arg0);
    }

    @ObfuscatedName("dg.z([IB)V")
    public void method2306(int[] arg0) {
        this.field1958 = new class116(arg0);
    }

    @ObfuscatedName("dg.h(II)V")
    public void method2307(int arg0) {
        this.field2007[++this.field2003 - 1] = (byte) (arg0 + this.field1958.method2331());
    }

    @ObfuscatedName("dg.c(I)I")
    public int method2308() {
        return this.field2007[++this.field2003 - 1] - this.field1958.method2331() & 0xFF;
    }

    @ObfuscatedName("dg.p(I)V")
    public void method2310() {
        this.field1959 = this.field2003 * 8;
    }

    @ObfuscatedName("dg.i(IB)I")
    public int method2312(int arg0) {
        int var2 = this.field1959 >> 3;
        int var3 = 8 - (this.field1959 & 0x7);
        int var4 = 0;
        this.field1959 += arg0;
        while (arg0 > var3) {
            var4 += (this.field2007[var2++] & field1960[var3]) << arg0 - var3;
            arg0 -= var3;
            var3 = 8;
        }
        int var5;
        if (arg0 == var3) {
            var5 = (this.field2007[var2] & field1960[var3]) + var4;
        } else {
            var5 = (this.field2007[var2] >> var3 - arg0 & field1960[arg0]) + var4;
        }
        return var5;
    }

    @ObfuscatedName("dg.v(I)V")
    public void method2311() {
        this.field2003 = (this.field1959 + 7) / 8;
    }

    @ObfuscatedName("dg.l(IB)I")
    public int method2309(int arg0) {
        return arg0 * 8 - this.field1959;
    }
}
