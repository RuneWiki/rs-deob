package deob;

@ObfuscatedName("di")
public class class128 extends class120 {

    @ObfuscatedName("di.e")
    public long[] field2022 = new long[10];

    @ObfuscatedName("di.p")
    public int field2018 = 256;

    @ObfuscatedName("di.a")
    public int field2019 = 1;

    @ObfuscatedName("di.g")
    public long field2020 = class103.method527();

    @ObfuscatedName("di.u")
    public int field2021 = 0;

    @ObfuscatedName("di.k")
    public int field2025;

    public class128() {
        for (int var1 = 0; var1 < 10; var1++) {
            this.field2022[var1] = this.field2020;
        }
    }

    @ObfuscatedName("di.p(I)V")
    public void method2454() {
        for (int var1 = 0; var1 < 10; var1++) {
            this.field2022[var1] = 0L;
        }
    }

    @ObfuscatedName("di.a(III)I")
    public int method2453(int arg0, int arg1) {
        int var3 = this.field2018;
        int var4 = this.field2019;
        this.field2018 = 300;
        this.field2019 = 1;
        this.field2020 = class103.method527();
        if (this.field2022[this.field2025] == 0L) {
            this.field2018 = var3;
            this.field2019 = var4;
        } else if (this.field2020 > this.field2022[this.field2025]) {
            this.field2018 = (int) ((long) (arg0 * 2560) / (this.field2020 - this.field2022[this.field2025]));
        }
        if (this.field2018 < 25) {
            this.field2018 = 25;
        }
        if (this.field2018 > 256) {
            this.field2018 = 256;
            this.field2019 = (int) ((long) arg0 - (this.field2020 - this.field2022[this.field2025]) / 10L);
        }
        if (this.field2019 > arg0) {
            this.field2019 = arg0;
        }
        this.field2022[this.field2025] = this.field2020;
        this.field2025 = (this.field2025 + 1) % 10;
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
        class114.method658((long) this.field2019);
        int var6 = 0;
        while (this.field2021 < 256) {
            var6++;
            this.field2021 += this.field2018;
        }
        this.field2021 &= 0xFF;
        return var6;
    }
}
