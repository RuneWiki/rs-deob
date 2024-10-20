package deob;

@ObfuscatedName("db")
public final class class116 extends class127 {

    @ObfuscatedName("db.l")
    public class117 field1956;

    @ObfuscatedName("db.b")
    public static final int[] field1959 = new int[] { 0, 1, 3, 7, 15, 31, 63, 127, 255, 511, 1023, 2047, 4095, 8191, 16383, 32767, 65535, 131071, 262143, 524287, 1048575, 2097151, 4194303, 8388607, 16777215, 33554431, 67108863, 134217727, 268435455, 536870911, 1073741823, Integer.MAX_VALUE, -1 };

    @ObfuscatedName("db.o")
    public int field1957;

    public class116(int arg0) {
        super(arg0);
    }

    @ObfuscatedName("db.l([IB)V")
    public void method2303(int[] arg0) {
        this.field1956 = new class117(arg0);
    }

    @ObfuscatedName("db.b(II)V")
    public void method2326(int arg0) {
        this.field2024[++this.field2022 - 1] = (byte) (arg0 + this.field1956.method2330());
    }

    @ObfuscatedName("db.o(B)I")
    public int method2304() {
        return this.field2024[++this.field2022 - 1] - this.field1956.method2330() & 0xFF;
    }

    @ObfuscatedName("db.w(I)V")
    public void method2305() {
        this.field1957 = this.field2022 * 8;
    }

    @ObfuscatedName("db.r(IB)I")
    public int method2306(int arg0) {
        int var2 = this.field1957 >> 3;
        int var3 = 8 - (this.field1957 & 0x7);
        int var4 = 0;
        this.field1957 += arg0;
        while (arg0 > var3) {
            var4 += (this.field2024[var2++] & field1959[var3]) << arg0 - var3;
            arg0 -= var3;
            var3 = 8;
        }
        int var5;
        if (arg0 == var3) {
            var5 = (this.field2024[var2] & field1959[var3]) + var4;
        } else {
            var5 = (this.field2024[var2] >> var3 - arg0 & field1959[arg0]) + var4;
        }
        return var5;
    }

    @ObfuscatedName("db.k(B)V")
    public void method2307() {
        this.field2022 = (this.field1957 + 7) / 8;
    }

    @ObfuscatedName("db.z(II)I")
    public int method2308(int arg0) {
        return arg0 * 8 - this.field1957;
    }
}
