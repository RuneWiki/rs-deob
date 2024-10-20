package deob;

@ObfuscatedName("dp")
public final class class110 extends class107 {

    @ObfuscatedName("dp.g")
    public class111 field1856;

    @ObfuscatedName("dp.u")
    public static final int[] field1857 = new int[] { 0, 1, 3, 7, 15, 31, 63, 127, 255, 511, 1023, 2047, 4095, 8191, 16383, 32767, 65535, 131071, 262143, 524287, 1048575, 2097151, 4194303, 8388607, 16777215, 33554431, 67108863, 134217727, 268435455, 536870911, 1073741823, Integer.MAX_VALUE, -1 };

    @ObfuscatedName("dp.d")
    public int field1858;

    public class110(int arg0) {
        super(arg0);
    }

    @ObfuscatedName("dp.hp([II)V")
    public void method2416(int[] arg0) {
        this.field1856 = new class111(arg0);
    }

    @ObfuscatedName("dp.hv(IB)V")
    public void method2386(int arg0) {
        this.field1841[++this.field1837 - 1] = (byte) (arg0 + this.field1856.method2419());
    }

    @ObfuscatedName("dp.hb(I)I")
    public int method2404() {
        return this.field1841[++this.field1837 - 1] - this.field1856.method2419() & 0xFF;
    }

    @ObfuscatedName("dp.hh(S)V")
    public void method2385() {
        this.field1858 = this.field1837 * 8;
    }

    @ObfuscatedName("dp.hz(II)I")
    public int method2389(int arg0) {
        int var2 = this.field1858 >> 3;
        int var3 = 8 - (this.field1858 & 0x7);
        int var4 = 0;
        this.field1858 += arg0;
        while (arg0 > var3) {
            var4 += (this.field1841[var2++] & field1857[var3]) << arg0 - var3;
            arg0 -= var3;
            var3 = 8;
        }
        int var5;
        if (arg0 == var3) {
            var5 = (this.field1841[var2] & field1857[var3]) + var4;
        } else {
            var5 = (this.field1841[var2] >> var3 - arg0 & field1857[arg0]) + var4;
        }
        return var5;
    }

    @ObfuscatedName("dp.hk(B)V")
    public void method2390() {
        this.field1837 = (this.field1858 + 7) / 8;
    }

    @ObfuscatedName("dp.hw(IB)I")
    public int method2391(int arg0) {
        return arg0 * 8 - this.field1858;
    }
}
