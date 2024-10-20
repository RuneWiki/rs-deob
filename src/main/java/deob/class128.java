package deob;

@ObfuscatedName("dv")
public class class128 extends class120 {

    @ObfuscatedName("dv.k")
    public long[] field2020 = new long[10];

    @ObfuscatedName("dv.y")
    public int field2019 = 256;

    @ObfuscatedName("dv.s")
    public int field2025 = 1;

    @ObfuscatedName("dv.g")
    public long field2021 = class103.method16();

    @ObfuscatedName("dv.h")
    public int field2023 = 0;

    @ObfuscatedName("dv.l")
    public int field2018;

    public class128() {
        for (int var1 = 0; var1 < 10; var1++) {
            this.field2020[var1] = this.field2021;
        }
    }

    @ObfuscatedName("dv.k(I)V")
    public void method2453() {
        for (int var1 = 0; var1 < 10; var1++) {
            this.field2020[var1] = 0L;
        }
    }

    @ObfuscatedName("dv.y(III)I")
    public int method2454(int arg0, int arg1) {
        int var3 = this.field2019;
        int var4 = this.field2025;
        this.field2019 = 300;
        this.field2025 = 1;
        this.field2021 = class103.method16();
        if (this.field2020[this.field2018] == 0L) {
            this.field2019 = var3;
            this.field2025 = var4;
        } else if (this.field2021 > this.field2020[this.field2018]) {
            this.field2019 = (int) ((long) (arg0 * 2560) / (this.field2021 - this.field2020[this.field2018]));
        }
        if (this.field2019 < 25) {
            this.field2019 = 25;
        }
        if (this.field2019 > 256) {
            this.field2019 = 256;
            this.field2025 = (int) ((long) arg0 - (this.field2021 - this.field2020[this.field2018]) / 10L);
        }
        if (this.field2025 > arg0) {
            this.field2025 = arg0;
        }
        this.field2020[this.field2018] = this.field2021;
        this.field2018 = (this.field2018 + 1) % 10;
        if (this.field2025 > 1) {
            for (int var5 = 0; var5 < 10; var5++) {
                if (this.field2020[var5] != 0L) {
                    this.field2020[var5] += (long) this.field2025;
                }
            }
        }
        if (this.field2025 < arg1) {
            this.field2025 = arg1;
        }
        class114.method1888((long) this.field2025);
        int var6 = 0;
        while (this.field2023 < 256) {
            var6++;
            this.field2023 += this.field2019;
        }
        this.field2023 &= 0xFF;
        return var6;
    }
}
