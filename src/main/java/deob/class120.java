package deob;

@ObfuscatedName("do")
public class class120 implements class140 {

    @ObfuscatedName("do.q")
    public class125[] field1532;

    @ObfuscatedName("do.w")
    public class262 field1538 = new class262();

    @ObfuscatedName("do.e")
    public int field1531;

    @ObfuscatedName("do.p")
    public int field1534 = 0;

    @ObfuscatedName("do.k")
    public double field1535 = 1.0D;

    @ObfuscatedName("do.l")
    public int field1536 = 128;

    @ObfuscatedName("do.b")
    public class234 field1537;

    public class120(class234 arg0, class234 arg1, int arg2, double arg3, int arg4) {
        this.field1537 = arg1;
        this.field1531 = arg2;
        this.field1534 = this.field1531;
        this.field1535 = arg3;
        this.field1536 = arg4;
        int[] var7 = arg0.method3784(0);
        int var8 = var7.length;
        this.field1532 = new class125[arg0.method3785(0)];
        for (int var9 = 0; var9 < var8; var9++) {
            class301 var10 = new class301(arg0.method3775(0, var7[var9]));
            this.field1532[var7[var9]] = new class125(var10);
        }
    }

    @ObfuscatedName("do.q(I)I")
    public int method2506() {
        int var1 = 0;
        int var2 = 0;
        class125[] var3 = this.field1532;
        for (int var4 = 0; var4 < var3.length; var4++) {
            class125 var5 = var3[var4];
            if (var5 != null && var5.field1633 != null) {
                var1 += var5.field1633.length;
                int[] var6 = var5.field1633;
                for (int var7 = 0; var7 < var6.length; var7++) {
                    int var8 = var6[var7];
                    if (this.field1537.method3778(var8)) {
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

    @ObfuscatedName("do.w(D)V")
    public void method2488(double arg0) {
        this.field1535 = arg0;
        this.method2505();
    }

    @ObfuscatedName("do.e(II)[I")
    public int[] method2489(int arg0) {
        class125 var2 = this.field1532[arg0];
        if (var2 != null) {
            if (var2.field1632 != null) {
                this.field1538.method4503(var2);
                var2.field1634 = true;
                return var2.field1632;
            }
            boolean var3 = var2.method2589(this.field1535, this.field1536, this.field1537);
            if (var3) {
                if (this.field1534 == 0) {
                    class125 var4 = (class125) this.field1538.method4506();
                    var4.method2587();
                } else {
                    this.field1534--;
                }
                this.field1538.method4503(var2);
                var2.field1634 = true;
                return var2.field1632;
            }
        }
        return null;
    }

    @ObfuscatedName("do.p(II)I")
    public int method2491(int arg0) {
        return this.field1532[arg0] == null ? 0 : this.field1532[arg0].field1624;
    }

    @ObfuscatedName("do.k(IB)Z")
    public boolean method2476(int arg0) {
        return this.field1532[arg0].field1625;
    }

    @ObfuscatedName("do.l(IB)Z")
    public boolean method2477(int arg0) {
        return this.field1536 == 64;
    }

    @ObfuscatedName("do.b(I)V")
    public void method2505() {
        for (int var1 = 0; var1 < this.field1532.length; var1++) {
            if (this.field1532[var1] != null) {
                this.field1532[var1].method2587();
            }
        }
        this.field1538 = new class262();
        this.field1534 = this.field1531;
    }

    @ObfuscatedName("do.i(II)V")
    public void method2479(int arg0) {
        for (int var2 = 0; var2 < this.field1532.length; var2++) {
            class125 var3 = this.field1532[var2];
            if (var3 != null && var3.field1630 != 0 && var3.field1634) {
                var3.method2588(arg0);
                var3.field1634 = false;
            }
        }
    }
}
