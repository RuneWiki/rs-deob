package deob;

@ObfuscatedName("dt")
public class class116 {

    @ObfuscatedName("dt.c")
    public boolean field1435;

    @ObfuscatedName("dt.l")
    public boolean field1419;

    @ObfuscatedName("dt.s")
    public class115 field1423;

    @ObfuscatedName("dt.e")
    public class115 field1421;

    @ObfuscatedName("dt.r")
    public class112[] field1431;

    @ObfuscatedName("dt.o")
    public boolean field1422;

    @ObfuscatedName("dt.i")
    public float field1424;

    @ObfuscatedName("dt.w")
    public float field1425;

    @ObfuscatedName("dt.v")
    public float[] field1426 = new float[4];

    @ObfuscatedName("dt.a")
    public float[] field1427 = new float[4];

    @ObfuscatedName("dt.y")
    public boolean field1420 = true;

    @ObfuscatedName("dt.u")
    public int field1429 = 0;

    @ObfuscatedName("dt.h")
    public float[] field1430;

    @ObfuscatedName("dt.q")
    public int field1418;

    @ObfuscatedName("dt.x")
    public int field1428;

    @ObfuscatedName("dt.p")
    public float field1432;

    @ObfuscatedName("dt.n")
    public float field1434;

    @ObfuscatedName("dt.c(Lpi;II)I")
    public int method2492(class421 arg0, int arg1) {
        int var3 = arg0.method6666();
        class122.method5552(arg0.method6686());
        int var4 = arg0.method6686();
        class115 var5 = (class115) class321.method2696(class115.method2294(), var4);
        if (var5 == null) {
            var5 = class115.field1409;
        }
        this.field1423 = var5;
        int var7 = arg0.method6686();
        class115 var8 = (class115) class321.method2696(class115.method2294(), var7);
        if (var8 == null) {
            var8 = class115.field1409;
        }
        this.field1421 = var8;
        this.field1435 = arg0.method6686() != 0;
        this.field1431 = new class112[var3];
        class112 var10 = null;
        for (int var11 = 0; var11 < var3; var11++) {
            class112 var12 = new class112();
            var12.method2402(arg0, arg1);
            this.field1431[var11] = var12;
            if (var10 != null) {
                var10.field1384 = var12;
            }
            var10 = var12;
        }
        this.field1418 = this.field1431[0].field1378;
        this.field1428 = this.field1431[this.method2490() - 1].field1378;
        this.field1430 = new float[this.method2495() + 1];
        for (int var13 = this.method2485(); var13 <= this.method2486(); var13++) {
            this.field1430[var13 - this.method2485()] = class113.method2600(this, (float) var13);
        }
        this.field1431 = null;
        this.field1432 = class113.method2600(this, (float) (this.method2485() - 1));
        this.field1434 = class113.method2600(this, (float) (this.method2486() + 1));
        return var3;
    }

    @ObfuscatedName("dt.l(II)F")
    public float method2484(int arg0) {
        if (arg0 < this.method2485()) {
            return this.field1432;
        } else if (arg0 > this.method2486()) {
            return this.field1434;
        } else {
            return this.field1430[arg0 - this.method2485()];
        }
    }

    @ObfuscatedName("dt.s(I)I")
    public int method2485() {
        return this.field1418;
    }

    @ObfuscatedName("dt.e(I)I")
    public int method2486() {
        return this.field1428;
    }

    @ObfuscatedName("dt.r(I)I")
    public int method2495() {
        return this.method2486() - this.method2485();
    }

    @ObfuscatedName("dt.o(FB)I")
    public int method2488(float arg0) {
        if (this.field1429 >= 0 && ((float) this.field1431[this.field1429].field1378 <= arg0) && this.field1431[this.field1429].field1384 == null || ((float) this.field1431[this.field1429].field1384.field1378 > arg0)) {
            return this.field1429;
        } else if ((arg0 < (float) this.method2485()) || (arg0 > (float) this.method2486())) {
            return -1;
        } else {
            int var2 = this.method2490();
            int var3 = this.field1429;
            if (var2 > 0) {
                int var4 = 0;
                int var5 = var2 - 1;
                do {
                    int var6 = var4 + var5 >> 1;
                    if (arg0 < (float) this.field1431[var6].field1378) {
                        if (arg0 > (float) this.field1431[var6 - 1].field1378) {
                            var3 = var6 - 1;
                            break;
                        }
                        var5 = var6 - 1;
                    } else {
                        if (!(arg0 > (float) this.field1431[var6].field1378)) {
                            var3 = var6;
                            break;
                        }
                        if (arg0 < (float) this.field1431[var6 + 1].field1378) {
                            var3 = var6;
                            break;
                        }
                        var4 = var6 + 1;
                    }
                } while (var4 <= var5);
            }
            if (this.field1429 != var3) {
                this.field1429 = var3;
                this.field1420 = true;
            }
            return this.field1429;
        }
    }

    @ObfuscatedName("dt.i(FI)Ldz;")
    public class112 method2489(float arg0) {
        int var2 = this.method2488(arg0);
        return var2 >= 0 && var2 < this.field1431.length ? this.field1431[var2] : null;
    }

    @ObfuscatedName("dt.w(B)I")
    public int method2490() {
        return this.field1431 == null ? 0 : this.field1431.length;
    }
}
