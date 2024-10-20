package deob;

@ObfuscatedName("db")
public final class class110 extends class107 {

    @ObfuscatedName("db.u")
    public class111 field1867;

    @ObfuscatedName("db.j")
    public static final int[] field1865 = new int[] { 0, 1, 3, 7, 15, 31, 63, 127, 255, 511, 1023, 2047, 4095, 8191, 16383, 32767, 65535, 131071, 262143, 524287, 1048575, 2097151, 4194303, 8388607, 16777215, 33554431, 67108863, 134217727, 268435455, 536870911, 1073741823, Integer.MAX_VALUE, -1 };

    @ObfuscatedName("db.o")
    public int field1866;

    public class110(int arg0) {
        super(arg0);
    }

    @ObfuscatedName("db.hj([IS)V")
    public void method2334(int[] arg0) {
        this.field1867 = new class111(arg0);
    }

    @ObfuscatedName("db.ha(II)V")
    public void method2335(int arg0) {
        this.field1843[++this.field1844 - 1] = (byte) (arg0 + this.field1867.method2362());
    }

    @ObfuscatedName("db.hv(I)I")
    public int method2336() {
        return this.field1843[++this.field1844 - 1] - this.field1867.method2362() & 0xFF;
    }

    @ObfuscatedName("db.hh(I)V")
    public void method2347() {
        this.field1866 = this.field1844 * 8;
    }

    @ObfuscatedName("db.hg(II)I")
    public int method2360(int arg0) {
        int var2 = this.field1866 >> 3;
        int var3 = 8 - (this.field1866 & 0x7);
        int var4 = 0;
        this.field1866 += arg0;
        while (arg0 > var3) {
            var4 += (this.field1843[var2++] & field1865[var3]) << arg0 - var3;
            arg0 -= var3;
            var3 = 8;
        }
        int var5;
        if (arg0 == var3) {
            var5 = (this.field1843[var2] & field1865[var3]) + var4;
        } else {
            var5 = (this.field1843[var2] >> var3 - arg0 & field1865[arg0]) + var4;
        }
        return var5;
    }

    @ObfuscatedName("db.hl(B)V")
    public void method2338() {
        this.field1844 = (this.field1866 + 7) / 8;
    }

    @ObfuscatedName("db.hy(II)I")
    public int method2333(int arg0) {
        return arg0 * 8 - this.field1866;
    }
}
