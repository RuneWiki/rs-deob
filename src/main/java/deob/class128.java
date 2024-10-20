package deob;

@ObfuscatedName("dn")
public class class128 extends class120 {

    @ObfuscatedName("dn.g")
    public long[] field2045 = new long[10];

    @ObfuscatedName("dn.s")
    public int field2041 = 256;

    @ObfuscatedName("dn.v")
    public int field2042 = 1;

    @ObfuscatedName("dn.o")
    public long field2043 = class103.method1837();

    @ObfuscatedName("dn.k")
    public int field2040 = 0;

    @ObfuscatedName("dn.m")
    public int field2044;

    public class128() {
        for (int var1 = 0; var1 < 10; var1++) {
            this.field2045[var1] = this.field2043;
        }
    }

    @ObfuscatedName("dn.g(B)V")
    public void method2394() {
        for (int var1 = 0; var1 < 10; var1++) {
            this.field2045[var1] = 0L;
        }
    }

    @ObfuscatedName("dn.s(III)I")
    public int method2389(int arg0, int arg1) {
        int var3 = this.field2041;
        int var4 = this.field2042;
        this.field2041 = 300;
        this.field2042 = 1;
        this.field2043 = class103.method1837();
        if (this.field2045[this.field2044] == 0L) {
            this.field2041 = var3;
            this.field2042 = var4;
        } else if (this.field2043 > this.field2045[this.field2044]) {
            this.field2041 = (int) ((long) (arg0 * 2560) / (this.field2043 - this.field2045[this.field2044]));
        }
        if (this.field2041 < 25) {
            this.field2041 = 25;
        }
        if (this.field2041 > 256) {
            this.field2041 = 256;
            this.field2042 = (int) ((long) arg0 - (this.field2043 - this.field2045[this.field2044]) / 10L);
        }
        if (this.field2042 > arg0) {
            this.field2042 = arg0;
        }
        this.field2045[this.field2044] = this.field2043;
        this.field2044 = (this.field2044 + 1) % 10;
        if (this.field2042 > 1) {
            for (int var5 = 0; var5 < 10; var5++) {
                if (this.field2045[var5] != 0L) {
                    this.field2045[var5] += (long) this.field2042;
                }
            }
        }
        if (this.field2042 < arg1) {
            this.field2042 = arg1;
        }
        class114.method26((long) this.field2042);
        int var6 = 0;
        while (this.field2040 < 256) {
            var6++;
            this.field2040 += this.field2041;
        }
        this.field2040 &= 0xFF;
        return var6;
    }
}
