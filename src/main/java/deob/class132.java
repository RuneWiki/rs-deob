package deob;

@ObfuscatedName("ep")
public class class132 extends class124 {

    @ObfuscatedName("ep.a")
    public long[] field2053 = new long[10];

    @ObfuscatedName("ep.v")
    public int field2044 = 256;

    @ObfuscatedName("ep.i")
    public int field2056 = 1;

    @ObfuscatedName("ep.b")
    public long field2047 = class106.method2471();

    @ObfuscatedName("ep.l")
    public int field2048 = 0;

    @ObfuscatedName("ep.m")
    public int field2049;

    public class132() {
        for (int var1 = 0; var1 < 10; var1++) {
            this.field2053[var1] = this.field2047;
        }
    }

    @ObfuscatedName("ep.v(B)V")
    public void method2459() {
        for (int var1 = 0; var1 < 10; var1++) {
            this.field2053[var1] = 0L;
        }
    }

    @ObfuscatedName("ep.i(III)I")
    public int method2453(int arg0, int arg1) {
        int var3 = this.field2044;
        int var4 = this.field2056;
        this.field2044 = 300;
        this.field2056 = 1;
        this.field2047 = class106.method2471();
        if (this.field2053[this.field2049] == 0L) {
            this.field2044 = var3;
            this.field2056 = var4;
        } else if (this.field2047 > this.field2053[this.field2049]) {
            this.field2044 = (int) ((long) (arg0 * 2560) / (this.field2047 - this.field2053[this.field2049]));
        }
        if (this.field2044 < 25) {
            this.field2044 = 25;
        }
        if (this.field2044 > 256) {
            this.field2044 = 256;
            this.field2056 = (int) ((long) arg0 - (this.field2047 - this.field2053[this.field2049]) / 10L);
        }
        if (this.field2056 > arg0) {
            this.field2056 = arg0;
        }
        this.field2053[this.field2049] = this.field2047;
        this.field2049 = (this.field2049 + 1) % 10;
        if (this.field2056 > 1) {
            for (int var5 = 0; var5 < 10; var5++) {
                if (this.field2053[var5] != 0L) {
                    this.field2053[var5] += (long) this.field2056;
                }
            }
        }
        if (this.field2056 < arg1) {
            this.field2056 = arg1;
        }
        class118.method2072((long) this.field2056);
        int var6 = 0;
        while (this.field2048 < 256) {
            var6++;
            this.field2048 += this.field2044;
        }
        this.field2048 &= 0xFF;
        return var6;
    }
}
