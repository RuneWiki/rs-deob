package deob;

@ObfuscatedName("dr")
public class class111 {

    @ObfuscatedName("dr.w")
    public int field1655 = 2;

    @ObfuscatedName("dr.o")
    public int[] field1660 = new int[2];

    @ObfuscatedName("dr.k")
    public int[] field1659 = new int[2];

    @ObfuscatedName("dr.f")
    public int field1661;

    @ObfuscatedName("dr.i")
    public int field1658;

    @ObfuscatedName("dr.j")
    public int field1657;

    @ObfuscatedName("dr.m")
    public int field1656;

    @ObfuscatedName("dr.u")
    public int field1654;

    @ObfuscatedName("dr.r")
    public int field1662;

    @ObfuscatedName("dr.v")
    public int field1663;

    @ObfuscatedName("dr.h")
    public int field1664;

    public class111() {
        this.field1660[0] = 0;
        this.field1660[1] = 65535;
        this.field1659[0] = 0;
        this.field1659[1] = 65535;
    }

    @ObfuscatedName("dr.w(Lfi;)V")
    public final void method1852(class177 arg0) {
        this.field1657 = arg0.method2931();
        this.field1661 = arg0.method2904();
        this.field1658 = arg0.method2904();
        this.method1853(arg0);
    }

    @ObfuscatedName("dr.o(Lfi;)V")
    public final void method1853(class177 arg0) {
        this.field1655 = arg0.method2931();
        this.field1660 = new int[this.field1655];
        this.field1659 = new int[this.field1655];
        for (int var2 = 0; var2 < this.field1655; var2++) {
            this.field1660[var2] = arg0.method2886();
            this.field1659[var2] = arg0.method2886();
        }
    }

    @ObfuscatedName("dr.x()V")
    public final void method1858() {
        this.field1656 = 0;
        this.field1654 = 0;
        this.field1662 = 0;
        this.field1663 = 0;
        this.field1664 = 0;
    }

    @ObfuscatedName("dr.k(I)I")
    public final int method1855(int arg0) {
        if (this.field1664 >= this.field1656) {
            this.field1663 = this.field1659[this.field1654++] << 15;
            if (this.field1654 >= this.field1655) {
                this.field1654 = this.field1655 - 1;
            }
            this.field1656 = (int) ((double) this.field1660[this.field1654] / 65536.0D * (double) arg0);
            if (this.field1656 > this.field1664) {
                this.field1662 = ((this.field1659[this.field1654] << 15) - this.field1663) / (this.field1656 - this.field1664);
            }
        }
        this.field1663 += this.field1662;
        this.field1664++;
        return this.field1663 - this.field1662 >> 15;
    }
}
