package deob;

@ObfuscatedName("dj")
public class class128 extends class120 {

    @ObfuscatedName("dj.j")
    public long[] field2033 = new long[10];

    @ObfuscatedName("dj.z")
    public int field2026 = 256;

    @ObfuscatedName("dj.y")
    public int field2028 = 1;

    @ObfuscatedName("dj.h")
    public long field2029 = class103.method553();

    @ObfuscatedName("dj.r")
    public int field2030 = 0;

    @ObfuscatedName("dj.e")
    public int field2031;

    public class128() {
        for (int var1 = 0; var1 < 10; var1++) {
            this.field2033[var1] = this.field2029;
        }
    }

    @ObfuscatedName("dj.z(I)V")
    public void method2462() {
        for (int var1 = 0; var1 < 10; var1++) {
            this.field2033[var1] = 0L;
        }
    }

    @ObfuscatedName("dj.y(III)I")
    public int method2458(int arg0, int arg1) {
        int var3 = this.field2026;
        int var4 = this.field2028;
        this.field2026 = 300;
        this.field2028 = 1;
        this.field2029 = class103.method553();
        if (this.field2033[this.field2031] == 0L) {
            this.field2026 = var3;
            this.field2028 = var4;
        } else if (this.field2029 > this.field2033[this.field2031]) {
            this.field2026 = (int) ((long) (arg0 * 2560) / (this.field2029 - this.field2033[this.field2031]));
        }
        if (this.field2026 < 25) {
            this.field2026 = 25;
        }
        if (this.field2026 > 256) {
            this.field2026 = 256;
            this.field2028 = (int) ((long) arg0 - (this.field2029 - this.field2033[this.field2031]) / 10L);
        }
        if (this.field2028 > arg0) {
            this.field2028 = arg0;
        }
        this.field2033[this.field2031] = this.field2029;
        this.field2031 = (this.field2031 + 1) % 10;
        if (this.field2028 > 1) {
            for (int var5 = 0; var5 < 10; var5++) {
                if (this.field2033[var5] != 0L) {
                    this.field2033[var5] += (long) this.field2028;
                }
            }
        }
        if (this.field2028 < arg1) {
            this.field2028 = arg1;
        }
        class114.method589((long) this.field2028);
        int var6 = 0;
        while (this.field2030 < 256) {
            var6++;
            this.field2030 += this.field2026;
        }
        this.field2030 &= 0xFF;
        return var6;
    }
}
