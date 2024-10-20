package deob;

@ObfuscatedName("du")
public class class130 extends class122 {

    @ObfuscatedName("du.e")
    public long[] field2021 = new long[10];

    @ObfuscatedName("du.v")
    public int field2020 = 256;

    @ObfuscatedName("du.k")
    public int field2019 = 1;

    @ObfuscatedName("du.g")
    public long field2022 = class104.method567();

    @ObfuscatedName("du.q")
    public int field2026 = 0;

    @ObfuscatedName("du.l")
    public int field2024;

    public class130() {
        for (int var1 = 0; var1 < 10; var1++) {
            this.field2021[var1] = this.field2022;
        }
    }

    @ObfuscatedName("du.e(I)V")
    public void method2467() {
        for (int var1 = 0; var1 < 10; var1++) {
            this.field2021[var1] = 0L;
        }
    }

    @ObfuscatedName("du.v(IIB)I")
    public int method2461(int arg0, int arg1) {
        int var3 = this.field2020;
        int var4 = this.field2019;
        this.field2020 = 300;
        this.field2019 = 1;
        this.field2022 = class104.method567();
        if (this.field2021[this.field2024] == 0L) {
            this.field2020 = var3;
            this.field2019 = var4;
        } else if (this.field2022 > this.field2021[this.field2024]) {
            this.field2020 = (int) ((long) (arg0 * 2560) / (this.field2022 - this.field2021[this.field2024]));
        }
        if (this.field2020 < 25) {
            this.field2020 = 25;
        }
        if (this.field2020 > 256) {
            this.field2020 = 256;
            this.field2019 = (int) ((long) arg0 - (this.field2022 - this.field2021[this.field2024]) / 10L);
        }
        if (this.field2019 > arg0) {
            this.field2019 = arg0;
        }
        this.field2021[this.field2024] = this.field2022;
        this.field2024 = (this.field2024 + 1) % 10;
        if (this.field2019 > 1) {
            for (int var5 = 0; var5 < 10; var5++) {
                if (this.field2021[var5] != 0L) {
                    this.field2021[var5] += (long) this.field2019;
                }
            }
        }
        if (this.field2019 < arg1) {
            this.field2019 = arg1;
        }
        class116.method7((long) this.field2019);
        int var6 = 0;
        while (this.field2026 < 256) {
            var6++;
            this.field2026 += this.field2020;
        }
        this.field2026 &= 0xFF;
        return var6;
    }
}
