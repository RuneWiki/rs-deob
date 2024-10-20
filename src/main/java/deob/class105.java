package deob;

@ObfuscatedName("do")
public class class105 {

    @ObfuscatedName("do.f")
    public int field1391 = 2;

    @ObfuscatedName("do.i")
    public int[] field1388 = new int[2];

    @ObfuscatedName("do.y")
    public int field1397;

    @ObfuscatedName("do.w")
    public int[] field1393 = new int[2];

    @ObfuscatedName("do.p")
    public int field1390;

    @ObfuscatedName("do.b")
    public int field1389;

    @ObfuscatedName("do.e")
    public int field1392;

    @ObfuscatedName("do.a")
    public int field1387;

    @ObfuscatedName("do.d")
    public int field1394;

    @ObfuscatedName("do.c")
    public int field1395;

    @ObfuscatedName("do.o")
    public int field1396;

    public class105() {
        this.field1388[0] = 0;
        this.field1388[1] = 65535;
        this.field1393[0] = 0;
        this.field1393[1] = 65535;
    }

    @ObfuscatedName("do.f(Lkq;)V")
    public final void method2273(class300 arg0) {
        this.field1392 = arg0.method5110();
        this.field1390 = arg0.method5192();
        this.field1389 = arg0.method5192();
        this.method2274(arg0);
    }

    @ObfuscatedName("do.i(Lkq;)V")
    public final void method2274(class300 arg0) {
        this.field1391 = arg0.method5110();
        this.field1388 = new int[this.field1391];
        this.field1393 = new int[this.field1391];
        for (int var2 = 0; var2 < this.field1391; var2++) {
            this.field1388[var2] = arg0.method5112();
            this.field1393[var2] = arg0.method5112();
        }
    }

    @ObfuscatedName("do.y()V")
    public final void method2275() {
        this.field1387 = 0;
        this.field1394 = 0;
        this.field1395 = 0;
        this.field1396 = 0;
        this.field1397 = 0;
    }

    @ObfuscatedName("do.w(I)I")
    public final int method2276(int arg0) {
        if (this.field1397 >= this.field1387) {
            this.field1396 = this.field1393[this.field1394++] << 15;
            if (this.field1394 >= this.field1391) {
                this.field1394 = this.field1391 - 1;
            }
            this.field1387 = (int) ((double) this.field1388[this.field1394] / 65536.0D * (double) arg0);
            if (this.field1387 > this.field1397) {
                this.field1395 = ((this.field1393[this.field1394] << 15) - this.field1396) / (this.field1387 - this.field1397);
            }
        }
        this.field1396 += this.field1395;
        this.field1397++;
        return this.field1396 - this.field1395 >> 15;
    }
}
