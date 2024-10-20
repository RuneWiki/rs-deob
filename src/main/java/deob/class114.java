package deob;

@ObfuscatedName("dy")
public final class class114 extends class111 {

    @ObfuscatedName("dy.u")
    public class115 field1915;

    @ObfuscatedName("dy.o")
    public static final int[] field1913 = new int[] { 0, 1, 3, 7, 15, 31, 63, 127, 255, 511, 1023, 2047, 4095, 8191, 16383, 32767, 65535, 131071, 262143, 524287, 1048575, 2097151, 4194303, 8388607, 16777215, 33554431, 67108863, 134217727, 268435455, 536870911, 1073741823, Integer.MAX_VALUE, -1 };

    @ObfuscatedName("dy.m")
    public int field1910;

    public class114(int arg0) {
        super(arg0);
    }

    @ObfuscatedName("dy.ho([IB)V")
    public void method2376(int[] arg0) {
        this.field1915 = new class115(arg0);
    }

    @ObfuscatedName("dy.hs(II)V")
    public void method2386(int arg0) {
        this.field1897[++this.field1894 - 1] = (byte) (arg0 + this.field1915.method2400());
    }

    @ObfuscatedName("dy.hr(I)I")
    public int method2391() {
        return this.field1897[++this.field1894 - 1] - this.field1915.method2400() & 0xFF;
    }

    @ObfuscatedName("dy.ha(S)V")
    public void method2379() {
        this.field1910 = this.field1894 * 8;
    }

    @ObfuscatedName("dy.hu(IS)I")
    public int method2380(int arg0) {
        int var2 = this.field1910 >> 3;
        int var3 = 8 - (this.field1910 & 0x7);
        int var4 = 0;
        this.field1910 += arg0;
        while (arg0 > var3) {
            var4 += (this.field1897[var2++] & field1913[var3]) << arg0 - var3;
            arg0 -= var3;
            var3 = 8;
        }
        int var5;
        if (arg0 == var3) {
            var5 = (this.field1897[var2] & field1913[var3]) + var4;
        } else {
            var5 = (this.field1897[var2] >> var3 - arg0 & field1913[arg0]) + var4;
        }
        return var5;
    }

    @ObfuscatedName("dy.ib(I)V")
    public void method2390() {
        this.field1894 = (this.field1910 + 7) / 8;
    }

    @ObfuscatedName("dy.iu(II)I")
    public int method2382(int arg0) {
        return arg0 * 8 - this.field1910;
    }
}
