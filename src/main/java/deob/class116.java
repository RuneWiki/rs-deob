package deob;

@ObfuscatedName("dq")
public final class class116 extends class127 {

    @ObfuscatedName("dq.g")
    public class117 field1965;

    @ObfuscatedName("dq.h")
    public static final int[] field1967 = new int[] { 0, 1, 3, 7, 15, 31, 63, 127, 255, 511, 1023, 2047, 4095, 8191, 16383, 32767, 65535, 131071, 262143, 524287, 1048575, 2097151, 4194303, 8388607, 16777215, 33554431, 67108863, 134217727, 268435455, 536870911, 1073741823, Integer.MAX_VALUE, -1 };

    @ObfuscatedName("dq.s")
    public int field1966;

    public class116(int arg0) {
        super(arg0);
    }

    @ObfuscatedName("dq.g([II)V")
    public void method2362(int[] arg0) {
        this.field1965 = new class117(arg0);
    }

    @ObfuscatedName("dq.h(II)V")
    public void method2360(int arg0) {
        this.field2030[++this.field2027 - 1] = (byte) (arg0 + this.field1965.method2381());
    }

    @ObfuscatedName("dq.s(I)I")
    public int method2361() {
        return this.field2030[++this.field2027 - 1] - this.field1965.method2381() & 0xFF;
    }

    @ObfuscatedName("dq.o(I)V")
    public void method2373() {
        this.field1966 = this.field2027 * 8;
    }

    @ObfuscatedName("dq.p(II)I")
    public int method2359(int arg0) {
        int var2 = this.field1966 >> 3;
        int var3 = 8 - (this.field1966 & 0x7);
        int var4 = 0;
        this.field1966 += arg0;
        while (arg0 > var3) {
            var4 += (this.field2030[var2++] & field1967[var3]) << arg0 - var3;
            arg0 -= var3;
            var3 = 8;
        }
        int var5;
        if (arg0 == var3) {
            var5 = (this.field2030[var2] & field1967[var3]) + var4;
        } else {
            var5 = (this.field2030[var2] >> var3 - arg0 & field1967[arg0]) + var4;
        }
        return var5;
    }

    @ObfuscatedName("dq.x(I)V")
    public void method2364() {
        this.field2027 = (this.field1966 + 7) / 8;
    }

    @ObfuscatedName("dq.k(II)I")
    public int method2363(int arg0) {
        return arg0 * 8 - this.field1966;
    }
}
