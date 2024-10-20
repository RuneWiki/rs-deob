package deob;

@ObfuscatedName("dl")
public final class class122 extends class119 {

    @ObfuscatedName("dl.p")
    public class123 field2005;

    @ObfuscatedName("dl.t")
    public static final int[] field2002 = new int[] { 0, 1, 3, 7, 15, 31, 63, 127, 255, 511, 1023, 2047, 4095, 8191, 16383, 32767, 65535, 131071, 262143, 524287, 1048575, 2097151, 4194303, 8388607, 16777215, 33554431, 67108863, 134217727, 268435455, 536870911, 1073741823, Integer.MAX_VALUE, -1 };

    @ObfuscatedName("dl.g")
    public int field2001;

    public class122(int arg0) {
        super(arg0);
    }

    @ObfuscatedName("dl.hc([IB)V")
    public void method2536(int[] arg0) {
        this.field2005 = new class123(arg0);
    }

    @ObfuscatedName("dl.hv(II)V")
    public void method2555(int arg0) {
        this.field1989[++this.field1984 - 1] = (byte) (arg0 + this.field2005.method2563());
    }

    @ObfuscatedName("dl.hd(I)I")
    public int method2561() {
        return this.field1989[++this.field1984 - 1] - this.field2005.method2563() & 0xFF;
    }

    @ObfuscatedName("dl.hk(B)V")
    public void method2539() {
        this.field2001 = this.field1984 * 8;
    }

    @ObfuscatedName("dl.hg(II)I")
    public int method2558(int arg0) {
        int var2 = this.field2001 >> 3;
        int var3 = 8 - (this.field2001 & 0x7);
        int var4 = 0;
        this.field2001 += arg0;
        while (arg0 > var3) {
            var4 += (this.field1989[var2++] & field2002[var3]) << arg0 - var3;
            arg0 -= var3;
            var3 = 8;
        }
        int var5;
        if (arg0 == var3) {
            var5 = (this.field1989[var2] & field2002[var3]) + var4;
        } else {
            var5 = (this.field1989[var2] >> var3 - arg0 & field2002[arg0]) + var4;
        }
        return var5;
    }

    @ObfuscatedName("dl.hp(I)V")
    public void method2546() {
        this.field1984 = (this.field2001 + 7) / 8;
    }

    @ObfuscatedName("dl.hz(IB)I")
    public int method2541(int arg0) {
        return arg0 * 8 - this.field2001;
    }
}
