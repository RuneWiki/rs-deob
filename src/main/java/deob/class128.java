package deob;

@ObfuscatedName("dv")
public class class128 extends class120 {

    @ObfuscatedName("dv.i")
    public long[] field2009 = new long[10];

    @ObfuscatedName("dv.c")
    public int field2008 = 256;

    @ObfuscatedName("dv.h")
    public int field2013 = 1;

    @ObfuscatedName("dv.v")
    public long field2010 = class103.method1055();

    @ObfuscatedName("dv.q")
    public int field2014 = 0;

    @ObfuscatedName("dv.s")
    public int field2012;

    public class128() {
        for (int var1 = 0; var1 < 10; var1++) {
            this.field2009[var1] = this.field2010;
        }
    }

    @ObfuscatedName("dv.i(I)V")
    public void method2470() {
        for (int var1 = 0; var1 < 10; var1++) {
            this.field2009[var1] = 0L;
        }
    }

    @ObfuscatedName("dv.c(III)I")
    public int method2472(int arg0, int arg1) {
        int var3 = this.field2008;
        int var4 = this.field2013;
        this.field2008 = 300;
        this.field2013 = 1;
        this.field2010 = class103.method1055();
        if (this.field2009[this.field2012] == 0L) {
            this.field2008 = var3;
            this.field2013 = var4;
        } else if (this.field2010 > this.field2009[this.field2012]) {
            this.field2008 = (int) ((long) (arg0 * 2560) / (this.field2010 - this.field2009[this.field2012]));
        }
        if (this.field2008 < 25) {
            this.field2008 = 25;
        }
        if (this.field2008 > 256) {
            this.field2008 = 256;
            this.field2013 = (int) ((long) arg0 - (this.field2010 - this.field2009[this.field2012]) / 10L);
        }
        if (this.field2013 > arg0) {
            this.field2013 = arg0;
        }
        this.field2009[this.field2012] = this.field2010;
        this.field2012 = (this.field2012 + 1) % 10;
        if (this.field2013 > 1) {
            for (int var5 = 0; var5 < 10; var5++) {
                if (this.field2009[var5] != 0L) {
                    this.field2009[var5] += (long) this.field2013;
                }
            }
        }
        if (this.field2013 < arg1) {
            this.field2013 = arg1;
        }
        class114.method743((long) this.field2013);
        int var6 = 0;
        while (this.field2014 < 256) {
            var6++;
            this.field2014 += this.field2008;
        }
        this.field2014 &= 0xFF;
        return var6;
    }
}
