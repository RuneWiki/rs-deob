package deob;

@ObfuscatedName("dx")
public class class109 {

    @ObfuscatedName("dx.d")
    public int field1574 = 2;

    @ObfuscatedName("dx.z")
    public int[] field1583 = new int[2];

    @ObfuscatedName("dx.n")
    public int[] field1573 = new int[2];

    @ObfuscatedName("dx.r")
    public int field1576;

    @ObfuscatedName("dx.e")
    public int field1577;

    @ObfuscatedName("dx.y")
    public int field1575;

    @ObfuscatedName("dx.k")
    public int field1578;

    @ObfuscatedName("dx.s")
    public int field1579;

    @ObfuscatedName("dx.p")
    public int field1580;

    @ObfuscatedName("dx.m")
    public int field1581;

    @ObfuscatedName("dx.h")
    public int field1582;

    public class109() {
        this.field1583[0] = 0;
        this.field1583[1] = 65535;
        this.field1573[0] = 0;
        this.field1573[1] = 65535;
    }

    @ObfuscatedName("dx.d(Lgy;)V")
    public final void method2116(class195 arg0) {
        this.field1578 = arg0.method3330();
        this.field1576 = arg0.method3264();
        this.field1577 = arg0.method3264();
        this.method2117(arg0);
    }

    @ObfuscatedName("dx.z(Lgy;)V")
    public final void method2117(class195 arg0) {
        this.field1574 = arg0.method3330();
        this.field1583 = new int[this.field1574];
        this.field1573 = new int[this.field1574];
        for (int var2 = 0; var2 < this.field1574; var2++) {
            this.field1583[var2] = arg0.method3269();
            this.field1573[var2] = arg0.method3269();
        }
    }

    @ObfuscatedName("dx.n()V")
    public final void method2118() {
        this.field1579 = 0;
        this.field1580 = 0;
        this.field1581 = 0;
        this.field1582 = 0;
        this.field1575 = 0;
    }

    @ObfuscatedName("dx.r(I)I")
    public final int method2119(int arg0) {
        if (this.field1575 >= this.field1579) {
            this.field1582 = this.field1573[this.field1580++] << 15;
            if (this.field1580 >= this.field1574) {
                this.field1580 = this.field1574 - 1;
            }
            this.field1579 = (int) ((double) this.field1583[this.field1580] / 65536.0D * (double) arg0);
            if (this.field1579 > this.field1575) {
                this.field1581 = ((this.field1573[this.field1580] << 15) - this.field1582) / (this.field1579 - this.field1575);
            }
        }
        this.field1582 += this.field1581;
        this.field1575++;
        return this.field1582 - this.field1581 >> 15;
    }
}
