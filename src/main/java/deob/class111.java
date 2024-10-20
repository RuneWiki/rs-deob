package deob;

@ObfuscatedName("dd")
public class class111 {

    @ObfuscatedName("dd.n")
    public int field1663 = 2;

    @ObfuscatedName("dd.p")
    public int[] field1657 = new int[2];

    @ObfuscatedName("dd.i")
    public int[] field1658 = new int[2];

    @ObfuscatedName("dd.j")
    public int field1659;

    @ObfuscatedName("dd.f")
    public int field1660;

    @ObfuscatedName("dd.m")
    public int field1661;

    @ObfuscatedName("dd.c")
    public int field1662;

    @ObfuscatedName("dd.z")
    public int field1664;

    @ObfuscatedName("dd.h")
    public int field1656;

    @ObfuscatedName("dd.g")
    public int field1665;

    @ObfuscatedName("dd.e")
    public int field1666;

    public class111() {
        this.field1657[0] = 0;
        this.field1657[1] = 65535;
        this.field1658[0] = 0;
        this.field1658[1] = 65535;
    }

    @ObfuscatedName("dd.n(Lfl;)V")
    public final void method1902(class174 arg0) {
        this.field1661 = arg0.method2925();
        this.field1659 = arg0.method3058();
        this.field1660 = arg0.method3058();
        this.method1903(arg0);
    }

    @ObfuscatedName("dd.p(Lfl;)V")
    public final void method1903(class174 arg0) {
        this.field1663 = arg0.method2925();
        this.field1657 = new int[this.field1663];
        this.field1658 = new int[this.field1663];
        for (int var2 = 0; var2 < this.field1663; var2++) {
            this.field1657[var2] = arg0.method3065();
            this.field1658[var2] = arg0.method3065();
        }
    }

    @ObfuscatedName("dd.i()V")
    public final void method1904() {
        this.field1662 = 0;
        this.field1664 = 0;
        this.field1656 = 0;
        this.field1665 = 0;
        this.field1666 = 0;
    }

    @ObfuscatedName("dd.j(I)I")
    public final int method1905(int arg0) {
        if (this.field1666 >= this.field1662) {
            this.field1665 = this.field1658[this.field1664++] << 15;
            if (this.field1664 >= this.field1663) {
                this.field1664 = this.field1663 - 1;
            }
            this.field1662 = (int) ((double) this.field1657[this.field1664] / 65536.0D * (double) arg0);
            if (this.field1662 > this.field1666) {
                this.field1656 = ((this.field1658[this.field1664] << 15) - this.field1665) / (this.field1662 - this.field1666);
            }
        }
        this.field1665 += this.field1656;
        this.field1666++;
        return this.field1665 - this.field1656 >> 15;
    }
}
