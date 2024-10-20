package deob;

@ObfuscatedName("dg")
public final class class126 extends class123 {

    @ObfuscatedName("dg.p")
    public class127 field2073;

    @ObfuscatedName("dg.f")
    public static final int[] field2070 = new int[] { 0, 1, 3, 7, 15, 31, 63, 127, 255, 511, 1023, 2047, 4095, 8191, 16383, 32767, 65535, 131071, 262143, 524287, 1048575, 2097151, 4194303, 8388607, 16777215, 33554431, 67108863, 134217727, 268435455, 536870911, 1073741823, Integer.MAX_VALUE, -1 };

    @ObfuscatedName("dg.d")
    public int field2072;

    public class126(int arg0) {
        super(arg0);
    }

    @ObfuscatedName("dg.ix([II)V")
    public void method2669(int[] arg0) {
        this.field2073 = new class127(arg0);
    }

    @ObfuscatedName("dg.iw(II)V")
    public void method2670(int arg0) {
        this.field2056[++this.field2057 - 1] = (byte) (arg0 + this.field2073.method2687());
    }

    @ObfuscatedName("dg.ik(I)I")
    public int method2671() {
        return this.field2056[++this.field2057 - 1] - this.field2073.method2687() & 0xFF;
    }

    @ObfuscatedName("dg.iz(I)V")
    public void method2676() {
        this.field2072 = this.field2057 * 8;
    }

    @ObfuscatedName("dg.ia(IB)I")
    public int method2679(int arg0) {
        int var2 = this.field2072 >> 3;
        int var3 = 8 - (this.field2072 & 0x7);
        int var4 = 0;
        this.field2072 += arg0;
        while (arg0 > var3) {
            var4 += (this.field2056[var2++] & field2070[var3]) << arg0 - var3;
            arg0 -= var3;
            var3 = 8;
        }
        int var5;
        if (arg0 == var3) {
            var5 = (this.field2056[var2] & field2070[var3]) + var4;
        } else {
            var5 = (this.field2056[var2] >> var3 - arg0 & field2070[arg0]) + var4;
        }
        return var5;
    }

    @ObfuscatedName("dg.it(I)V")
    public void method2674() {
        this.field2057 = (this.field2072 + 7) / 8;
    }

    @ObfuscatedName("dg.il(IB)I")
    public int method2675(int arg0) {
        return arg0 * 8 - this.field2072;
    }
}
