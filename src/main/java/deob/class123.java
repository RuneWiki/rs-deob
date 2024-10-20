package deob;

@ObfuscatedName("dm")
public final class class123 extends class120 {

    @ObfuscatedName("dm.r")
    public class124 field1999;

    @ObfuscatedName("dm.k")
    public static final int[] field2000 = new int[] { 0, 1, 3, 7, 15, 31, 63, 127, 255, 511, 1023, 2047, 4095, 8191, 16383, 32767, 65535, 131071, 262143, 524287, 1048575, 2097151, 4194303, 8388607, 16777215, 33554431, 67108863, 134217727, 268435455, 536870911, 1073741823, Integer.MAX_VALUE, -1 };

    @ObfuscatedName("dm.m")
    public int field2003;

    public class123(int arg0) {
        super(arg0);
    }

    @ObfuscatedName("dm.hd([IB)V")
    public void method2604(int[] arg0) {
        this.field1999 = new class124(arg0);
    }

    @ObfuscatedName("dm.hv(II)V")
    public void method2594(int arg0) {
        this.field1981[++this.field1977 - 1] = (byte) (arg0 + this.field1999.method2608());
    }

    @ObfuscatedName("dm.hl(B)I")
    public int method2598() {
        return this.field1981[++this.field1977 - 1] - this.field1999.method2608() & 0xFF;
    }

    @ObfuscatedName("dm.hr(I)V")
    public void method2587() {
        this.field2003 = this.field1977 * 8;
    }

    @ObfuscatedName("dm.ho(IB)I")
    public int method2588(int arg0) {
        int var2 = this.field2003 >> 3;
        int var3 = 8 - (this.field2003 & 0x7);
        int var4 = 0;
        this.field2003 += arg0;
        while (arg0 > var3) {
            var4 += (this.field1981[var2++] & field2000[var3]) << arg0 - var3;
            arg0 -= var3;
            var3 = 8;
        }
        int var5;
        if (arg0 == var3) {
            var5 = (this.field1981[var2] & field2000[var3]) + var4;
        } else {
            var5 = (this.field1981[var2] >> var3 - arg0 & field2000[arg0]) + var4;
        }
        return var5;
    }

    @ObfuscatedName("dm.hf(I)V")
    public void method2586() {
        this.field1977 = (this.field2003 + 7) / 8;
    }

    @ObfuscatedName("dm.hx(II)I")
    public int method2590(int arg0) {
        return arg0 * 8 - this.field2003;
    }
}
