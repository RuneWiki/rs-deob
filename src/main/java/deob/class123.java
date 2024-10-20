package deob;

@ObfuscatedName("da")
public final class class123 extends class120 {

    @ObfuscatedName("da.l")
    public class124 field2004;

    @ObfuscatedName("da.u")
    public static final int[] field2000 = new int[] { 0, 1, 3, 7, 15, 31, 63, 127, 255, 511, 1023, 2047, 4095, 8191, 16383, 32767, 65535, 131071, 262143, 524287, 1048575, 2097151, 4194303, 8388607, 16777215, 33554431, 67108863, 134217727, 268435455, 536870911, 1073741823, Integer.MAX_VALUE, -1 };

    @ObfuscatedName("da.p")
    public int field2002;

    public class123(int arg0) {
        super(arg0);
    }

    @ObfuscatedName("da.ia([II)V")
    public void method2610(int[] arg0) {
        this.field2004 = new class124(arg0);
    }

    @ObfuscatedName("da.il(IB)V")
    public void method2611(int arg0) {
        this.field1983[++this.field1977 - 1] = (byte) (arg0 + this.field2004.method2641());
    }

    @ObfuscatedName("da.ih(I)I")
    public int method2617() {
        return this.field1983[++this.field1977 - 1] - this.field2004.method2641() & 0xFF;
    }

    @ObfuscatedName("da.iq(I)V")
    public void method2622() {
        this.field2002 = this.field1977 * 8;
    }

    @ObfuscatedName("da.io(IB)I")
    public int method2614(int arg0) {
        int var2 = this.field2002 >> 3;
        int var3 = 8 - (this.field2002 & 0x7);
        int var4 = 0;
        this.field2002 += arg0;
        while (arg0 > var3) {
            var4 += (this.field1983[var2++] & field2000[var3]) << arg0 - var3;
            arg0 -= var3;
            var3 = 8;
        }
        int var5;
        if (arg0 == var3) {
            var5 = (this.field1983[var2] & field2000[var3]) + var4;
        } else {
            var5 = (this.field1983[var2] >> var3 - arg0 & field2000[arg0]) + var4;
        }
        return var5;
    }

    @ObfuscatedName("da.iy(I)V")
    public void method2615() {
        this.field1977 = (this.field2002 + 7) / 8;
    }

    @ObfuscatedName("da.iz(IB)I")
    public int method2616(int arg0) {
        return arg0 * 8 - this.field2002;
    }
}
