package deob;

@ObfuscatedName("dc")
public final class class110 extends class107 {

    @ObfuscatedName("dc.m")
    public class111 field1860;

    @ObfuscatedName("dc.t")
    public static final int[] field1864 = new int[] { 0, 1, 3, 7, 15, 31, 63, 127, 255, 511, 1023, 2047, 4095, 8191, 16383, 32767, 65535, 131071, 262143, 524287, 1048575, 2097151, 4194303, 8388607, 16777215, 33554431, 67108863, 134217727, 268435455, 536870911, 1073741823, Integer.MAX_VALUE, -1 };

    @ObfuscatedName("dc.l")
    public int field1861;

    public class110(int arg0) {
        super(arg0);
    }

    @ObfuscatedName("dc.ge([II)V")
    public void method2370(int[] arg0) {
        this.field1860 = new class111(arg0);
    }

    @ObfuscatedName("dc.gu(II)V")
    public void method2374(int arg0) {
        this.field1845[++this.field1841 - 1] = (byte) (arg0 + this.field1860.method2397());
    }

    @ObfuscatedName("dc.gg(B)I")
    public int method2372() {
        return this.field1845[++this.field1841 - 1] - this.field1860.method2397() & 0xFF;
    }

    @ObfuscatedName("dc.gi(B)V")
    public void method2373() {
        this.field1861 = this.field1841 * 8;
    }

    @ObfuscatedName("dc.gm(IB)I")
    public int method2387(int arg0) {
        int var2 = this.field1861 >> 3;
        int var3 = 8 - (this.field1861 & 0x7);
        int var4 = 0;
        this.field1861 += arg0;
        while (arg0 > var3) {
            var4 += (this.field1845[var2++] & field1864[var3]) << arg0 - var3;
            arg0 -= var3;
            var3 = 8;
        }
        int var5;
        if (arg0 == var3) {
            var5 = (this.field1845[var2] & field1864[var3]) + var4;
        } else {
            var5 = (this.field1845[var2] >> var3 - arg0 & field1864[arg0]) + var4;
        }
        return var5;
    }

    @ObfuscatedName("dc.gp(I)V")
    public void method2375() {
        this.field1841 = (this.field1861 + 7) / 8;
    }

    @ObfuscatedName("dc.gr(IB)I")
    public int method2379(int arg0) {
        return arg0 * 8 - this.field1861;
    }
}
