package deob;

@ObfuscatedName("dg")
public class class110 implements class106 {

    @ObfuscatedName("dg.q")
    public class90[] field1830;

    @ObfuscatedName("dg.c")
    public class177 field1823 = new class177();

    @ObfuscatedName("dg.p")
    public int field1824;

    @ObfuscatedName("dg.z")
    public int field1825 = 0;

    @ObfuscatedName("dg.m")
    public double field1826 = 1.0D;

    @ObfuscatedName("dg.k")
    public int field1827 = 128;

    @ObfuscatedName("dg.v")
    public class153 field1828;

    public class110(class153 arg0, class153 arg1, int arg2, double arg3, int arg4) {
        this.field1828 = arg1;
        this.field1824 = arg2;
        this.field1825 = this.field1824;
        this.field1826 = arg3;
        this.field1827 = arg4;
        int[] var7 = arg0.method2964(0);
        int var8 = var7.length;
        this.field1830 = new class90[arg0.method2962(0)];
        for (int var9 = 0; var9 < var8; var9++) {
            class127 var10 = new class127(arg0.method2952(0, var7[var9]));
            this.field1830[var7[var9]] = new class90(var10);
        }
    }

    @ObfuscatedName("dg.g(D)V")
    public void method2189(double arg0) {
        this.field1826 = arg0;
        this.method2190();
    }

    @ObfuscatedName("dg.q(II)[I")
    public int[] method2164(int arg0) {
        class90 var2 = this.field1830[arg0];
        if (var2 != null) {
            if (var2.field1516 != null) {
                this.field1823.method3277(var2);
                var2.field1517 = true;
                return var2.field1516;
            }
            boolean var3 = var2.method1842(this.field1826, this.field1827, this.field1828);
            if (var3) {
                if (this.field1825 == 0) {
                    class90 var4 = (class90) this.field1823.method3280();
                    var4.method1840();
                } else {
                    this.field1825--;
                }
                this.field1823.method3277(var2);
                var2.field1517 = true;
                return var2.field1516;
            }
        }
        return null;
    }

    @ObfuscatedName("dg.c(II)I")
    public int method2162(int arg0) {
        return this.field1830[arg0] == null ? 0 : this.field1830[arg0].field1514;
    }

    @ObfuscatedName("dg.p(II)Z")
    public boolean method2167(int arg0) {
        return this.field1830[arg0].field1512;
    }

    @ObfuscatedName("dg.z(II)Z")
    public boolean method2161(int arg0) {
        return this.field1827 == 64;
    }

    @ObfuscatedName("dg.e(B)V")
    public void method2190() {
        for (int var1 = 0; var1 < this.field1830.length; var1++) {
            if (this.field1830[var1] != null) {
                this.field1830[var1].method1840();
            }
        }
        this.field1823 = new class177();
        this.field1825 = this.field1824;
    }

    @ObfuscatedName("dg.n(II)V")
    public void method2194(int arg0) {
        for (int var2 = 0; var2 < this.field1830.length; var2++) {
            class90 var3 = this.field1830[var2];
            if (var3 != null && var3.field1509 != 0 && var3.field1517) {
                var3.method1843(arg0);
                var3.field1517 = false;
            }
        }
    }
}
