package deob;

@ObfuscatedName("de")
public class class105 {

    @ObfuscatedName("de.m")
    public int field1384 = 2;

    @ObfuscatedName("de.f")
    public int[] field1382 = new int[2];

    @ObfuscatedName("de.q")
    public int[] field1383 = new int[2];

    @ObfuscatedName("de.w")
    public int field1388;

    @ObfuscatedName("de.o")
    public int field1385;

    @ObfuscatedName("de.u")
    public int field1386;

    @ObfuscatedName("de.g")
    public int field1387;

    @ObfuscatedName("de.l")
    public int field1391;

    @ObfuscatedName("de.e")
    public int field1389;

    @ObfuscatedName("de.d")
    public int field1390;

    @ObfuscatedName("de.k")
    public int field1381;

    public class105() {
        this.field1382[0] = 0;
        this.field1382[1] = 65535;
        this.field1383[0] = 0;
        this.field1383[1] = 65535;
    }

    @ObfuscatedName("de.m(Lgr;)V")
    public final void method2227(class202 arg0) {
        this.field1386 = arg0.method3551();
        this.field1388 = arg0.method3620();
        this.field1385 = arg0.method3620();
        this.method2228(arg0);
    }

    @ObfuscatedName("de.f(Lgr;)V")
    public final void method2228(class202 arg0) {
        this.field1384 = arg0.method3551();
        this.field1382 = new int[this.field1384];
        this.field1383 = new int[this.field1384];
        for (int var2 = 0; var2 < this.field1384; var2++) {
            this.field1382[var2] = arg0.method3530();
            this.field1383[var2] = arg0.method3530();
        }
    }

    @ObfuscatedName("de.q()V")
    public final void method2229() {
        this.field1387 = 0;
        this.field1391 = 0;
        this.field1389 = 0;
        this.field1390 = 0;
        this.field1381 = 0;
    }

    @ObfuscatedName("de.w(I)I")
    public final int method2230(int arg0) {
        if (this.field1381 >= this.field1387) {
            this.field1390 = this.field1383[this.field1391++] << 15;
            if (this.field1391 >= this.field1384) {
                this.field1391 = this.field1384 - 1;
            }
            this.field1387 = (int) ((double) this.field1382[this.field1391] / 65536.0D * (double) arg0);
            if (this.field1387 > this.field1381) {
                this.field1389 = ((this.field1383[this.field1391] << 15) - this.field1390) / (this.field1387 - this.field1381);
            }
        }
        this.field1390 += this.field1389;
        this.field1381++;
        return this.field1390 - this.field1389 >> 15;
    }
}
