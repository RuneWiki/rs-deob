package deob;

@ObfuscatedName("dc")
public class class128 extends class120 {

    @ObfuscatedName("dc.b")
    public long[] field2026 = new long[10];

    @ObfuscatedName("dc.u")
    public int field2027 = 256;

    @ObfuscatedName("dc.x")
    public int field2020 = 1;

    @ObfuscatedName("dc.j")
    public long field2021 = class103.method29();

    @ObfuscatedName("dc.o")
    public int field2023 = 0;

    @ObfuscatedName("dc.n")
    public int field2022;

    public class128() {
        for (int var1 = 0; var1 < 10; var1++) {
            this.field2026[var1] = this.field2021;
        }
    }

    @ObfuscatedName("dc.b(I)V")
    public void method2464() {
        for (int var1 = 0; var1 < 10; var1++) {
            this.field2026[var1] = 0L;
        }
    }

    @ObfuscatedName("dc.u(III)I")
    public int method2466(int arg0, int arg1) {
        int var3 = this.field2027;
        int var4 = this.field2020;
        this.field2027 = 300;
        this.field2020 = 1;
        this.field2021 = class103.method29();
        if (this.field2026[this.field2022] == 0L) {
            this.field2027 = var3;
            this.field2020 = var4;
        } else if (this.field2021 > this.field2026[this.field2022]) {
            this.field2027 = (int) ((long) (arg0 * 2560) / (this.field2021 - this.field2026[this.field2022]));
        }
        if (this.field2027 < 25) {
            this.field2027 = 25;
        }
        if (this.field2027 > 256) {
            this.field2027 = 256;
            this.field2020 = (int) ((long) arg0 - (this.field2021 - this.field2026[this.field2022]) / 10L);
        }
        if (this.field2020 > arg0) {
            this.field2020 = arg0;
        }
        this.field2026[this.field2022] = this.field2021;
        this.field2022 = (this.field2022 + 1) % 10;
        if (this.field2020 > 1) {
            for (int var5 = 0; var5 < 10; var5++) {
                if (this.field2026[var5] != 0L) {
                    this.field2026[var5] += (long) this.field2020;
                }
            }
        }
        if (this.field2020 < arg1) {
            this.field2020 = arg1;
        }
        class114.method2914((long) this.field2020);
        int var6 = 0;
        while (this.field2023 < 256) {
            var6++;
            this.field2023 += this.field2027;
        }
        this.field2023 &= 0xFF;
        return var6;
    }
}
