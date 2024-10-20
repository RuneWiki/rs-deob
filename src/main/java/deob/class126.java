package deob;

@ObfuscatedName("du")
public final class class126 extends class123 {

    @ObfuscatedName("du.n")
    public class127 field2075;

    @ObfuscatedName("du.b")
    public static final int[] field2068 = new int[] { 0, 1, 3, 7, 15, 31, 63, 127, 255, 511, 1023, 2047, 4095, 8191, 16383, 32767, 65535, 131071, 262143, 524287, 1048575, 2097151, 4194303, 8388607, 16777215, 33554431, 67108863, 134217727, 268435455, 536870911, 1073741823, Integer.MAX_VALUE, -1 };

    @ObfuscatedName("du.m")
    public int field2069;

    public class126(int arg0) {
        super(arg0);
    }

    @ObfuscatedName("du.in([II)V")
    public void method2765(int[] arg0) {
        this.field2075 = new class127(arg0);
    }

    @ObfuscatedName("du.ir(II)V")
    public void method2760(int arg0) {
        this.field2052[++this.field2051 - 1] = (byte) (arg0 + this.field2075.method2784());
    }

    @ObfuscatedName("du.ig(B)I")
    public int method2755() {
        return this.field2052[++this.field2051 - 1] - this.field2075.method2784() & 0xFF;
    }

    @ObfuscatedName("du.iw(I)V")
    public void method2756() {
        this.field2069 = this.field2051 * 8;
    }

    @ObfuscatedName("du.ia(II)I")
    public int method2764(int arg0) {
        int var2 = this.field2069 >> 3;
        int var3 = 8 - (this.field2069 & 0x7);
        int var4 = 0;
        this.field2069 += arg0;
        while (arg0 > var3) {
            var4 += (this.field2052[var2++] & field2068[var3]) << arg0 - var3;
            arg0 -= var3;
            var3 = 8;
        }
        int var5;
        if (arg0 == var3) {
            var5 = (this.field2052[var2] & field2068[var3]) + var4;
        } else {
            var5 = (this.field2052[var2] >> var3 - arg0 & field2068[arg0]) + var4;
        }
        return var5;
    }

    @ObfuscatedName("du.iv(I)V")
    public void method2757() {
        this.field2051 = (this.field2069 + 7) / 8;
    }

    @ObfuscatedName("du.id(II)I")
    public int method2752(int arg0) {
        return arg0 * 8 - this.field2069;
    }
}
