package deob;

@ObfuscatedName("dq")
public class class110 {

    @ObfuscatedName("dq.i")
    public int field1659 = 2;

    @ObfuscatedName("dq.j")
    public int[] field1665 = new int[2];

    @ObfuscatedName("dq.a")
    public int[] field1657 = new int[2];

    @ObfuscatedName("dq.r")
    public int field1658;

    @ObfuscatedName("dq.o")
    public int field1656;

    @ObfuscatedName("dq.n")
    public int field1660;

    @ObfuscatedName("dq.q")
    public int field1661;

    @ObfuscatedName("dq.b")
    public int field1655;

    @ObfuscatedName("dq.k")
    public int field1662;

    @ObfuscatedName("dq.s")
    public int field1663;

    @ObfuscatedName("dq.d")
    public int field1664;

    public class110() {
        this.field1665[0] = 0;
        this.field1665[1] = 65535;
        this.field1657[0] = 0;
        this.field1657[1] = 65535;
    }

    @ObfuscatedName("dq.i(Lfp;)V")
    public final void method1886(class175 arg0) {
        this.field1660 = arg0.method2999();
        this.field1658 = arg0.method2998();
        this.field1656 = arg0.method2998();
        this.method1888(arg0);
    }

    @ObfuscatedName("dq.j(Lfp;)V")
    public final void method1888(class175 arg0) {
        this.field1659 = arg0.method2999();
        this.field1665 = new int[this.field1659];
        this.field1657 = new int[this.field1659];
        for (int var2 = 0; var2 < this.field1659; var2++) {
            this.field1665[var2] = arg0.method2995();
            this.field1657[var2] = arg0.method2995();
        }
    }

    @ObfuscatedName("dq.a()V")
    public final void method1889() {
        this.field1661 = 0;
        this.field1655 = 0;
        this.field1662 = 0;
        this.field1663 = 0;
        this.field1664 = 0;
    }

    @ObfuscatedName("dq.r(I)I")
    public final int method1890(int arg0) {
        if (this.field1664 >= this.field1661) {
            this.field1663 = this.field1657[this.field1655++] << 15;
            if (this.field1655 >= this.field1659) {
                this.field1655 = this.field1659 - 1;
            }
            this.field1661 = (int) ((double) this.field1665[this.field1655] / 65536.0D * (double) arg0);
            if (this.field1661 > this.field1664) {
                this.field1662 = ((this.field1657[this.field1655] << 15) - this.field1663) / (this.field1661 - this.field1664);
            }
        }
        this.field1663 += this.field1662;
        this.field1664++;
        return this.field1663 - this.field1662 >> 15;
    }
}
