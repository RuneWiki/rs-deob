package deob;

@ObfuscatedName("dd")
public final class class115 extends class125 {

    @ObfuscatedName("dd.c")
    public class116 field1958;

    @ObfuscatedName("dd.j")
    public static final int[] field1956 = new int[] { 0, 1, 3, 7, 15, 31, 63, 127, 255, 511, 1023, 2047, 4095, 8191, 16383, 32767, 65535, 131071, 262143, 524287, 1048575, 2097151, 4194303, 8388607, 16777215, 33554431, 67108863, 134217727, 268435455, 536870911, 1073741823, Integer.MAX_VALUE, -1 };

    @ObfuscatedName("dd.f")
    public int field1955;

    public class115(int arg0) {
        super(arg0);
    }

    @ObfuscatedName("dd.c([IB)V")
    public void method2211(int[] arg0) {
        this.field1958 = new class116(arg0);
    }

    @ObfuscatedName("dd.j(II)V")
    public void method2198(int arg0) {
        this.field2002[++this.field2003 - 1] = (byte) (arg0 + this.field1958.method2227());
    }

    @ObfuscatedName("dd.f(I)I")
    public int method2203() {
        return this.field2002[++this.field2003 - 1] - this.field1958.method2227() & 0xFF;
    }

    @ObfuscatedName("dd.y(I)V")
    public void method2200() {
        this.field1955 = this.field2003 * 8;
    }

    @ObfuscatedName("dd.x(IB)I")
    public int method2201(int arg0) {
        int var2 = this.field1955 >> 3;
        int var3 = 8 - (this.field1955 & 0x7);
        int var4 = 0;
        this.field1955 += arg0;
        while (arg0 > var3) {
            var4 += (this.field2002[var2++] & field1956[var3]) << arg0 - var3;
            arg0 -= var3;
            var3 = 8;
        }
        int var5;
        if (arg0 == var3) {
            var5 = (this.field2002[var2] & field1956[var3]) + var4;
        } else {
            var5 = (this.field2002[var2] >> var3 - arg0 & field1956[arg0]) + var4;
        }
        return var5;
    }

    @ObfuscatedName("dd.e(I)V")
    public void method2202() {
        this.field2003 = (this.field1955 + 7) / 8;
    }

    @ObfuscatedName("dd.m(IS)I")
    public int method2214(int arg0) {
        return arg0 * 8 - this.field1955;
    }
}
