package deob;

@ObfuscatedName("dt")
public class class118 {

    @ObfuscatedName("dt.v")
    public boolean field1414;

    @ObfuscatedName("dt.c")
    public boolean field1409;

    @ObfuscatedName("dt.i")
    public class117 field1410;

    @ObfuscatedName("dt.f")
    public class117 field1411;

    @ObfuscatedName("dt.b")
    public class114[] field1412;

    @ObfuscatedName("dt.n")
    public boolean field1413;

    @ObfuscatedName("dt.s")
    public float field1423;

    @ObfuscatedName("dt.l")
    public float field1415;

    @ObfuscatedName("dt.q")
    public float[] field1416 = new float[4];

    @ObfuscatedName("dt.o")
    public float[] field1417 = new float[4];

    @ObfuscatedName("dt.r")
    public boolean field1408 = true;

    @ObfuscatedName("dt.p")
    public int field1419 = 0;

    @ObfuscatedName("dt.w")
    public float[] field1420;

    @ObfuscatedName("dt.k")
    public int field1418;

    @ObfuscatedName("dt.d")
    public int field1422;

    @ObfuscatedName("dt.m")
    public float field1426;

    @ObfuscatedName("dt.u")
    public float field1424;

    @ObfuscatedName("dt.v(Lpi;IB)I")
    public int method2583(class438 arg0, int arg1) {
        int var3 = arg0.method7148();
        int var4 = arg0.method6971();
        class124 var5 = (class124) class330.method4919(class124.method6313(), var4);
        if (var5 == null) {
            class124 var6 = class124.field1490;
        }
        int var7 = arg0.method6971();
        class117 var8 = (class117) class330.method4919(class117.method2813(), var7);
        if (var8 == null) {
            var8 = class117.field1404;
        }
        this.field1410 = var8;
        int var10 = arg0.method6971();
        class117 var11 = (class117) class330.method4919(class117.method2813(), var10);
        if (var11 == null) {
            var11 = class117.field1404;
        }
        this.field1411 = var11;
        this.field1414 = arg0.method6971() != 0;
        this.field1412 = new class114[var3];
        class114 var13 = null;
        for (int var14 = 0; var14 < var3; var14++) {
            class114 var15 = new class114();
            var15.method2525(arg0, arg1);
            this.field1412[var14] = var15;
            if (var13 != null) {
                var13.field1376 = var15;
            }
            var13 = var15;
        }
        this.field1418 = this.field1412[0].field1374;
        this.field1422 = this.field1412[this.method2590() - 1].field1374;
        this.field1420 = new float[this.method2587() + 1];
        for (int var16 = this.method2589(); var16 <= this.method2586(); var16++) {
            this.field1420[var16 - this.method2589()] = class115.method87(this, (float) var16);
        }
        this.field1412 = null;
        this.field1426 = class115.method87(this, (float) (this.method2589() - 1));
        this.field1424 = class115.method87(this, (float) (this.method2586() + 1));
        return var3;
    }

    @ObfuscatedName("dt.c(II)F")
    public float method2584(int arg0) {
        if (arg0 < this.method2589()) {
            return this.field1426;
        } else if (arg0 > this.method2586()) {
            return this.field1424;
        } else {
            return this.field1420[arg0 - this.method2589()];
        }
    }

    @ObfuscatedName("dt.i(B)I")
    public int method2589() {
        return this.field1418;
    }

    @ObfuscatedName("dt.f(I)I")
    public int method2586() {
        return this.field1422;
    }

    @ObfuscatedName("dt.b(B)I")
    public int method2587() {
        return this.method2586() - this.method2589();
    }

    @ObfuscatedName("dt.n(FI)I")
    public int method2588(float arg0) {
        if (this.field1419 >= 0 && ((float) this.field1412[this.field1419].field1374 <= arg0) && this.field1412[this.field1419].field1376 == null || ((float) this.field1412[this.field1419].field1376.field1374 > arg0)) {
            return this.field1419;
        } else if ((arg0 < (float) this.method2589()) || (arg0 > (float) this.method2586())) {
            return -1;
        } else {
            int var2 = this.method2590();
            int var3 = this.field1419;
            if (var2 > 0) {
                int var4 = 0;
                int var5 = var2 - 1;
                do {
                    int var6 = var4 + var5 >> 1;
                    if (arg0 < (float) this.field1412[var6].field1374) {
                        if (arg0 > (float) this.field1412[var6 - 1].field1374) {
                            var3 = var6 - 1;
                            break;
                        }
                        var5 = var6 - 1;
                    } else {
                        if (!(arg0 > (float) this.field1412[var6].field1374)) {
                            var3 = var6;
                            break;
                        }
                        if (arg0 < (float) this.field1412[var6 + 1].field1374) {
                            var3 = var6;
                            break;
                        }
                        var4 = var6 + 1;
                    }
                } while (var4 <= var5);
            }
            if (this.field1419 != var3) {
                this.field1419 = var3;
                this.field1408 = true;
            }
            return this.field1419;
        }
    }

    @ObfuscatedName("dt.s(FB)Ldm;")
    public class114 method2611(float arg0) {
        int var2 = this.method2588(arg0);
        return var2 >= 0 && var2 < this.field1412.length ? this.field1412[var2] : null;
    }

    @ObfuscatedName("dt.l(I)I")
    public int method2590() {
        return this.field1412 == null ? 0 : this.field1412.length;
    }
}
