package deob;

@ObfuscatedName("dg")
public class class114 implements class134 {

    @ObfuscatedName("dg.c")
    public class119[] field1506;

    @ObfuscatedName("dg.q")
    public class208 field1510 = new class208();

    @ObfuscatedName("dg.m")
    public int field1508;

    @ObfuscatedName("dg.j")
    public int field1509 = 0;

    @ObfuscatedName("dg.g")
    public double field1507 = 1.0D;

    @ObfuscatedName("dg.i")
    public int field1511 = 128;

    @ObfuscatedName("dg.h")
    public class250 field1512;

    public class114(class250 arg0, class250 arg1, int arg2, double arg3, int arg4) {
        this.field1512 = arg1;
        this.field1508 = arg2;
        this.field1509 = this.field1508;
        this.field1507 = arg3;
        this.field1511 = arg4;
        int[] var7 = arg0.method4221(0);
        int var8 = var7.length;
        this.field1506 = new class119[arg0.method4222(0)];
        for (int var9 = 0; var9 < var8; var9++) {
            class185 var10 = new class185(arg0.method4210(0, var7[var9]));
            this.field1506[var7[var9]] = new class119(var10);
        }
    }

    @ObfuscatedName("dg.c(B)I")
    public int method2290() {
        int var1 = 0;
        int var2 = 0;
        class119[] var3 = this.field1506;
        for (int var4 = 0; var4 < var3.length; var4++) {
            class119 var5 = var3[var4];
            if (var5 != null && var5.field1602 != null) {
                var1 += var5.field1602.length;
                int[] var6 = var5.field1602;
                for (int var7 = 0; var7 < var6.length; var7++) {
                    int var8 = var6[var7];
                    if (this.field1512.method4249(var8)) {
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

    @ObfuscatedName("dg.q(D)V")
    public void method2291(double arg0) {
        this.field1507 = arg0;
        this.method2313();
    }

    @ObfuscatedName("dg.m(II)[I")
    public int[] method2307(int arg0) {
        class119 var2 = this.field1506[arg0];
        if (var2 != null) {
            if (var2.field1608 != null) {
                this.field1510.method3753(var2);
                var2.field1609 = true;
                return var2.field1608;
            }
            boolean var3 = var2.method2403(this.field1507, this.field1511, this.field1512);
            if (var3) {
                if (this.field1509 == 0) {
                    class119 var4 = (class119) this.field1510.method3744();
                    var4.method2411();
                } else {
                    this.field1509--;
                }
                this.field1510.method3753(var2);
                var2.field1609 = true;
                return var2.field1608;
            }
        }
        return null;
    }

    @ObfuscatedName("dg.j(II)I")
    public int method2293(int arg0) {
        return this.field1506[arg0] == null ? 0 : this.field1506[arg0].field1598;
    }

    @ObfuscatedName("dg.g(II)Z")
    public boolean method2294(int arg0) {
        return this.field1506[arg0].field1601;
    }

    @ObfuscatedName("dg.i(II)Z")
    public boolean method2314(int arg0) {
        return this.field1511 == 64;
    }

    @ObfuscatedName("dg.h(B)V")
    public void method2313() {
        for (int var1 = 0; var1 < this.field1506.length; var1++) {
            if (this.field1506[var1] != null) {
                this.field1506[var1].method2411();
            }
        }
        this.field1510 = new class208();
        this.field1509 = this.field1508;
    }

    @ObfuscatedName("dg.l(II)V")
    public void method2297(int arg0) {
        for (int var2 = 0; var2 < this.field1506.length; var2++) {
            class119 var3 = this.field1506[var2];
            if (var3 != null && var3.field1606 != 0 && var3.field1609) {
                var3.method2405(arg0);
                var3.field1609 = false;
            }
        }
    }
}
