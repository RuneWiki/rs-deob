package deob;

@ObfuscatedName("dv")
public final class class114 extends class111 {

    @ObfuscatedName("dv.s")
    public class115 field1906;

    @ObfuscatedName("dv.c")
    public static final int[] field1901 = new int[] { 0, 1, 3, 7, 15, 31, 63, 127, 255, 511, 1023, 2047, 4095, 8191, 16383, 32767, 65535, 131071, 262143, 524287, 1048575, 2097151, 4194303, 8388607, 16777215, 33554431, 67108863, 134217727, 268435455, 536870911, 1073741823, Integer.MAX_VALUE, -1 };

    @ObfuscatedName("dv.d")
    public int field1902;

    public class114(int arg0) {
        super(arg0);
    }

    @ObfuscatedName("dv.hh([IB)V")
    public void method2417(int[] arg0) {
        this.field1906 = new class115(arg0);
    }

    @ObfuscatedName("dv.hv(II)V")
    public void method2426(int arg0) {
        this.field1889[++this.field1885 - 1] = (byte) (arg0 + this.field1906.method2448());
    }

    @ObfuscatedName("dv.hx(I)I")
    public int method2419() {
        return this.field1889[++this.field1885 - 1] - this.field1906.method2448() & 0xFF;
    }

    @ObfuscatedName("dv.hs(I)V")
    public void method2424() {
        this.field1902 = this.field1885 * 8;
    }

    @ObfuscatedName("dv.hy(IS)I")
    public int method2420(int arg0) {
        int var2 = this.field1902 >> 3;
        int var3 = 8 - (this.field1902 & 0x7);
        int var4 = 0;
        this.field1902 += arg0;
        while (arg0 > var3) {
            var4 += (this.field1889[var2++] & field1901[var3]) << arg0 - var3;
            arg0 -= var3;
            var3 = 8;
        }
        int var5;
        if (arg0 == var3) {
            var5 = (this.field1889[var2] & field1901[var3]) + var4;
        } else {
            var5 = (this.field1889[var2] >> var3 - arg0 & field1901[arg0]) + var4;
        }
        return var5;
    }

    @ObfuscatedName("dv.hn(I)V")
    public void method2421() {
        this.field1885 = (this.field1902 + 7) / 8;
    }

    @ObfuscatedName("dv.hm(II)I")
    public int method2441(int arg0) {
        return arg0 * 8 - this.field1902;
    }
}
