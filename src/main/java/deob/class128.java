package deob;

@ObfuscatedName("dg")
public class class128 extends class120 {

    @ObfuscatedName("dg.t")
    public long[] field2021 = new long[10];

    @ObfuscatedName("dg.s")
    public int field2018 = 256;

    @ObfuscatedName("dg.f")
    public int field2012 = 1;

    @ObfuscatedName("dg.e")
    public long field2013 = class103.method2037();

    @ObfuscatedName("dg.d")
    public int field2014 = 0;

    @ObfuscatedName("dg.n")
    public int field2015;

    public class128() {
        for (int var1 = 0; var1 < 10; var1++) {
            this.field2021[var1] = this.field2013;
        }
    }

    @ObfuscatedName("dg.s(I)V")
    public void method2436() {
        for (int var1 = 0; var1 < 10; var1++) {
            this.field2021[var1] = 0L;
        }
    }

    @ObfuscatedName("dg.f(III)I")
    public int method2435(int arg0, int arg1) {
        int var3 = this.field2018;
        int var4 = this.field2012;
        this.field2018 = 300;
        this.field2012 = 1;
        this.field2013 = class103.method2037();
        if (this.field2021[this.field2015] == 0L) {
            this.field2018 = var3;
            this.field2012 = var4;
        } else if (this.field2013 > this.field2021[this.field2015]) {
            this.field2018 = (int) ((long) (arg0 * 2560) / (this.field2013 - this.field2021[this.field2015]));
        }
        if (this.field2018 < 25) {
            this.field2018 = 25;
        }
        if (this.field2018 > 256) {
            this.field2018 = 256;
            this.field2012 = (int) ((long) arg0 - (this.field2013 - this.field2021[this.field2015]) / 10L);
        }
        if (this.field2012 > arg0) {
            this.field2012 = arg0;
        }
        this.field2021[this.field2015] = this.field2013;
        this.field2015 = (this.field2015 + 1) % 10;
        if (this.field2012 > 1) {
            for (int var5 = 0; var5 < 10; var5++) {
                if (this.field2021[var5] != 0L) {
                    this.field2021[var5] += (long) this.field2012;
                }
            }
        }
        if (this.field2012 < arg1) {
            this.field2012 = arg1;
        }
        class114.method2031((long) this.field2012);
        int var6 = 0;
        while (this.field2014 < 256) {
            var6++;
            this.field2014 += this.field2018;
        }
        this.field2014 &= 0xFF;
        return var6;
    }
}
