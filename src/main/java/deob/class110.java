package deob;

@ObfuscatedName("dw")
public final class class110 extends class107 {

    @ObfuscatedName("dw.y")
    public class111 field1869;

    @ObfuscatedName("dw.f")
    public static final int[] field1868 = new int[] { 0, 1, 3, 7, 15, 31, 63, 127, 255, 511, 1023, 2047, 4095, 8191, 16383, 32767, 65535, 131071, 262143, 524287, 1048575, 2097151, 4194303, 8388607, 16777215, 33554431, 67108863, 134217727, 268435455, 536870911, 1073741823, Integer.MAX_VALUE, -1 };

    @ObfuscatedName("dw.p")
    public int field1871;

    public class110(int arg0) {
        super(arg0);
    }

    @ObfuscatedName("dw.hv([II)V")
    public void method2388(int[] arg0) {
        this.field1869 = new class111(arg0);
    }

    @ObfuscatedName("dw.hr(IB)V")
    public void method2389(int arg0) {
        this.field1844[++this.field1845 - 1] = (byte) (arg0 + this.field1869.method2416());
    }

    @ObfuscatedName("dw.he(I)I")
    public int method2390() {
        return this.field1844[++this.field1845 - 1] - this.field1869.method2416() & 0xFF;
    }

    @ObfuscatedName("dw.hz(B)V")
    public void method2391() {
        this.field1871 = this.field1845 * 8;
    }

    @ObfuscatedName("dw.hn(II)I")
    public int method2392(int arg0) {
        int var2 = this.field1871 >> 3;
        int var3 = 8 - (this.field1871 & 0x7);
        int var4 = 0;
        this.field1871 += arg0;
        while (arg0 > var3) {
            var4 += (this.field1844[var2++] & field1868[var3]) << arg0 - var3;
            arg0 -= var3;
            var3 = 8;
        }
        int var5;
        if (arg0 == var3) {
            var5 = (this.field1844[var2] & field1868[var3]) + var4;
        } else {
            var5 = (this.field1844[var2] >> var3 - arg0 & field1868[arg0]) + var4;
        }
        return var5;
    }

    @ObfuscatedName("dw.hp(I)V")
    public void method2406() {
        this.field1845 = (this.field1871 + 7) / 8;
    }

    @ObfuscatedName("dw.ia(IB)I")
    public int method2409(int arg0) {
        return arg0 * 8 - this.field1871;
    }
}
