package deob;

@ObfuscatedName("er")
public class class132 extends class124 {

    @ObfuscatedName("er.v")
    public long[] field2039 = new long[10];

    @ObfuscatedName("er.t")
    public int field2032 = 256;

    @ObfuscatedName("er.f")
    public int field2033 = 1;

    @ObfuscatedName("er.j")
    public long field2040 = class106.method487();

    @ObfuscatedName("er.l")
    public int field2035 = 0;

    @ObfuscatedName("er.g")
    public int field2036;

    public class132() {
        for (int var1 = 0; var1 < 10; var1++) {
            this.field2039[var1] = this.field2040;
        }
    }

    @ObfuscatedName("er.t(B)V")
    public void method2497() {
        for (int var1 = 0; var1 < 10; var1++) {
            this.field2039[var1] = 0L;
        }
    }

    @ObfuscatedName("er.f(IIS)I")
    public int method2492(int arg0, int arg1) {
        int var3 = this.field2032;
        int var4 = this.field2033;
        this.field2032 = 300;
        this.field2033 = 1;
        this.field2040 = class106.method487();
        if (this.field2039[this.field2036] == 0L) {
            this.field2032 = var3;
            this.field2033 = var4;
        } else if (this.field2040 > this.field2039[this.field2036]) {
            this.field2032 = (int) ((long) (arg0 * 2560) / (this.field2040 - this.field2039[this.field2036]));
        }
        if (this.field2032 < 25) {
            this.field2032 = 25;
        }
        if (this.field2032 > 256) {
            this.field2032 = 256;
            this.field2033 = (int) ((long) arg0 - (this.field2040 - this.field2039[this.field2036]) / 10L);
        }
        if (this.field2033 > arg0) {
            this.field2033 = arg0;
        }
        this.field2039[this.field2036] = this.field2040;
        this.field2036 = (this.field2036 + 1) % 10;
        if (this.field2033 > 1) {
            for (int var5 = 0; var5 < 10; var5++) {
                if (this.field2039[var5] != 0L) {
                    this.field2039[var5] += (long) this.field2033;
                }
            }
        }
        if (this.field2033 < arg1) {
            this.field2033 = arg1;
        }
        class118.method2729((long) this.field2033);
        int var6 = 0;
        while (this.field2035 < 256) {
            var6++;
            this.field2035 += this.field2032;
        }
        this.field2035 &= 0xFF;
        return var6;
    }
}
