package deob;

@ObfuscatedName("da")
public class class109 {

    @ObfuscatedName("da.d")
    public int field1640 = 2;

    @ObfuscatedName("da.k")
    public int[] field1646 = new int[2];

    @ObfuscatedName("da.e")
    public int[] field1638 = new int[2];

    @ObfuscatedName("da.p")
    public int field1639;

    @ObfuscatedName("da.q")
    public int field1636;

    @ObfuscatedName("da.s")
    public int field1641;

    @ObfuscatedName("da.r")
    public int field1637;

    @ObfuscatedName("da.g")
    public int field1642;

    @ObfuscatedName("da.v")
    public int field1644;

    @ObfuscatedName("da.t")
    public int field1645;

    @ObfuscatedName("da.y")
    public int field1643;

    public class109() {
        this.field1646[0] = 0;
        this.field1646[1] = 65535;
        this.field1638[0] = 0;
        this.field1638[1] = 65535;
    }

    @ObfuscatedName("da.d(Lfg;)V")
    public final void method1964(class174 arg0) {
        this.field1641 = arg0.method2955();
        this.field1639 = arg0.method2960();
        this.field1636 = arg0.method2960();
        this.method1954(arg0);
    }

    @ObfuscatedName("da.k(Lfg;)V")
    public final void method1954(class174 arg0) {
        this.field1640 = arg0.method2955();
        this.field1646 = new int[this.field1640];
        this.field1638 = new int[this.field1640];
        for (int var2 = 0; var2 < this.field1640; var2++) {
            this.field1646[var2] = arg0.method3035();
            this.field1638[var2] = arg0.method3035();
        }
    }

    @ObfuscatedName("da.e()V")
    public final void method1956() {
        this.field1637 = 0;
        this.field1642 = 0;
        this.field1644 = 0;
        this.field1645 = 0;
        this.field1643 = 0;
    }

    @ObfuscatedName("da.p(I)I")
    public final int method1957(int arg0) {
        if (this.field1643 >= this.field1637) {
            this.field1645 = this.field1638[this.field1642++] << 15;
            if (this.field1642 >= this.field1640) {
                this.field1642 = this.field1640 - 1;
            }
            this.field1637 = (int) ((double) this.field1646[this.field1642] / 65536.0D * (double) arg0);
            if (this.field1637 > this.field1643) {
                this.field1644 = ((this.field1638[this.field1642] << 15) - this.field1645) / (this.field1637 - this.field1643);
            }
        }
        this.field1645 += this.field1644;
        this.field1643++;
        return this.field1645 - this.field1644 >> 15;
    }
}
