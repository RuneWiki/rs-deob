package deob;

@ObfuscatedName("ds")
public class class116 {

    @ObfuscatedName("ds.n")
    public int field1448 = 2;

    @ObfuscatedName("ds.v")
    public int[] field1443 = new int[2];

    @ObfuscatedName("ds.d")
    public int[] field1444 = new int[2];

    @ObfuscatedName("ds.c")
    public int field1447;

    @ObfuscatedName("ds.y")
    public int field1452;

    @ObfuscatedName("ds.h")
    public int field1446;

    @ObfuscatedName("ds.z")
    public int field1449;

    @ObfuscatedName("ds.e")
    public int field1445;

    @ObfuscatedName("ds.q")
    public int field1442;

    @ObfuscatedName("ds.l")
    public int field1450;

    @ObfuscatedName("ds.s")
    public int field1451;

    public class116() {
        this.field1443[0] = 0;
        this.field1443[1] = 65535;
        this.field1444[0] = 0;
        this.field1444[1] = 65535;
    }

    @ObfuscatedName("ds.n(Lkx;)V")
    public final void method2457(class311 arg0) {
        this.field1449 = arg0.method5310();
        this.field1447 = arg0.method5455();
        this.field1446 = arg0.method5455();
        this.method2458(arg0);
    }

    @ObfuscatedName("ds.v(Lkx;)V")
    public final void method2458(class311 arg0) {
        this.field1448 = arg0.method5310();
        this.field1443 = new int[this.field1448];
        this.field1444 = new int[this.field1448];
        for (int var2 = 0; var2 < this.field1448; var2++) {
            this.field1443[var2] = arg0.method5247();
            this.field1444[var2] = arg0.method5247();
        }
    }

    @ObfuscatedName("ds.d()V")
    public final void method2459() {
        this.field1445 = 0;
        this.field1442 = 0;
        this.field1450 = 0;
        this.field1451 = 0;
        this.field1452 = 0;
    }

    @ObfuscatedName("ds.c(I)I")
    public final int method2460(int arg0) {
        if (this.field1452 >= this.field1445) {
            this.field1451 = this.field1444[this.field1442++] << 15;
            if (this.field1442 >= this.field1448) {
                this.field1442 = this.field1448 - 1;
            }
            this.field1445 = (int) ((double) this.field1443[this.field1442] / 65536.0D * (double) arg0);
            if (this.field1445 > this.field1452) {
                this.field1450 = ((this.field1444[this.field1442] << 15) - this.field1451) / (this.field1445 - this.field1452);
            }
        }
        this.field1451 += this.field1450;
        this.field1452++;
        return this.field1451 - this.field1450 >> 15;
    }
}
