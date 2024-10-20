package deob;

@ObfuscatedName("dx")
public class class125 implements class145 {

    @ObfuscatedName("dx.d")
    public class130[] field1690;

    @ObfuscatedName("dx.x")
    public class201 field1688 = new class201();

    @ObfuscatedName("dx.k")
    public int field1692;

    @ObfuscatedName("dx.z")
    public int field1687 = 0;

    @ObfuscatedName("dx.v")
    public double field1691 = 1.0D;

    @ObfuscatedName("dx.m")
    public int field1694 = 128;

    @ObfuscatedName("dx.b")
    public class243 field1693;

    public class125(class243 arg0, class243 arg1, int arg2, double arg3, int arg4) {
        this.field1693 = arg1;
        this.field1692 = arg2;
        this.field1687 = this.field1692;
        this.field1691 = arg3;
        this.field1694 = arg4;
        int[] var7 = arg0.method3945(0);
        int var8 = var7.length;
        this.field1690 = new class130[arg0.method3946(0)];
        for (int var9 = 0; var9 < var8; var9++) {
            class181 var10 = new class181(arg0.method3935(0, var7[var9]));
            this.field1690[var7[var9]] = new class130(var10);
        }
    }

    @ObfuscatedName("dx.d(D)V")
    public void method2265(double arg0) {
        this.field1691 = arg0;
        this.method2264();
    }

    @ObfuscatedName("dx.x(II)[I")
    public int[] method2288(int arg0) {
        class130 var2 = this.field1690[arg0];
        if (var2 != null) {
            if (var2.field1792 != null) {
                this.field1688.method3497(var2);
                var2.field1793 = true;
                return var2.field1792;
            }
            boolean var3 = var2.method2392(this.field1691, this.field1694, this.field1693);
            if (var3) {
                if (this.field1687 == 0) {
                    class130 var4 = (class130) this.field1688.method3485();
                    var4.method2390();
                } else {
                    this.field1687--;
                }
                this.field1688.method3497(var2);
                var2.field1793 = true;
                return var2.field1792;
            }
        }
        return null;
    }

    @ObfuscatedName("dx.k(II)I")
    public int method2280(int arg0) {
        return this.field1690[arg0] == null ? 0 : this.field1690[arg0].field1784;
    }

    @ObfuscatedName("dx.z(IB)Z")
    public boolean method2267(int arg0) {
        return this.field1690[arg0].field1785;
    }

    @ObfuscatedName("dx.v(II)Z")
    public boolean method2268(int arg0) {
        return this.field1694 == 64;
    }

    @ObfuscatedName("dx.m(B)V")
    public void method2264() {
        for (int var1 = 0; var1 < this.field1690.length; var1++) {
            if (this.field1690[var1] != null) {
                this.field1690[var1].method2390();
            }
        }
        this.field1688 = new class201();
        this.field1687 = this.field1692;
    }

    @ObfuscatedName("dx.b(II)V")
    public void method2270(int arg0) {
        for (int var2 = 0; var2 < this.field1690.length; var2++) {
            class130 var3 = this.field1690[var2];
            if (var3 != null && var3.field1790 != 0 && var3.field1793) {
                var3.method2391(arg0);
                var3.field1793 = false;
            }
        }
    }
}
