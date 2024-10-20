package deob;

@ObfuscatedName("dl")
public class class110 {

    @ObfuscatedName("dl.m")
    public int field1577 = 2;

    @ObfuscatedName("dl.p")
    public int[] field1575 = new int[2];

    @ObfuscatedName("dl.i")
    public int[] field1571 = new int[2];

    @ObfuscatedName("dl.j")
    public int field1573;

    @ObfuscatedName("dl.v")
    public int field1574;

    @ObfuscatedName("dl.e")
    public int field1572;

    @ObfuscatedName("dl.l")
    public int field1576;

    @ObfuscatedName("dl.b")
    public int field1579;

    @ObfuscatedName("dl.n")
    public int field1578;

    @ObfuscatedName("dl.c")
    public int field1570;

    @ObfuscatedName("dl.a")
    public int field1580;

    public class110() {
        this.field1575[0] = 0;
        this.field1575[1] = 65535;
        this.field1571[0] = 0;
        this.field1571[1] = 65535;
    }

    @ObfuscatedName("dl.m(Lfv;)V")
    public final void method1968(class181 arg0) {
        this.field1572 = arg0.method3012();
        this.field1573 = arg0.method3017();
        this.field1574 = arg0.method3017();
        this.method1967(arg0);
    }

    @ObfuscatedName("dl.p(Lfv;)V")
    public final void method1967(class181 arg0) {
        this.field1577 = arg0.method3012();
        this.field1575 = new int[this.field1577];
        this.field1571 = new int[this.field1577];
        for (int var2 = 0; var2 < this.field1577; var2++) {
            this.field1575[var2] = arg0.method3009();
            this.field1571[var2] = arg0.method3009();
        }
    }

    @ObfuscatedName("dl.i()V")
    public final void method1970() {
        this.field1576 = 0;
        this.field1579 = 0;
        this.field1578 = 0;
        this.field1570 = 0;
        this.field1580 = 0;
    }

    @ObfuscatedName("dl.j(I)I")
    public final int method1971(int arg0) {
        if (this.field1580 >= this.field1576) {
            this.field1570 = this.field1571[this.field1579++] << 15;
            if (this.field1579 >= this.field1577) {
                this.field1579 = this.field1577 - 1;
            }
            this.field1576 = (int) ((double) this.field1575[this.field1579] / 65536.0D * (double) arg0);
            if (this.field1576 > this.field1580) {
                this.field1578 = ((this.field1571[this.field1579] << 15) - this.field1570) / (this.field1576 - this.field1580);
            }
        }
        this.field1570 += this.field1578;
        this.field1580++;
        return this.field1570 - this.field1578 >> 15;
    }
}
