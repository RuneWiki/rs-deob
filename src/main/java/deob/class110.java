package deob;

@ObfuscatedName("dh")
public class class110 implements class106 {

    @ObfuscatedName("dh.i")
    public class90[] field1822;

    @ObfuscatedName("dh.p")
    public class177 field1823 = new class177();

    @ObfuscatedName("dh.a")
    public int field1824;

    @ObfuscatedName("dh.l")
    public int field1825 = 0;

    @ObfuscatedName("dh.q")
    public double field1826 = 1.0D;

    @ObfuscatedName("dh.b")
    public int field1829 = 128;

    @ObfuscatedName("dh.u")
    public class152 field1828;

    public class110(class152 arg0, class152 arg1, int arg2, double arg3, int arg4) {
        this.field1828 = arg1;
        this.field1824 = arg2;
        this.field1825 = this.field1824;
        this.field1826 = arg3;
        this.field1829 = arg4;
        int[] var7 = arg0.method2944(0);
        int var8 = var7.length;
        this.field1822 = new class90[arg0.method2945(0)];
        for (int var9 = 0; var9 < var8; var9++) {
            class127 var10 = new class127(arg0.method2932(0, var7[var9]));
            this.field1822[var7[var9]] = new class90(var10);
        }
    }

    @ObfuscatedName("dh.s(D)V")
    public void method2156(double arg0) {
        this.field1826 = arg0;
        this.method2157();
    }

    @ObfuscatedName("dh.i(IB)[I")
    public int[] method2129(int arg0) {
        class90 var2 = this.field1822[arg0];
        if (var2 != null) {
            if (var2.field1505 != null) {
                this.field1823.method3294(var2);
                var2.field1516 = true;
                return var2.field1505;
            }
            boolean var3 = var2.method1774(this.field1826, this.field1829, this.field1828);
            if (var3) {
                if (this.field1825 == 0) {
                    class90 var4 = (class90) this.field1823.method3302();
                    var4.method1782();
                } else {
                    this.field1825--;
                }
                this.field1823.method3294(var2);
                var2.field1516 = true;
                return var2.field1505;
            }
        }
        return null;
    }

    @ObfuscatedName("dh.p(IS)I")
    public int method2136(int arg0) {
        return this.field1822[arg0] == null ? 0 : this.field1822[arg0].field1507;
    }

    @ObfuscatedName("dh.a(II)Z")
    public boolean method2127(int arg0) {
        return this.field1822[arg0].field1506;
    }

    @ObfuscatedName("dh.l(II)Z")
    public boolean method2126(int arg0) {
        return this.field1829 == 64;
    }

    @ObfuscatedName("dh.t(I)V")
    public void method2157() {
        for (int var1 = 0; var1 < this.field1822.length; var1++) {
            if (this.field1822[var1] != null) {
                this.field1822[var1].method1782();
            }
        }
        this.field1823 = new class177();
        this.field1825 = this.field1824;
    }

    @ObfuscatedName("dh.r(IS)V")
    public void method2158(int arg0) {
        for (int var2 = 0; var2 < this.field1822.length; var2++) {
            class90 var3 = this.field1822[var2];
            if (var3 != null && var3.field1513 != 0 && var3.field1516) {
                var3.method1776(arg0);
                var3.field1516 = false;
            }
        }
    }
}
