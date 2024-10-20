package deob;

@ObfuscatedName("dj")
public final class class115 extends class126 {

    @ObfuscatedName("dj.g")
    public class116 field1952;

    @ObfuscatedName("dj.e")
    public static final int[] field1949 = new int[] { 0, 1, 3, 7, 15, 31, 63, 127, 255, 511, 1023, 2047, 4095, 8191, 16383, 32767, 65535, 131071, 262143, 524287, 1048575, 2097151, 4194303, 8388607, 16777215, 33554431, 67108863, 134217727, 268435455, 536870911, 1073741823, Integer.MAX_VALUE, -1 };

    @ObfuscatedName("dj.n")
    public int field1950;

    public class115(int arg0) {
        super(arg0);
    }

    @ObfuscatedName("dj.g([II)V")
    public void method2359(int[] arg0) {
        this.field1952 = new class116(arg0);
    }

    @ObfuscatedName("dj.e(II)V")
    public void method2358(int arg0) {
        this.field2013[++this.field2016 - 1] = (byte) (arg0 + this.field1952.method2383());
    }

    @ObfuscatedName("dj.n(I)I")
    public int method2360() {
        return this.field2013[++this.field2016 - 1] - this.field1952.method2383() & 0xFF;
    }

    @ObfuscatedName("dj.j(I)V")
    public void method2361() {
        this.field1950 = this.field2016 * 8;
    }

    @ObfuscatedName("dj.i(II)I")
    public int method2377(int arg0) {
        int var2 = this.field1950 >> 3;
        int var3 = 8 - (this.field1950 & 0x7);
        int var4 = 0;
        this.field1950 += arg0;
        while (arg0 > var3) {
            var4 += (this.field2013[var2++] & field1949[var3]) << arg0 - var3;
            arg0 -= var3;
            var3 = 8;
        }
        int var5;
        if (arg0 == var3) {
            var5 = (this.field2013[var2] & field1949[var3]) + var4;
        } else {
            var5 = (this.field2013[var2] >> var3 - arg0 & field1949[arg0]) + var4;
        }
        return var5;
    }

    @ObfuscatedName("dj.o(I)V")
    public void method2378() {
        this.field2016 = (this.field1950 + 7) / 8;
    }

    @ObfuscatedName("dj.l(II)I")
    public int method2364(int arg0) {
        return arg0 * 8 - this.field1950;
    }
}
