package deob;

@ObfuscatedName("dm")
public final class class116 extends class127 {

    @ObfuscatedName("dm.c")
    public class117 field1993;

    @ObfuscatedName("dm.q")
    public static final int[] field1991 = new int[] { 0, 1, 3, 7, 15, 31, 63, 127, 255, 511, 1023, 2047, 4095, 8191, 16383, 32767, 65535, 131071, 262143, 524287, 1048575, 2097151, 4194303, 8388607, 16777215, 33554431, 67108863, 134217727, 268435455, 536870911, 1073741823, Integer.MAX_VALUE, -1 };

    @ObfuscatedName("dm.y")
    public int field1994;

    public class116(int arg0) {
        super(arg0);
    }

    @ObfuscatedName("dm.c([II)V")
    public void method2201(int[] arg0) {
        this.field1993 = new class117(arg0);
    }

    @ObfuscatedName("dm.q(II)V")
    public void method2218(int arg0) {
        this.field2057[++this.field2052 - 1] = (byte) (arg0 + this.field1993.method2237());
    }

    @ObfuscatedName("dm.y(I)I")
    public int method2203() {
        return this.field2057[++this.field2052 - 1] - this.field1993.method2237() & 0xFF;
    }

    @ObfuscatedName("dm.v(I)V")
    public void method2204() {
        this.field1994 = this.field2052 * 8;
    }

    @ObfuscatedName("dm.g(IB)I")
    public int method2209(int arg0) {
        int var2 = this.field1994 >> 3;
        int var3 = 8 - (this.field1994 & 0x7);
        int var4 = 0;
        this.field1994 += arg0;
        while (arg0 > var3) {
            var4 += (this.field2057[var2++] & field1991[var3]) << arg0 - var3;
            arg0 -= var3;
            var3 = 8;
        }
        int var5;
        if (arg0 == var3) {
            var5 = (this.field2057[var2] & field1991[var3]) + var4;
        } else {
            var5 = (this.field2057[var2] >> var3 - arg0 & field1991[arg0]) + var4;
        }
        return var5;
    }

    @ObfuscatedName("dm.x(I)V")
    public void method2206() {
        this.field2052 = (this.field1994 + 7) / 8;
    }

    @ObfuscatedName("dm.u(II)I")
    public int method2207(int arg0) {
        return arg0 * 8 - this.field1994;
    }
}
