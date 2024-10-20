package deob;

@ObfuscatedName("ds")
public class class128 extends class120 {

    @ObfuscatedName("ds.t")
    public long[] field1991 = new long[10];

    @ObfuscatedName("ds.o")
    public int field1993 = 256;

    @ObfuscatedName("ds.i")
    public int field1999 = 1;

    @ObfuscatedName("ds.p")
    public long field1992 = class103.method1861();

    @ObfuscatedName("ds.c")
    public int field1995 = 0;

    @ObfuscatedName("ds.y")
    public int field1996;

    public class128() {
        for (int var1 = 0; var1 < 10; var1++) {
            this.field1991[var1] = this.field1992;
        }
    }

    @ObfuscatedName("ds.o(I)V")
    public void method2427() {
        for (int var1 = 0; var1 < 10; var1++) {
            this.field1991[var1] = 0L;
        }
    }

    @ObfuscatedName("ds.i(III)I")
    public int method2426(int arg0, int arg1) {
        int var3 = this.field1993;
        int var4 = this.field1999;
        this.field1993 = 300;
        this.field1999 = 1;
        this.field1992 = class103.method1861();
        if (this.field1991[this.field1996] == 0L) {
            this.field1993 = var3;
            this.field1999 = var4;
        } else if (this.field1992 > this.field1991[this.field1996]) {
            this.field1993 = (int) ((long) (arg0 * 2560) / (this.field1992 - this.field1991[this.field1996]));
        }
        if (this.field1993 < 25) {
            this.field1993 = 25;
        }
        if (this.field1993 > 256) {
            this.field1993 = 256;
            this.field1999 = (int) ((long) arg0 - (this.field1992 - this.field1991[this.field1996]) / 10L);
        }
        if (this.field1999 > arg0) {
            this.field1999 = arg0;
        }
        this.field1991[this.field1996] = this.field1992;
        this.field1996 = (this.field1996 + 1) % 10;
        if (this.field1999 > 1) {
            for (int var5 = 0; var5 < 10; var5++) {
                if (this.field1991[var5] != 0L) {
                    this.field1991[var5] += (long) this.field1999;
                }
            }
        }
        if (this.field1999 < arg1) {
            this.field1999 = arg1;
        }
        class114.method1854((long) this.field1999);
        int var6 = 0;
        while (this.field1995 < 256) {
            var6++;
            this.field1995 += this.field1993;
        }
        this.field1995 &= 0xFF;
        return var6;
    }
}
