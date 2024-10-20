package deob;

@ObfuscatedName("dh")
public class class110 {

    @ObfuscatedName("dh.a")
    public int field1555 = 2;

    @ObfuscatedName("dh.w")
    public int[] field1546 = new int[2];

    @ObfuscatedName("dh.e")
    public int[] field1547 = new int[2];

    @ObfuscatedName("dh.k")
    public int field1554;

    @ObfuscatedName("dh.u")
    public int field1548;

    @ObfuscatedName("dh.z")
    public int field1550;

    @ObfuscatedName("dh.t")
    public int field1551;

    @ObfuscatedName("dh.f")
    public int field1553;

    @ObfuscatedName("dh.g")
    public int field1545;

    @ObfuscatedName("dh.j")
    public int field1552;

    @ObfuscatedName("dh.c")
    public int field1549;

    public class110() {
        this.field1546[0] = 0;
        this.field1546[1] = 65535;
        this.field1547[0] = 0;
        this.field1547[1] = 65535;
    }

    @ObfuscatedName("dh.a(Lgh;)V")
    public final void method1882(class185 arg0) {
        this.field1550 = arg0.method2962();
        this.field1554 = arg0.method2967();
        this.field1548 = arg0.method2967();
        this.method1886(arg0);
    }

    @ObfuscatedName("dh.w(Lgh;)V")
    public final void method1886(class185 arg0) {
        this.field1555 = arg0.method2962();
        this.field1546 = new int[this.field1555];
        this.field1547 = new int[this.field1555];
        for (int var2 = 0; var2 < this.field1555; var2++) {
            this.field1546[var2] = arg0.method3194();
            this.field1547[var2] = arg0.method3194();
        }
    }

    @ObfuscatedName("dh.e()V")
    public final void method1884() {
        this.field1551 = 0;
        this.field1553 = 0;
        this.field1545 = 0;
        this.field1552 = 0;
        this.field1549 = 0;
    }

    @ObfuscatedName("dh.k(I)I")
    public final int method1885(int arg0) {
        if (this.field1549 >= this.field1551) {
            this.field1552 = this.field1547[this.field1553++] << 15;
            if (this.field1553 >= this.field1555) {
                this.field1553 = this.field1555 - 1;
            }
            this.field1551 = (int) ((double) this.field1546[this.field1553] / 65536.0D * (double) arg0);
            if (this.field1551 > this.field1549) {
                this.field1545 = ((this.field1547[this.field1553] << 15) - this.field1552) / (this.field1551 - this.field1549);
            }
        }
        this.field1552 += this.field1545;
        this.field1549++;
        return this.field1552 - this.field1545 >> 15;
    }
}
