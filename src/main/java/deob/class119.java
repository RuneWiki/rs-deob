package deob;

@ObfuscatedName("dp")
public class class119 implements class139 {

    @ObfuscatedName("dp.n")
    public class124[] field1509;

    @ObfuscatedName("dp.h")
    public class213 field1505 = new class213();

    @ObfuscatedName("dp.l")
    public int field1506;

    @ObfuscatedName("dp.g")
    public int field1507 = 0;

    @ObfuscatedName("dp.b")
    public double field1508 = 1.0D;

    @ObfuscatedName("dp.a")
    public int field1504 = 128;

    @ObfuscatedName("dp.c")
    public class254 field1510;

    public class119(class254 arg0, class254 arg1, int arg2, double arg3, int arg4) {
        this.field1510 = arg1;
        this.field1506 = arg2;
        this.field1507 = this.field1506;
        this.field1508 = arg3;
        this.field1504 = arg4;
        int[] var7 = arg0.method4465(0);
        int var8 = var7.length;
        this.field1509 = new class124[arg0.method4466(0)];
        for (int var9 = 0; var9 < var8; var9++) {
            class190 var10 = new class190(arg0.method4494(0, var7[var9]));
            this.field1509[var7[var9]] = new class124(var10);
        }
    }

    @ObfuscatedName("dp.n(I)I")
    public int method2548() {
        int var1 = 0;
        int var2 = 0;
        class124[] var3 = this.field1509;
        for (int var4 = 0; var4 < var3.length; var4++) {
            class124 var5 = var3[var4];
            if (var5 != null && var5.field1603 != null) {
                var1 += var5.field1603.length;
                int[] var6 = var5.field1603;
                for (int var7 = 0; var7 < var6.length; var7++) {
                    int var8 = var6[var7];
                    if (this.field1510.method4457(var8)) {
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

    @ObfuscatedName("dp.h(D)V")
    public void method2547(double arg0) {
        this.field1508 = arg0;
        this.method2552();
    }

    @ObfuscatedName("dp.l(II)[I")
    public int[] method2567(int arg0) {
        class124 var2 = this.field1509[arg0];
        if (var2 != null) {
            if (var2.field1609 != null) {
                this.field1505.method3982(var2);
                var2.field1610 = true;
                return var2.field1609;
            }
            boolean var3 = var2.method2657(this.field1508, this.field1504, this.field1510);
            if (var3) {
                if (this.field1507 == 0) {
                    class124 var4 = (class124) this.field1505.method3985();
                    var4.method2656();
                } else {
                    this.field1507--;
                }
                this.field1505.method3982(var2);
                var2.field1610 = true;
                return var2.field1609;
            }
        }
        return null;
    }

    @ObfuscatedName("dp.g(II)I")
    public int method2546(int arg0) {
        return this.field1509[arg0] == null ? 0 : this.field1509[arg0].field1605;
    }

    @ObfuscatedName("dp.b(IB)Z")
    public boolean method2550(int arg0) {
        return this.field1509[arg0].field1601;
    }

    @ObfuscatedName("dp.a(II)Z")
    public boolean method2551(int arg0) {
        return this.field1504 == 64;
    }

    @ObfuscatedName("dp.c(I)V")
    public void method2552() {
        for (int var1 = 0; var1 < this.field1509.length; var1++) {
            if (this.field1509[var1] != null) {
                this.field1509[var1].method2656();
            }
        }
        this.field1505 = new class213();
        this.field1507 = this.field1506;
    }

    @ObfuscatedName("dp.z(IB)V")
    public void method2553(int arg0) {
        for (int var2 = 0; var2 < this.field1509.length; var2++) {
            class124 var3 = this.field1509[var2];
            if (var3 != null && var3.field1607 != 0 && var3.field1610) {
                var3.method2662(arg0);
                var3.field1610 = false;
            }
        }
    }
}
