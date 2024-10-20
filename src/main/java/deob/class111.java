package deob;

@ObfuscatedName("dd")
public final class class111 extends class108 {

    @ObfuscatedName("dd.b")
    public class112 field1853;

    @ObfuscatedName("dd.k")
    public static final int[] field1852 = new int[] { 0, 1, 3, 7, 15, 31, 63, 127, 255, 511, 1023, 2047, 4095, 8191, 16383, 32767, 65535, 131071, 262143, 524287, 1048575, 2097151, 4194303, 8388607, 16777215, 33554431, 67108863, 134217727, 268435455, 536870911, 1073741823, Integer.MAX_VALUE, -1 };

    @ObfuscatedName("dd.g")
    public int field1854;

    public class111(int arg0) {
        super(arg0);
    }

    @ObfuscatedName("dd.hu([II)V")
    public void method2374(int[] arg0) {
        this.field1853 = new class112(arg0);
    }

    @ObfuscatedName("dd.hj(IS)V")
    public void method2376(int arg0) {
        this.field1830[++this.field1826 - 1] = (byte) (arg0 + this.field1853.method2407());
    }

    @ObfuscatedName("dd.hz(I)I")
    public int method2378() {
        return this.field1830[++this.field1826 - 1] - this.field1853.method2407() & 0xFF;
    }

    @ObfuscatedName("dd.hk(I)V")
    public void method2377() {
        this.field1854 = this.field1826 * 8;
    }

    @ObfuscatedName("dd.hm(II)I")
    public int method2394(int arg0) {
        int var2 = this.field1854 >> 3;
        int var3 = 8 - (this.field1854 & 0x7);
        int var4 = 0;
        this.field1854 += arg0;
        while (arg0 > var3) {
            var4 += (this.field1830[var2++] & field1852[var3]) << arg0 - var3;
            arg0 -= var3;
            var3 = 8;
        }
        int var5;
        if (arg0 == var3) {
            var5 = (this.field1830[var2] & field1852[var3]) + var4;
        } else {
            var5 = (this.field1830[var2] >> var3 - arg0 & field1852[arg0]) + var4;
        }
        return var5;
    }

    @ObfuscatedName("dd.hx(B)V")
    public void method2379() {
        this.field1826 = (this.field1854 + 7) / 8;
    }

    @ObfuscatedName("dd.hi(II)I")
    public int method2380(int arg0) {
        return arg0 * 8 - this.field1854;
    }
}
