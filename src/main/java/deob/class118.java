package deob;

@ObfuscatedName("dz")
public class class118 {

    @ObfuscatedName("dz.o")
    public boolean field1478;

    @ObfuscatedName("dz.q")
    public boolean field1488;

    @ObfuscatedName("dz.l")
    public class117 field1473;

    @ObfuscatedName("dz.k")
    public class117 field1476;

    @ObfuscatedName("dz.a")
    public class114[] field1477;

    @ObfuscatedName("dz.m")
    public boolean field1481;

    @ObfuscatedName("dz.p")
    public float field1479;

    @ObfuscatedName("dz.s")
    public float field1480;

    @ObfuscatedName("dz.r")
    public float[] field1474 = new float[4];

    @ObfuscatedName("dz.v")
    public float[] field1482 = new float[4];

    @ObfuscatedName("dz.y")
    public boolean field1483 = true;

    @ObfuscatedName("dz.c")
    public int field1484 = 0;

    @ObfuscatedName("dz.w")
    public float[] field1485;

    @ObfuscatedName("dz.b")
    public int field1475;

    @ObfuscatedName("dz.t")
    public int field1487;

    @ObfuscatedName("dz.g")
    public float field1486;

    @ObfuscatedName("dz.x")
    public float field1489;

    @ObfuscatedName("dz.o(Lpx;II)I")
    public int method2546(class440 arg0, int arg1) {
        int var3 = arg0.method7082();
        class124.method5101(arg0.method7071());
        int var4 = arg0.method7071();
        class117[] var5 = new class117[] { class117.field1471, class117.field1466, class117.field1465, class117.field1467, class117.field1469 };
        class117 var6 = (class117) class330.method4934(var5, var4);
        if (var6 == null) {
            var6 = class117.field1471;
        }
        this.field1473 = var6;
        int var8 = arg0.method7071();
        class117[] var9 = new class117[] { class117.field1471, class117.field1466, class117.field1465, class117.field1467, class117.field1469 };
        class117 var10 = (class117) class330.method4934(var9, var8);
        if (var10 == null) {
            var10 = class117.field1471;
        }
        this.field1476 = var10;
        this.field1478 = arg0.method7071() != 0;
        this.field1477 = new class114[var3];
        class114 var12 = null;
        for (int var13 = 0; var13 < var3; var13++) {
            class114 var14 = new class114();
            var14.method2482(arg0, arg1);
            this.field1477[var13] = var14;
            if (var12 != null) {
                var12.field1428 = var14;
            }
            var12 = var14;
        }
        this.field1475 = this.field1477[0].field1431;
        this.field1487 = this.field1477[this.method2553() - 1].field1431;
        this.field1485 = new float[this.method2550() + 1];
        for (int var15 = this.method2548(); var15 <= this.method2549(); var15++) {
            this.field1485[var15 - this.method2548()] = class115.method4861(this, (float) var15);
        }
        this.field1477 = null;
        this.field1486 = class115.method4861(this, (float) (this.method2548() - 1));
        this.field1489 = class115.method4861(this, (float) (this.method2549() + 1));
        return var3;
    }

    @ObfuscatedName("dz.q(II)F")
    public float method2547(int arg0) {
        if (arg0 < this.method2548()) {
            return this.field1486;
        } else if (arg0 > this.method2549()) {
            return this.field1489;
        } else {
            return this.field1485[arg0 - this.method2548()];
        }
    }

    @ObfuscatedName("dz.l(B)I")
    public int method2548() {
        return this.field1475;
    }

    @ObfuscatedName("dz.k(I)I")
    public int method2549() {
        return this.field1487;
    }

    @ObfuscatedName("dz.a(B)I")
    public int method2550() {
        return this.method2549() - this.method2548();
    }

    @ObfuscatedName("dz.m(FS)I")
    public int method2570(float arg0) {
        if (this.field1484 >= 0 && ((float) this.field1477[this.field1484].field1431 <= arg0) && this.field1477[this.field1484].field1428 == null || ((float) this.field1477[this.field1484].field1428.field1431 > arg0)) {
            return this.field1484;
        } else if ((arg0 < (float) this.method2548()) || (arg0 > (float) this.method2549())) {
            return -1;
        } else {
            int var2 = this.method2553();
            int var3 = this.field1484;
            if (var2 > 0) {
                int var4 = 0;
                int var5 = var2 - 1;
                do {
                    int var6 = var4 + var5 >> 1;
                    if (arg0 < (float) this.field1477[var6].field1431) {
                        if (arg0 > (float) this.field1477[var6 - 1].field1431) {
                            var3 = var6 - 1;
                            break;
                        }
                        var5 = var6 - 1;
                    } else {
                        if (!(arg0 > (float) this.field1477[var6].field1431)) {
                            var3 = var6;
                            break;
                        }
                        if (arg0 < (float) this.field1477[var6 + 1].field1431) {
                            var3 = var6;
                            break;
                        }
                        var4 = var6 + 1;
                    }
                } while (var4 <= var5);
            }
            if (this.field1484 != var3) {
                this.field1484 = var3;
                this.field1483 = true;
            }
            return this.field1484;
        }
    }

    @ObfuscatedName("dz.p(FI)Ldi;")
    public class114 method2565(float arg0) {
        int var2 = this.method2570(arg0);
        return var2 >= 0 && var2 < this.field1477.length ? this.field1477[var2] : null;
    }

    @ObfuscatedName("dz.s(S)I")
    public int method2553() {
        return this.field1477 == null ? 0 : this.field1477.length;
    }
}
