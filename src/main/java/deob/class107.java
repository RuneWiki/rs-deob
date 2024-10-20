package deob;

@ObfuscatedName("ds")
public class class107 {

    @ObfuscatedName("ds.c")
    public int field1421 = 2;

    @ObfuscatedName("ds.t")
    public int[] field1415 = new int[2];

    @ObfuscatedName("ds.o")
    public int[] field1416 = new int[2];

    @ObfuscatedName("ds.e")
    public int field1424;

    @ObfuscatedName("ds.i")
    public int field1418;

    @ObfuscatedName("ds.g")
    public int field1417;

    @ObfuscatedName("ds.d")
    public int field1420;

    @ObfuscatedName("ds.l")
    public int field1414;

    @ObfuscatedName("ds.j")
    public int field1422;

    @ObfuscatedName("ds.m")
    public int field1423;

    @ObfuscatedName("ds.p")
    public int field1419;

    public class107() {
        this.field1415[0] = 0;
        this.field1415[1] = 65535;
        this.field1416[0] = 0;
        this.field1416[1] = 65535;
    }

    @ObfuscatedName("ds.c(Lkp;)V")
    public final void method2322(class301 arg0) {
        this.field1417 = arg0.method5129();
        this.field1424 = arg0.method5134();
        this.field1418 = arg0.method5134();
        this.method2323(arg0);
    }

    @ObfuscatedName("ds.t(Lkp;)V")
    public final void method2323(class301 arg0) {
        this.field1421 = arg0.method5129();
        this.field1415 = new int[this.field1421];
        this.field1416 = new int[this.field1421];
        for (int var2 = 0; var2 < this.field1421; var2++) {
            this.field1415[var2] = arg0.method5124();
            this.field1416[var2] = arg0.method5124();
        }
    }

    @ObfuscatedName("ds.o()V")
    public final void method2324() {
        this.field1420 = 0;
        this.field1414 = 0;
        this.field1422 = 0;
        this.field1423 = 0;
        this.field1419 = 0;
    }

    @ObfuscatedName("ds.e(I)I")
    public final int method2331(int arg0) {
        if (this.field1419 >= this.field1420) {
            this.field1423 = this.field1416[this.field1414++] << 15;
            if (this.field1414 >= this.field1421) {
                this.field1414 = this.field1421 - 1;
            }
            this.field1420 = (int) ((double) this.field1415[this.field1414] / 65536.0D * (double) arg0);
            if (this.field1420 > this.field1419) {
                this.field1422 = ((this.field1416[this.field1414] << 15) - this.field1423) / (this.field1420 - this.field1419);
            }
        }
        this.field1423 += this.field1422;
        this.field1419++;
        return this.field1423 - this.field1422 >> 15;
    }
}
