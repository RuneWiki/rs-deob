package deob;

@ObfuscatedName("de")
public final class class111 extends class108 {

    @ObfuscatedName("de.w")
    public class112 field1847;

    @ObfuscatedName("de.l")
    public static final int[] field1844 = new int[] { 0, 1, 3, 7, 15, 31, 63, 127, 255, 511, 1023, 2047, 4095, 8191, 16383, 32767, 65535, 131071, 262143, 524287, 1048575, 2097151, 4194303, 8388607, 16777215, 33554431, 67108863, 134217727, 268435455, 536870911, 1073741823, Integer.MAX_VALUE, -1 };

    @ObfuscatedName("de.n")
    public int field1845;

    public class111(int arg0) {
        super(arg0);
    }

    @ObfuscatedName("de.hq([IB)V")
    public void method2311(int[] arg0) {
        this.field1847 = new class112(arg0);
    }

    @ObfuscatedName("de.ht(IB)V")
    public void method2312(int arg0) {
        this.field1828[++this.field1824 - 1] = (byte) (arg0 + this.field1847.method2338());
    }

    @ObfuscatedName("de.hc(I)I")
    public int method2310() {
        return this.field1828[++this.field1824 - 1] - this.field1847.method2338() & 0xFF;
    }

    @ObfuscatedName("de.hs(B)V")
    public void method2334() {
        this.field1845 = this.field1824 * 8;
    }

    @ObfuscatedName("de.hg(IB)I")
    public int method2315(int arg0) {
        int var2 = this.field1845 >> 3;
        int var3 = 8 - (this.field1845 & 0x7);
        int var4 = 0;
        this.field1845 += arg0;
        while (arg0 > var3) {
            var4 += (this.field1828[var2++] & field1844[var3]) << arg0 - var3;
            arg0 -= var3;
            var3 = 8;
        }
        int var5;
        if (arg0 == var3) {
            var5 = (this.field1828[var2] & field1844[var3]) + var4;
        } else {
            var5 = (this.field1828[var2] >> var3 - arg0 & field1844[arg0]) + var4;
        }
        return var5;
    }

    @ObfuscatedName("de.hk(B)V")
    public void method2316() {
        this.field1824 = (this.field1845 + 7) / 8;
    }

    @ObfuscatedName("de.hn(II)I")
    public int method2317(int arg0) {
        return arg0 * 8 - this.field1845;
    }
}
