package deob;

@ObfuscatedName("dw")
public final class class110 extends class107 {

    @ObfuscatedName("dw.e")
    public class111 field1863;

    @ObfuscatedName("dw.u")
    public static final int[] field1858 = new int[] { 0, 1, 3, 7, 15, 31, 63, 127, 255, 511, 1023, 2047, 4095, 8191, 16383, 32767, 65535, 131071, 262143, 524287, 1048575, 2097151, 4194303, 8388607, 16777215, 33554431, 67108863, 134217727, 268435455, 536870911, 1073741823, Integer.MAX_VALUE, -1 };

    @ObfuscatedName("dw.j")
    public int field1862;

    public class110(int arg0) {
        super(arg0);
    }

    @ObfuscatedName("dw.gw([II)V")
    public void method2365(int[] arg0) {
        this.field1863 = new class111(arg0);
    }

    @ObfuscatedName("dw.gg(IB)V")
    public void method2366(int arg0) {
        this.field1844[++this.field1838 - 1] = (byte) (arg0 + this.field1863.method2388());
    }

    @ObfuscatedName("dw.hh(B)I")
    public int method2367() {
        return this.field1844[++this.field1838 - 1] - this.field1863.method2388() & 0xFF;
    }

    @ObfuscatedName("dw.hi(I)V")
    public void method2368() {
        this.field1862 = this.field1838 * 8;
    }

    @ObfuscatedName("dw.hk(II)I")
    public int method2369(int arg0) {
        int var2 = this.field1862 >> 3;
        int var3 = 8 - (this.field1862 & 0x7);
        int var4 = 0;
        this.field1862 += arg0;
        while (arg0 > var3) {
            var4 += (this.field1844[var2++] & field1858[var3]) << arg0 - var3;
            arg0 -= var3;
            var3 = 8;
        }
        int var5;
        if (arg0 == var3) {
            var5 = (this.field1844[var2] & field1858[var3]) + var4;
        } else {
            var5 = (this.field1844[var2] >> var3 - arg0 & field1858[arg0]) + var4;
        }
        return var5;
    }

    @ObfuscatedName("dw.ho(B)V")
    public void method2370() {
        this.field1838 = (this.field1862 + 7) / 8;
    }

    @ObfuscatedName("dw.ha(II)I")
    public int method2371(int arg0) {
        return arg0 * 8 - this.field1862;
    }
}
