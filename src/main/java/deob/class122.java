package deob;

@ObfuscatedName("dg")
public final class class122 extends class119 {

    @ObfuscatedName("dg.i")
    public class123 field1978;

    @ObfuscatedName("dg.w")
    public static final int[] field1974 = new int[] { 0, 1, 3, 7, 15, 31, 63, 127, 255, 511, 1023, 2047, 4095, 8191, 16383, 32767, 65535, 131071, 262143, 524287, 1048575, 2097151, 4194303, 8388607, 16777215, 33554431, 67108863, 134217727, 268435455, 536870911, 1073741823, Integer.MAX_VALUE, -1 };

    @ObfuscatedName("dg.m")
    public int field1975;

    public class122(int arg0) {
        super(arg0);
    }

    @ObfuscatedName("dg.he([II)V")
    public void method2527(int[] arg0) {
        this.field1978 = new class123(arg0);
    }

    @ObfuscatedName("dg.hm(II)V")
    public void method2544(int arg0) {
        this.field1956[++this.field1955 - 1] = (byte) (arg0 + this.field1978.method2566());
    }

    @ObfuscatedName("dg.hc(B)I")
    public int method2528() {
        return this.field1956[++this.field1955 - 1] - this.field1978.method2566() & 0xFF;
    }

    @ObfuscatedName("dg.hd(I)V")
    public void method2533() {
        this.field1975 = this.field1955 * 8;
    }

    @ObfuscatedName("dg.hk(II)I")
    public int method2530(int arg0) {
        int var2 = this.field1975 >> 3;
        int var3 = 8 - (this.field1975 & 0x7);
        int var4 = 0;
        this.field1975 += arg0;
        while (arg0 > var3) {
            var4 += (this.field1956[var2++] & field1974[var3]) << arg0 - var3;
            arg0 -= var3;
            var3 = 8;
        }
        int var5;
        if (arg0 == var3) {
            var5 = (this.field1956[var2] & field1974[var3]) + var4;
        } else {
            var5 = (this.field1956[var2] >> var3 - arg0 & field1974[arg0]) + var4;
        }
        return var5;
    }

    @ObfuscatedName("dg.hz(I)V")
    public void method2531() {
        this.field1955 = (this.field1975 + 7) / 8;
    }

    @ObfuscatedName("dg.hx(IB)I")
    public int method2526(int arg0) {
        return arg0 * 8 - this.field1975;
    }
}
