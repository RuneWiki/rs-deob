package deob;

@ObfuscatedName("dr")
public final class class122 extends class119 {

    @ObfuscatedName("dr.u")
    public class123 field2000;

    @ObfuscatedName("dr.c")
    public static final int[] field1996 = new int[] { 0, 1, 3, 7, 15, 31, 63, 127, 255, 511, 1023, 2047, 4095, 8191, 16383, 32767, 65535, 131071, 262143, 524287, 1048575, 2097151, 4194303, 8388607, 16777215, 33554431, 67108863, 134217727, 268435455, 536870911, 1073741823, Integer.MAX_VALUE, -1 };

    @ObfuscatedName("dr.v")
    public int field1998;

    public class122(int arg0) {
        super(arg0);
    }

    @ObfuscatedName("dr.iy([IB)V")
    public void method2611(int[] arg0) {
        this.field2000 = new class123(arg0);
    }

    @ObfuscatedName("dr.im(II)V")
    public void method2612(int arg0) {
        this.field1986[++this.field1977 - 1] = (byte) (arg0 + this.field2000.method2648());
    }

    @ObfuscatedName("dr.ih(I)I")
    public int method2620() {
        return this.field1986[++this.field1977 - 1] - this.field2000.method2648() & 0xFF;
    }

    @ObfuscatedName("dr.iq(I)V")
    public void method2623() {
        this.field1998 = this.field1977 * 8;
    }

    @ObfuscatedName("dr.iw(II)I")
    public int method2614(int arg0) {
        int var2 = this.field1998 >> 3;
        int var3 = 8 - (this.field1998 & 0x7);
        int var4 = 0;
        this.field1998 += arg0;
        while (arg0 > var3) {
            var4 += (this.field1986[var2++] & field1996[var3]) << arg0 - var3;
            arg0 -= var3;
            var3 = 8;
        }
        int var5;
        if (arg0 == var3) {
            var5 = (this.field1986[var2] & field1996[var3]) + var4;
        } else {
            var5 = (this.field1986[var2] >> var3 - arg0 & field1996[arg0]) + var4;
        }
        return var5;
    }

    @ObfuscatedName("dr.ip(B)V")
    public void method2615() {
        this.field1977 = (this.field1998 + 7) / 8;
    }

    @ObfuscatedName("dr.ia(II)I")
    public int method2616(int arg0) {
        return arg0 * 8 - this.field1998;
    }
}
