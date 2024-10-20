package deob;

@ObfuscatedName("dt")
public final class class110 extends class107 {

    @ObfuscatedName("dt.a")
    public class111 field1866;

    @ObfuscatedName("dt.x")
    public static final int[] field1865 = new int[] { 0, 1, 3, 7, 15, 31, 63, 127, 255, 511, 1023, 2047, 4095, 8191, 16383, 32767, 65535, 131071, 262143, 524287, 1048575, 2097151, 4194303, 8388607, 16777215, 33554431, 67108863, 134217727, 268435455, 536870911, 1073741823, Integer.MAX_VALUE, -1 };

    @ObfuscatedName("dt.r")
    public int field1867;

    public class110(int arg0) {
        super(arg0);
    }

    @ObfuscatedName("dt.gb([IB)V")
    public void method2330(int[] arg0) {
        this.field1866 = new class111(arg0);
    }

    @ObfuscatedName("dt.gq(IB)V")
    public void method2331(int arg0) {
        this.field1856[++this.field1854 - 1] = (byte) (arg0 + this.field1866.method2362());
    }

    @ObfuscatedName("dt.gz(I)I")
    public int method2359() {
        return this.field1856[++this.field1854 - 1] - this.field1866.method2362() & 0xFF;
    }

    @ObfuscatedName("dt.gd(I)V")
    public void method2341() {
        this.field1867 = this.field1854 * 8;
    }

    @ObfuscatedName("dt.hn(IB)I")
    public int method2339(int arg0) {
        int var2 = this.field1867 >> 3;
        int var3 = 8 - (this.field1867 & 0x7);
        int var4 = 0;
        this.field1867 += arg0;
        while (arg0 > var3) {
            var4 += (this.field1856[var2++] & field1865[var3]) << arg0 - var3;
            arg0 -= var3;
            var3 = 8;
        }
        int var5;
        if (arg0 == var3) {
            var5 = (this.field1856[var2] & field1865[var3]) + var4;
        } else {
            var5 = (this.field1856[var2] >> var3 - arg0 & field1865[arg0]) + var4;
        }
        return var5;
    }

    @ObfuscatedName("dt.ho(I)V")
    public void method2334() {
        this.field1854 = (this.field1867 + 7) / 8;
    }

    @ObfuscatedName("dt.hl(II)I")
    public int method2351(int arg0) {
        return arg0 * 8 - this.field1867;
    }
}
