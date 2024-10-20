package deob;

@ObfuscatedName("er")
public class class132 extends class124 {

    @ObfuscatedName("er.b")
    public long[] field2040 = new long[10];

    @ObfuscatedName("er.e")
    public int field2039 = 256;

    @ObfuscatedName("er.i")
    public int field2046 = 1;

    @ObfuscatedName("er.k")
    public long field2041 = class106.method3592();

    @ObfuscatedName("er.h")
    public int field2043 = 0;

    @ObfuscatedName("er.p")
    public int field2038;

    public class132() {
        for (int var1 = 0; var1 < 10; var1++) {
            this.field2040[var1] = this.field2041;
        }
    }

    @ObfuscatedName("er.e(B)V")
    public void method2478() {
        for (int var1 = 0; var1 < 10; var1++) {
            this.field2040[var1] = 0L;
        }
    }

    @ObfuscatedName("er.i(III)I")
    public int method2473(int arg0, int arg1) {
        int var3 = this.field2039;
        int var4 = this.field2046;
        this.field2039 = 300;
        this.field2046 = 1;
        this.field2041 = class106.method3592();
        if (this.field2040[this.field2038] == 0L) {
            this.field2039 = var3;
            this.field2046 = var4;
        } else if (this.field2041 > this.field2040[this.field2038]) {
            this.field2039 = (int) ((long) (arg0 * 2560) / (this.field2041 - this.field2040[this.field2038]));
        }
        if (this.field2039 < 25) {
            this.field2039 = 25;
        }
        if (this.field2039 > 256) {
            this.field2039 = 256;
            this.field2046 = (int) ((long) arg0 - (this.field2041 - this.field2040[this.field2038]) / 10L);
        }
        if (this.field2046 > arg0) {
            this.field2046 = arg0;
        }
        this.field2040[this.field2038] = this.field2041;
        this.field2038 = (this.field2038 + 1) % 10;
        if (this.field2046 > 1) {
            for (int var5 = 0; var5 < 10; var5++) {
                if (this.field2040[var5] != 0L) {
                    this.field2040[var5] += (long) this.field2046;
                }
            }
        }
        if (this.field2046 < arg1) {
            this.field2046 = arg1;
        }
        class118.method2490((long) this.field2046);
        int var6 = 0;
        while (this.field2043 < 256) {
            var6++;
            this.field2043 += this.field2039;
        }
        this.field2043 &= 0xFF;
        return var6;
    }
}
