package deob;

@ObfuscatedName("dd")
public final class class116 extends class127 {

    @ObfuscatedName("dd.i")
    public class117 field1985;

    @ObfuscatedName("dd.v")
    public static final int[] field1983 = new int[] { 0, 1, 3, 7, 15, 31, 63, 127, 255, 511, 1023, 2047, 4095, 8191, 16383, 32767, 65535, 131071, 262143, 524287, 1048575, 2097151, 4194303, 8388607, 16777215, 33554431, 67108863, 134217727, 268435455, 536870911, 1073741823, Integer.MAX_VALUE, -1 };

    @ObfuscatedName("dd.m")
    public int field1982;

    public class116(int arg0) {
        super(arg0);
    }

    @ObfuscatedName("dd.i([II)V")
    public void method2361(int[] arg0) {
        this.field1985 = new class117(arg0);
    }

    @ObfuscatedName("dd.v(IS)V")
    public void method2352(int arg0) {
        this.field2041[++this.field2039 - 1] = (byte) (arg0 + this.field1985.method2381());
    }

    @ObfuscatedName("dd.m(S)I")
    public int method2353() {
        return this.field2041[++this.field2039 - 1] - this.field1985.method2381() & 0xFF;
    }

    @ObfuscatedName("dd.j(B)V")
    public void method2354() {
        this.field1982 = this.field2039 * 8;
    }

    @ObfuscatedName("dd.o(II)I")
    public int method2355(int arg0) {
        int var2 = this.field1982 >> 3;
        int var3 = 8 - (this.field1982 & 0x7);
        int var4 = 0;
        this.field1982 += arg0;
        while (arg0 > var3) {
            var4 += (this.field2041[var2++] & field1983[var3]) << arg0 - var3;
            arg0 -= var3;
            var3 = 8;
        }
        int var5;
        if (arg0 == var3) {
            var5 = (this.field2041[var2] & field1983[var3]) + var4;
        } else {
            var5 = (this.field2041[var2] >> var3 - arg0 & field1983[arg0]) + var4;
        }
        return var5;
    }

    @ObfuscatedName("dd.l(B)V")
    public void method2356() {
        this.field2039 = (this.field1982 + 7) / 8;
    }

    @ObfuscatedName("dd.g(II)I")
    public int method2357(int arg0) {
        return arg0 * 8 - this.field1982;
    }
}
