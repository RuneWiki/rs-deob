package deob;

@ObfuscatedName("de")
public class class116 {

    @ObfuscatedName("de.m")
    public int field1454 = 2;

    @ObfuscatedName("de.k")
    public int[] field1444 = new int[2];

    @ObfuscatedName("de.d")
    public int[] field1446 = new int[2];

    @ObfuscatedName("de.w")
    public int field1451;

    @ObfuscatedName("de.v")
    public int field1448;

    @ObfuscatedName("de.q")
    public int field1450;

    @ObfuscatedName("de.z")
    public int field1447;

    @ObfuscatedName("de.t")
    public int field1445;

    @ObfuscatedName("de.e")
    public int field1452;

    @ObfuscatedName("de.s")
    public int field1453;

    @ObfuscatedName("de.p")
    public int field1449;

    public class116() {
        this.field1444[0] = 0;
        this.field1444[1] = 65535;
        this.field1446[0] = 0;
        this.field1446[1] = 65535;
    }

    @ObfuscatedName("de.x(Lkb;)V")
    public final void method2365(class310 arg0) {
        this.field1450 = arg0.method5137();
        this.field1451 = arg0.method5142();
        this.field1448 = arg0.method5142();
        this.method2367(arg0);
    }

    @ObfuscatedName("de.m(Lkb;)V")
    public final void method2367(class310 arg0) {
        this.field1454 = arg0.method5137();
        this.field1444 = new int[this.field1454];
        this.field1446 = new int[this.field1454];
        for (int var2 = 0; var2 < this.field1454; var2++) {
            this.field1444[var2] = arg0.method5139();
            this.field1446[var2] = arg0.method5139();
        }
    }

    @ObfuscatedName("de.k()V")
    public final void method2368() {
        this.field1447 = 0;
        this.field1445 = 0;
        this.field1452 = 0;
        this.field1453 = 0;
        this.field1449 = 0;
    }

    @ObfuscatedName("de.d(I)I")
    public final int method2369(int arg0) {
        if (this.field1449 >= this.field1447) {
            this.field1453 = this.field1446[this.field1445++] << 15;
            if (this.field1445 >= this.field1454) {
                this.field1445 = this.field1454 - 1;
            }
            this.field1447 = (int) ((double) this.field1444[this.field1445] / 65536.0D * (double) arg0);
            if (this.field1447 > this.field1449) {
                this.field1452 = ((this.field1446[this.field1445] << 15) - this.field1453) / (this.field1447 - this.field1449);
            }
        }
        this.field1453 += this.field1452;
        this.field1449++;
        return this.field1453 - this.field1452 >> 15;
    }
}
