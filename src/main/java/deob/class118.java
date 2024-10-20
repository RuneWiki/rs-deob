package deob;

@ObfuscatedName("dj")
public class class118 {

    @ObfuscatedName("dj.s")
    public boolean field1448;

    @ObfuscatedName("dj.h")
    public boolean field1439;

    @ObfuscatedName("dj.w")
    public class117 field1440;

    @ObfuscatedName("dj.v")
    public class117 field1450;

    @ObfuscatedName("dj.c")
    public class114[] field1442;

    @ObfuscatedName("dj.q")
    public boolean field1443;

    @ObfuscatedName("dj.i")
    public float field1438;

    @ObfuscatedName("dj.k")
    public float field1445;

    @ObfuscatedName("dj.o")
    public float[] field1446 = new float[4];

    @ObfuscatedName("dj.n")
    public float[] field1441 = new float[4];

    @ObfuscatedName("dj.d")
    public boolean field1449 = true;

    @ObfuscatedName("dj.a")
    public int field1447 = 0;

    @ObfuscatedName("dj.m")
    public float[] field1455;

    @ObfuscatedName("dj.u")
    public int field1451;

    @ObfuscatedName("dj.l")
    public int field1452;

    @ObfuscatedName("dj.z")
    public float field1453;

    @ObfuscatedName("dj.r")
    public float field1444;

    @ObfuscatedName("dj.s(Lqr;II)I")
    public int method2547(class444 arg0, int arg1) {
        int var3 = arg0.method7120();
        int var4 = arg0.method6929();
        class124[] var5 = new class124[] { class124.field1509, class124.field1516, class124.field1508, class124.field1513, class124.field1510, class124.field1519, class124.field1512, class124.field1511, class124.field1514 };
        class124 var6 = (class124) class330.method525(var5, var4);
        if (var6 == null) {
            class124 var7 = class124.field1514;
        }
        int var8 = arg0.method6929();
        class117[] var9 = new class117[] { class117.field1435, class117.field1432, class117.field1429, class117.field1434, class117.field1433 };
        class117 var10 = (class117) class330.method525(var9, var8);
        if (var10 == null) {
            var10 = class117.field1435;
        }
        this.field1440 = var10;
        int var12 = arg0.method6929();
        class117[] var13 = new class117[] { class117.field1435, class117.field1432, class117.field1429, class117.field1434, class117.field1433 };
        class117 var14 = (class117) class330.method525(var13, var12);
        if (var14 == null) {
            var14 = class117.field1435;
        }
        this.field1450 = var14;
        this.field1448 = arg0.method6929() != 0;
        this.field1442 = new class114[var3];
        class114 var16 = null;
        for (int var17 = 0; var17 < var3; var17++) {
            class114 var18 = new class114();
            var18.method2486(arg0, arg1);
            this.field1442[var17] = var18;
            if (var16 != null) {
                var16.field1405 = var18;
            }
            var16 = var18;
        }
        this.field1451 = this.field1442[0].field1401;
        this.field1452 = this.field1442[this.method2574() - 1].field1401;
        this.field1455 = new float[this.method2548() + 1];
        for (int var19 = this.method2549(); var19 <= this.method2571(); var19++) {
            this.field1455[var19 - this.method2549()] = class115.method81(this, (float) var19);
        }
        this.field1442 = null;
        this.field1453 = class115.method81(this, (float) (this.method2549() - 1));
        this.field1444 = class115.method81(this, (float) (this.method2571() + 1));
        return var3;
    }

    @ObfuscatedName("dj.h(II)F")
    public float method2567(int arg0) {
        if (arg0 < this.method2549()) {
            return this.field1453;
        } else if (arg0 > this.method2571()) {
            return this.field1444;
        } else {
            return this.field1455[arg0 - this.method2549()];
        }
    }

    @ObfuscatedName("dj.w(S)I")
    public int method2549() {
        return this.field1451;
    }

    @ObfuscatedName("dj.v(I)I")
    public int method2571() {
        return this.field1452;
    }

    @ObfuscatedName("dj.c(B)I")
    public int method2548() {
        return this.method2571() - this.method2549();
    }

    @ObfuscatedName("dj.q(FI)I")
    public int method2552(float arg0) {
        if (this.field1447 >= 0 && ((float) this.field1442[this.field1447].field1401 <= arg0) && this.field1442[this.field1447].field1405 == null || ((float) this.field1442[this.field1447].field1405.field1401 > arg0)) {
            return this.field1447;
        } else if ((arg0 < (float) this.method2549()) || (arg0 > (float) this.method2571())) {
            return -1;
        } else {
            int var2 = this.method2574();
            int var3 = this.field1447;
            if (var2 > 0) {
                int var4 = 0;
                int var5 = var2 - 1;
                do {
                    int var6 = var4 + var5 >> 1;
                    if (arg0 < (float) this.field1442[var6].field1401) {
                        if (arg0 > (float) this.field1442[var6 - 1].field1401) {
                            var3 = var6 - 1;
                            break;
                        }
                        var5 = var6 - 1;
                    } else {
                        if (!(arg0 > (float) this.field1442[var6].field1401)) {
                            var3 = var6;
                            break;
                        }
                        if (arg0 < (float) this.field1442[var6 + 1].field1401) {
                            var3 = var6;
                            break;
                        }
                        var4 = var6 + 1;
                    }
                } while (var4 <= var5);
            }
            if (this.field1447 != var3) {
                this.field1447 = var3;
                this.field1449 = true;
            }
            return this.field1447;
        }
    }

    @ObfuscatedName("dj.i(FB)Ldr;")
    public class114 method2553(float arg0) {
        int var2 = this.method2552(arg0);
        return var2 >= 0 && var2 < this.field1442.length ? this.field1442[var2] : null;
    }

    @ObfuscatedName("dj.k(I)I")
    public int method2574() {
        return this.field1442 == null ? 0 : this.field1442.length;
    }
}
