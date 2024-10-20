package deob;

@ObfuscatedName("df")
public class class108 {

    @ObfuscatedName("df.b")
    public int field1533 = 2;

    @ObfuscatedName("df.q")
    public int[] field1532 = new int[2];

    @ObfuscatedName("df.o")
    public int[] field1540 = new int[2];

    @ObfuscatedName("df.p")
    public int field1537;

    @ObfuscatedName("df.a")
    public int field1535;

    @ObfuscatedName("df.h")
    public int field1536;

    @ObfuscatedName("df.l")
    public int field1531;

    @ObfuscatedName("df.y")
    public int field1541;

    @ObfuscatedName("df.g")
    public int field1538;

    @ObfuscatedName("df.c")
    public int field1539;

    @ObfuscatedName("df.u")
    public int field1534;

    public class108() {
        this.field1532[0] = 0;
        this.field1532[1] = 65535;
        this.field1540[0] = 0;
        this.field1540[1] = 65535;
    }

    @ObfuscatedName("df.b(Lgn;)V")
    public final void method2082(class194 arg0) {
        this.field1536 = arg0.method3247();
        this.field1537 = arg0.method3261();
        this.field1535 = arg0.method3261();
        this.method2083(arg0);
    }

    @ObfuscatedName("df.q(Lgn;)V")
    public final void method2083(class194 arg0) {
        this.field1533 = arg0.method3247();
        this.field1532 = new int[this.field1533];
        this.field1540 = new int[this.field1533];
        for (int var2 = 0; var2 < this.field1533; var2++) {
            this.field1532[var2] = arg0.method3249();
            this.field1540[var2] = arg0.method3249();
        }
    }

    @ObfuscatedName("df.o()V")
    public final void method2084() {
        this.field1531 = 0;
        this.field1538 = 0;
        this.field1539 = 0;
        this.field1534 = 0;
        this.field1541 = 0;
    }

    @ObfuscatedName("df.p(I)I")
    public final int method2085(int arg0) {
        if (this.field1541 >= this.field1531) {
            this.field1534 = this.field1540[this.field1538++] << 15;
            if (this.field1538 >= this.field1533) {
                this.field1538 = this.field1533 - 1;
            }
            this.field1531 = (int) ((double) this.field1532[this.field1538] / 65536.0D * (double) arg0);
            if (this.field1531 > this.field1541) {
                this.field1539 = ((this.field1540[this.field1538] << 15) - this.field1534) / (this.field1531 - this.field1541);
            }
        }
        this.field1534 += this.field1539;
        this.field1541++;
        return this.field1534 - this.field1539 >> 15;
    }
}
