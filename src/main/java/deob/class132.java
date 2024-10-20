package deob;

@ObfuscatedName("em")
public class class132 extends class124 {

    @ObfuscatedName("em.p")
    public long[] field2033 = new long[10];

    @ObfuscatedName("em.y")
    public int field2030 = 256;

    @ObfuscatedName("em.d")
    public int field2025 = 1;

    @ObfuscatedName("em.c")
    public long field2026 = class106.method870();

    @ObfuscatedName("em.r")
    public int field2027 = 0;

    @ObfuscatedName("em.f")
    public int field2028;

    public class132() {
        for (int var1 = 0; var1 < 10; var1++) {
            this.field2033[var1] = this.field2026;
        }
    }

    @ObfuscatedName("em.p(I)V")
    public void method2455() {
        for (int var1 = 0; var1 < 10; var1++) {
            this.field2033[var1] = 0L;
        }
    }

    @ObfuscatedName("em.y(III)I")
    public int method2460(int arg0, int arg1) {
        int var3 = this.field2030;
        int var4 = this.field2025;
        this.field2030 = 300;
        this.field2025 = 1;
        this.field2026 = class106.method870();
        if (this.field2033[this.field2028] == 0L) {
            this.field2030 = var3;
            this.field2025 = var4;
        } else if (this.field2026 > this.field2033[this.field2028]) {
            this.field2030 = (int) ((long) (arg0 * 2560) / (this.field2026 - this.field2033[this.field2028]));
        }
        if (this.field2030 < 25) {
            this.field2030 = 25;
        }
        if (this.field2030 > 256) {
            this.field2030 = 256;
            this.field2025 = (int) ((long) arg0 - (this.field2026 - this.field2033[this.field2028]) / 10L);
        }
        if (this.field2025 > arg0) {
            this.field2025 = arg0;
        }
        this.field2033[this.field2028] = this.field2026;
        this.field2028 = (this.field2028 + 1) % 10;
        if (this.field2025 > 1) {
            for (int var5 = 0; var5 < 10; var5++) {
                if (this.field2033[var5] != 0L) {
                    this.field2033[var5] += (long) this.field2025;
                }
            }
        }
        if (this.field2025 < arg1) {
            this.field2025 = arg1;
        }
        class118.method1901((long) this.field2025);
        int var6 = 0;
        while (this.field2027 < 256) {
            var6++;
            this.field2027 += this.field2030;
        }
        this.field2027 &= 0xFF;
        return var6;
    }
}
