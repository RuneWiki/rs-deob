package deob;

@ObfuscatedName("db")
public class class124 implements class144 {

    @ObfuscatedName("db.d")
    public class129[] field1696;

    @ObfuscatedName("db.z")
    public class218 field1692 = new class218();

    @ObfuscatedName("db.n")
    public int field1691;

    @ObfuscatedName("db.r")
    public int field1690 = 0;

    @ObfuscatedName("db.e")
    public double field1689 = 1.0D;

    @ObfuscatedName("db.y")
    public int field1694 = 128;

    @ObfuscatedName("db.k")
    public class262 field1695;

    public class124(class262 arg0, class262 arg1, int arg2, double arg3, int arg4) {
        this.field1695 = arg1;
        this.field1691 = arg2;
        this.field1690 = this.field1691;
        this.field1689 = arg3;
        this.field1694 = arg4;
        int[] var7 = arg0.method4364(0);
        int var8 = var7.length;
        this.field1696 = new class129[arg0.method4285(0)];
        for (int var9 = 0; var9 < var8; var9++) {
            class195 var10 = new class195(arg0.method4273(0, var7[var9]));
            this.field1696[var7[var9]] = new class129(var10);
        }
    }

    @ObfuscatedName("db.d(I)I")
    public int method2391() {
        int var1 = 0;
        int var2 = 0;
        class129[] var3 = this.field1696;
        for (int var4 = 0; var4 < var3.length; var4++) {
            class129 var5 = var3[var4];
            if (var5 != null && var5.field1786 != null) {
                var1 += var5.field1786.length;
                int[] var6 = var5.field1786;
                for (int var7 = 0; var7 < var6.length; var7++) {
                    int var8 = var6[var7];
                    if (this.field1695.method4274(var8)) {
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

    @ObfuscatedName("db.z(D)V")
    public void method2392(double arg0) {
        this.field1689 = arg0;
        this.method2397();
    }

    @ObfuscatedName("db.n(II)[I")
    public int[] method2411(int arg0) {
        class129 var2 = this.field1696[arg0];
        if (var2 != null) {
            if (var2.field1796 != null) {
                this.field1692.method3794(var2);
                var2.field1797 = true;
                return var2.field1796;
            }
            boolean var3 = var2.method2509(this.field1689, this.field1694, this.field1695);
            if (var3) {
                if (this.field1690 == 0) {
                    class129 var4 = (class129) this.field1692.method3806();
                    var4.method2510();
                } else {
                    this.field1690--;
                }
                this.field1692.method3794(var2);
                var2.field1797 = true;
                return var2.field1796;
            }
        }
        return null;
    }

    @ObfuscatedName("db.r(IS)I")
    public int method2394(int arg0) {
        return this.field1696[arg0] == null ? 0 : this.field1696[arg0].field1788;
    }

    @ObfuscatedName("db.e(II)Z")
    public boolean method2395(int arg0) {
        return this.field1696[arg0].field1784;
    }

    @ObfuscatedName("db.y(II)Z")
    public boolean method2396(int arg0) {
        return this.field1694 == 64;
    }

    @ObfuscatedName("db.k(S)V")
    public void method2397() {
        for (int var1 = 0; var1 < this.field1696.length; var1++) {
            if (this.field1696[var1] != null) {
                this.field1696[var1].method2510();
            }
        }
        this.field1692 = new class218();
        this.field1690 = this.field1691;
    }

    @ObfuscatedName("db.s(II)V")
    public void method2398(int arg0) {
        for (int var2 = 0; var2 < this.field1696.length; var2++) {
            class129 var3 = this.field1696[var2];
            if (var3 != null && var3.field1798 != 0 && var3.field1797) {
                var3.method2511(arg0);
                var3.field1797 = false;
            }
        }
    }
}
