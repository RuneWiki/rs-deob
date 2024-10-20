package deob;

@ObfuscatedName("dr")
public class class112 implements class132 {

    @ObfuscatedName("dr.w")
    public class117[] field1463;

    @ObfuscatedName("dr.m")
    public class206 field1464 = new class206();

    @ObfuscatedName("dr.q")
    public int field1470;

    @ObfuscatedName("dr.b")
    public int field1466 = 0;

    @ObfuscatedName("dr.f")
    public double field1467 = 1.0D;

    @ObfuscatedName("dr.n")
    public int field1468 = 128;

    @ObfuscatedName("dr.h")
    public class248 field1465;

    public class112(class248 arg0, class248 arg1, int arg2, double arg3, int arg4) {
        this.field1465 = arg1;
        this.field1470 = arg2;
        this.field1466 = this.field1470;
        this.field1467 = arg3;
        this.field1468 = arg4;
        int[] var7 = arg0.method4272(0);
        int var8 = var7.length;
        this.field1463 = new class117[arg0.method4262(0)];
        for (int var9 = 0; var9 < var8; var9++) {
            class183 var10 = new class183(arg0.method4250(0, var7[var9]));
            this.field1463[var7[var9]] = new class117(var10);
        }
    }

    @ObfuscatedName("dr.w(I)I")
    public int method2403() {
        int var1 = 0;
        int var2 = 0;
        class117[] var3 = this.field1463;
        for (int var4 = 0; var4 < var3.length; var4++) {
            class117 var5 = var3[var4];
            if (var5 != null && var5.field1570 != null) {
                var1 += var5.field1570.length;
                int[] var6 = var5.field1570;
                for (int var7 = 0; var7 < var6.length; var7++) {
                    int var8 = var6[var7];
                    if (this.field1465.method4253(var8)) {
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

    @ObfuscatedName("dr.m(D)V")
    public void method2371(double arg0) {
        this.field1467 = arg0;
        this.method2376();
    }

    @ObfuscatedName("dr.q(II)[I")
    public int[] method2396(int arg0) {
        class117 var2 = this.field1463[arg0];
        if (var2 != null) {
            if (var2.field1571 != null) {
                this.field1464.method3791(var2);
                var2.field1563 = true;
                return var2.field1571;
            }
            boolean var3 = var2.method2493(this.field1467, this.field1468, this.field1465);
            if (var3) {
                if (this.field1466 == 0) {
                    class117 var4 = (class117) this.field1464.method3794();
                    var4.method2494();
                } else {
                    this.field1466--;
                }
                this.field1464.method3791(var2);
                var2.field1563 = true;
                return var2.field1571;
            }
        }
        return null;
    }

    @ObfuscatedName("dr.x(IB)I")
    public int method2373(int arg0) {
        return this.field1463[arg0] == null ? 0 : this.field1463[arg0].field1564;
    }

    @ObfuscatedName("dr.j(IB)Z")
    public boolean method2400(int arg0) {
        return this.field1463[arg0].field1560;
    }

    @ObfuscatedName("dr.a(II)Z")
    public boolean method2375(int arg0) {
        return this.field1468 == 64;
    }

    @ObfuscatedName("dr.l(B)V")
    public void method2376() {
        for (int var1 = 0; var1 < this.field1463.length; var1++) {
            if (this.field1463[var1] != null) {
                this.field1463[var1].method2494();
            }
        }
        this.field1464 = new class206();
        this.field1466 = this.field1470;
    }

    @ObfuscatedName("dr.d(II)V")
    public void method2377(int arg0) {
        for (int var2 = 0; var2 < this.field1463.length; var2++) {
            class117 var3 = this.field1463[var2];
            if (var3 != null && var3.field1569 != 0 && var3.field1563) {
                var3.method2492(arg0);
                var3.field1563 = false;
            }
        }
    }
}
