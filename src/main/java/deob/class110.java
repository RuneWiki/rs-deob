package deob;

@ObfuscatedName("dn")
public final class class110 extends class107 {

    @ObfuscatedName("dn.b")
    public class111 field1863;

    @ObfuscatedName("dn.v")
    public static final int[] field1858 = new int[] { 0, 1, 3, 7, 15, 31, 63, 127, 255, 511, 1023, 2047, 4095, 8191, 16383, 32767, 65535, 131071, 262143, 524287, 1048575, 2097151, 4194303, 8388607, 16777215, 33554431, 67108863, 134217727, 268435455, 536870911, 1073741823, Integer.MAX_VALUE, -1 };

    @ObfuscatedName("dn.y")
    public int field1857;

    public class110(int arg0) {
        super(arg0);
    }

    @ObfuscatedName("dn.gn([IB)V")
    public void method2343(int[] arg0) {
        this.field1863 = new class111(arg0);
    }

    @ObfuscatedName("dn.gf(II)V")
    public void method2334(int arg0) {
        this.field1839[++this.field1835 - 1] = (byte) (arg0 + this.field1863.method2355());
    }

    @ObfuscatedName("dn.gh(I)I")
    public int method2339() {
        return this.field1839[++this.field1835 - 1] - this.field1863.method2355() & 0xFF;
    }

    @ObfuscatedName("dn.gq(I)V")
    public void method2326() {
        this.field1857 = this.field1835 * 8;
    }

    @ObfuscatedName("dn.gy(IB)I")
    public int method2327(int arg0) {
        int var2 = this.field1857 >> 3;
        int var3 = 8 - (this.field1857 & 0x7);
        int var4 = 0;
        this.field1857 += arg0;
        while (arg0 > var3) {
            var4 += (this.field1839[var2++] & field1858[var3]) << arg0 - var3;
            arg0 -= var3;
            var3 = 8;
        }
        int var5;
        if (arg0 == var3) {
            var5 = (this.field1839[var2] & field1858[var3]) + var4;
        } else {
            var5 = (this.field1839[var2] >> var3 - arg0 & field1858[arg0]) + var4;
        }
        return var5;
    }

    @ObfuscatedName("dn.gv(I)V")
    public void method2328() {
        this.field1835 = (this.field1857 + 7) / 8;
    }

    @ObfuscatedName("dn.gi(IB)I")
    public int method2323(int arg0) {
        return arg0 * 8 - this.field1857;
    }
}
