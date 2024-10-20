package deob;

@ObfuscatedName("db")
public final class class114 extends class111 {

    @ObfuscatedName("db.q")
    public class115 field1912;

    @ObfuscatedName("db.z")
    public static final int[] field1913 = new int[] { 0, 1, 3, 7, 15, 31, 63, 127, 255, 511, 1023, 2047, 4095, 8191, 16383, 32767, 65535, 131071, 262143, 524287, 1048575, 2097151, 4194303, 8388607, 16777215, 33554431, 67108863, 134217727, 268435455, 536870911, 1073741823, Integer.MAX_VALUE, -1 };

    @ObfuscatedName("db.v")
    public int field1914;

    public class114(int arg0) {
        super(arg0);
    }

    @ObfuscatedName("db.hf([II)V")
    public void method2417(int[] arg0) {
        this.field1912 = new class115(arg0);
    }

    @ObfuscatedName("db.hl(II)V")
    public void method2429(int arg0) {
        this.field1897[++this.field1902 - 1] = (byte) (arg0 + this.field1912.method2444());
    }

    @ObfuscatedName("db.ij(I)I")
    public int method2416() {
        return this.field1897[++this.field1902 - 1] - this.field1912.method2444() & 0xFF;
    }

    @ObfuscatedName("db.if(I)V")
    public void method2422() {
        this.field1914 = this.field1902 * 8;
    }

    @ObfuscatedName("db.ip(II)I")
    public int method2420(int arg0) {
        int var2 = this.field1914 >> 3;
        int var3 = 8 - (this.field1914 & 0x7);
        int var4 = 0;
        this.field1914 += arg0;
        while (arg0 > var3) {
            var4 += (this.field1897[var2++] & field1913[var3]) << arg0 - var3;
            arg0 -= var3;
            var3 = 8;
        }
        int var5;
        if (arg0 == var3) {
            var5 = (this.field1897[var2] & field1913[var3]) + var4;
        } else {
            var5 = (this.field1897[var2] >> var3 - arg0 & field1913[arg0]) + var4;
        }
        return var5;
    }

    @ObfuscatedName("db.ie(I)V")
    public void method2421() {
        this.field1902 = (this.field1914 + 7) / 8;
    }

    @ObfuscatedName("db.in(II)I")
    public int method2423(int arg0) {
        return arg0 * 8 - this.field1914;
    }
}
