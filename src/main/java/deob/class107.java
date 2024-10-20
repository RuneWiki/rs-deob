package deob;

@ObfuscatedName("dd")
public class class107 {

    @ObfuscatedName("dd.a")
    public int field1404 = 2;

    @ObfuscatedName("dd.t")
    public int[] field1411 = new int[2];

    @ObfuscatedName("dd.n")
    public int[] field1410 = new int[2];

    @ObfuscatedName("dd.q")
    public int field1405;

    @ObfuscatedName("dd.v")
    public int field1406;

    @ObfuscatedName("dd.l")
    public int field1403;

    @ObfuscatedName("dd.c")
    public int field1408;

    @ObfuscatedName("dd.o")
    public int field1409;

    @ObfuscatedName("dd.i")
    public int field1402;

    @ObfuscatedName("dd.d")
    public int field1407;

    @ObfuscatedName("dd.m")
    public int field1412;

    public class107() {
        this.field1411[0] = 0;
        this.field1411[1] = 65535;
        this.field1410[0] = 0;
        this.field1410[1] = 65535;
    }

    @ObfuscatedName("dd.a(Lkc;)V")
    public final void method2385(class300 arg0) {
        this.field1403 = arg0.method5123();
        this.field1405 = arg0.method5155();
        this.field1406 = arg0.method5155();
        this.method2390(arg0);
    }

    @ObfuscatedName("dd.t(Lkc;)V")
    public final void method2390(class300 arg0) {
        this.field1404 = arg0.method5123();
        this.field1411 = new int[this.field1404];
        this.field1410 = new int[this.field1404];
        for (int var2 = 0; var2 < this.field1404; var2++) {
            this.field1411[var2] = arg0.method5166();
            this.field1410[var2] = arg0.method5166();
        }
    }

    @ObfuscatedName("dd.n()V")
    public final void method2387() {
        this.field1408 = 0;
        this.field1409 = 0;
        this.field1402 = 0;
        this.field1407 = 0;
        this.field1412 = 0;
    }

    @ObfuscatedName("dd.q(I)I")
    public final int method2388(int arg0) {
        if (this.field1412 >= this.field1408) {
            this.field1407 = this.field1410[this.field1409++] << 15;
            if (this.field1409 >= this.field1404) {
                this.field1409 = this.field1404 - 1;
            }
            this.field1408 = (int) ((double) this.field1411[this.field1409] / 65536.0D * (double) arg0);
            if (this.field1408 > this.field1412) {
                this.field1402 = ((this.field1410[this.field1409] << 15) - this.field1407) / (this.field1408 - this.field1412);
            }
        }
        this.field1407 += this.field1402;
        this.field1412++;
        return this.field1407 - this.field1402 >> 15;
    }
}
