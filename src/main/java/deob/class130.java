package deob;

@ObfuscatedName("do")
public class class130 extends class122 {

    @ObfuscatedName("do.l")
    public long[] field2013 = new long[10];

    @ObfuscatedName("do.y")
    public int field2009 = 256;

    @ObfuscatedName("do.g")
    public int field2010 = 1;

    @ObfuscatedName("do.j")
    public long field2011 = class104.method2616();

    @ObfuscatedName("do.w")
    public int field2012 = 0;

    @ObfuscatedName("do.c")
    public int field2008;

    public class130() {
        for (int var1 = 0; var1 < 10; var1++) {
            this.field2013[var1] = this.field2011;
        }
    }

    @ObfuscatedName("do.l(I)V")
    public void method2463() {
        for (int var1 = 0; var1 < 10; var1++) {
            this.field2013[var1] = 0L;
        }
    }

    @ObfuscatedName("do.y(III)I")
    public int method2464(int arg0, int arg1) {
        int var3 = this.field2009;
        int var4 = this.field2010;
        this.field2009 = 300;
        this.field2010 = 1;
        this.field2011 = class104.method2616();
        if (this.field2013[this.field2008] == 0L) {
            this.field2009 = var3;
            this.field2010 = var4;
        } else if (this.field2011 > this.field2013[this.field2008]) {
            this.field2009 = (int) ((long) (arg0 * 2560) / (this.field2011 - this.field2013[this.field2008]));
        }
        if (this.field2009 < 25) {
            this.field2009 = 25;
        }
        if (this.field2009 > 256) {
            this.field2009 = 256;
            this.field2010 = (int) ((long) arg0 - (this.field2011 - this.field2013[this.field2008]) / 10L);
        }
        if (this.field2010 > arg0) {
            this.field2010 = arg0;
        }
        this.field2013[this.field2008] = this.field2011;
        this.field2008 = (this.field2008 + 1) % 10;
        if (this.field2010 > 1) {
            for (int var5 = 0; var5 < 10; var5++) {
                if (this.field2013[var5] != 0L) {
                    this.field2013[var5] += (long) this.field2010;
                }
            }
        }
        if (this.field2010 < arg1) {
            this.field2010 = arg1;
        }
        class116.method71((long) this.field2010);
        int var6 = 0;
        while (this.field2012 < 256) {
            var6++;
            this.field2012 += this.field2009;
        }
        this.field2012 &= 0xFF;
        return var6;
    }
}
