package deob;

@ObfuscatedName("dm")
public class class110 implements class106 {

    @ObfuscatedName("dm.a")
    public class90[] field1824;

    @ObfuscatedName("dm.x")
    public class177 field1827 = new class177();

    @ObfuscatedName("dm.e")
    public int field1825;

    @ObfuscatedName("dm.r")
    public int field1826 = 0;

    @ObfuscatedName("dm.p")
    public double field1829 = 1.0D;

    @ObfuscatedName("dm.n")
    public int field1828 = 128;

    @ObfuscatedName("dm.o")
    public class152 field1823;

    public class110(class152 arg0, class152 arg1, int arg2, double arg3, int arg4) {
        this.field1823 = arg1;
        this.field1825 = arg2;
        this.field1826 = this.field1825;
        this.field1829 = arg3;
        this.field1828 = arg4;
        int[] var7 = arg0.method2946(0);
        int var8 = var7.length;
        this.field1824 = new class90[arg0.method2947(0)];
        for (int var9 = 0; var9 < var8; var9++) {
            class127 var10 = new class127(arg0.method2961(0, var7[var9]));
            this.field1824[var7[var9]] = new class90(var10);
        }
    }

    @ObfuscatedName("dm.f(D)V")
    public void method2161(double arg0) {
        this.field1829 = arg0;
        this.method2164();
    }

    @ObfuscatedName("dm.a(II)[I")
    public int[] method2135(int arg0) {
        class90 var2 = this.field1824[arg0];
        if (var2 != null) {
            if (var2.field1510 != null) {
                this.field1827.method3248(var2);
                var2.field1511 = true;
                return var2.field1510;
            }
            boolean var3 = var2.method1797(this.field1829, this.field1828, this.field1823);
            if (var3) {
                if (this.field1826 == 0) {
                    class90 var4 = (class90) this.field1827.method3251();
                    var4.method1795();
                } else {
                    this.field1826--;
                }
                this.field1827.method3248(var2);
                var2.field1511 = true;
                return var2.field1510;
            }
        }
        return null;
    }

    @ObfuscatedName("dm.x(II)I")
    public int method2131(int arg0) {
        return this.field1824[arg0] == null ? 0 : this.field1824[arg0].field1502;
    }

    @ObfuscatedName("dm.e(IB)Z")
    public boolean method2133(int arg0) {
        return this.field1824[arg0].field1503;
    }

    @ObfuscatedName("dm.r(II)Z")
    public boolean method2134(int arg0) {
        return this.field1828 == 64;
    }

    @ObfuscatedName("dm.w(B)V")
    public void method2164() {
        for (int var1 = 0; var1 < this.field1824.length; var1++) {
            if (this.field1824[var1] != null) {
                this.field1824[var1].method1795();
            }
        }
        this.field1827 = new class177();
        this.field1826 = this.field1825;
    }

    @ObfuscatedName("dm.d(II)V")
    public void method2163(int arg0) {
        for (int var2 = 0; var2 < this.field1824.length; var2++) {
            class90 var3 = this.field1824[var2];
            if (var3 != null && var3.field1504 != 0 && var3.field1511) {
                var3.method1793(arg0);
                var3.field1511 = false;
            }
        }
    }
}
