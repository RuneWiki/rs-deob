package deob;

@ObfuscatedName("dl")
public class class128 extends class120 {

    @ObfuscatedName("dl.y")
    public long[] field2030 = new long[10];

    @ObfuscatedName("dl.u")
    public int field2020 = 256;

    @ObfuscatedName("dl.k")
    public int field2031 = 1;

    @ObfuscatedName("dl.v")
    public long field2033 = class103.method790();

    @ObfuscatedName("dl.l")
    public int field2022 = 0;

    @ObfuscatedName("dl.g")
    public int field2023;

    public class128() {
        for (int var1 = 0; var1 < 10; var1++) {
            this.field2030[var1] = this.field2033;
        }
    }

    @ObfuscatedName("dl.y(I)V")
    public void method2435() {
        for (int var1 = 0; var1 < 10; var1++) {
            this.field2030[var1] = 0L;
        }
    }

    @ObfuscatedName("dl.u(III)I")
    public int method2426(int arg0, int arg1) {
        int var3 = this.field2020;
        int var4 = this.field2031;
        this.field2020 = 300;
        this.field2031 = 1;
        this.field2033 = class103.method790();
        if (this.field2030[this.field2023] == 0L) {
            this.field2020 = var3;
            this.field2031 = var4;
        } else if (this.field2033 > this.field2030[this.field2023]) {
            this.field2020 = (int) ((long) (arg0 * 2560) / (this.field2033 - this.field2030[this.field2023]));
        }
        if (this.field2020 < 25) {
            this.field2020 = 25;
        }
        if (this.field2020 > 256) {
            this.field2020 = 256;
            this.field2031 = (int) ((long) arg0 - (this.field2033 - this.field2030[this.field2023]) / 10L);
        }
        if (this.field2031 > arg0) {
            this.field2031 = arg0;
        }
        this.field2030[this.field2023] = this.field2033;
        this.field2023 = (this.field2023 + 1) % 10;
        if (this.field2031 > 1) {
            for (int var5 = 0; var5 < 10; var5++) {
                if (this.field2030[var5] != 0L) {
                    this.field2030[var5] += (long) this.field2031;
                }
            }
        }
        if (this.field2031 < arg1) {
            this.field2031 = arg1;
        }
        class114.method140((long) this.field2031);
        int var6 = 0;
        while (this.field2022 < 256) {
            var6++;
            this.field2022 += this.field2020;
        }
        this.field2022 &= 0xFF;
        return var6;
    }
}
