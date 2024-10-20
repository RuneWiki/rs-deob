package deob;

@ObfuscatedName("dq")
public class class130 extends class122 {

    @ObfuscatedName("dq.f")
    public long[] field2037 = new long[10];

    @ObfuscatedName("dq.k")
    public int field2035 = 256;

    @ObfuscatedName("dq.y")
    public int field2034 = 1;

    @ObfuscatedName("dq.e")
    public long field2039 = class104.method1417();

    @ObfuscatedName("dq.r")
    public int field2042 = 0;

    @ObfuscatedName("dq.a")
    public int field2041;

    public class130() {
        for (int var1 = 0; var1 < 10; var1++) {
            this.field2037[var1] = this.field2039;
        }
    }

    @ObfuscatedName("dq.f(B)V")
    public void method2505() {
        for (int var1 = 0; var1 < 10; var1++) {
            this.field2037[var1] = 0L;
        }
    }

    @ObfuscatedName("dq.k(IIB)I")
    public int method2493(int arg0, int arg1) {
        int var3 = this.field2035;
        int var4 = this.field2034;
        this.field2035 = 300;
        this.field2034 = 1;
        this.field2039 = class104.method1417();
        if (this.field2037[this.field2041] == 0L) {
            this.field2035 = var3;
            this.field2034 = var4;
        } else if (this.field2039 > this.field2037[this.field2041]) {
            this.field2035 = (int) ((long) (arg0 * 2560) / (this.field2039 - this.field2037[this.field2041]));
        }
        if (this.field2035 < 25) {
            this.field2035 = 25;
        }
        if (this.field2035 > 256) {
            this.field2035 = 256;
            this.field2034 = (int) ((long) arg0 - (this.field2039 - this.field2037[this.field2041]) / 10L);
        }
        if (this.field2034 > arg0) {
            this.field2034 = arg0;
        }
        this.field2037[this.field2041] = this.field2039;
        this.field2041 = (this.field2041 + 1) % 10;
        if (this.field2034 > 1) {
            for (int var5 = 0; var5 < 10; var5++) {
                if (this.field2037[var5] != 0L) {
                    this.field2037[var5] += (long) this.field2034;
                }
            }
        }
        if (this.field2034 < arg1) {
            this.field2034 = arg1;
        }
        class116.method557((long) this.field2034);
        int var6 = 0;
        while (this.field2042 < 256) {
            var6++;
            this.field2042 += this.field2035;
        }
        this.field2042 &= 0xFF;
        return var6;
    }
}
