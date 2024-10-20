package deob;

@ObfuscatedName("cc")
public class class104 {

    @ObfuscatedName("cc.n")
    public int field1383 = 2;

    @ObfuscatedName("cc.h")
    public int[] field1382 = new int[2];

    @ObfuscatedName("cc.l")
    public int[] field1379 = new int[2];

    @ObfuscatedName("cc.g")
    public int field1380;

    @ObfuscatedName("cc.b")
    public int field1381;

    @ObfuscatedName("cc.a")
    public int field1378;

    @ObfuscatedName("cc.c")
    public int field1377;

    @ObfuscatedName("cc.z")
    public int field1384;

    @ObfuscatedName("cc.j")
    public int field1385;

    @ObfuscatedName("cc.d")
    public int field1386;

    @ObfuscatedName("cc.t")
    public int field1387;

    public class104() {
        this.field1382[0] = 0;
        this.field1382[1] = 65535;
        this.field1379[0] = 0;
        this.field1379[1] = 65535;
    }

    @ObfuscatedName("cc.n(Lgc;)V")
    public final void method2271(class190 arg0) {
        this.field1378 = arg0.method3511();
        this.field1380 = arg0.method3562();
        this.field1381 = arg0.method3562();
        this.method2272(arg0);
    }

    @ObfuscatedName("cc.h(Lgc;)V")
    public final void method2272(class190 arg0) {
        this.field1383 = arg0.method3511();
        this.field1382 = new int[this.field1383];
        this.field1379 = new int[this.field1383];
        for (int var2 = 0; var2 < this.field1383; var2++) {
            this.field1382[var2] = arg0.method3513();
            this.field1379[var2] = arg0.method3513();
        }
    }

    @ObfuscatedName("cc.l()V")
    public final void method2273() {
        this.field1377 = 0;
        this.field1384 = 0;
        this.field1385 = 0;
        this.field1386 = 0;
        this.field1387 = 0;
    }

    @ObfuscatedName("cc.g(I)I")
    public final int method2274(int arg0) {
        if (this.field1387 >= this.field1377) {
            this.field1386 = this.field1379[this.field1384++] << 15;
            if (this.field1384 >= this.field1383) {
                this.field1384 = this.field1383 - 1;
            }
            this.field1377 = (int) ((double) this.field1382[this.field1384] / 65536.0D * (double) arg0);
            if (this.field1377 > this.field1387) {
                this.field1385 = ((this.field1379[this.field1384] << 15) - this.field1386) / (this.field1377 - this.field1387);
            }
        }
        this.field1386 += this.field1385;
        this.field1387++;
        return this.field1386 - this.field1385 >> 15;
    }
}
