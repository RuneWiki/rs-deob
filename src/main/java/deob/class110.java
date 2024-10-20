package deob;

@ObfuscatedName("dm")
public final class class110 extends class107 {

    @ObfuscatedName("dm.v")
    public class111 field1852;

    @ObfuscatedName("dm.z")
    public static final int[] field1845 = new int[] { 0, 1, 3, 7, 15, 31, 63, 127, 255, 511, 1023, 2047, 4095, 8191, 16383, 32767, 65535, 131071, 262143, 524287, 1048575, 2097151, 4194303, 8388607, 16777215, 33554431, 67108863, 134217727, 268435455, 536870911, 1073741823, Integer.MAX_VALUE, -1 };

    @ObfuscatedName("dm.j")
    public int field1847;

    public class110(int arg0) {
        super(arg0);
    }

    @ObfuscatedName("dm.hb([II)V")
    public void method2353(int[] arg0) {
        this.field1852 = new class111(arg0);
    }

    @ObfuscatedName("dm.hw(IB)V")
    public void method2345(int arg0) {
        this.field1831[++this.field1830 - 1] = (byte) (arg0 + this.field1852.method2377());
    }

    @ObfuscatedName("dm.hy(I)I")
    public int method2350() {
        return this.field1831[++this.field1830 - 1] - this.field1852.method2377() & 0xFF;
    }

    @ObfuscatedName("dm.ht(I)V")
    public void method2347() {
        this.field1847 = this.field1830 * 8;
    }

    @ObfuscatedName("dm.hp(IB)I")
    public int method2357(int arg0) {
        int var2 = this.field1847 >> 3;
        int var3 = 8 - (this.field1847 & 0x7);
        int var4 = 0;
        this.field1847 += arg0;
        while (arg0 > var3) {
            var4 += (this.field1831[var2++] & field1845[var3]) << arg0 - var3;
            arg0 -= var3;
            var3 = 8;
        }
        int var5;
        if (arg0 == var3) {
            var5 = (this.field1831[var2] & field1845[var3]) + var4;
        } else {
            var5 = (this.field1831[var2] >> var3 - arg0 & field1845[arg0]) + var4;
        }
        return var5;
    }

    @ObfuscatedName("dm.hu(B)V")
    public void method2349() {
        this.field1830 = (this.field1847 + 7) / 8;
    }

    @ObfuscatedName("dm.hj(II)I")
    public int method2344(int arg0) {
        return arg0 * 8 - this.field1847;
    }
}
