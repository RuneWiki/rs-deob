package deob;

@ObfuscatedName("dl")
public class class120 implements class140 {

    @ObfuscatedName("dl.m")
    public class125[] field1503;

    @ObfuscatedName("dl.f")
    public class273 field1506 = new class273();

    @ObfuscatedName("dl.q")
    public int field1505;

    @ObfuscatedName("dl.w")
    public int field1504 = 0;

    @ObfuscatedName("dl.o")
    public double field1502 = 1.0D;

    @ObfuscatedName("dl.u")
    public int field1507 = 128;

    @ObfuscatedName("dl.g")
    public class245 field1508;

    public class120(class245 arg0, class245 arg1, int arg2, double arg3, int arg4) {
        this.field1508 = arg1;
        this.field1505 = arg2;
        this.field1504 = this.field1505;
        this.field1502 = arg3;
        this.field1507 = arg4;
        int[] var7 = arg0.method4167(0);
        int var8 = var7.length;
        this.field1503 = new class125[arg0.method4168(0)];
        for (int var9 = 0; var9 < var8; var9++) {
            class202 var10 = new class202(arg0.method4156(0, var7[var9]));
            this.field1503[var7[var9]] = new class125(var10);
        }
    }

    @ObfuscatedName("dl.m(I)I")
    public int method2497() {
        int var1 = 0;
        int var2 = 0;
        class125[] var3 = this.field1503;
        for (int var4 = 0; var4 < var3.length; var4++) {
            class125 var5 = var3[var4];
            if (var5 != null && var5.field1601 != null) {
                var1 += var5.field1601.length;
                int[] var6 = var5.field1601;
                for (int var7 = 0; var7 < var6.length; var7++) {
                    int var8 = var6[var7];
                    if (this.field1508.method4159(var8)) {
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

    @ObfuscatedName("dl.f(D)V")
    public void method2511(double arg0) {
        this.field1502 = arg0;
        this.method2503();
    }

    @ObfuscatedName("dl.q(II)[I")
    public int[] method2499(int arg0) {
        class125 var2 = this.field1503[arg0];
        if (var2 != null) {
            if (var2.field1600 != null) {
                this.field1506.method4889(var2);
                var2.field1608 = true;
                return var2.field1600;
            }
            boolean var3 = var2.method2614(this.field1502, this.field1507, this.field1508);
            if (var3) {
                if (this.field1504 == 0) {
                    class125 var4 = (class125) this.field1506.method4855();
                    var4.method2604();
                } else {
                    this.field1504--;
                }
                this.field1506.method4889(var2);
                var2.field1608 = true;
                return var2.field1600;
            }
        }
        return null;
    }

    @ObfuscatedName("dl.w(II)I")
    public int method2500(int arg0) {
        return this.field1503[arg0] == null ? 0 : this.field1503[arg0].field1599;
    }

    @ObfuscatedName("dl.o(IB)Z")
    public boolean method2506(int arg0) {
        return this.field1503[arg0].field1603;
    }

    @ObfuscatedName("dl.u(II)Z")
    public boolean method2502(int arg0) {
        return this.field1507 == 64;
    }

    @ObfuscatedName("dl.g(I)V")
    public void method2503() {
        for (int var1 = 0; var1 < this.field1503.length; var1++) {
            if (this.field1503[var1] != null) {
                this.field1503[var1].method2604();
            }
        }
        this.field1506 = new class273();
        this.field1504 = this.field1505;
    }

    @ObfuscatedName("dl.l(II)V")
    public void method2525(int arg0) {
        for (int var2 = 0; var2 < this.field1503.length; var2++) {
            class125 var3 = this.field1503[var2];
            if (var3 != null && var3.field1605 != 0 && var3.field1608) {
                var3.method2613(arg0);
                var3.field1608 = false;
            }
        }
    }
}
