package deob;

@ObfuscatedName("dz")
public class class128 extends class120 {

    @ObfuscatedName("dz.n")
    public long[] field2011 = new long[10];

    @ObfuscatedName("dz.x")
    public int field2005 = 256;

    @ObfuscatedName("dz.k")
    public int field2003 = 1;

    @ObfuscatedName("dz.i")
    public long field2004 = class103.method1066();

    @ObfuscatedName("dz.d")
    public int field2001 = 0;

    @ObfuscatedName("dz.q")
    public int field2006;

    public class128() {
        for (int var1 = 0; var1 < 10; var1++) {
            this.field2011[var1] = this.field2004;
        }
    }

    @ObfuscatedName("dz.n(I)V")
    public void method2425() {
        for (int var1 = 0; var1 < 10; var1++) {
            this.field2011[var1] = 0L;
        }
    }

    @ObfuscatedName("dz.x(IIB)I")
    public int method2426(int arg0, int arg1) {
        int var3 = this.field2005;
        int var4 = this.field2003;
        this.field2005 = 300;
        this.field2003 = 1;
        this.field2004 = class103.method1066();
        if (this.field2011[this.field2006] == 0L) {
            this.field2005 = var3;
            this.field2003 = var4;
        } else if (this.field2004 > this.field2011[this.field2006]) {
            this.field2005 = (int) ((long) (arg0 * 2560) / (this.field2004 - this.field2011[this.field2006]));
        }
        if (this.field2005 < 25) {
            this.field2005 = 25;
        }
        if (this.field2005 > 256) {
            this.field2005 = 256;
            this.field2003 = (int) ((long) arg0 - (this.field2004 - this.field2011[this.field2006]) / 10L);
        }
        if (this.field2003 > arg0) {
            this.field2003 = arg0;
        }
        this.field2011[this.field2006] = this.field2004;
        this.field2006 = (this.field2006 + 1) % 10;
        if (this.field2003 > 1) {
            for (int var5 = 0; var5 < 10; var5++) {
                if (this.field2011[var5] != 0L) {
                    this.field2011[var5] += (long) this.field2003;
                }
            }
        }
        if (this.field2003 < arg1) {
            this.field2003 = arg1;
        }
        class114.method25((long) this.field2003);
        int var6 = 0;
        while (this.field2001 < 256) {
            var6++;
            this.field2001 += this.field2005;
        }
        this.field2001 &= 0xFF;
        return var6;
    }
}
