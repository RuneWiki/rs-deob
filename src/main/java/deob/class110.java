package deob;

@ObfuscatedName("dv")
public class class110 implements class106 {

    @ObfuscatedName("dv.d")
    public class90[] field1825;

    @ObfuscatedName("dv.g")
    public class177 field1826 = new class177();

    @ObfuscatedName("dv.a")
    public int field1824;

    @ObfuscatedName("dv.t")
    public int field1828 = 0;

    @ObfuscatedName("dv.f")
    public double field1827 = 1.0D;

    @ObfuscatedName("dv.c")
    public int field1823 = 128;

    @ObfuscatedName("dv.p")
    public class152 field1829;

    public class110(class152 arg0, class152 arg1, int arg2, double arg3, int arg4) {
        this.field1829 = arg1;
        this.field1824 = arg2;
        this.field1828 = this.field1824;
        this.field1827 = arg3;
        this.field1823 = arg4;
        int[] var7 = arg0.method2951(0);
        int var8 = var7.length;
        this.field1825 = new class90[arg0.method2943(0)];
        for (int var9 = 0; var9 < var8; var9++) {
            class127 var10 = new class127(arg0.method2958(0, var7[var9]));
            this.field1825[var7[var9]] = new class90(var10);
        }
    }

    @ObfuscatedName("dv.z(D)V")
    public void method2171(double arg0) {
        this.field1827 = arg0;
        this.method2175();
    }

    @ObfuscatedName("dv.d(IB)[I")
    public int[] method2152(int arg0) {
        class90 var2 = this.field1825[arg0];
        if (var2 != null) {
            if (var2.field1498 != null) {
                this.field1826.method3289(var2);
                var2.field1500 = true;
                return var2.field1498;
            }
            boolean var3 = var2.method1801(this.field1827, this.field1823, this.field1829);
            if (var3) {
                if (this.field1828 == 0) {
                    class90 var4 = (class90) this.field1826.method3277();
                    var4.method1802();
                } else {
                    this.field1828--;
                }
                this.field1826.method3289(var2);
                var2.field1500 = true;
                return var2.field1498;
            }
        }
        return null;
    }

    @ObfuscatedName("dv.g(II)I")
    public int method2149(int arg0) {
        return this.field1825[arg0] == null ? 0 : this.field1825[arg0].field1494;
    }

    @ObfuscatedName("dv.a(II)Z")
    public boolean method2154(int arg0) {
        return this.field1825[arg0].field1491;
    }

    @ObfuscatedName("dv.t(IB)Z")
    public boolean method2150(int arg0) {
        return this.field1823 == 64;
    }

    @ObfuscatedName("dv.r(I)V")
    public void method2175() {
        for (int var1 = 0; var1 < this.field1825.length; var1++) {
            if (this.field1825[var1] != null) {
                this.field1825[var1].method1802();
            }
        }
        this.field1826 = new class177();
        this.field1828 = this.field1824;
    }

    @ObfuscatedName("dv.h(II)V")
    public void method2174(int arg0) {
        for (int var2 = 0; var2 < this.field1825.length; var2++) {
            class90 var3 = this.field1825[var2];
            if (var3 != null && var3.field1499 != 0 && var3.field1500) {
                var3.method1803(arg0);
                var3.field1500 = false;
            }
        }
    }
}
