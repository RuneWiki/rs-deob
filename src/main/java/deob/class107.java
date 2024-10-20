package deob;

@ObfuscatedName("dm")
public final class class107 extends class104 {

    @ObfuscatedName("dm.l")
    public class108 field1846;

    @ObfuscatedName("dm.v")
    public static final int[] field1839 = new int[] { 0, 1, 3, 7, 15, 31, 63, 127, 255, 511, 1023, 2047, 4095, 8191, 16383, 32767, 65535, 131071, 262143, 524287, 1048575, 2097151, 4194303, 8388607, 16777215, 33554431, 67108863, 134217727, 268435455, 536870911, 1073741823, Integer.MAX_VALUE, -1 };

    @ObfuscatedName("dm.j")
    public int field1840;

    public class107(int arg0) {
        super(arg0);
    }

    @ObfuscatedName("dm.hc([II)V")
    public void method2375(int[] arg0) {
        this.field1846 = new class108(arg0);
    }

    @ObfuscatedName("dm.hd(II)V")
    public void method2376(int arg0) {
        this.field1819[++this.field1815 - 1] = (byte) (arg0 + this.field1846.method2399());
    }

    @ObfuscatedName("dm.hr(B)I")
    public int method2395() {
        return this.field1819[++this.field1815 - 1] - this.field1846.method2399() & 0xFF;
    }

    @ObfuscatedName("dm.hp(I)V")
    public void method2397() {
        this.field1840 = this.field1815 * 8;
    }

    @ObfuscatedName("dm.hu(IB)I")
    public int method2371(int arg0) {
        int var2 = this.field1840 >> 3;
        int var3 = 8 - (this.field1840 & 0x7);
        int var4 = 0;
        this.field1840 += arg0;
        while (arg0 > var3) {
            var4 += (this.field1819[var2++] & field1839[var3]) << arg0 - var3;
            arg0 -= var3;
            var3 = 8;
        }
        int var5;
        if (arg0 == var3) {
            var5 = (this.field1819[var2] & field1839[var3]) + var4;
        } else {
            var5 = (this.field1819[var2] >> var3 - arg0 & field1839[arg0]) + var4;
        }
        return var5;
    }

    @ObfuscatedName("dm.hi(B)V")
    public void method2377() {
        this.field1815 = (this.field1840 + 7) / 8;
    }

    @ObfuscatedName("dm.hw(II)I")
    public int method2374(int arg0) {
        return arg0 * 8 - this.field1840;
    }
}
