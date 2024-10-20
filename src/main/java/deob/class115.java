package deob;

@ObfuscatedName("dm")
public final class class115 extends class126 {

    @ObfuscatedName("dm.u")
    public class116 field1955;

    @ObfuscatedName("dm.k")
    public static final int[] field1957 = new int[] { 0, 1, 3, 7, 15, 31, 63, 127, 255, 511, 1023, 2047, 4095, 8191, 16383, 32767, 65535, 131071, 262143, 524287, 1048575, 2097151, 4194303, 8388607, 16777215, 33554431, 67108863, 134217727, 268435455, 536870911, 1073741823, Integer.MAX_VALUE, -1 };

    @ObfuscatedName("dm.x")
    public int field1958;

    public class115(int arg0) {
        super(arg0);
    }

    @ObfuscatedName("dm.u([II)V")
    public void method2316(int[] arg0) {
        this.field1955 = new class116(arg0);
    }

    @ObfuscatedName("dm.k(II)V")
    public void method2322(int arg0) {
        this.field2022[++this.field2024 - 1] = (byte) (arg0 + this.field1955.method2343());
    }

    @ObfuscatedName("dm.x(B)I")
    public int method2335() {
        return this.field2022[++this.field2024 - 1] - this.field1955.method2343() & 0xFF;
    }

    @ObfuscatedName("dm.m(I)V")
    public void method2318() {
        this.field1958 = this.field2024 * 8;
    }

    @ObfuscatedName("dm.n(IB)I")
    public int method2319(int arg0) {
        int var2 = this.field1958 >> 3;
        int var3 = 8 - (this.field1958 & 0x7);
        int var4 = 0;
        this.field1958 += arg0;
        while (arg0 > var3) {
            var4 += (this.field2022[var2++] & field1957[var3]) << arg0 - var3;
            arg0 -= var3;
            var3 = 8;
        }
        int var5;
        if (arg0 == var3) {
            var5 = (this.field2022[var2] & field1957[var3]) + var4;
        } else {
            var5 = (this.field2022[var2] >> var3 - arg0 & field1957[arg0]) + var4;
        }
        return var5;
    }

    @ObfuscatedName("dm.q(I)V")
    public void method2320() {
        this.field2024 = (this.field1958 + 7) / 8;
    }

    @ObfuscatedName("dm.a(IB)I")
    public int method2321(int arg0) {
        return arg0 * 8 - this.field1958;
    }
}
