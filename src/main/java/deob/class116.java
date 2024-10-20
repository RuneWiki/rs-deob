package deob;

@ObfuscatedName("db")
public final class class116 extends class127 {

    @ObfuscatedName("db.p")
    public class117 field1988;

    @ObfuscatedName("db.e")
    public static final int[] field1984 = new int[] { 0, 1, 3, 7, 15, 31, 63, 127, 255, 511, 1023, 2047, 4095, 8191, 16383, 32767, 65535, 131071, 262143, 524287, 1048575, 2097151, 4194303, 8388607, 16777215, 33554431, 67108863, 134217727, 268435455, 536870911, 1073741823, Integer.MAX_VALUE, -1 };

    @ObfuscatedName("db.a")
    public int field1985;

    public class116(int arg0) {
        super(arg0);
    }

    @ObfuscatedName("db.p([II)V")
    public void method2357(int[] arg0) {
        this.field1988 = new class117(arg0);
    }

    @ObfuscatedName("db.e(II)V")
    public void method2345(int arg0) {
        this.field2033[++this.field2029 - 1] = (byte) (arg0 + this.field1988.method2382());
    }

    @ObfuscatedName("db.a(I)I")
    public int method2343() {
        return this.field2033[++this.field2029 - 1] - this.field1988.method2382() & 0xFF;
    }

    @ObfuscatedName("db.h(S)V")
    public void method2347() {
        this.field1985 = this.field2029 * 8;
    }

    @ObfuscatedName("db.y(II)I")
    public int method2352(int arg0) {
        int var2 = this.field1985 >> 3;
        int var3 = 8 - (this.field1985 & 0x7);
        int var4 = 0;
        this.field1985 += arg0;
        while (arg0 > var3) {
            var4 += (this.field2033[var2++] & field1984[var3]) << arg0 - var3;
            arg0 -= var3;
            var3 = 8;
        }
        int var5;
        if (arg0 == var3) {
            var5 = (this.field2033[var2] & field1984[var3]) + var4;
        } else {
            var5 = (this.field2033[var2] >> var3 - arg0 & field1984[arg0]) + var4;
        }
        return var5;
    }

    @ObfuscatedName("db.j(B)V")
    public void method2349() {
        this.field2029 = (this.field1985 + 7) / 8;
    }

    @ObfuscatedName("db.l(IB)I")
    public int method2350(int arg0) {
        return arg0 * 8 - this.field1985;
    }
}
