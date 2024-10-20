package deob;

@ObfuscatedName("ds")
public final class class122 extends class119 {

    @ObfuscatedName("ds.a")
    public class123 field1997;

    @ObfuscatedName("ds.q")
    public static final int[] field1995 = new int[] { 0, 1, 3, 7, 15, 31, 63, 127, 255, 511, 1023, 2047, 4095, 8191, 16383, 32767, 65535, 131071, 262143, 524287, 1048575, 2097151, 4194303, 8388607, 16777215, 33554431, 67108863, 134217727, 268435455, 536870911, 1073741823, Integer.MAX_VALUE, -1 };

    @ObfuscatedName("ds.m")
    public int field1996;

    public class122(int arg0) {
        super(arg0);
    }

    @ObfuscatedName("ds.hu([IS)V")
    public void method2573(int[] arg0) {
        this.field1997 = new class123(arg0);
    }

    @ObfuscatedName("ds.hh(II)V")
    public void method2574(int arg0) {
        this.field1974[++this.field1973 - 1] = (byte) (arg0 + this.field1997.method2609());
    }

    @ObfuscatedName("ds.hp(I)I")
    public int method2575() {
        return this.field1974[++this.field1973 - 1] - this.field1997.method2609() & 0xFF;
    }

    @ObfuscatedName("ds.hj(I)V")
    public void method2576() {
        this.field1996 = this.field1973 * 8;
    }

    @ObfuscatedName("ds.hd(II)I")
    public int method2582(int arg0) {
        int var2 = this.field1996 >> 3;
        int var3 = 8 - (this.field1996 & 0x7);
        int var4 = 0;
        this.field1996 += arg0;
        while (arg0 > var3) {
            var4 += (this.field1974[var2++] & field1995[var3]) << arg0 - var3;
            arg0 -= var3;
            var3 = 8;
        }
        int var5;
        if (arg0 == var3) {
            var5 = (this.field1974[var2] & field1995[var3]) + var4;
        } else {
            var5 = (this.field1974[var2] >> var3 - arg0 & field1995[arg0]) + var4;
        }
        return var5;
    }

    @ObfuscatedName("ds.ih(I)V")
    public void method2578() {
        this.field1973 = (this.field1996 + 7) / 8;
    }

    @ObfuscatedName("ds.ii(II)I")
    public int method2595(int arg0) {
        return arg0 * 8 - this.field1996;
    }
}
