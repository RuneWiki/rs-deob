package deob;

@ObfuscatedName("dd")
public class class111 {

    @ObfuscatedName("dd.s")
    public int field1652 = 2;

    @ObfuscatedName("dd.c")
    public int[] field1644 = new int[2];

    @ObfuscatedName("dd.f")
    public int[] field1643 = new int[2];

    @ObfuscatedName("dd.m")
    public int field1646;

    @ObfuscatedName("dd.h")
    public int field1653;

    @ObfuscatedName("dd.t")
    public int field1648;

    @ObfuscatedName("dd.p")
    public int field1649;

    @ObfuscatedName("dd.d")
    public int field1650;

    @ObfuscatedName("dd.n")
    public int field1645;

    @ObfuscatedName("dd.z")
    public int field1651;

    @ObfuscatedName("dd.o")
    public int field1647;

    public class111() {
        this.field1644[0] = 0;
        this.field1644[1] = 65535;
        this.field1643[0] = 0;
        this.field1643[1] = 65535;
    }

    @ObfuscatedName("dd.s(Lfs;)V")
    public final void method1927(class177 arg0) {
        this.field1648 = arg0.method2965();
        this.field1646 = arg0.method2970();
        this.field1653 = arg0.method2970();
        this.method1935(arg0);
    }

    @ObfuscatedName("dd.c(Lfs;)V")
    public final void method1935(class177 arg0) {
        this.field1652 = arg0.method2965();
        this.field1644 = new int[this.field1652];
        this.field1643 = new int[this.field1652];
        for (int var2 = 0; var2 < this.field1652; var2++) {
            this.field1644[var2] = arg0.method2967();
            this.field1643[var2] = arg0.method2967();
        }
    }

    @ObfuscatedName("dd.f()V")
    public final void method1926() {
        this.field1649 = 0;
        this.field1650 = 0;
        this.field1645 = 0;
        this.field1651 = 0;
        this.field1647 = 0;
    }

    @ObfuscatedName("dd.m(I)I")
    public final int method1930(int arg0) {
        if (this.field1647 >= this.field1649) {
            this.field1651 = this.field1643[this.field1650++] << 15;
            if (this.field1650 >= this.field1652) {
                this.field1650 = this.field1652 - 1;
            }
            this.field1649 = (int) ((double) this.field1644[this.field1650] / 65536.0D * (double) arg0);
            if (this.field1649 > this.field1647) {
                this.field1645 = ((this.field1643[this.field1650] << 15) - this.field1651) / (this.field1649 - this.field1647);
            }
        }
        this.field1651 += this.field1645;
        this.field1647++;
        return this.field1651 - this.field1645 >> 15;
    }
}
