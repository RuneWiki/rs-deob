package deob;

@ObfuscatedName("dm")
public class class130 extends class122 {

    @ObfuscatedName("dm.g")
    public long[] field2016 = new long[10];

    @ObfuscatedName("dm.j")
    public int field2010 = 256;

    @ObfuscatedName("dm.z")
    public int field2009 = 1;

    @ObfuscatedName("dm.b")
    public long field2011 = class104.method528();

    @ObfuscatedName("dm.k")
    public int field2012 = 0;

    @ObfuscatedName("dm.c")
    public int field2013;

    public class130() {
        for (int var1 = 0; var1 < 10; var1++) {
            this.field2016[var1] = this.field2011;
        }
    }

    @ObfuscatedName("dm.g(I)V")
    public void method2414() {
        for (int var1 = 0; var1 < 10; var1++) {
            this.field2016[var1] = 0L;
        }
    }

    @ObfuscatedName("dm.j(III)I")
    public int method2415(int arg0, int arg1) {
        int var3 = this.field2010;
        int var4 = this.field2009;
        this.field2010 = 300;
        this.field2009 = 1;
        this.field2011 = class104.method528();
        if (this.field2016[this.field2013] == 0L) {
            this.field2010 = var3;
            this.field2009 = var4;
        } else if (this.field2011 > this.field2016[this.field2013]) {
            this.field2010 = (int) ((long) (arg0 * 2560) / (this.field2011 - this.field2016[this.field2013]));
        }
        if (this.field2010 < 25) {
            this.field2010 = 25;
        }
        if (this.field2010 > 256) {
            this.field2010 = 256;
            this.field2009 = (int) ((long) arg0 - (this.field2011 - this.field2016[this.field2013]) / 10L);
        }
        if (this.field2009 > arg0) {
            this.field2009 = arg0;
        }
        this.field2016[this.field2013] = this.field2011;
        this.field2013 = (this.field2013 + 1) % 10;
        if (this.field2009 > 1) {
            for (int var5 = 0; var5 < 10; var5++) {
                if (this.field2016[var5] != 0L) {
                    this.field2016[var5] += (long) this.field2009;
                }
            }
        }
        if (this.field2009 < arg1) {
            this.field2009 = arg1;
        }
        class116.method154((long) this.field2009);
        int var6 = 0;
        while (this.field2012 < 256) {
            var6++;
            this.field2012 += this.field2010;
        }
        this.field2012 &= 0xFF;
        return var6;
    }
}
