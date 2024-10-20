package deob;

@ObfuscatedName("dl")
public final class class110 extends class107 {

    @ObfuscatedName("dl.g")
    public class111 field1876;

    @ObfuscatedName("dl.c")
    public static final int[] field1873 = new int[] { 0, 1, 3, 7, 15, 31, 63, 127, 255, 511, 1023, 2047, 4095, 8191, 16383, 32767, 65535, 131071, 262143, 524287, 1048575, 2097151, 4194303, 8388607, 16777215, 33554431, 67108863, 134217727, 268435455, 536870911, 1073741823, Integer.MAX_VALUE, -1 };

    @ObfuscatedName("dl.o")
    public int field1874;

    public class110(int arg0) {
        super(arg0);
    }

    @ObfuscatedName("dl.gp([II)V")
    public void method2348(int[] arg0) {
        this.field1876 = new class111(arg0);
    }

    @ObfuscatedName("dl.gw(II)V")
    public void method2347(int arg0) {
        this.field1857[++this.field1862 - 1] = (byte) (arg0 + this.field1876.method2379());
    }

    @ObfuscatedName("dl.ga(I)I")
    public int method2351() {
        return this.field1857[++this.field1862 - 1] - this.field1876.method2379() & 0xFF;
    }

    @ObfuscatedName("dl.gd(I)V")
    public void method2353() {
        this.field1874 = this.field1862 * 8;
    }

    @ObfuscatedName("dl.gs(II)I")
    public int method2352(int arg0) {
        int var2 = this.field1874 >> 3;
        int var3 = 8 - (this.field1874 & 0x7);
        int var4 = 0;
        this.field1874 += arg0;
        while (arg0 > var3) {
            var4 += (this.field1857[var2++] & field1873[var3]) << arg0 - var3;
            arg0 -= var3;
            var3 = 8;
        }
        int var5;
        if (arg0 == var3) {
            var5 = (this.field1857[var2] & field1873[var3]) + var4;
        } else {
            var5 = (this.field1857[var2] >> var3 - arg0 & field1873[arg0]) + var4;
        }
        return var5;
    }

    @ObfuscatedName("dl.gr(B)V")
    public void method2377() {
        this.field1862 = (this.field1874 + 7) / 8;
    }

    @ObfuscatedName("dl.hw(IB)I")
    public int method2362(int arg0) {
        return arg0 * 8 - this.field1874;
    }
}
