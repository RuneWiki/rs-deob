package deob;

@ObfuscatedName("dr")
public class class116 {

    @ObfuscatedName("dr.h")
    public int field1455 = 2;

    @ObfuscatedName("dr.v")
    public int[] field1446 = new int[2];

    @ObfuscatedName("dr.w")
    public int[] field1454 = new int[2];

    @ObfuscatedName("dr.t")
    public int field1448;

    @ObfuscatedName("dr.j")
    public int field1449;

    @ObfuscatedName("dr.n")
    public int field1445;

    @ObfuscatedName("dr.p")
    public int field1451;

    @ObfuscatedName("dr.l")
    public int field1452;

    @ObfuscatedName("dr.z")
    public int field1453;

    @ObfuscatedName("dr.u")
    public int field1450;

    @ObfuscatedName("dr.e")
    public int field1447;

    public class116() {
        this.field1446[0] = 0;
        this.field1446[1] = 65535;
        this.field1454[0] = 0;
        this.field1454[1] = 65535;
    }

    @ObfuscatedName("dr.h(Lkj;)V")
    public final void method2367(class311 arg0) {
        this.field1445 = arg0.method5274();
        this.field1448 = arg0.method5120();
        this.field1449 = arg0.method5120();
        this.method2356(arg0);
    }

    @ObfuscatedName("dr.v(Lkj;)V")
    public final void method2356(class311 arg0) {
        this.field1455 = arg0.method5274();
        this.field1446 = new int[this.field1455];
        this.field1454 = new int[this.field1455];
        for (int var2 = 0; var2 < this.field1455; var2++) {
            this.field1446[var2] = arg0.method5342();
            this.field1454[var2] = arg0.method5342();
        }
    }

    @ObfuscatedName("dr.x()V")
    public final void method2357() {
        this.field1451 = 0;
        this.field1452 = 0;
        this.field1453 = 0;
        this.field1450 = 0;
        this.field1447 = 0;
    }

    @ObfuscatedName("dr.w(I)I")
    public final int method2358(int arg0) {
        if (this.field1447 >= this.field1451) {
            this.field1450 = this.field1454[this.field1452++] << 15;
            if (this.field1452 >= this.field1455) {
                this.field1452 = this.field1455 - 1;
            }
            this.field1451 = (int) ((double) this.field1446[this.field1452] / 65536.0D * (double) arg0);
            if (this.field1451 > this.field1447) {
                this.field1453 = ((this.field1454[this.field1452] << 15) - this.field1450) / (this.field1451 - this.field1447);
            }
        }
        this.field1450 += this.field1453;
        this.field1447++;
        return this.field1450 - this.field1453 >> 15;
    }
}
