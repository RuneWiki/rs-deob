package deob;

@ObfuscatedName("dm")
public final class class110 extends class107 {

    @ObfuscatedName("dm.g")
    public class111 field1849;

    @ObfuscatedName("dm.l")
    public static final int[] field1848 = new int[] { 0, 1, 3, 7, 15, 31, 63, 127, 255, 511, 1023, 2047, 4095, 8191, 16383, 32767, 65535, 131071, 262143, 524287, 1048575, 2097151, 4194303, 8388607, 16777215, 33554431, 67108863, 134217727, 268435455, 536870911, 1073741823, Integer.MAX_VALUE, -1 };

    @ObfuscatedName("dm.h")
    public int field1850;

    public class110(int arg0) {
        super(arg0);
    }

    @ObfuscatedName("dm.gz([IB)V")
    public void method2338(int[] arg0) {
        this.field1849 = new class111(arg0);
    }

    @ObfuscatedName("dm.gf(II)V")
    public void method2339(int arg0) {
        this.field1826[++this.field1827 - 1] = (byte) (arg0 + this.field1849.method2362());
    }

    @ObfuscatedName("dm.gy(I)I")
    public int method2353() {
        return this.field1826[++this.field1827 - 1] - this.field1849.method2362() & 0xFF;
    }

    @ObfuscatedName("dm.gb(I)V")
    public void method2341() {
        this.field1850 = this.field1827 * 8;
    }

    @ObfuscatedName("dm.go(II)I")
    public int method2337(int arg0) {
        int var2 = this.field1850 >> 3;
        int var3 = 8 - (this.field1850 & 0x7);
        int var4 = 0;
        this.field1850 += arg0;
        while (arg0 > var3) {
            var4 += (this.field1826[var2++] & field1848[var3]) << arg0 - var3;
            arg0 -= var3;
            var3 = 8;
        }
        int var5;
        if (arg0 == var3) {
            var5 = (this.field1826[var2] & field1848[var3]) + var4;
        } else {
            var5 = (this.field1826[var2] >> var3 - arg0 & field1848[arg0]) + var4;
        }
        return var5;
    }

    @ObfuscatedName("dm.gm(I)V")
    public void method2343() {
        this.field1827 = (this.field1850 + 7) / 8;
    }

    @ObfuscatedName("dm.gp(II)I")
    public int method2344(int arg0) {
        return arg0 * 8 - this.field1850;
    }
}
