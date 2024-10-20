package deob;

@ObfuscatedName("du")
public class class119 implements class139 {

    @ObfuscatedName("du.a")
    public class124[] field1525;

    @ObfuscatedName("du.s")
    public class213 field1522 = new class213();

    @ObfuscatedName("du.g")
    public int field1528;

    @ObfuscatedName("du.x")
    public int field1524 = 0;

    @ObfuscatedName("du.h")
    public double field1529 = 1.0D;

    @ObfuscatedName("du.f")
    public int field1521 = 128;

    @ObfuscatedName("du.p")
    public class255 field1527;

    public class119(class255 arg0, class255 arg1, int arg2, double arg3, int arg4) {
        this.field1527 = arg1;
        this.field1528 = arg2;
        this.field1524 = this.field1528;
        this.field1529 = arg3;
        this.field1521 = arg4;
        int[] var7 = arg0.method4433(0);
        int var8 = var7.length;
        this.field1525 = new class124[arg0.method4419(0)];
        for (int var9 = 0; var9 < var8; var9++) {
            class190 var10 = new class190(arg0.method4422(0, var7[var9]));
            this.field1525[var7[var9]] = new class124(var10);
        }
    }

    @ObfuscatedName("du.a(I)I")
    public int method2571() {
        int var1 = 0;
        int var2 = 0;
        class124[] var3 = this.field1525;
        for (int var4 = 0; var4 < var3.length; var4++) {
            class124 var5 = var3[var4];
            if (var5 != null && var5.field1621 != null) {
                var1 += var5.field1621.length;
                int[] var6 = var5.field1621;
                for (int var7 = 0; var7 < var6.length; var7++) {
                    int var8 = var6[var7];
                    if (this.field1527.method4508(var8)) {
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

    @ObfuscatedName("du.s(D)V")
    public void method2562(double arg0) {
        this.field1529 = arg0;
        this.method2561();
    }

    @ObfuscatedName("du.g(II)[I")
    public int[] method2563(int arg0) {
        class124 var2 = this.field1525[arg0];
        if (var2 != null) {
            if (var2.field1624 != null) {
                this.field1522.method3967(var2);
                var2.field1622 = true;
                return var2.field1624;
            }
            boolean var3 = var2.method2665(this.field1529, this.field1521, this.field1527);
            if (var3) {
                if (this.field1524 == 0) {
                    class124 var4 = (class124) this.field1522.method3970();
                    var4.method2664();
                } else {
                    this.field1524--;
                }
                this.field1522.method3967(var2);
                var2.field1622 = true;
                return var2.field1624;
            }
        }
        return null;
    }

    @ObfuscatedName("du.x(II)I")
    public int method2564(int arg0) {
        return this.field1525[arg0] == null ? 0 : this.field1525[arg0].field1616;
    }

    @ObfuscatedName("du.h(IB)Z")
    public boolean method2565(int arg0) {
        return this.field1525[arg0].field1618;
    }

    @ObfuscatedName("du.f(II)Z")
    public boolean method2566(int arg0) {
        return this.field1521 == 64;
    }

    @ObfuscatedName("du.p(I)V")
    public void method2561() {
        for (int var1 = 0; var1 < this.field1525.length; var1++) {
            if (this.field1525[var1] != null) {
                this.field1525[var1].method2664();
            }
        }
        this.field1522 = new class213();
        this.field1524 = this.field1528;
    }

    @ObfuscatedName("du.m(IB)V")
    public void method2568(int arg0) {
        for (int var2 = 0; var2 < this.field1525.length; var2++) {
            class124 var3 = this.field1525[var2];
            if (var3 != null && var3.field1613 != 0 && var3.field1622) {
                var3.method2667(arg0);
                var3.field1622 = false;
            }
        }
    }
}
