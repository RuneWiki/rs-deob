package deob;

@ObfuscatedName("dl")
public class class125 extends class117 {

    @ObfuscatedName("dl.z")
    public long[] field2009 = new long[10];

    @ObfuscatedName("dl.n")
    public int field2004 = 256;

    @ObfuscatedName("dl.u")
    public int field2011 = 1;

    @ObfuscatedName("dl.t")
    public long field2006 = class100.method496();

    @ObfuscatedName("dl.e")
    public int field2012 = 0;

    @ObfuscatedName("dl.a")
    public int field2008;

    public class125() {
        for (int var1 = 0; var1 < 10; var1++) {
            this.field2009[var1] = this.field2006;
        }
    }

    @ObfuscatedName("dl.z(B)V")
    public void method2471() {
        for (int var1 = 0; var1 < 10; var1++) {
            this.field2009[var1] = 0L;
        }
    }

    @ObfuscatedName("dl.n(IIB)I")
    public int method2478(int arg0, int arg1) {
        int var3 = this.field2004;
        int var4 = this.field2011;
        this.field2004 = 300;
        this.field2011 = 1;
        this.field2006 = class100.method496();
        if (this.field2009[this.field2008] == 0L) {
            this.field2004 = var3;
            this.field2011 = var4;
        } else if (this.field2006 > this.field2009[this.field2008]) {
            this.field2004 = (int) ((long) (arg0 * 2560) / (this.field2006 - this.field2009[this.field2008]));
        }
        if (this.field2004 < 25) {
            this.field2004 = 25;
        }
        if (this.field2004 > 256) {
            this.field2004 = 256;
            this.field2011 = (int) ((long) arg0 - (this.field2006 - this.field2009[this.field2008]) / 10L);
        }
        if (this.field2011 > arg0) {
            this.field2011 = arg0;
        }
        this.field2009[this.field2008] = this.field2006;
        this.field2008 = (this.field2008 + 1) % 10;
        if (this.field2011 > 1) {
            for (int var5 = 0; var5 < 10; var5++) {
                if (this.field2009[var5] != 0L) {
                    this.field2009[var5] += (long) this.field2011;
                }
            }
        }
        if (this.field2011 < arg1) {
            this.field2011 = arg1;
        }
        class111.method1306((long) this.field2011);
        int var6 = 0;
        while (this.field2012 < 256) {
            var6++;
            this.field2012 += this.field2004;
        }
        this.field2012 &= 0xFF;
        return var6;
    }
}
