package deob;

@ObfuscatedName("de")
public final class class122 extends class119 {

    @ObfuscatedName("de.t")
    public class123 field2002;

    @ObfuscatedName("de.k")
    public static final int[] field1999 = new int[] { 0, 1, 3, 7, 15, 31, 63, 127, 255, 511, 1023, 2047, 4095, 8191, 16383, 32767, 65535, 131071, 262143, 524287, 1048575, 2097151, 4194303, 8388607, 16777215, 33554431, 67108863, 134217727, 268435455, 536870911, 1073741823, Integer.MAX_VALUE, -1 };

    @ObfuscatedName("de.s")
    public int field2000;

    public class122(int arg0) {
        super(arg0);
    }

    @ObfuscatedName("de.ht([II)V")
    public void method2618(int[] arg0) {
        this.field2002 = new class123(arg0);
    }

    @ObfuscatedName("de.hk(IB)V")
    public void method2621(int arg0) {
        this.field1981[++this.field1982 - 1] = (byte) (arg0 + this.field2002.method2643());
    }

    @ObfuscatedName("de.hj(I)I")
    public int method2632() {
        return this.field1981[++this.field1982 - 1] - this.field2002.method2643() & 0xFF;
    }

    @ObfuscatedName("de.ho(B)V")
    public void method2623() {
        this.field2000 = this.field1982 * 8;
    }

    @ObfuscatedName("de.hu(IS)I")
    public int method2622(int arg0) {
        int var2 = this.field2000 >> 3;
        int var3 = 8 - (this.field2000 & 0x7);
        int var4 = 0;
        this.field2000 += arg0;
        while (arg0 > var3) {
            var4 += (this.field1981[var2++] & field1999[var3]) << arg0 - var3;
            arg0 -= var3;
            var3 = 8;
        }
        int var5;
        if (arg0 == var3) {
            var5 = (this.field1981[var2] & field1999[var3]) + var4;
        } else {
            var5 = (this.field1981[var2] >> var3 - arg0 & field1999[arg0]) + var4;
        }
        return var5;
    }

    @ObfuscatedName("de.hm(S)V")
    public void method2636() {
        this.field1982 = (this.field2000 + 7) / 8;
    }

    @ObfuscatedName("de.he(II)I")
    public int method2624(int arg0) {
        return arg0 * 8 - this.field2000;
    }
}
