package deob;

@ObfuscatedName("dj")
public class class128 extends class120 {

    @ObfuscatedName("dj.k")
    public long[] field2024 = new long[10];

    @ObfuscatedName("dj.r")
    public int field2025 = 256;

    @ObfuscatedName("dj.y")
    public int field2023 = 1;

    @ObfuscatedName("dj.w")
    public long field2028 = class103.method470();

    @ObfuscatedName("dj.m")
    public int field2026 = 0;

    @ObfuscatedName("dj.j")
    public int field2027;

    public class128() {
        for (int var1 = 0; var1 < 10; var1++) {
            this.field2024[var1] = this.field2028;
        }
    }

    @ObfuscatedName("dj.k(I)V")
    public void method2433() {
        for (int var1 = 0; var1 < 10; var1++) {
            this.field2024[var1] = 0L;
        }
    }

    @ObfuscatedName("dj.r(III)I")
    public int method2432(int arg0, int arg1) {
        int var3 = this.field2025;
        int var4 = this.field2023;
        this.field2025 = 300;
        this.field2023 = 1;
        this.field2028 = class103.method470();
        if (this.field2024[this.field2027] == 0L) {
            this.field2025 = var3;
            this.field2023 = var4;
        } else if (this.field2028 > this.field2024[this.field2027]) {
            this.field2025 = (int) ((long) (arg0 * 2560) / (this.field2028 - this.field2024[this.field2027]));
        }
        if (this.field2025 < 25) {
            this.field2025 = 25;
        }
        if (this.field2025 > 256) {
            this.field2025 = 256;
            this.field2023 = (int) ((long) arg0 - (this.field2028 - this.field2024[this.field2027]) / 10L);
        }
        if (this.field2023 > arg0) {
            this.field2023 = arg0;
        }
        this.field2024[this.field2027] = this.field2028;
        this.field2027 = (this.field2027 + 1) % 10;
        if (this.field2023 > 1) {
            for (int var5 = 0; var5 < 10; var5++) {
                if (this.field2024[var5] != 0L) {
                    this.field2024[var5] += (long) this.field2023;
                }
            }
        }
        if (this.field2023 < arg1) {
            this.field2023 = arg1;
        }
        class114.method2808((long) this.field2023);
        int var6 = 0;
        while (this.field2026 < 256) {
            var6++;
            this.field2026 += this.field2025;
        }
        this.field2026 &= 0xFF;
        return var6;
    }
}
