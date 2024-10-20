package deob;

@ObfuscatedName("de")
public final class class115 extends class126 {

    @ObfuscatedName("de.v")
    public class116 field1968;

    @ObfuscatedName("de.f")
    public static final int[] field1967 = new int[] { 0, 1, 3, 7, 15, 31, 63, 127, 255, 511, 1023, 2047, 4095, 8191, 16383, 32767, 65535, 131071, 262143, 524287, 1048575, 2097151, 4194303, 8388607, 16777215, 33554431, 67108863, 134217727, 268435455, 536870911, 1073741823, Integer.MAX_VALUE, -1 };

    @ObfuscatedName("de.n")
    public int field1973;

    public class115(int arg0) {
        super(arg0);
    }

    @ObfuscatedName("de.v([II)V")
    public void method2330(int[] arg0) {
        this.field1968 = new class116(arg0);
    }

    @ObfuscatedName("de.f(II)V")
    public void method2331(int arg0) {
        this.field2029[++this.field2027 - 1] = (byte) (arg0 + this.field1968.method2355());
    }

    @ObfuscatedName("de.n(I)I")
    public int method2333() {
        return this.field2029[++this.field2027 - 1] - this.field1968.method2355() & 0xFF;
    }

    @ObfuscatedName("de.c(I)V")
    public void method2332() {
        this.field1973 = this.field2027 * 8;
    }

    @ObfuscatedName("de.r(II)I")
    public int method2334(int arg0) {
        int var2 = this.field1973 >> 3;
        int var3 = 8 - (this.field1973 & 0x7);
        int var4 = 0;
        this.field1973 += arg0;
        while (arg0 > var3) {
            var4 += (this.field2029[var2++] & field1967[var3]) << arg0 - var3;
            arg0 -= var3;
            var3 = 8;
        }
        int var5;
        if (arg0 == var3) {
            var5 = (this.field2029[var2] & field1967[var3]) + var4;
        } else {
            var5 = (this.field2029[var2] >> var3 - arg0 & field1967[arg0]) + var4;
        }
        return var5;
    }

    @ObfuscatedName("de.k(I)V")
    public void method2339() {
        this.field2027 = (this.field1973 + 7) / 8;
    }

    @ObfuscatedName("de.e(II)I")
    public int method2341(int arg0) {
        return arg0 * 8 - this.field1973;
    }
}
