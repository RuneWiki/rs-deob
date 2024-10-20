package deob;

@ObfuscatedName("da")
public final class class114 extends class111 {

    @ObfuscatedName("da.v")
    public class115 field1885;

    @ObfuscatedName("da.y")
    public static final int[] field1879 = new int[] { 0, 1, 3, 7, 15, 31, 63, 127, 255, 511, 1023, 2047, 4095, 8191, 16383, 32767, 65535, 131071, 262143, 524287, 1048575, 2097151, 4194303, 8388607, 16777215, 33554431, 67108863, 134217727, 268435455, 536870911, 1073741823, Integer.MAX_VALUE, -1 };

    @ObfuscatedName("da.k")
    public int field1880;

    public class114(int arg0) {
        super(arg0);
    }

    @ObfuscatedName("da.in([II)V")
    public void method2476(int[] arg0) {
        this.field1885 = new class115(arg0);
    }

    @ObfuscatedName("da.ig(II)V")
    public void method2477(int arg0) {
        this.field1860[++this.field1861 - 1] = (byte) (arg0 + this.field1885.method2502());
    }

    @ObfuscatedName("da.if(I)I")
    public int method2478() {
        return this.field1860[++this.field1861 - 1] - this.field1885.method2502() & 0xFF;
    }

    @ObfuscatedName("da.iu(I)V")
    public void method2479() {
        this.field1880 = this.field1861 * 8;
    }

    @ObfuscatedName("da.id(II)I")
    public int method2482(int arg0) {
        int var2 = this.field1880 >> 3;
        int var3 = 8 - (this.field1880 & 0x7);
        int var4 = 0;
        this.field1880 += arg0;
        while (arg0 > var3) {
            var4 += (this.field1860[var2++] & field1879[var3]) << arg0 - var3;
            arg0 -= var3;
            var3 = 8;
        }
        int var5;
        if (arg0 == var3) {
            var5 = (this.field1860[var2] & field1879[var3]) + var4;
        } else {
            var5 = (this.field1860[var2] >> var3 - arg0 & field1879[arg0]) + var4;
        }
        return var5;
    }

    @ObfuscatedName("da.ir(I)V")
    public void method2475() {
        this.field1861 = (this.field1880 + 7) / 8;
    }

    @ObfuscatedName("da.ic(II)I")
    public int method2498(int arg0) {
        return arg0 * 8 - this.field1880;
    }
}
