package deob;

@ObfuscatedName("du")
public class class126 {

    @ObfuscatedName("du.h")
    public boolean field1548;

    @ObfuscatedName("du.e")
    public boolean field1539;

    @ObfuscatedName("du.v")
    public class125 field1540;

    @ObfuscatedName("du.x")
    public class125 field1541;

    @ObfuscatedName("du.m")
    public class122[] field1542;

    @ObfuscatedName("du.q")
    public boolean field1558;

    @ObfuscatedName("du.f")
    public float field1544;

    @ObfuscatedName("du.r")
    public float field1545;

    @ObfuscatedName("du.u")
    public float field1546;

    @ObfuscatedName("du.b")
    public float field1560;

    @ObfuscatedName("du.j")
    public float field1538;

    @ObfuscatedName("du.g")
    public float field1549;

    @ObfuscatedName("du.i")
    public float field1550;

    @ObfuscatedName("du.o")
    public float field1551;

    @ObfuscatedName("du.n")
    public float field1552;

    @ObfuscatedName("du.k")
    public float field1553;

    @ObfuscatedName("du.a")
    public boolean field1554 = true;

    @ObfuscatedName("du.s")
    public int field1557 = 0;

    @ObfuscatedName("du.l")
    public float[] field1547;

    @ObfuscatedName("du.t")
    public int field1543;

    @ObfuscatedName("du.c")
    public int field1556;

    @ObfuscatedName("du.p")
    public float field1559;

    @ObfuscatedName("du.d")
    public float field1555;

    @ObfuscatedName("du.h(Lqy;II)I")
    public int method2796(class467 arg0, int arg1) {
        int var3 = arg0.method7794();
        class132.method2038(arg0.method7792());
        int var4 = arg0.method7792();
        class125 var5 = (class125) class347.method1688(class125.method5076(), var4);
        if (var5 == null) {
            var5 = class125.field1536;
        }
        this.field1540 = var5;
        int var7 = arg0.method7792();
        class125 var8 = (class125) class347.method1688(class125.method5076(), var7);
        if (var8 == null) {
            var8 = class125.field1536;
        }
        this.field1541 = var8;
        this.field1548 = arg0.method7792() != 0;
        this.field1542 = new class122[var3];
        class122 var10 = null;
        for (int var11 = 0; var11 < var3; var11++) {
            class122 var12 = new class122();
            var12.method2741(arg0, arg1);
            this.field1542[var11] = var12;
            if (var10 != null) {
                var10.field1502 = var12;
            }
            var10 = var12;
        }
        this.field1543 = this.field1542[0].field1503;
        this.field1556 = this.field1542[this.method2800() - 1].field1503;
        this.field1547 = new float[this.method2797() + 1];
        for (int var13 = this.method2799(); var13 <= this.method2795(); var13++) {
            this.field1547[var13 - this.method2799()] = class123.method3646(this, (float) var13);
        }
        this.field1542 = null;
        this.field1559 = class123.method3646(this, (float) (this.method2799() - 1));
        this.field1555 = class123.method3646(this, (float) (this.method2795() + 1));
        return var3;
    }

    @ObfuscatedName("du.e(IB)F")
    public float method2819(int arg0) {
        if (arg0 < this.method2799()) {
            return this.field1559;
        } else if (arg0 > this.method2795()) {
            return this.field1555;
        } else {
            return this.field1547[arg0 - this.method2799()];
        }
    }

    @ObfuscatedName("du.v(B)I")
    public int method2799() {
        return this.field1543;
    }

    @ObfuscatedName("du.x(I)I")
    public int method2795() {
        return this.field1556;
    }

    @ObfuscatedName("du.m(I)I")
    public int method2797() {
        return this.method2795() - this.method2799();
    }

    @ObfuscatedName("du.q(FI)I")
    public int method2798(float arg0) {
        if (this.field1557 >= 0 && ((float) this.field1542[this.field1557].field1503 <= arg0) && this.field1542[this.field1557].field1502 == null || ((float) this.field1542[this.field1557].field1502.field1503 > arg0)) {
            return this.field1557;
        } else if ((arg0 < (float) this.method2799()) || (arg0 > (float) this.method2795())) {
            return -1;
        } else {
            int var2 = this.method2800();
            int var3 = this.field1557;
            if (var2 > 0) {
                int var4 = 0;
                int var5 = var2 - 1;
                do {
                    int var6 = var4 + var5 >> 1;
                    if (arg0 < (float) this.field1542[var6].field1503) {
                        if (arg0 > (float) this.field1542[var6 - 1].field1503) {
                            var3 = var6 - 1;
                            break;
                        }
                        var5 = var6 - 1;
                    } else {
                        if (!(arg0 > (float) this.field1542[var6].field1503)) {
                            var3 = var6;
                            break;
                        }
                        if (arg0 < (float) this.field1542[var6 + 1].field1503) {
                            var3 = var6;
                            break;
                        }
                        var4 = var6 + 1;
                    }
                } while (var4 <= var5);
            }
            if (this.field1557 != var3) {
                this.field1557 = var3;
                this.field1554 = true;
            }
            return this.field1557;
        }
    }

    @ObfuscatedName("du.f(FI)Ldq;")
    public class122 method2803(float arg0) {
        int var2 = this.method2798(arg0);
        return var2 >= 0 && var2 < this.field1542.length ? this.field1542[var2] : null;
    }

    @ObfuscatedName("du.r(I)I")
    public int method2800() {
        return this.field1542 == null ? 0 : this.field1542.length;
    }
}
