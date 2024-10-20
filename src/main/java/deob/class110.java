package deob;

@ObfuscatedName("dp")
public final class class110 extends class107 {

    @ObfuscatedName("dp.g")
    public class111 field1888;

    @ObfuscatedName("dp.p")
    public static final int[] field1883 = new int[] { 0, 1, 3, 7, 15, 31, 63, 127, 255, 511, 1023, 2047, 4095, 8191, 16383, 32767, 65535, 131071, 262143, 524287, 1048575, 2097151, 4194303, 8388607, 16777215, 33554431, 67108863, 134217727, 268435455, 536870911, 1073741823, Integer.MAX_VALUE, -1 };

    @ObfuscatedName("dp.o")
    public int field1885;

    public class110(int arg0) {
        super(arg0);
    }

    @ObfuscatedName("dp.hr([IB)V")
    public void method2341(int[] arg0) {
        this.field1888 = new class111(arg0);
    }

    @ObfuscatedName("dp.hd(IB)V")
    public void method2356(int arg0) {
        this.field1865[++this.field1863 - 1] = (byte) (arg0 + this.field1888.method2363());
    }

    @ObfuscatedName("dp.hy(I)I")
    public int method2343() {
        return this.field1865[++this.field1863 - 1] - this.field1888.method2363() & 0xFF;
    }

    @ObfuscatedName("dp.hv(B)V")
    public void method2344() {
        this.field1885 = this.field1863 * 8;
    }

    @ObfuscatedName("dp.hn(II)I")
    public int method2340(int arg0) {
        int var2 = this.field1885 >> 3;
        int var3 = 8 - (this.field1885 & 0x7);
        int var4 = 0;
        this.field1885 += arg0;
        while (arg0 > var3) {
            var4 += (this.field1865[var2++] & field1883[var3]) << arg0 - var3;
            arg0 -= var3;
            var3 = 8;
        }
        int var5;
        if (arg0 == var3) {
            var5 = (this.field1865[var2] & field1883[var3]) + var4;
        } else {
            var5 = (this.field1865[var2] >> var3 - arg0 & field1883[arg0]) + var4;
        }
        return var5;
    }

    @ObfuscatedName("dp.hi(I)V")
    public void method2345() {
        this.field1863 = (this.field1885 + 7) / 8;
    }

    @ObfuscatedName("dp.hq(IB)I")
    public int method2346(int arg0) {
        return arg0 * 8 - this.field1885;
    }
}
