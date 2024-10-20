package deob;

@ObfuscatedName("dn")
public class class109 {

    @ObfuscatedName("dn.c")
    public int field1582 = 2;

    @ObfuscatedName("dn.i")
    public int[] field1573 = new int[2];

    @ObfuscatedName("dn.o")
    public int[] field1574 = new int[2];

    @ObfuscatedName("dn.j")
    public int field1575;

    @ObfuscatedName("dn.k")
    public int field1577;

    @ObfuscatedName("dn.z")
    public int field1576;

    @ObfuscatedName("dn.p")
    public int field1578;

    @ObfuscatedName("dn.w")
    public int field1579;

    @ObfuscatedName("dn.r")
    public int field1580;

    @ObfuscatedName("dn.d")
    public int field1581;

    @ObfuscatedName("dn.a")
    public int field1572;

    public class109() {
        this.field1573[0] = 0;
        this.field1573[1] = 65535;
        this.field1574[0] = 0;
        this.field1574[1] = 65535;
    }

    @ObfuscatedName("dn.c(Lgp;)V")
    public final void method2072(class195 arg0) {
        this.field1576 = arg0.method3429();
        this.field1575 = arg0.method3230();
        this.field1577 = arg0.method3230();
        this.method2068(arg0);
    }

    @ObfuscatedName("dn.i(Lgp;)V")
    public final void method2068(class195 arg0) {
        this.field1582 = arg0.method3429();
        this.field1573 = new int[this.field1582];
        this.field1574 = new int[this.field1582];
        for (int var2 = 0; var2 < this.field1582; var2++) {
            this.field1573[var2] = arg0.method3218();
            this.field1574[var2] = arg0.method3218();
        }
    }

    @ObfuscatedName("dn.o()V")
    public final void method2070() {
        this.field1578 = 0;
        this.field1579 = 0;
        this.field1580 = 0;
        this.field1581 = 0;
        this.field1572 = 0;
    }

    @ObfuscatedName("dn.j(I)I")
    public final int method2069(int arg0) {
        if (this.field1572 >= this.field1578) {
            this.field1581 = this.field1574[this.field1579++] << 15;
            if (this.field1579 >= this.field1582) {
                this.field1579 = this.field1582 - 1;
            }
            this.field1578 = (int) ((double) this.field1573[this.field1579] / 65536.0D * (double) arg0);
            if (this.field1578 > this.field1572) {
                this.field1580 = ((this.field1574[this.field1579] << 15) - this.field1581) / (this.field1578 - this.field1572);
            }
        }
        this.field1581 += this.field1580;
        this.field1572++;
        return this.field1581 - this.field1580 >> 15;
    }
}
