package deob;

@ObfuscatedName("dn")
public class class130 extends class122 {

    @ObfuscatedName("dn.x")
    public long[] field2022 = new long[10];

    @ObfuscatedName("dn.v")
    public int field2014 = 256;

    @ObfuscatedName("dn.m")
    public int field2015 = 1;

    @ObfuscatedName("dn.e")
    public long field2016 = class104.method27();

    @ObfuscatedName("dn.h")
    public int field2013 = 0;

    @ObfuscatedName("dn.p")
    public int field2018;

    public class130() {
        for (int var1 = 0; var1 < 10; var1++) {
            this.field2022[var1] = this.field2016;
        }
    }

    @ObfuscatedName("dn.x(I)V")
    public void method2468() {
        for (int var1 = 0; var1 < 10; var1++) {
            this.field2022[var1] = 0L;
        }
    }

    @ObfuscatedName("dn.v(III)I")
    public int method2469(int arg0, int arg1) {
        int var3 = this.field2014;
        int var4 = this.field2015;
        this.field2014 = 300;
        this.field2015 = 1;
        this.field2016 = class104.method27();
        if (this.field2022[this.field2018] == 0L) {
            this.field2014 = var3;
            this.field2015 = var4;
        } else if (this.field2016 > this.field2022[this.field2018]) {
            this.field2014 = (int) ((long) (arg0 * 2560) / (this.field2016 - this.field2022[this.field2018]));
        }
        if (this.field2014 < 25) {
            this.field2014 = 25;
        }
        if (this.field2014 > 256) {
            this.field2014 = 256;
            this.field2015 = (int) ((long) arg0 - (this.field2016 - this.field2022[this.field2018]) / 10L);
        }
        if (this.field2015 > arg0) {
            this.field2015 = arg0;
        }
        this.field2022[this.field2018] = this.field2016;
        this.field2018 = (this.field2018 + 1) % 10;
        if (this.field2015 > 1) {
            for (int var5 = 0; var5 < 10; var5++) {
                if (this.field2022[var5] != 0L) {
                    this.field2022[var5] += (long) this.field2015;
                }
            }
        }
        if (this.field2015 < arg1) {
            this.field2015 = arg1;
        }
        class116.method1361((long) this.field2015);
        int var6 = 0;
        while (this.field2013 < 256) {
            var6++;
            this.field2013 += this.field2014;
        }
        this.field2013 &= 0xFF;
        return var6;
    }
}
