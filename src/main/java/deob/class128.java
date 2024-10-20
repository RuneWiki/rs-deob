package deob;

@ObfuscatedName("dm")
public class class128 extends class120 {

    @ObfuscatedName("dm.e")
    public long[] field2012 = new long[10];

    @ObfuscatedName("dm.v")
    public int field2011 = 256;

    @ObfuscatedName("dm.i")
    public int field2018 = 1;

    @ObfuscatedName("dm.g")
    public long field2013 = class103.method1957();

    @ObfuscatedName("dm.x")
    public int field2017 = 0;

    @ObfuscatedName("dm.b")
    public int field2015;

    public class128() {
        for (int var1 = 0; var1 < 10; var1++) {
            this.field2012[var1] = this.field2013;
        }
    }

    @ObfuscatedName("dm.e(I)V")
    public void method2438() {
        for (int var1 = 0; var1 < 10; var1++) {
            this.field2012[var1] = 0L;
        }
    }

    @ObfuscatedName("dm.v(III)I")
    public int method2437(int arg0, int arg1) {
        int var3 = this.field2011;
        int var4 = this.field2018;
        this.field2011 = 300;
        this.field2018 = 1;
        this.field2013 = class103.method1957();
        if (this.field2012[this.field2015] == 0L) {
            this.field2011 = var3;
            this.field2018 = var4;
        } else if (this.field2013 > this.field2012[this.field2015]) {
            this.field2011 = (int) ((long) (arg0 * 2560) / (this.field2013 - this.field2012[this.field2015]));
        }
        if (this.field2011 < 25) {
            this.field2011 = 25;
        }
        if (this.field2011 > 256) {
            this.field2011 = 256;
            this.field2018 = (int) ((long) arg0 - (this.field2013 - this.field2012[this.field2015]) / 10L);
        }
        if (this.field2018 > arg0) {
            this.field2018 = arg0;
        }
        this.field2012[this.field2015] = this.field2013;
        this.field2015 = (this.field2015 + 1) % 10;
        if (this.field2018 > 1) {
            for (int var5 = 0; var5 < 10; var5++) {
                if (this.field2012[var5] != 0L) {
                    this.field2012[var5] += (long) this.field2018;
                }
            }
        }
        if (this.field2018 < arg1) {
            this.field2018 = arg1;
        }
        class114.method2357((long) this.field2018);
        int var6 = 0;
        while (this.field2017 < 256) {
            var6++;
            this.field2017 += this.field2011;
        }
        this.field2017 &= 0xFF;
        return var6;
    }
}
