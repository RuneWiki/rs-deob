package deob;

@ObfuscatedName("dg")
public final class class116 extends class127 {

    @ObfuscatedName("dg.j")
    public class117 field1965;

    @ObfuscatedName("dg.r")
    public static final int[] field1961 = new int[] { 0, 1, 3, 7, 15, 31, 63, 127, 255, 511, 1023, 2047, 4095, 8191, 16383, 32767, 65535, 131071, 262143, 524287, 1048575, 2097151, 4194303, 8388607, 16777215, 33554431, 67108863, 134217727, 268435455, 536870911, 1073741823, Integer.MAX_VALUE, -1 };

    @ObfuscatedName("dg.v")
    public int field1962;

    public class116(int arg0) {
        super(arg0);
    }

    @ObfuscatedName("dg.j([II)V")
    public void method2318(int[] arg0) {
        this.field1965 = new class117(arg0);
    }

    @ObfuscatedName("dg.r(II)V")
    public void method2319(int arg0) {
        this.field2025[++this.field2022 - 1] = (byte) (arg0 + this.field1965.method2339());
    }

    @ObfuscatedName("dg.v(B)I")
    public int method2325() {
        return this.field2025[++this.field2022 - 1] - this.field1965.method2339() & 0xFF;
    }

    @ObfuscatedName("dg.p(I)V")
    public void method2321() {
        this.field1962 = this.field2022 * 8;
    }

    @ObfuscatedName("dg.e(II)I")
    public int method2322(int arg0) {
        int var2 = this.field1962 >> 3;
        int var3 = 8 - (this.field1962 & 0x7);
        int var4 = 0;
        this.field1962 += arg0;
        while (arg0 > var3) {
            var4 += (this.field2025[var2++] & field1961[var3]) << arg0 - var3;
            arg0 -= var3;
            var3 = 8;
        }
        int var5;
        if (arg0 == var3) {
            var5 = (this.field2025[var2] & field1961[var3]) + var4;
        } else {
            var5 = (this.field2025[var2] >> var3 - arg0 & field1961[arg0]) + var4;
        }
        return var5;
    }

    @ObfuscatedName("dg.d(I)V")
    public void method2323() {
        this.field2022 = (this.field1962 + 7) / 8;
    }

    @ObfuscatedName("dg.y(IB)I")
    public int method2324(int arg0) {
        return arg0 * 8 - this.field1962;
    }
}
