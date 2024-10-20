package deob;

@ObfuscatedName("dj")
public final class class115 extends class126 {

    @ObfuscatedName("dj.j")
    public class116 field1971;

    @ObfuscatedName("dj.y")
    public static final int[] field1966 = new int[] { 0, 1, 3, 7, 15, 31, 63, 127, 255, 511, 1023, 2047, 4095, 8191, 16383, 32767, 65535, 131071, 262143, 524287, 1048575, 2097151, 4194303, 8388607, 16777215, 33554431, 67108863, 134217727, 268435455, 536870911, 1073741823, Integer.MAX_VALUE, -1 };

    @ObfuscatedName("dj.x")
    public int field1968;

    public class115(int arg0) {
        super(arg0);
    }

    @ObfuscatedName("dj.j([II)V")
    public void method2252(int[] arg0) {
        this.field1971 = new class116(arg0);
    }

    @ObfuscatedName("dj.y(IS)V")
    public void method2273(int arg0) {
        this.field2025[++this.field2020 - 1] = (byte) (arg0 + this.field1971.method2284());
    }

    @ObfuscatedName("dj.x(I)I")
    public int method2254() {
        return this.field2025[++this.field2020 - 1] - this.field1971.method2284() & 0xFF;
    }

    @ObfuscatedName("dj.z(B)V")
    public void method2255() {
        this.field1968 = this.field2020 * 8;
    }

    @ObfuscatedName("dj.c(II)I")
    public int method2256(int arg0) {
        int var2 = this.field1968 >> 3;
        int var3 = 8 - (this.field1968 & 0x7);
        int var4 = 0;
        this.field1968 += arg0;
        while (arg0 > var3) {
            var4 += (this.field2025[var2++] & field1966[var3]) << arg0 - var3;
            arg0 -= var3;
            var3 = 8;
        }
        int var5;
        if (arg0 == var3) {
            var5 = (this.field2025[var2] & field1966[var3]) + var4;
        } else {
            var5 = (this.field2025[var2] >> var3 - arg0 & field1966[arg0]) + var4;
        }
        return var5;
    }

    @ObfuscatedName("dj.e(I)V")
    public void method2269() {
        this.field2020 = (this.field1968 + 7) / 8;
    }

    @ObfuscatedName("dj.s(IB)I")
    public int method2258(int arg0) {
        return arg0 * 8 - this.field1968;
    }
}
