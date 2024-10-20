package deob;

@ObfuscatedName("di")
public class class128 extends class120 {

    @ObfuscatedName("di.g")
    public long[] field2024 = new long[10];

    @ObfuscatedName("di.i")
    public int field2023 = 256;

    @ObfuscatedName("di.k")
    public int field2032 = 1;

    @ObfuscatedName("di.e")
    public long field2026 = class103.method98();

    @ObfuscatedName("di.w")
    public int field2027 = 0;

    @ObfuscatedName("di.m")
    public int field2025;

    public class128() {
        for (int var1 = 0; var1 < 10; var1++) {
            this.field2024[var1] = this.field2026;
        }
    }

    @ObfuscatedName("di.g(I)V")
    public void method2430() {
        for (int var1 = 0; var1 < 10; var1++) {
            this.field2024[var1] = 0L;
        }
    }

    @ObfuscatedName("di.i(III)I")
    public int method2431(int arg0, int arg1) {
        int var3 = this.field2023;
        int var4 = this.field2032;
        this.field2023 = 300;
        this.field2032 = 1;
        this.field2026 = class103.method98();
        if (this.field2024[this.field2025] == 0L) {
            this.field2023 = var3;
            this.field2032 = var4;
        } else if (this.field2026 > this.field2024[this.field2025]) {
            this.field2023 = (int) ((long) (arg0 * 2560) / (this.field2026 - this.field2024[this.field2025]));
        }
        if (this.field2023 < 25) {
            this.field2023 = 25;
        }
        if (this.field2023 > 256) {
            this.field2023 = 256;
            this.field2032 = (int) ((long) arg0 - (this.field2026 - this.field2024[this.field2025]) / 10L);
        }
        if (this.field2032 > arg0) {
            this.field2032 = arg0;
        }
        this.field2024[this.field2025] = this.field2026;
        this.field2025 = (this.field2025 + 1) % 10;
        if (this.field2032 > 1) {
            for (int var5 = 0; var5 < 10; var5++) {
                if (this.field2024[var5] != 0L) {
                    this.field2024[var5] += (long) this.field2032;
                }
            }
        }
        if (this.field2032 < arg1) {
            this.field2032 = arg1;
        }
        class114.method1935((long) this.field2032);
        int var6 = 0;
        while (this.field2027 < 256) {
            var6++;
            this.field2027 += this.field2023;
        }
        this.field2027 &= 0xFF;
        return var6;
    }
}
