package deob;

@ObfuscatedName("dj")
public final class class116 extends class127 {

    @ObfuscatedName("dj.i")
    public class117 field1991;

    @ObfuscatedName("dj.w")
    public static final int[] field1989 = new int[] { 0, 1, 3, 7, 15, 31, 63, 127, 255, 511, 1023, 2047, 4095, 8191, 16383, 32767, 65535, 131071, 262143, 524287, 1048575, 2097151, 4194303, 8388607, 16777215, 33554431, 67108863, 134217727, 268435455, 536870911, 1073741823, Integer.MAX_VALUE, -1 };

    @ObfuscatedName("dj.f")
    public int field1993;

    public class116(int arg0) {
        super(arg0);
    }

    @ObfuscatedName("dj.i([IB)V")
    public void method2324(int[] arg0) {
        this.field1991 = new class117(arg0);
    }

    @ObfuscatedName("dj.w(II)V")
    public void method2325(int arg0) {
        this.field2049[++this.field2045 - 1] = (byte) (arg0 + this.field1991.method2352());
    }

    @ObfuscatedName("dj.f(I)I")
    public int method2326() {
        return this.field2049[++this.field2045 - 1] - this.field1991.method2352() & 0xFF;
    }

    @ObfuscatedName("dj.e(B)V")
    public void method2344() {
        this.field1993 = this.field2045 * 8;
    }

    @ObfuscatedName("dj.t(II)I")
    public int method2328(int arg0) {
        int var2 = this.field1993 >> 3;
        int var3 = 8 - (this.field1993 & 0x7);
        int var4 = 0;
        this.field1993 += arg0;
        while (arg0 > var3) {
            var4 += (this.field2049[var2++] & field1989[var3]) << arg0 - var3;
            arg0 -= var3;
            var3 = 8;
        }
        int var5;
        if (arg0 == var3) {
            var5 = (this.field2049[var2] & field1989[var3]) + var4;
        } else {
            var5 = (this.field2049[var2] >> var3 - arg0 & field1989[arg0]) + var4;
        }
        return var5;
    }

    @ObfuscatedName("dj.d(B)V")
    public void method2329() {
        this.field2045 = (this.field1993 + 7) / 8;
    }

    @ObfuscatedName("dj.p(IB)I")
    public int method2327(int arg0) {
        return arg0 * 8 - this.field1993;
    }
}
