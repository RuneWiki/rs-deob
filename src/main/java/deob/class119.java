package deob;

@ObfuscatedName("di")
public class class119 {

    @ObfuscatedName("di.c")
    public boolean field1457;

    @ObfuscatedName("di.p")
    public boolean field1454;

    @ObfuscatedName("di.f")
    public class118 field1455;

    @ObfuscatedName("di.n")
    public class118 field1456;

    @ObfuscatedName("di.k")
    public class115[] field1468;

    @ObfuscatedName("di.w")
    public boolean field1458;

    @ObfuscatedName("di.s")
    public float field1459;

    @ObfuscatedName("di.q")
    public float field1460;

    @ObfuscatedName("di.m")
    public float[] field1461 = new float[4];

    @ObfuscatedName("di.x")
    public float[] field1463 = new float[4];

    @ObfuscatedName("di.j")
    public boolean field1453 = true;

    @ObfuscatedName("di.v")
    public int field1462 = 0;

    @ObfuscatedName("di.h")
    public float[] field1465;

    @ObfuscatedName("di.t")
    public int field1466;

    @ObfuscatedName("di.u")
    public int field1464;

    @ObfuscatedName("di.d")
    public float field1467;

    @ObfuscatedName("di.b")
    public float field1469;

    @ObfuscatedName("di.c(Lqq;II)I")
    public int method2741(class445 arg0, int arg1) {
        int var3 = arg0.method7198();
        class125.method5350(arg0.method7196());
        this.field1455 = class118.method2422(arg0.method7196());
        this.field1456 = class118.method2422(arg0.method7196());
        this.field1457 = arg0.method7196() != 0;
        this.field1468 = new class115[var3];
        class115 var4 = null;
        for (int var5 = 0; var5 < var3; var5++) {
            class115 var6 = new class115();
            var6.method2683(arg0, arg1);
            this.field1468[var5] = var6;
            if (var4 != null) {
                var4.field1415 = var6;
            }
            var4 = var6;
        }
        this.field1466 = this.field1468[0].field1408;
        this.field1464 = this.field1468[this.method2749() - 1].field1408;
        this.field1465 = new float[this.method2746() + 1];
        for (int var7 = this.method2744(); var7 <= this.method2745(); var7++) {
            this.field1465[var7 - this.method2744()] = class116.method630(this, (float) var7);
        }
        this.field1468 = null;
        this.field1467 = class116.method630(this, (float) (this.method2744() - 1));
        this.field1469 = class116.method630(this, (float) (this.method2745() + 1));
        return var3;
    }

    @ObfuscatedName("di.p(IS)F")
    public float method2743(int arg0) {
        if (arg0 < this.method2744()) {
            return this.field1467;
        } else if (arg0 > this.method2745()) {
            return this.field1469;
        } else {
            return this.field1465[arg0 - this.method2744()];
        }
    }

    @ObfuscatedName("di.f(I)I")
    public int method2744() {
        return this.field1466;
    }

    @ObfuscatedName("di.n(I)I")
    public int method2745() {
        return this.field1464;
    }

    @ObfuscatedName("di.k(S)I")
    public int method2746() {
        return this.method2745() - this.method2744();
    }

    @ObfuscatedName("di.w(FI)I")
    public int method2747(float arg0) {
        if (this.field1462 >= 0 && ((float) this.field1468[this.field1462].field1408 <= arg0) && this.field1468[this.field1462].field1415 == null || ((float) this.field1468[this.field1462].field1415.field1408 > arg0)) {
            return this.field1462;
        } else if ((arg0 < (float) this.method2744()) || (arg0 > (float) this.method2745())) {
            return -1;
        } else {
            int var2 = this.method2749();
            int var3 = this.field1462;
            if (var2 > 0) {
                int var4 = 0;
                int var5 = var2 - 1;
                do {
                    int var6 = var4 + var5 >> 1;
                    if (arg0 < (float) this.field1468[var6].field1408) {
                        if (arg0 > (float) this.field1468[var6 - 1].field1408) {
                            var3 = var6 - 1;
                            break;
                        }
                        var5 = var6 - 1;
                    } else {
                        if (!(arg0 > (float) this.field1468[var6].field1408)) {
                            var3 = var6;
                            break;
                        }
                        if (arg0 < (float) this.field1468[var6 + 1].field1408) {
                            var3 = var6;
                            break;
                        }
                        var4 = var6 + 1;
                    }
                } while (var4 <= var5);
            }
            if (this.field1462 != var3) {
                this.field1462 = var3;
                this.field1453 = true;
            }
            return this.field1462;
        }
    }

    @ObfuscatedName("di.s(FI)Ldz;")
    public class115 method2765(float arg0) {
        int var2 = this.method2747(arg0);
        return var2 >= 0 && var2 < this.field1468.length ? this.field1468[var2] : null;
    }

    @ObfuscatedName("di.q(B)I")
    public int method2749() {
        return this.field1468 == null ? 0 : this.field1468.length;
    }
}
