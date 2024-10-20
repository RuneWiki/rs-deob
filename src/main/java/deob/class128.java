package deob;

@ObfuscatedName("du")
public class class128 extends class120 {

    @ObfuscatedName("du.z")
    public long[] field2011 = new long[10];

    @ObfuscatedName("du.j")
    public int field2004 = 256;

    @ObfuscatedName("du.a")
    public int field2005 = 1;

    @ObfuscatedName("du.y")
    public long field2010 = class103.method26();

    @ObfuscatedName("du.i")
    public int field2007 = 0;

    @ObfuscatedName("du.b")
    public int field2008;

    public class128() {
        for (int var1 = 0; var1 < 10; var1++) {
            this.field2011[var1] = this.field2010;
        }
    }

    @ObfuscatedName("du.z(S)V")
    public void method2457() {
        for (int var1 = 0; var1 < 10; var1++) {
            this.field2011[var1] = 0L;
        }
    }

    @ObfuscatedName("du.j(III)I")
    public int method2458(int arg0, int arg1) {
        int var3 = this.field2004;
        int var4 = this.field2005;
        this.field2004 = 300;
        this.field2005 = 1;
        this.field2010 = class103.method26();
        if (this.field2011[this.field2008] == 0L) {
            this.field2004 = var3;
            this.field2005 = var4;
        } else if (this.field2010 > this.field2011[this.field2008]) {
            this.field2004 = (int) ((long) (arg0 * 2560) / (this.field2010 - this.field2011[this.field2008]));
        }
        if (this.field2004 < 25) {
            this.field2004 = 25;
        }
        if (this.field2004 > 256) {
            this.field2004 = 256;
            this.field2005 = (int) ((long) arg0 - (this.field2010 - this.field2011[this.field2008]) / 10L);
        }
        if (this.field2005 > arg0) {
            this.field2005 = arg0;
        }
        this.field2011[this.field2008] = this.field2010;
        this.field2008 = (this.field2008 + 1) % 10;
        if (this.field2005 > 1) {
            for (int var5 = 0; var5 < 10; var5++) {
                if (this.field2011[var5] != 0L) {
                    this.field2011[var5] += (long) this.field2005;
                }
            }
        }
        if (this.field2005 < arg1) {
            this.field2005 = arg1;
        }
        class114.method1960((long) this.field2005);
        int var6 = 0;
        while (this.field2007 < 256) {
            var6++;
            this.field2007 += this.field2004;
        }
        this.field2007 &= 0xFF;
        return var6;
    }
}
