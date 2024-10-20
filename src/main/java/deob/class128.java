package deob;

@ObfuscatedName("dy")
public class class128 extends class120 {

    @ObfuscatedName("dy.p")
    public long[] field2007 = new long[10];

    @ObfuscatedName("dy.g")
    public int field2006 = 256;

    @ObfuscatedName("dy.x")
    public int field2005 = 1;

    @ObfuscatedName("dy.c")
    public long field2013 = class103.method550();

    @ObfuscatedName("dy.n")
    public int field2009 = 0;

    @ObfuscatedName("dy.s")
    public int field2010;

    public class128() {
        for (int var1 = 0; var1 < 10; var1++) {
            this.field2007[var1] = this.field2013;
        }
    }

    @ObfuscatedName("dy.p(I)V")
    public void method2502() {
        for (int var1 = 0; var1 < 10; var1++) {
            this.field2007[var1] = 0L;
        }
    }

    @ObfuscatedName("dy.g(III)I")
    public int method2503(int arg0, int arg1) {
        int var3 = this.field2006;
        int var4 = this.field2005;
        this.field2006 = 300;
        this.field2005 = 1;
        this.field2013 = class103.method550();
        if (this.field2007[this.field2010] == 0L) {
            this.field2006 = var3;
            this.field2005 = var4;
        } else if (this.field2013 > this.field2007[this.field2010]) {
            this.field2006 = (int) ((long) (arg0 * 2560) / (this.field2013 - this.field2007[this.field2010]));
        }
        if (this.field2006 < 25) {
            this.field2006 = 25;
        }
        if (this.field2006 > 256) {
            this.field2006 = 256;
            this.field2005 = (int) ((long) arg0 - (this.field2013 - this.field2007[this.field2010]) / 10L);
        }
        if (this.field2005 > arg0) {
            this.field2005 = arg0;
        }
        this.field2007[this.field2010] = this.field2013;
        this.field2010 = (this.field2010 + 1) % 10;
        if (this.field2005 > 1) {
            for (int var5 = 0; var5 < 10; var5++) {
                if (this.field2007[var5] != 0L) {
                    this.field2007[var5] += (long) this.field2005;
                }
            }
        }
        if (this.field2005 < arg1) {
            this.field2005 = arg1;
        }
        class114.method1917((long) this.field2005);
        int var6 = 0;
        while (this.field2009 < 256) {
            var6++;
            this.field2009 += this.field2006;
        }
        this.field2009 &= 0xFF;
        return var6;
    }
}
