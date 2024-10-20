package deob;

@ObfuscatedName("bh")
public class class127 extends class123 {

    @ObfuscatedName("bh.d")
    public int field2030;

    @ObfuscatedName("bh.b")
    public long[] field2032 = new long[10];

    @ObfuscatedName("bh.k")
    public int field2026 = 1;

    @ObfuscatedName("bh.h")
    public int field2025 = 256;

    @ObfuscatedName("bh.w")
    public long field2027 = class38.method2385();

    @ObfuscatedName("bh.t")
    public int field2028 = 0;

    @ObfuscatedName("bh.b(I)V")
    public void method2187() {
        for (int var1 = 0; var1 < 10; var1++) {
            this.field2032[var1] = 0L;
        }
    }

    @ObfuscatedName("bh.h(III)I")
    public int method2188(int arg0, int arg1) {
        int var3 = this.field2025;
        int var4 = this.field2026;
        this.field2025 = 300;
        this.field2026 = 1;
        this.field2027 = class38.method2385();
        if (this.field2032[this.field2030] == 0L) {
            this.field2025 = var3;
            this.field2026 = var4;
        } else if (this.field2027 > this.field2032[this.field2030]) {
            this.field2025 = (int) ((long) (arg0 * 2560) / (this.field2027 - this.field2032[this.field2030]));
        }
        if (this.field2025 < 25) {
            this.field2025 = 25;
        }
        if (this.field2025 > 256) {
            this.field2025 = 256;
            this.field2026 = (int) ((long) arg0 - (this.field2027 - this.field2032[this.field2030]) / 10L);
        }
        if (this.field2026 > arg0) {
            this.field2026 = arg0;
        }
        this.field2032[this.field2030] = this.field2027;
        this.field2030 = (this.field2030 + 1) % 10;
        if (this.field2026 > 1) {
            for (int var5 = 0; var5 < 10; var5++) {
                if (this.field2032[var5] != 0L) {
                    this.field2032[var5] += (long) this.field2026;
                }
            }
        }
        if (this.field2026 < arg1) {
            this.field2026 = arg1;
        }
        class134.method600((long) this.field2026);
        int var6 = 0;
        while (this.field2028 < 256) {
            var6++;
            this.field2028 += this.field2025;
        }
        this.field2028 &= 0xFF;
        return var6;
    }

    public class127() {
        for (int var1 = 0; var1 < 10; var1++) {
            this.field2032[var1] = this.field2027;
        }
    }
}
