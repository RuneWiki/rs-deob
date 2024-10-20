package deob;

@ObfuscatedName("dp")
public class class112 {

    @ObfuscatedName("dp.j")
    public int field1655 = 2;

    @ObfuscatedName("dp.h")
    public int[] field1653 = new int[2];

    @ObfuscatedName("dp.f")
    public int[] field1658 = new int[2];

    @ObfuscatedName("dp.p")
    public int field1656;

    @ObfuscatedName("dp.g")
    public int field1657;

    @ObfuscatedName("dp.c")
    public int field1654;

    @ObfuscatedName("dp.l")
    public int field1659;

    @ObfuscatedName("dp.w")
    public int field1660;

    @ObfuscatedName("dp.b")
    public int field1661;

    @ObfuscatedName("dp.o")
    public int field1662;

    @ObfuscatedName("dp.m")
    public int field1663;

    public class112() {
        this.field1653[0] = 0;
        this.field1653[1] = 65535;
        this.field1658[0] = 0;
        this.field1658[1] = 65535;
    }

    @ObfuscatedName("dp.j(Lfb;)V")
    public final void method1908(class175 arg0) {
        this.field1654 = arg0.method2903();
        this.field1656 = arg0.method2908();
        this.field1657 = arg0.method2908();
        this.method1917(arg0);
    }

    @ObfuscatedName("dp.h(Lfb;)V")
    public final void method1917(class175 arg0) {
        this.field1655 = arg0.method2903();
        this.field1653 = new int[this.field1655];
        this.field1658 = new int[this.field1655];
        for (int var2 = 0; var2 < this.field1655; var2++) {
            this.field1653[var2] = arg0.method3023();
            this.field1658[var2] = arg0.method3023();
        }
    }

    @ObfuscatedName("dp.f()V")
    public final void method1909() {
        this.field1659 = 0;
        this.field1660 = 0;
        this.field1661 = 0;
        this.field1662 = 0;
        this.field1663 = 0;
    }

    @ObfuscatedName("dp.p(I)I")
    public final int method1910(int arg0) {
        if (this.field1663 >= this.field1659) {
            this.field1662 = this.field1658[this.field1660++] << 15;
            if (this.field1660 >= this.field1655) {
                this.field1660 = this.field1655 - 1;
            }
            this.field1659 = (int) ((double) this.field1653[this.field1660] / 65536.0D * (double) arg0);
            if (this.field1659 > this.field1663) {
                this.field1661 = ((this.field1658[this.field1660] << 15) - this.field1662) / (this.field1659 - this.field1663);
            }
        }
        this.field1662 += this.field1661;
        this.field1663++;
        return this.field1662 - this.field1661 >> 15;
    }
}
