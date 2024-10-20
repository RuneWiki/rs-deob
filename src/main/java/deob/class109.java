package deob;

@ObfuscatedName("dl")
public class class109 {

    @ObfuscatedName("dl.o")
    public int field1598 = 2;

    @ObfuscatedName("dl.k")
    public int[] field1589 = new int[2];

    @ObfuscatedName("dl.t")
    public int[] field1590 = new int[2];

    @ObfuscatedName("dl.d")
    public int field1588;

    @ObfuscatedName("dl.h")
    public int field1592;

    @ObfuscatedName("dl.m")
    public int field1593;

    @ObfuscatedName("dl.z")
    public int field1596;

    @ObfuscatedName("dl.i")
    public int field1594;

    @ObfuscatedName("dl.u")
    public int field1597;

    @ObfuscatedName("dl.y")
    public int field1595;

    @ObfuscatedName("dl.a")
    public int field1591;

    public class109() {
        this.field1589[0] = 0;
        this.field1589[1] = 65535;
        this.field1590[0] = 0;
        this.field1590[1] = 65535;
    }

    @ObfuscatedName("dl.o(Lgc;)V")
    public final void method2063(class195 arg0) {
        this.field1593 = arg0.method3205();
        this.field1588 = arg0.method3254();
        this.field1592 = arg0.method3254();
        this.method2064(arg0);
    }

    @ObfuscatedName("dl.k(Lgc;)V")
    public final void method2064(class195 arg0) {
        this.field1598 = arg0.method3205();
        this.field1589 = new int[this.field1598];
        this.field1590 = new int[this.field1598];
        for (int var2 = 0; var2 < this.field1598; var2++) {
            this.field1589[var2] = arg0.method3207();
            this.field1590[var2] = arg0.method3207();
        }
    }

    @ObfuscatedName("dl.t()V")
    public final void method2065() {
        this.field1596 = 0;
        this.field1594 = 0;
        this.field1597 = 0;
        this.field1591 = 0;
        this.field1595 = 0;
    }

    @ObfuscatedName("dl.d(I)I")
    public final int method2066(int arg0) {
        if (this.field1595 >= this.field1596) {
            this.field1591 = this.field1590[this.field1594++] << 15;
            if (this.field1594 >= this.field1598) {
                this.field1594 = this.field1598 - 1;
            }
            this.field1596 = (int) ((double) this.field1589[this.field1594] / 65536.0D * (double) arg0);
            if (this.field1596 > this.field1595) {
                this.field1597 = ((this.field1590[this.field1594] << 15) - this.field1591) / (this.field1596 - this.field1595);
            }
        }
        this.field1591 += this.field1597;
        this.field1595++;
        return this.field1591 - this.field1597 >> 15;
    }
}
