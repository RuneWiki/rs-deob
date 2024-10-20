package deob;

@ObfuscatedName("du")
public class class128 extends class120 {

    @ObfuscatedName("du.k")
    public long[] field2032 = new long[10];

    @ObfuscatedName("du.b")
    public int field2027 = 256;

    @ObfuscatedName("du.e")
    public int field2028 = 1;

    @ObfuscatedName("du.i")
    public long field2029 = class103.method2455();

    @ObfuscatedName("du.t")
    public int field2030 = 0;

    @ObfuscatedName("du.z")
    public int field2031;

    public class128() {
        for (int var1 = 0; var1 < 10; var1++) {
            this.field2032[var1] = this.field2029;
        }
    }

    @ObfuscatedName("du.b(I)V")
    public void method2439() {
        for (int var1 = 0; var1 < 10; var1++) {
            this.field2032[var1] = 0L;
        }
    }

    @ObfuscatedName("du.e(III)I")
    public int method2437(int arg0, int arg1) {
        int var3 = this.field2027;
        int var4 = this.field2028;
        this.field2027 = 300;
        this.field2028 = 1;
        this.field2029 = class103.method2455();
        if (this.field2032[this.field2031] == 0L) {
            this.field2027 = var3;
            this.field2028 = var4;
        } else if (this.field2029 > this.field2032[this.field2031]) {
            this.field2027 = (int) ((long) (arg0 * 2560) / (this.field2029 - this.field2032[this.field2031]));
        }
        if (this.field2027 < 25) {
            this.field2027 = 25;
        }
        if (this.field2027 > 256) {
            this.field2027 = 256;
            this.field2028 = (int) ((long) arg0 - (this.field2029 - this.field2032[this.field2031]) / 10L);
        }
        if (this.field2028 > arg0) {
            this.field2028 = arg0;
        }
        this.field2032[this.field2031] = this.field2029;
        this.field2031 = (this.field2031 + 1) % 10;
        if (this.field2028 > 1) {
            for (int var5 = 0; var5 < 10; var5++) {
                if (this.field2032[var5] != 0L) {
                    this.field2032[var5] += (long) this.field2028;
                }
            }
        }
        if (this.field2028 < arg1) {
            this.field2028 = arg1;
        }
        class114.method500((long) this.field2028);
        int var6 = 0;
        while (this.field2030 < 256) {
            var6++;
            this.field2030 += this.field2027;
        }
        this.field2030 &= 0xFF;
        return var6;
    }
}
