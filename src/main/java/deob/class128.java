package deob;

@ObfuscatedName("dx")
public class class128 extends class120 {

    @ObfuscatedName("dx.g")
    public long[] field2034 = new long[10];

    @ObfuscatedName("dx.v")
    public int field2035 = 256;

    @ObfuscatedName("dx.z")
    public int field2041 = 1;

    @ObfuscatedName("dx.h")
    public long field2037 = class103.method19();

    @ObfuscatedName("dx.k")
    public int field2038 = 0;

    @ObfuscatedName("dx.l")
    public int field2039;

    public class128() {
        for (int var1 = 0; var1 < 10; var1++) {
            this.field2034[var1] = this.field2037;
        }
    }

    @ObfuscatedName("dx.g(I)V")
    public void method2448() {
        for (int var1 = 0; var1 < 10; var1++) {
            this.field2034[var1] = 0L;
        }
    }

    @ObfuscatedName("dx.v(III)I")
    public int method2442(int arg0, int arg1) {
        int var3 = this.field2035;
        int var4 = this.field2041;
        this.field2035 = 300;
        this.field2041 = 1;
        this.field2037 = class103.method19();
        if (this.field2034[this.field2039] == 0L) {
            this.field2035 = var3;
            this.field2041 = var4;
        } else if (this.field2037 > this.field2034[this.field2039]) {
            this.field2035 = (int) ((long) (arg0 * 2560) / (this.field2037 - this.field2034[this.field2039]));
        }
        if (this.field2035 < 25) {
            this.field2035 = 25;
        }
        if (this.field2035 > 256) {
            this.field2035 = 256;
            this.field2041 = (int) ((long) arg0 - (this.field2037 - this.field2034[this.field2039]) / 10L);
        }
        if (this.field2041 > arg0) {
            this.field2041 = arg0;
        }
        this.field2034[this.field2039] = this.field2037;
        this.field2039 = (this.field2039 + 1) % 10;
        if (this.field2041 > 1) {
            for (int var5 = 0; var5 < 10; var5++) {
                if (this.field2034[var5] != 0L) {
                    this.field2034[var5] += (long) this.field2041;
                }
            }
        }
        if (this.field2041 < arg1) {
            this.field2041 = arg1;
        }
        class114.method2962((long) this.field2041);
        int var6 = 0;
        while (this.field2038 < 256) {
            var6++;
            this.field2038 += this.field2035;
        }
        this.field2038 &= 0xFF;
        return var6;
    }
}
