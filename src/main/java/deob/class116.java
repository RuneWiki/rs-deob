package deob;

@ObfuscatedName("ds")
public final class class116 extends class126 {

    @ObfuscatedName("ds.b")
    public class117 field1969;

    @ObfuscatedName("ds.e")
    public static final int[] field1968 = new int[] { 0, 1, 3, 7, 15, 31, 63, 127, 255, 511, 1023, 2047, 4095, 8191, 16383, 32767, 65535, 131071, 262143, 524287, 1048575, 2097151, 4194303, 8388607, 16777215, 33554431, 67108863, 134217727, 268435455, 536870911, 1073741823, Integer.MAX_VALUE, -1 };

    @ObfuscatedName("ds.g")
    public int field1972;

    public class116(int arg0) {
        super(arg0);
    }

    @ObfuscatedName("ds.b([II)V")
    public void method2305(int[] arg0) {
        this.field1969 = new class117(arg0);
    }

    @ObfuscatedName("ds.e(II)V")
    public void method2306(int arg0) {
        this.field2026[++this.field2027 - 1] = (byte) (arg0 + this.field1969.method2330());
    }

    @ObfuscatedName("ds.g(I)I")
    public int method2307() {
        return this.field2026[++this.field2027 - 1] - this.field1969.method2330() & 0xFF;
    }

    @ObfuscatedName("ds.o(I)V")
    public void method2315() {
        this.field1972 = this.field2027 * 8;
    }

    @ObfuscatedName("ds.a(IB)I")
    public int method2309(int arg0) {
        int var2 = this.field1972 >> 3;
        int var3 = 8 - (this.field1972 & 0x7);
        int var4 = 0;
        this.field1972 += arg0;
        while (arg0 > var3) {
            var4 += (this.field2026[var2++] & field1968[var3]) << arg0 - var3;
            arg0 -= var3;
            var3 = 8;
        }
        int var5;
        if (arg0 == var3) {
            var5 = (this.field2026[var2] & field1968[var3]) + var4;
        } else {
            var5 = (this.field2026[var2] >> var3 - arg0 & field1968[arg0]) + var4;
        }
        return var5;
    }

    @ObfuscatedName("ds.h(B)V")
    public void method2310() {
        this.field2027 = (this.field1972 + 7) / 8;
    }

    @ObfuscatedName("ds.j(II)I")
    public int method2311(int arg0) {
        return arg0 * 8 - this.field1972;
    }
}
