package deob;

@ObfuscatedName("dc")
public class class130 extends class122 {

    @ObfuscatedName("dc.c")
    public long[] field2006 = new long[10];

    @ObfuscatedName("dc.j")
    public int field2007 = 256;

    @ObfuscatedName("dc.y")
    public int field2008 = 1;

    @ObfuscatedName("dc.r")
    public long field2012 = class104.method1388();

    @ObfuscatedName("dc.f")
    public int field2009 = 0;

    @ObfuscatedName("dc.l")
    public int field2010;

    public class130() {
        for (int var1 = 0; var1 < 10; var1++) {
            this.field2006[var1] = this.field2012;
        }
    }

    @ObfuscatedName("dc.c(I)V")
    public void method2467() {
        for (int var1 = 0; var1 < 10; var1++) {
            this.field2006[var1] = 0L;
        }
    }

    @ObfuscatedName("dc.j(III)I")
    public int method2465(int arg0, int arg1) {
        int var3 = this.field2007;
        int var4 = this.field2008;
        this.field2007 = 300;
        this.field2008 = 1;
        this.field2012 = class104.method1388();
        if (this.field2006[this.field2010] == 0L) {
            this.field2007 = var3;
            this.field2008 = var4;
        } else if (this.field2012 > this.field2006[this.field2010]) {
            this.field2007 = (int) ((long) (arg0 * 2560) / (this.field2012 - this.field2006[this.field2010]));
        }
        if (this.field2007 < 25) {
            this.field2007 = 25;
        }
        if (this.field2007 > 256) {
            this.field2007 = 256;
            this.field2008 = (int) ((long) arg0 - (this.field2012 - this.field2006[this.field2010]) / 10L);
        }
        if (this.field2008 > arg0) {
            this.field2008 = arg0;
        }
        this.field2006[this.field2010] = this.field2012;
        this.field2010 = (this.field2010 + 1) % 10;
        if (this.field2008 > 1) {
            for (int var5 = 0; var5 < 10; var5++) {
                if (this.field2006[var5] != 0L) {
                    this.field2006[var5] += (long) this.field2008;
                }
            }
        }
        if (this.field2008 < arg1) {
            this.field2008 = arg1;
        }
        class116.method2713((long) this.field2008);
        int var6 = 0;
        while (this.field2009 < 256) {
            var6++;
            this.field2009 += this.field2007;
        }
        this.field2009 &= 0xFF;
        return var6;
    }
}
