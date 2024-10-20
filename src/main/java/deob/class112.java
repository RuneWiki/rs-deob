package deob;

@ObfuscatedName("de")
public class class112 implements class132 {

    @ObfuscatedName("de.z")
    public class117[] field1442;

    @ObfuscatedName("de.w")
    public class206 field1445 = new class206();

    @ObfuscatedName("de.s")
    public int field1441;

    @ObfuscatedName("de.l")
    public int field1440 = 0;

    @ObfuscatedName("de.u")
    public double field1443 = 1.0D;

    @ObfuscatedName("de.q")
    public int field1444 = 128;

    @ObfuscatedName("de.k")
    public class248 field1439;

    public class112(class248 arg0, class248 arg1, int arg2, double arg3, int arg4) {
        this.field1439 = arg1;
        this.field1441 = arg2;
        this.field1440 = this.field1441;
        this.field1443 = arg3;
        this.field1444 = arg4;
        int[] var7 = arg0.method4290(0);
        int var8 = var7.length;
        this.field1442 = new class117[arg0.method4258(0)];
        for (int var9 = 0; var9 < var8; var9++) {
            class183 var10 = new class183(arg0.method4247(0, var7[var9]));
            this.field1442[var7[var9]] = new class117(var10);
        }
    }

    @ObfuscatedName("de.z(I)I")
    public int method2326() {
        int var1 = 0;
        int var2 = 0;
        class117[] var3 = this.field1442;
        for (int var4 = 0; var4 < var3.length; var4++) {
            class117 var5 = var3[var4];
            if (var5 != null && var5.field1534 != null) {
                var1 += var5.field1534.length;
                int[] var6 = var5.field1534;
                for (int var7 = 0; var7 < var6.length; var7++) {
                    int var8 = var6[var7];
                    if (this.field1439.method4249(var8)) {
                        var2++;
                    }
                }
            }
        }
        if (var1 == 0) {
            return 0;
        } else {
            return var2 * 100 / var1;
        }
    }

    @ObfuscatedName("de.w(D)V")
    public void method2340(double arg0) {
        this.field1443 = arg0;
        this.method2357();
    }

    @ObfuscatedName("de.s(II)[I")
    public int[] method2348(int arg0) {
        class117 var2 = this.field1442[arg0];
        if (var2 != null) {
            if (var2.field1540 != null) {
                this.field1445.method3766(var2);
                var2.field1541 = true;
                return var2.field1540;
            }
            boolean var3 = var2.method2457(this.field1443, this.field1444, this.field1439);
            if (var3) {
                if (this.field1440 == 0) {
                    class117 var4 = (class117) this.field1445.method3772();
                    var4.method2452();
                } else {
                    this.field1440--;
                }
                this.field1445.method3766(var2);
                var2.field1541 = true;
                return var2.field1540;
            }
        }
        return null;
    }

    @ObfuscatedName("de.l(II)I")
    public int method2356(int arg0) {
        return this.field1442[arg0] == null ? 0 : this.field1442[arg0].field1528;
    }

    @ObfuscatedName("de.u(IB)Z")
    public boolean method2353(int arg0) {
        return this.field1442[arg0].field1531;
    }

    @ObfuscatedName("de.q(II)Z")
    public boolean method2331(int arg0) {
        return this.field1444 == 64;
    }

    @ObfuscatedName("de.i(I)V")
    public void method2357() {
        for (int var1 = 0; var1 < this.field1442.length; var1++) {
            if (this.field1442[var1] != null) {
                this.field1442[var1].method2452();
            }
        }
        this.field1445 = new class206();
        this.field1440 = this.field1441;
    }

    @ObfuscatedName("de.x(IB)V")
    public void method2333(int arg0) {
        for (int var2 = 0; var2 < this.field1442.length; var2++) {
            class117 var3 = this.field1442[var2];
            if (var3 != null && var3.field1538 != 0 && var3.field1541) {
                var3.method2453(arg0);
                var3.field1541 = false;
            }
        }
    }
}
