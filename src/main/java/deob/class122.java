package deob;

@ObfuscatedName("do")
public final class class122 extends class119 {

    @ObfuscatedName("do.e")
    public class123 field1986;

    @ObfuscatedName("do.b")
    public static final int[] field1991 = new int[] { 0, 1, 3, 7, 15, 31, 63, 127, 255, 511, 1023, 2047, 4095, 8191, 16383, 32767, 65535, 131071, 262143, 524287, 1048575, 2097151, 4194303, 8388607, 16777215, 33554431, 67108863, 134217727, 268435455, 536870911, 1073741823, Integer.MAX_VALUE, -1 };

    @ObfuscatedName("do.o")
    public int field1987;

    public class122(int arg0) {
        super(arg0);
    }

    @ObfuscatedName("do.ho([IB)V")
    public void method2619(int[] arg0) {
        this.field1986 = new class123(arg0);
    }

    @ObfuscatedName("do.hl(IB)V")
    public void method2620(int arg0) {
        this.field1973[++this.field1966 - 1] = (byte) (arg0 + this.field1986.method2652());
    }

    @ObfuscatedName("do.hg(B)I")
    public int method2625() {
        return this.field1973[++this.field1966 - 1] - this.field1986.method2652() & 0xFF;
    }

    @ObfuscatedName("do.ha(B)V")
    public void method2624() {
        this.field1987 = this.field1966 * 8;
    }

    @ObfuscatedName("do.hy(IB)I")
    public int method2630(int arg0) {
        int var2 = this.field1987 >> 3;
        int var3 = 8 - (this.field1987 & 0x7);
        int var4 = 0;
        this.field1987 += arg0;
        while (arg0 > var3) {
            var4 += (this.field1973[var2++] & field1991[var3]) << arg0 - var3;
            arg0 -= var3;
            var3 = 8;
        }
        int var5;
        if (arg0 == var3) {
            var5 = (this.field1973[var2] & field1991[var3]) + var4;
        } else {
            var5 = (this.field1973[var2] >> var3 - arg0 & field1991[arg0]) + var4;
        }
        return var5;
    }

    @ObfuscatedName("do.hq(B)V")
    public void method2627() {
        this.field1966 = (this.field1987 + 7) / 8;
    }

    @ObfuscatedName("do.hu(IB)I")
    public int method2623(int arg0) {
        return arg0 * 8 - this.field1987;
    }
}
