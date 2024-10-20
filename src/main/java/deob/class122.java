package deob;

@ObfuscatedName("dh")
public final class class122 extends class119 {

    @ObfuscatedName("dh.j")
    public class123 field1974;

    @ObfuscatedName("dh.f")
    public static final int[] field1973 = new int[] { 0, 1, 3, 7, 15, 31, 63, 127, 255, 511, 1023, 2047, 4095, 8191, 16383, 32767, 65535, 131071, 262143, 524287, 1048575, 2097151, 4194303, 8388607, 16777215, 33554431, 67108863, 134217727, 268435455, 536870911, 1073741823, Integer.MAX_VALUE, -1 };

    @ObfuscatedName("dh.i")
    public int field1975;

    public class122(int arg0) {
        super(arg0);
    }

    @ObfuscatedName("dh.hu([IS)V")
    public void method2566(int[] arg0) {
        this.field1974 = new class123(arg0);
    }

    @ObfuscatedName("dh.hc(II)V")
    public void method2587(int arg0) {
        this.field1960[++this.field1949 - 1] = (byte) (arg0 + this.field1974.method2594());
    }

    @ObfuscatedName("dh.hm(I)I")
    public int method2568() {
        return this.field1960[++this.field1949 - 1] - this.field1974.method2594() & 0xFF;
    }

    @ObfuscatedName("dh.hw(B)V")
    public void method2590() {
        this.field1975 = this.field1949 * 8;
    }

    @ObfuscatedName("dh.hx(II)I")
    public int method2565(int arg0) {
        int var2 = this.field1975 >> 3;
        int var3 = 8 - (this.field1975 & 0x7);
        int var4 = 0;
        this.field1975 += arg0;
        while (arg0 > var3) {
            var4 += (this.field1960[var2++] & field1973[var3]) << arg0 - var3;
            arg0 -= var3;
            var3 = 8;
        }
        int var5;
        if (arg0 == var3) {
            var5 = (this.field1960[var2] & field1973[var3]) + var4;
        } else {
            var5 = (this.field1960[var2] >> var3 - arg0 & field1973[arg0]) + var4;
        }
        return var5;
    }

    @ObfuscatedName("dh.hq(I)V")
    public void method2571() {
        this.field1949 = (this.field1975 + 7) / 8;
    }

    @ObfuscatedName("dh.hb(IB)I")
    public int method2567(int arg0) {
        return arg0 * 8 - this.field1975;
    }
}
