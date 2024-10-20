package deob;

@ObfuscatedName("dj")
public final class class114 extends class111 {

    @ObfuscatedName("dj.l")
    public class115 field1880;

    @ObfuscatedName("dj.m")
    public static final int[] field1873 = new int[] { 0, 1, 3, 7, 15, 31, 63, 127, 255, 511, 1023, 2047, 4095, 8191, 16383, 32767, 65535, 131071, 262143, 524287, 1048575, 2097151, 4194303, 8388607, 16777215, 33554431, 67108863, 134217727, 268435455, 536870911, 1073741823, Integer.MAX_VALUE, -1 };

    @ObfuscatedName("dj.o")
    public int field1872;

    public class114(int arg0) {
        super(arg0);
    }

    @ObfuscatedName("dj.gv([II)V")
    public void method2375(int[] arg0) {
        this.field1880 = new class115(arg0);
    }

    @ObfuscatedName("dj.gy(II)V")
    public void method2396(int arg0) {
        this.field1859[++this.field1852 - 1] = (byte) (arg0 + this.field1880.method2410());
    }

    @ObfuscatedName("dj.hn(I)I")
    public int method2383() {
        return this.field1859[++this.field1852 - 1] - this.field1880.method2410() & 0xFF;
    }

    @ObfuscatedName("dj.hm(I)V")
    public void method2376() {
        this.field1872 = this.field1852 * 8;
    }

    @ObfuscatedName("dj.hf(II)I")
    public int method2378(int arg0) {
        int var2 = this.field1872 >> 3;
        int var3 = 8 - (this.field1872 & 0x7);
        int var4 = 0;
        this.field1872 += arg0;
        while (arg0 > var3) {
            var4 += (this.field1859[var2++] & field1873[var3]) << arg0 - var3;
            arg0 -= var3;
            var3 = 8;
        }
        int var5;
        if (arg0 == var3) {
            var5 = (this.field1859[var2] & field1873[var3]) + var4;
        } else {
            var5 = (this.field1859[var2] >> var3 - arg0 & field1873[arg0]) + var4;
        }
        return var5;
    }

    @ObfuscatedName("dj.hd(I)V")
    public void method2379() {
        this.field1852 = (this.field1872 + 7) / 8;
    }

    @ObfuscatedName("dj.hh(IB)I")
    public int method2389(int arg0) {
        return arg0 * 8 - this.field1872;
    }
}
