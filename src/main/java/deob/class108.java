package deob;

@ObfuscatedName("dk")
public class class108 {

    @ObfuscatedName("dk.p")
    public int field1542 = 2;

    @ObfuscatedName("dk.i")
    public int[] field1537 = new int[2];

    @ObfuscatedName("dk.w")
    public int[] field1541 = new int[2];

    @ObfuscatedName("dk.s")
    public int field1539;

    @ObfuscatedName("dk.j")
    public int field1540;

    @ObfuscatedName("dk.a")
    public int field1543;

    @ObfuscatedName("dk.t")
    public int field1538;

    @ObfuscatedName("dk.r")
    public int field1536;

    @ObfuscatedName("dk.m")
    public int field1544;

    @ObfuscatedName("dk.h")
    public int field1545;

    @ObfuscatedName("dk.o")
    public int field1546;

    public class108() {
        this.field1537[0] = 0;
        this.field1537[1] = 65535;
        this.field1541[0] = 0;
        this.field1541[1] = 65535;
    }

    @ObfuscatedName("dk.p(Lgj;)V")
    public final void method2075(class185 arg0) {
        this.field1543 = arg0.method3197();
        this.field1539 = arg0.method3127();
        this.field1540 = arg0.method3127();
        this.method2071(arg0);
    }

    @ObfuscatedName("dk.i(Lgj;)V")
    public final void method2071(class185 arg0) {
        this.field1542 = arg0.method3197();
        this.field1537 = new int[this.field1542];
        this.field1541 = new int[this.field1542];
        for (int var2 = 0; var2 < this.field1542; var2++) {
            this.field1537[var2] = arg0.method3124();
            this.field1541[var2] = arg0.method3124();
        }
    }

    @ObfuscatedName("dk.w()V")
    public final void method2073() {
        this.field1538 = 0;
        this.field1536 = 0;
        this.field1544 = 0;
        this.field1545 = 0;
        this.field1546 = 0;
    }

    @ObfuscatedName("dk.s(I)I")
    public final int method2074(int arg0) {
        if (this.field1546 >= this.field1538) {
            this.field1545 = this.field1541[this.field1536++] << 15;
            if (this.field1536 >= this.field1542) {
                this.field1536 = this.field1542 - 1;
            }
            this.field1538 = (int) ((double) this.field1537[this.field1536] / 65536.0D * (double) arg0);
            if (this.field1538 > this.field1546) {
                this.field1544 = ((this.field1541[this.field1536] << 15) - this.field1545) / (this.field1538 - this.field1546);
            }
        }
        this.field1545 += this.field1544;
        this.field1546++;
        return this.field1545 - this.field1544 >> 15;
    }
}
