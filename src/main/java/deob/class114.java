package deob;

@ObfuscatedName("dc")
public final class class114 extends class111 {

    @ObfuscatedName("dc.f")
    public class115 field1913;

    @ObfuscatedName("dc.m")
    public static final int[] field1910 = new int[] { 0, 1, 3, 7, 15, 31, 63, 127, 255, 511, 1023, 2047, 4095, 8191, 16383, 32767, 65535, 131071, 262143, 524287, 1048575, 2097151, 4194303, 8388607, 16777215, 33554431, 67108863, 134217727, 268435455, 536870911, 1073741823, Integer.MAX_VALUE, -1 };

    @ObfuscatedName("dc.a")
    public int field1911;

    public class114(int arg0) {
        super(arg0);
    }

    @ObfuscatedName("dc.hi([II)V")
    public void method2481(int[] arg0) {
        this.field1913 = new class115(arg0);
    }

    @ObfuscatedName("dc.hp(IB)V")
    public void method2480(int arg0) {
        this.field1888[++this.field1889 - 1] = (byte) (arg0 + this.field1913.method2506());
    }

    @ObfuscatedName("dc.hr(I)I")
    public int method2482() {
        return this.field1888[++this.field1889 - 1] - this.field1913.method2506() & 0xFF;
    }

    @ObfuscatedName("dc.ic(I)V")
    public void method2483() {
        this.field1911 = this.field1889 * 8;
    }

    @ObfuscatedName("dc.iz(IB)I")
    public int method2484(int arg0) {
        int var2 = this.field1911 >> 3;
        int var3 = 8 - (this.field1911 & 0x7);
        int var4 = 0;
        this.field1911 += arg0;
        while (arg0 > var3) {
            var4 += (this.field1888[var2++] & field1910[var3]) << arg0 - var3;
            arg0 -= var3;
            var3 = 8;
        }
        int var5;
        if (arg0 == var3) {
            var5 = (this.field1888[var2] & field1910[var3]) + var4;
        } else {
            var5 = (this.field1888[var2] >> var3 - arg0 & field1910[arg0]) + var4;
        }
        return var5;
    }

    @ObfuscatedName("dc.ih(I)V")
    public void method2485() {
        this.field1889 = (this.field1911 + 7) / 8;
    }

    @ObfuscatedName("dc.is(IB)I")
    public int method2486(int arg0) {
        return arg0 * 8 - this.field1911;
    }
}
