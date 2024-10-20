package deob;

@ObfuscatedName("do")
public class class128 extends class120 {

    @ObfuscatedName("do.g")
    public long[] field2009 = new long[10];

    @ObfuscatedName("do.s")
    public int field2005 = 256;

    @ObfuscatedName("do.h")
    public int field2010 = 1;

    @ObfuscatedName("do.m")
    public long field2006 = class103.method494();

    @ObfuscatedName("do.u")
    public int field2004 = 0;

    @ObfuscatedName("do.j")
    public int field2011;

    public class128() {
        for (int var1 = 0; var1 < 10; var1++) {
            this.field2009[var1] = this.field2006;
        }
    }

    @ObfuscatedName("do.g(I)V")
    public void method2419() {
        for (int var1 = 0; var1 < 10; var1++) {
            this.field2009[var1] = 0L;
        }
    }

    @ObfuscatedName("do.s(IIB)I")
    public int method2418(int arg0, int arg1) {
        int var3 = this.field2005;
        int var4 = this.field2010;
        this.field2005 = 300;
        this.field2010 = 1;
        this.field2006 = class103.method494();
        if (this.field2009[this.field2011] == 0L) {
            this.field2005 = var3;
            this.field2010 = var4;
        } else if (this.field2006 > this.field2009[this.field2011]) {
            this.field2005 = (int) ((long) (arg0 * 2560) / (this.field2006 - this.field2009[this.field2011]));
        }
        if (this.field2005 < 25) {
            this.field2005 = 25;
        }
        if (this.field2005 > 256) {
            this.field2005 = 256;
            this.field2010 = (int) ((long) arg0 - (this.field2006 - this.field2009[this.field2011]) / 10L);
        }
        if (this.field2010 > arg0) {
            this.field2010 = arg0;
        }
        this.field2009[this.field2011] = this.field2006;
        this.field2011 = (this.field2011 + 1) % 10;
        if (this.field2010 > 1) {
            for (int var5 = 0; var5 < 10; var5++) {
                if (this.field2009[var5] != 0L) {
                    this.field2009[var5] += (long) this.field2010;
                }
            }
        }
        if (this.field2010 < arg1) {
            this.field2010 = arg1;
        }
        class114.method2036((long) this.field2010);
        int var6 = 0;
        while (this.field2004 < 256) {
            var6++;
            this.field2004 += this.field2005;
        }
        this.field2004 &= 0xFF;
        return var6;
    }
}
