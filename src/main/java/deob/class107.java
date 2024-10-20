package deob;

@ObfuscatedName("do")
public class class107 {

    @ObfuscatedName("do.c")
    public int field1394 = 2;

    @ObfuscatedName("do.t")
    public int[] field1393 = new int[2];

    @ObfuscatedName("do.g")
    public int[] field1397 = new int[2];

    @ObfuscatedName("do.l")
    public int field1402;

    @ObfuscatedName("do.u")
    public int field1396;

    @ObfuscatedName("do.j")
    public int field1395;

    @ObfuscatedName("do.v")
    public int field1398;

    @ObfuscatedName("do.d")
    public int field1399;

    @ObfuscatedName("do.z")
    public int field1400;

    @ObfuscatedName("do.n")
    public int field1401;

    @ObfuscatedName("do.h")
    public int field1392;

    public class107() {
        this.field1393[0] = 0;
        this.field1393[1] = 65535;
        this.field1397[0] = 0;
        this.field1397[1] = 65535;
    }

    @ObfuscatedName("do.c(Lkz;)V")
    public final void method2283(class300 arg0) {
        this.field1395 = arg0.method5103();
        this.field1402 = arg0.method5208();
        this.field1396 = arg0.method5208();
        this.method2269(arg0);
    }

    @ObfuscatedName("do.x(Lkz;)V")
    public final void method2269(class300 arg0) {
        this.field1394 = arg0.method5103();
        this.field1393 = new int[this.field1394];
        this.field1397 = new int[this.field1394];
        for (int var2 = 0; var2 < this.field1394; var2++) {
            this.field1393[var2] = arg0.method5304();
            this.field1397[var2] = arg0.method5304();
        }
    }

    @ObfuscatedName("do.t()V")
    public final void method2273() {
        this.field1398 = 0;
        this.field1399 = 0;
        this.field1400 = 0;
        this.field1401 = 0;
        this.field1392 = 0;
    }

    @ObfuscatedName("do.g(I)I")
    public final int method2272(int arg0) {
        if (this.field1392 >= this.field1398) {
            this.field1401 = this.field1397[this.field1399++] << 15;
            if (this.field1399 >= this.field1394) {
                this.field1399 = this.field1394 - 1;
            }
            this.field1398 = (int) ((double) this.field1393[this.field1399] / 65536.0D * (double) arg0);
            if (this.field1398 > this.field1392) {
                this.field1400 = ((this.field1397[this.field1399] << 15) - this.field1401) / (this.field1398 - this.field1392);
            }
        }
        this.field1401 += this.field1400;
        this.field1392++;
        return this.field1401 - this.field1400 >> 15;
    }
}
