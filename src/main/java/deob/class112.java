package deob;

@ObfuscatedName("dd")
public class class112 {

    @ObfuscatedName("dd.e")
    public int field1645 = 2;

    @ObfuscatedName("dd.n")
    public int[] field1638 = new int[2];

    @ObfuscatedName("dd.g")
    public int[] field1639 = new int[2];

    @ObfuscatedName("dd.y")
    public int field1647;

    @ObfuscatedName("dd.w")
    public int field1640;

    @ObfuscatedName("dd.k")
    public int field1641;

    @ObfuscatedName("dd.v")
    public int field1643;

    @ObfuscatedName("dd.z")
    public int field1644;

    @ObfuscatedName("dd.r")
    public int field1637;

    @ObfuscatedName("dd.u")
    public int field1642;

    @ObfuscatedName("dd.d")
    public int field1646;

    public class112() {
        this.field1638[0] = 0;
        this.field1638[1] = 65535;
        this.field1639[0] = 0;
        this.field1639[1] = 65535;
    }

    @ObfuscatedName("dd.e(Lfh;)V")
    public final void method1927(class175 arg0) {
        this.field1643 = arg0.method2928();
        this.field1640 = arg0.method2933();
        this.field1641 = arg0.method2933();
        this.method1925(arg0);
    }

    @ObfuscatedName("dd.n(Lfh;)V")
    public final void method1925(class175 arg0) {
        this.field1645 = arg0.method2928();
        this.field1638 = new int[this.field1645];
        this.field1639 = new int[this.field1645];
        for (int var2 = 0; var2 < this.field1645; var2++) {
            this.field1638[var2] = arg0.method3091();
            this.field1639[var2] = arg0.method3091();
        }
    }

    @ObfuscatedName("dd.g()V")
    public final void method1928() {
        this.field1644 = 0;
        this.field1637 = 0;
        this.field1642 = 0;
        this.field1646 = 0;
        this.field1647 = 0;
    }

    @ObfuscatedName("dd.y(I)I")
    public final int method1926(int arg0) {
        if (this.field1647 >= this.field1644) {
            this.field1646 = this.field1639[this.field1637++] << 15;
            if (this.field1637 >= this.field1645) {
                this.field1637 = this.field1645 - 1;
            }
            this.field1644 = (int) ((double) this.field1638[this.field1637] / 65536.0D * (double) arg0);
            if (this.field1644 > this.field1647) {
                this.field1642 = ((this.field1639[this.field1637] << 15) - this.field1646) / (this.field1644 - this.field1647);
            }
        }
        this.field1646 += this.field1642;
        this.field1647++;
        return this.field1646 - this.field1642 >> 15;
    }
}
