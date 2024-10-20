package deob;

@ObfuscatedName("db")
public class class125 implements class145 {

    @ObfuscatedName("db.m")
    public class130[] field1693;

    @ObfuscatedName("db.p")
    public class201 field1697 = new class201();

    @ObfuscatedName("db.i")
    public int field1691;

    @ObfuscatedName("db.j")
    public int field1692 = 0;

    @ObfuscatedName("db.v")
    public double field1695 = 1.0D;

    @ObfuscatedName("db.x")
    public int field1694 = 128;

    @ObfuscatedName("db.e")
    public class243 field1690;

    public class125(class243 arg0, class243 arg1, int arg2, double arg3, int arg4) {
        this.field1690 = arg1;
        this.field1691 = arg2;
        this.field1692 = this.field1691;
        this.field1695 = arg3;
        this.field1694 = arg4;
        int[] var7 = arg0.method3936(0);
        int var8 = var7.length;
        this.field1693 = new class130[arg0.method3941(0)];
        for (int var9 = 0; var9 < var8; var9++) {
            class181 var10 = new class181(arg0.method3930(0, var7[var9]));
            this.field1693[var7[var9]] = new class130(var10);
        }
    }

    @ObfuscatedName("db.m(D)V")
    public void method2280(double arg0) {
        this.field1695 = arg0;
        this.method2269();
    }

    @ObfuscatedName("db.p(II)[I")
    public int[] method2282(int arg0) {
        class130 var2 = this.field1693[arg0];
        if (var2 != null) {
            if (var2.field1798 != null) {
                this.field1697.method3482(var2);
                var2.field1801 = true;
                return var2.field1798;
            }
            boolean var3 = var2.method2370(this.field1695, this.field1694, this.field1690);
            if (var3) {
                if (this.field1692 == 0) {
                    class130 var4 = (class130) this.field1697.method3485();
                    var4.method2369();
                } else {
                    this.field1692--;
                }
                this.field1697.method3482(var2);
                var2.field1801 = true;
                return var2.field1798;
            }
        }
        return null;
    }

    @ObfuscatedName("db.i(II)I")
    public int method2266(int arg0) {
        return this.field1693[arg0] == null ? 0 : this.field1693[arg0].field1792;
    }

    @ObfuscatedName("db.j(II)Z")
    public boolean method2267(int arg0) {
        return this.field1693[arg0].field1797;
    }

    @ObfuscatedName("db.v(IS)Z")
    public boolean method2268(int arg0) {
        return this.field1694 == 64;
    }

    @ObfuscatedName("db.x(B)V")
    public void method2269() {
        for (int var1 = 0; var1 < this.field1693.length; var1++) {
            if (this.field1693[var1] != null) {
                this.field1693[var1].method2369();
            }
        }
        this.field1697 = new class201();
        this.field1692 = this.field1691;
    }

    @ObfuscatedName("db.e(II)V")
    public void method2270(int arg0) {
        for (int var2 = 0; var2 < this.field1693.length; var2++) {
            class130 var3 = this.field1693[var2];
            if (var3 != null && var3.field1793 != 0 && var3.field1801) {
                var3.method2371(arg0);
                var3.field1801 = false;
            }
        }
    }
}
