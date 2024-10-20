package deob;

@ObfuscatedName("dh")
public class class128 extends class120 {

    @ObfuscatedName("dh.e")
    public long[] field2022 = new long[10];

    @ObfuscatedName("dh.o")
    public int field2021 = 256;

    @ObfuscatedName("dh.y")
    public int field2019 = 1;

    @ObfuscatedName("dh.b")
    public long field2020 = class103.method833();

    @ObfuscatedName("dh.w")
    public int field2023 = 0;

    @ObfuscatedName("dh.r")
    public int field2024;

    public class128() {
        for (int var1 = 0; var1 < 10; var1++) {
            this.field2022[var1] = this.field2020;
        }
    }

    @ObfuscatedName("dh.o(B)V")
    public void method2383() {
        for (int var1 = 0; var1 < 10; var1++) {
            this.field2022[var1] = 0L;
        }
    }

    @ObfuscatedName("dh.y(III)I")
    public int method2384(int arg0, int arg1) {
        int var3 = this.field2021;
        int var4 = this.field2019;
        this.field2021 = 300;
        this.field2019 = 1;
        this.field2020 = class103.method833();
        if (this.field2022[this.field2024] == 0L) {
            this.field2021 = var3;
            this.field2019 = var4;
        } else if (this.field2020 > this.field2022[this.field2024]) {
            this.field2021 = (int) ((long) (arg0 * 2560) / (this.field2020 - this.field2022[this.field2024]));
        }
        if (this.field2021 < 25) {
            this.field2021 = 25;
        }
        if (this.field2021 > 256) {
            this.field2021 = 256;
            this.field2019 = (int) ((long) arg0 - (this.field2020 - this.field2022[this.field2024]) / 10L);
        }
        if (this.field2019 > arg0) {
            this.field2019 = arg0;
        }
        this.field2022[this.field2024] = this.field2020;
        this.field2024 = (this.field2024 + 1) % 10;
        if (this.field2019 > 1) {
            for (int var5 = 0; var5 < 10; var5++) {
                if (this.field2022[var5] != 0L) {
                    this.field2022[var5] += (long) this.field2019;
                }
            }
        }
        if (this.field2019 < arg1) {
            this.field2019 = arg1;
        }
        class114.method134((long) this.field2019);
        int var6 = 0;
        while (this.field2023 < 256) {
            var6++;
            this.field2023 += this.field2021;
        }
        this.field2023 &= 0xFF;
        return var6;
    }
}
