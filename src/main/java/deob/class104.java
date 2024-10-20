package deob;

@ObfuscatedName("cl")
public class class104 {

    @ObfuscatedName("cl.a")
    public int field1414 = 2;

    @ObfuscatedName("cl.s")
    public int[] field1407 = new int[2];

    @ObfuscatedName("cl.g")
    public int[] field1412 = new int[2];

    @ObfuscatedName("cl.h")
    public int field1410;

    @ObfuscatedName("cl.f")
    public int field1411;

    @ObfuscatedName("cl.p")
    public int field1408;

    @ObfuscatedName("cl.m")
    public int field1413;

    @ObfuscatedName("cl.q")
    public int field1409;

    @ObfuscatedName("cl.b")
    public int field1415;

    @ObfuscatedName("cl.n")
    public int field1416;

    @ObfuscatedName("cl.e")
    public int field1417;

    public class104() {
        this.field1407[0] = 0;
        this.field1407[1] = 65535;
        this.field1412[0] = 0;
        this.field1412[1] = 65535;
    }

    @ObfuscatedName("cl.a(Lgx;)V")
    public final void method2294(class190 arg0) {
        this.field1408 = arg0.method3443();
        this.field1410 = arg0.method3460();
        this.field1411 = arg0.method3460();
        this.method2288(arg0);
    }

    @ObfuscatedName("cl.s(Lgx;)V")
    public final void method2288(class190 arg0) {
        this.field1414 = arg0.method3443();
        this.field1407 = new int[this.field1414];
        this.field1412 = new int[this.field1414];
        for (int var2 = 0; var2 < this.field1414; var2++) {
            this.field1407[var2] = arg0.method3610();
            this.field1412[var2] = arg0.method3610();
        }
    }

    @ObfuscatedName("cl.g()V")
    public final void method2290() {
        this.field1413 = 0;
        this.field1409 = 0;
        this.field1415 = 0;
        this.field1416 = 0;
        this.field1417 = 0;
    }

    @ObfuscatedName("cl.x(I)I")
    public final int method2291(int arg0) {
        if (this.field1417 >= this.field1413) {
            this.field1416 = this.field1412[this.field1409++] << 15;
            if (this.field1409 >= this.field1414) {
                this.field1409 = this.field1414 - 1;
            }
            this.field1413 = (int) ((double) this.field1407[this.field1409] / 65536.0D * (double) arg0);
            if (this.field1413 > this.field1417) {
                this.field1415 = ((this.field1412[this.field1409] << 15) - this.field1416) / (this.field1413 - this.field1417);
            }
        }
        this.field1416 += this.field1415;
        this.field1417++;
        return this.field1416 - this.field1415 >> 15;
    }
}
