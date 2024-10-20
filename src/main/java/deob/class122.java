package deob;

@ObfuscatedName("dk")
public final class class122 extends class119 {

    @ObfuscatedName("dk.y")
    public class123 field2003;

    @ObfuscatedName("dk.o")
    public static final int[] field1999 = new int[] { 0, 1, 3, 7, 15, 31, 63, 127, 255, 511, 1023, 2047, 4095, 8191, 16383, 32767, 65535, 131071, 262143, 524287, 1048575, 2097151, 4194303, 8388607, 16777215, 33554431, 67108863, 134217727, 268435455, 536870911, 1073741823, Integer.MAX_VALUE, -1 };

    @ObfuscatedName("dk.h")
    public int field2001;

    public class122(int arg0) {
        super(arg0);
    }

    @ObfuscatedName("dk.hr([II)V")
    public void method2612(int[] arg0) {
        this.field2003 = new class123(arg0);
    }

    @ObfuscatedName("dk.he(II)V")
    public void method2592(int arg0) {
        this.field1987[++this.field1982 - 1] = (byte) (arg0 + this.field2003.method2616());
    }

    @ObfuscatedName("dk.hj(B)I")
    public int method2604() {
        return this.field1987[++this.field1982 - 1] - this.field2003.method2616() & 0xFF;
    }

    @ObfuscatedName("dk.ho(I)V")
    public void method2593() {
        this.field2001 = this.field1982 * 8;
    }

    @ObfuscatedName("dk.hf(II)I")
    public int method2594(int arg0) {
        int var2 = this.field2001 >> 3;
        int var3 = 8 - (this.field2001 & 0x7);
        int var4 = 0;
        this.field2001 += arg0;
        while (arg0 > var3) {
            var4 += (this.field1987[var2++] & field1999[var3]) << arg0 - var3;
            arg0 -= var3;
            var3 = 8;
        }
        int var5;
        if (arg0 == var3) {
            var5 = (this.field1987[var2] & field1999[var3]) + var4;
        } else {
            var5 = (this.field1987[var2] >> var3 - arg0 & field1999[arg0]) + var4;
        }
        return var5;
    }

    @ObfuscatedName("dk.hs(I)V")
    public void method2606() {
        this.field1982 = (this.field2001 + 7) / 8;
    }

    @ObfuscatedName("dk.ht(IB)I")
    public int method2596(int arg0) {
        return arg0 * 8 - this.field2001;
    }
}
