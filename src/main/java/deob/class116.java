package deob;

@ObfuscatedName("ds")
public final class class116 extends class127 {

    @ObfuscatedName("ds.x")
    public class117 field1956;

    @ObfuscatedName("ds.p")
    public static final int[] field1954 = new int[] { 0, 1, 3, 7, 15, 31, 63, 127, 255, 511, 1023, 2047, 4095, 8191, 16383, 32767, 65535, 131071, 262143, 524287, 1048575, 2097151, 4194303, 8388607, 16777215, 33554431, 67108863, 134217727, 268435455, 536870911, 1073741823, Integer.MAX_VALUE, -1 };

    @ObfuscatedName("ds.k")
    public int field1953;

    public class116(int arg0) {
        super(arg0);
    }

    @ObfuscatedName("ds.x([II)V")
    public void method2280(int[] arg0) {
        this.field1956 = new class117(arg0);
    }

    @ObfuscatedName("ds.p(IB)V")
    public void method2275(int arg0) {
        this.field2015[++this.field2008 - 1] = (byte) (arg0 + this.field1956.method2304());
    }

    @ObfuscatedName("ds.k(I)I")
    public int method2276() {
        return this.field2015[++this.field2008 - 1] - this.field1956.method2304() & 0xFF;
    }

    @ObfuscatedName("ds.a(I)V")
    public void method2277() {
        this.field1953 = this.field2008 * 8;
    }

    @ObfuscatedName("ds.q(II)I")
    public int method2278(int arg0) {
        int var2 = this.field1953 >> 3;
        int var3 = 8 - (this.field1953 & 0x7);
        int var4 = 0;
        this.field1953 += arg0;
        while (arg0 > var3) {
            var4 += (this.field2015[var2++] & field1954[var3]) << arg0 - var3;
            arg0 -= var3;
            var3 = 8;
        }
        int var5;
        if (arg0 == var3) {
            var5 = (this.field2015[var2] & field1954[var3]) + var4;
        } else {
            var5 = (this.field2015[var2] >> var3 - arg0 & field1954[arg0]) + var4;
        }
        return var5;
    }

    @ObfuscatedName("ds.j(B)V")
    public void method2279() {
        this.field2008 = (this.field1953 + 7) / 8;
    }

    @ObfuscatedName("ds.v(IB)I")
    public int method2290(int arg0) {
        return arg0 * 8 - this.field1953;
    }
}
