package deob;

@ObfuscatedName("do")
public class class118 {

    @ObfuscatedName("do.c")
    public boolean field1464;

    @ObfuscatedName("do.v")
    public boolean field1460;

    @ObfuscatedName("do.q")
    public class117 field1469;

    @ObfuscatedName("do.f")
    public class117 field1462;

    @ObfuscatedName("do.j")
    public class114[] field1463;

    @ObfuscatedName("do.e")
    public boolean field1471;

    @ObfuscatedName("do.g")
    public float field1465;

    @ObfuscatedName("do.w")
    public float field1459;

    @ObfuscatedName("do.y")
    public float[] field1466 = new float[4];

    @ObfuscatedName("do.i")
    public float[] field1468 = new float[4];

    @ObfuscatedName("do.s")
    public boolean field1473 = true;

    @ObfuscatedName("do.t")
    public int field1470 = 0;

    @ObfuscatedName("do.z")
    public float[] field1461;

    @ObfuscatedName("do.r")
    public int field1472;

    @ObfuscatedName("do.u")
    public int field1467;

    @ObfuscatedName("do.k")
    public float field1474;

    @ObfuscatedName("do.h")
    public float field1475;

    @ObfuscatedName("do.c(Lqt;II)I")
    public int method2574(class443 arg0, int arg1) {
        int var3 = arg0.method7049();
        class124.method982(arg0.method7047());
        int var4 = arg0.method7047();
        class117[] var5 = new class117[] { class117.field1456, class117.field1452, class117.field1451, class117.field1454, class117.field1455 };
        class117 var6 = (class117) class329.method2087(var5, var4);
        if (var6 == null) {
            var6 = class117.field1456;
        }
        this.field1469 = var6;
        int var8 = arg0.method7047();
        class117[] var9 = new class117[] { class117.field1456, class117.field1452, class117.field1451, class117.field1454, class117.field1455 };
        class117 var10 = (class117) class329.method2087(var9, var8);
        if (var10 == null) {
            var10 = class117.field1456;
        }
        this.field1462 = var10;
        this.field1464 = arg0.method7047() != 0;
        this.field1463 = new class114[var3];
        class114 var12 = null;
        for (int var13 = 0; var13 < var3; var13++) {
            class114 var14 = new class114();
            var14.method2505(arg0, arg1);
            this.field1463[var13] = var14;
            if (var12 != null) {
                var12.field1427 = var14;
            }
            var12 = var14;
        }
        this.field1472 = this.field1463[0].field1421;
        this.field1467 = this.field1463[this.method2581() - 1].field1421;
        this.field1461 = new float[this.method2578() + 1];
        for (int var15 = this.method2576(); var15 <= this.method2575(); var15++) {
            this.field1461[var15 - this.method2576()] = class115.method4532(this, (float) var15);
        }
        this.field1463 = null;
        this.field1474 = class115.method4532(this, (float) (this.method2576() - 1));
        this.field1475 = class115.method4532(this, (float) (this.method2575() + 1));
        return var3;
    }

    @ObfuscatedName("do.v(II)F")
    public float method2573(int arg0) {
        if (arg0 < this.method2576()) {
            return this.field1474;
        } else if (arg0 > this.method2575()) {
            return this.field1475;
        } else {
            return this.field1461[arg0 - this.method2576()];
        }
    }

    @ObfuscatedName("do.q(I)I")
    public int method2576() {
        return this.field1472;
    }

    @ObfuscatedName("do.f(I)I")
    public int method2575() {
        return this.field1467;
    }

    @ObfuscatedName("do.j(B)I")
    public int method2578() {
        return this.method2575() - this.method2576();
    }

    @ObfuscatedName("do.e(FI)I")
    public int method2577(float arg0) {
        if (this.field1470 >= 0 && ((float) this.field1463[this.field1470].field1421 <= arg0) && this.field1463[this.field1470].field1427 == null || ((float) this.field1463[this.field1470].field1427.field1421 > arg0)) {
            return this.field1470;
        } else if ((arg0 < (float) this.method2576()) || (arg0 > (float) this.method2575())) {
            return -1;
        } else {
            int var2 = this.method2581();
            int var3 = this.field1470;
            if (var2 > 0) {
                int var4 = 0;
                int var5 = var2 - 1;
                do {
                    int var6 = var4 + var5 >> 1;
                    if (arg0 < (float) this.field1463[var6].field1421) {
                        if (arg0 > (float) this.field1463[var6 - 1].field1421) {
                            var3 = var6 - 1;
                            break;
                        }
                        var5 = var6 - 1;
                    } else {
                        if (!(arg0 > (float) this.field1463[var6].field1421)) {
                            var3 = var6;
                            break;
                        }
                        if (arg0 < (float) this.field1463[var6 + 1].field1421) {
                            var3 = var6;
                            break;
                        }
                        var4 = var6 + 1;
                    }
                } while (var4 <= var5);
            }
            if (this.field1470 != var3) {
                this.field1470 = var3;
                this.field1473 = true;
            }
            return this.field1470;
        }
    }

    @ObfuscatedName("do.g(FI)Ldx;")
    public class114 method2589(float arg0) {
        int var2 = this.method2577(arg0);
        return var2 >= 0 && var2 < this.field1463.length ? this.field1463[var2] : null;
    }

    @ObfuscatedName("do.w(I)I")
    public int method2581() {
        return this.field1463 == null ? 0 : this.field1463.length;
    }
}
