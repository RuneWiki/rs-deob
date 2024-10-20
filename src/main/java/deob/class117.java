package deob;

@ObfuscatedName("dw")
public final class class117 extends class128 {

    @ObfuscatedName("dw.i")
    public class118 field1985;

    @ObfuscatedName("dw.b")
    public static final int[] field1986 = new int[] { 0, 1, 3, 7, 15, 31, 63, 127, 255, 511, 1023, 2047, 4095, 8191, 16383, 32767, 65535, 131071, 262143, 524287, 1048575, 2097151, 4194303, 8388607, 16777215, 33554431, 67108863, 134217727, 268435455, 536870911, 1073741823, Integer.MAX_VALUE, -1 };

    @ObfuscatedName("dw.r")
    public int field1988;

    public class117(int arg0) {
        super(arg0);
    }

    @ObfuscatedName("dw.i([IS)V")
    public void method2353(int[] arg0) {
        this.field1985 = new class118(arg0);
    }

    @ObfuscatedName("dw.b(IB)V")
    public void method2335(int arg0) {
        this.field2050[++this.field2048 - 1] = (byte) (arg0 + this.field1985.method2361());
    }

    @ObfuscatedName("dw.r(I)I")
    public int method2336() {
        return this.field2050[++this.field2048 - 1] - this.field1985.method2361() & 0xFF;
    }

    @ObfuscatedName("dw.l(I)V")
    public void method2345() {
        this.field1988 = this.field2048 * 8;
    }

    @ObfuscatedName("dw.s(II)I")
    public int method2338(int arg0) {
        int var2 = this.field1988 >> 3;
        int var3 = 8 - (this.field1988 & 0x7);
        int var4 = 0;
        this.field1988 += arg0;
        while (arg0 > var3) {
            var4 += (this.field2050[var2++] & field1986[var3]) << arg0 - var3;
            arg0 -= var3;
            var3 = 8;
        }
        int var5;
        if (arg0 == var3) {
            var5 = (this.field2050[var2] & field1986[var3]) + var4;
        } else {
            var5 = (this.field2050[var2] >> var3 - arg0 & field1986[arg0]) + var4;
        }
        return var5;
    }

    @ObfuscatedName("dw.d(B)V")
    public void method2344() {
        this.field2048 = (this.field1988 + 7) / 8;
    }

    @ObfuscatedName("dw.e(II)I")
    public int method2349(int arg0) {
        return arg0 * 8 - this.field1988;
    }
}
