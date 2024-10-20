package deob;

@ObfuscatedName("dh")
public final class class113 extends class110 {

    @ObfuscatedName("dh.w")
    public class114 field1877;

    @ObfuscatedName("dh.e")
    public static final int[] field1878 = new int[] { 0, 1, 3, 7, 15, 31, 63, 127, 255, 511, 1023, 2047, 4095, 8191, 16383, 32767, 65535, 131071, 262143, 524287, 1048575, 2097151, 4194303, 8388607, 16777215, 33554431, 67108863, 134217727, 268435455, 536870911, 1073741823, Integer.MAX_VALUE, -1 };

    @ObfuscatedName("dh.n")
    public int field1881;

    public class113(int arg0) {
        super(arg0);
    }

    @ObfuscatedName("dh.gb([II)V")
    public void method2371(int[] arg0) {
        this.field1877 = new class114(arg0);
    }

    @ObfuscatedName("dh.gi(IB)V")
    public void method2376(int arg0) {
        this.field1865[++this.field1861 - 1] = (byte) (arg0 + this.field1877.method2388());
    }

    @ObfuscatedName("dh.gs(I)I")
    public int method2363() {
        return this.field1865[++this.field1861 - 1] - this.field1877.method2388() & 0xFF;
    }

    @ObfuscatedName("dh.gm(I)V")
    public void method2362() {
        this.field1881 = this.field1861 * 8;
    }

    @ObfuscatedName("dh.gx(II)I")
    public int method2365(int arg0) {
        int var2 = this.field1881 >> 3;
        int var3 = 8 - (this.field1881 & 0x7);
        int var4 = 0;
        this.field1881 += arg0;
        while (arg0 > var3) {
            var4 += (this.field1865[var2++] & field1878[var3]) << arg0 - var3;
            arg0 -= var3;
            var3 = 8;
        }
        int var5;
        if (arg0 == var3) {
            var5 = (this.field1865[var2] & field1878[var3]) + var4;
        } else {
            var5 = (this.field1865[var2] >> var3 - arg0 & field1878[arg0]) + var4;
        }
        return var5;
    }

    @ObfuscatedName("dh.hd(B)V")
    public void method2380() {
        this.field1861 = (this.field1881 + 7) / 8;
    }

    @ObfuscatedName("dh.hf(IB)I")
    public int method2367(int arg0) {
        return arg0 * 8 - this.field1881;
    }
}
