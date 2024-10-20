package deob;

@ObfuscatedName("dm")
public class class107 {

    @ObfuscatedName("dm.z")
    public int field1411 = 2;

    @ObfuscatedName("dm.n")
    public int[] field1406 = new int[2];

    @ObfuscatedName("dm.v")
    public int[] field1407 = new int[2];

    @ObfuscatedName("dm.u")
    public int field1410;

    @ObfuscatedName("dm.r")
    public int field1405;

    @ObfuscatedName("dm.p")
    public int field1409;

    @ObfuscatedName("dm.q")
    public int field1408;

    @ObfuscatedName("dm.m")
    public int field1412;

    @ObfuscatedName("dm.y")
    public int field1415;

    @ObfuscatedName("dm.i")
    public int field1413;

    @ObfuscatedName("dm.c")
    public int field1414;

    public class107() {
        this.field1406[0] = 0;
        this.field1406[1] = 65535;
        this.field1407[0] = 0;
        this.field1407[1] = 65535;
    }

    @ObfuscatedName("dm.z(Lkl;)V")
    public final void method2226(class300 arg0) {
        this.field1409 = arg0.method4990();
        this.field1410 = arg0.method5085();
        this.field1405 = arg0.method5085();
        this.method2223(arg0);
    }

    @ObfuscatedName("dm.n(Lkl;)V")
    public final void method2223(class300 arg0) {
        this.field1411 = arg0.method4990();
        this.field1406 = new int[this.field1411];
        this.field1407 = new int[this.field1411];
        for (int var2 = 0; var2 < this.field1411; var2++) {
            this.field1406[var2] = arg0.method4992();
            this.field1407[var2] = arg0.method4992();
        }
    }

    @ObfuscatedName("dm.v()V")
    public final void method2234() {
        this.field1408 = 0;
        this.field1412 = 0;
        this.field1413 = 0;
        this.field1414 = 0;
        this.field1415 = 0;
    }

    @ObfuscatedName("dm.u(I)I")
    public final int method2232(int arg0) {
        if (this.field1415 >= this.field1408) {
            this.field1414 = this.field1407[this.field1412++] << 15;
            if (this.field1412 >= this.field1411) {
                this.field1412 = this.field1411 - 1;
            }
            this.field1408 = (int) ((double) this.field1406[this.field1412] / 65536.0D * (double) arg0);
            if (this.field1408 > this.field1415) {
                this.field1413 = ((this.field1407[this.field1412] << 15) - this.field1414) / (this.field1408 - this.field1415);
            }
        }
        this.field1414 += this.field1413;
        this.field1415++;
        return this.field1414 - this.field1413 >> 15;
    }
}
