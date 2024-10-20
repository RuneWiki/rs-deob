package deob;

@ObfuscatedName("da")
public class class126 {

    @ObfuscatedName("da.f")
    public boolean field1546;

    @ObfuscatedName("da.w")
    public boolean field1522;

    @ObfuscatedName("da.v")
    public class124 field1523;

    @ObfuscatedName("da.s")
    public class124 field1542;

    @ObfuscatedName("da.z")
    public class121[] field1525;

    @ObfuscatedName("da.j")
    public boolean field1526;

    @ObfuscatedName("da.i")
    public float field1521;

    @ObfuscatedName("da.n")
    public float field1528;

    @ObfuscatedName("da.l")
    public float field1529;

    @ObfuscatedName("da.k")
    public float field1530;

    @ObfuscatedName("da.c")
    public float field1544;

    @ObfuscatedName("da.r")
    public float field1532;

    @ObfuscatedName("da.b")
    public float field1533;

    @ObfuscatedName("da.m")
    public float field1538;

    @ObfuscatedName("da.t")
    public float field1535;

    @ObfuscatedName("da.h")
    public float field1536;

    @ObfuscatedName("da.p")
    public boolean field1531 = true;

    @ObfuscatedName("da.o")
    public int field1524 = 0;

    @ObfuscatedName("da.u")
    public float[] field1539;

    @ObfuscatedName("da.x")
    public int field1527;

    @ObfuscatedName("da.a")
    public int field1541;

    @ObfuscatedName("da.q")
    public float field1540;

    @ObfuscatedName("da.d")
    public float field1543;

    @ObfuscatedName("da.f(Lrd;II)I")
    public int method2922(class474 arg0, int arg1) {
        int var3 = arg0.method8032();
        class135.method688(arg0.method7964());
        int var4 = arg0.method7964();
        class124 var5 = (class124) class351.method19(class124.method2715(), var4);
        if (var5 == null) {
            var5 = class124.field1503;
        }
        this.field1523 = var5;
        this.field1542 = class124.method2190(arg0.method7964());
        this.field1546 = arg0.method7964() != 0;
        this.field1525 = new class121[var3];
        class121 var7 = null;
        for (int var8 = 0; var8 < var3; var8++) {
            class121 var9 = new class121();
            var9.method2834(arg0, arg1);
            this.field1525[var8] = var9;
            if (var7 != null) {
                var7.field1469 = var9;
            }
            var7 = var9;
        }
        return var3;
    }

    @ObfuscatedName("da.w(I)V")
    public void method2921() {
        this.field1527 = this.field1525[0].field1475;
        this.field1541 = this.field1525[this.method2918() - 1].field1475;
        this.field1539 = new float[this.method2904() + 1];
        for (int var1 = this.method2919(); var1 <= this.method2903(); var1++) {
            this.field1539[var1 - this.method2919()] = class122.method2737(this, (float) var1);
        }
        this.field1525 = null;
        this.field1540 = class122.method2737(this, (float) (this.method2919() - 1));
        this.field1543 = class122.method2737(this, (float) (this.method2903() + 1));
    }

    @ObfuscatedName("da.v(II)F")
    public float method2901(int arg0) {
        if (arg0 < this.method2919()) {
            return this.field1540;
        } else if (arg0 > this.method2903()) {
            return this.field1543;
        } else {
            return this.field1539[arg0 - this.method2919()];
        }
    }

    @ObfuscatedName("da.s(I)I")
    public int method2919() {
        return this.field1527;
    }

    @ObfuscatedName("da.z(I)I")
    public int method2903() {
        return this.field1541;
    }

    @ObfuscatedName("da.j(B)I")
    public int method2904() {
        return this.method2903() - this.method2919();
    }

    @ObfuscatedName("da.i(FI)I")
    public int method2905(float arg0) {
        if (this.field1524 >= 0 && ((float) this.field1525[this.field1524].field1475 <= arg0) && this.field1525[this.field1524].field1469 == null || ((float) this.field1525[this.field1524].field1469.field1475 > arg0)) {
            return this.field1524;
        } else if ((arg0 < (float) this.method2919()) || (arg0 > (float) this.method2903())) {
            return -1;
        } else {
            int var2 = this.method2918();
            int var3 = this.field1524;
            if (var2 > 0) {
                int var4 = 0;
                int var5 = var2 - 1;
                do {
                    int var6 = var4 + var5 >> 1;
                    if (arg0 < (float) this.field1525[var6].field1475) {
                        if (arg0 > (float) this.field1525[var6 - 1].field1475) {
                            var3 = var6 - 1;
                            break;
                        }
                        var5 = var6 - 1;
                    } else {
                        if (!(arg0 > (float) this.field1525[var6].field1475)) {
                            var3 = var6;
                            break;
                        }
                        if (arg0 < (float) this.field1525[var6 + 1].field1475) {
                            var3 = var6;
                            break;
                        }
                        var4 = var6 + 1;
                    }
                } while (var4 <= var5);
            }
            if (this.field1524 != var3) {
                this.field1524 = var3;
                this.field1531 = true;
            }
            return this.field1524;
        }
    }

    @ObfuscatedName("da.n(FB)Ldp;")
    public class121 method2907(float arg0) {
        int var2 = this.method2905(arg0);
        return var2 >= 0 && var2 < this.field1525.length ? this.field1525[var2] : null;
    }

    @ObfuscatedName("da.l(I)I")
    public int method2918() {
        return this.field1525 == null ? 0 : this.field1525.length;
    }
}
