package deob;

@ObfuscatedName("dj")
public final class class107 extends class104 {

    @ObfuscatedName("dj.f")
    public class108 field1823;

    @ObfuscatedName("dj.a")
    public static final int[] field1824 = new int[] { 0, 1, 3, 7, 15, 31, 63, 127, 255, 511, 1023, 2047, 4095, 8191, 16383, 32767, 65535, 131071, 262143, 524287, 1048575, 2097151, 4194303, 8388607, 16777215, 33554431, 67108863, 134217727, 268435455, 536870911, 1073741823, Integer.MAX_VALUE, -1 };

    @ObfuscatedName("dj.w")
    public int field1827;

    public class107(int arg0) {
        super(arg0);
    }

    @ObfuscatedName("dj.hi([II)V")
    public void method2373(int[] arg0) {
        this.field1823 = new class108(arg0);
    }

    @ObfuscatedName("dj.hb(II)V")
    public void method2372(int arg0) {
        this.field1808[++this.field1806 - 1] = (byte) (arg0 + this.field1823.method2388());
    }

    @ObfuscatedName("dj.hq(S)I")
    public int method2374() {
        return this.field1808[++this.field1806 - 1] - this.field1823.method2388() & 0xFF;
    }

    @ObfuscatedName("dj.hg(B)V")
    public void method2379() {
        this.field1827 = this.field1806 * 8;
    }

    @ObfuscatedName("dj.hj(II)I")
    public int method2376(int arg0) {
        int var2 = this.field1827 >> 3;
        int var3 = 8 - (this.field1827 & 0x7);
        int var4 = 0;
        this.field1827 += arg0;
        while (arg0 > var3) {
            var4 += (this.field1808[var2++] & field1824[var3]) << arg0 - var3;
            arg0 -= var3;
            var3 = 8;
        }
        int var5;
        if (arg0 == var3) {
            var5 = (this.field1808[var2] & field1824[var3]) + var4;
        } else {
            var5 = (this.field1808[var2] >> var3 - arg0 & field1824[arg0]) + var4;
        }
        return var5;
    }

    @ObfuscatedName("dj.hp(B)V")
    public void method2377() {
        this.field1806 = (this.field1827 + 7) / 8;
    }

    @ObfuscatedName("dj.hm(II)I")
    public int method2378(int arg0) {
        return arg0 * 8 - this.field1827;
    }
}
