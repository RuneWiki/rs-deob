package deob;

@ObfuscatedName("dn")
public class class110 implements class106 {

    @ObfuscatedName("dn.x")
    public class90[] field1797;

    @ObfuscatedName("dn.p")
    public class177 field1796 = new class177();

    @ObfuscatedName("dn.k")
    public int field1799;

    @ObfuscatedName("dn.a")
    public int field1798 = 0;

    @ObfuscatedName("dn.q")
    public double field1802 = 1.0D;

    @ObfuscatedName("dn.j")
    public int field1795 = 128;

    @ObfuscatedName("dn.v")
    public class152 field1800;

    public class110(class152 arg0, class152 arg1, int arg2, double arg3, int arg4) {
        this.field1800 = arg1;
        this.field1799 = arg2;
        this.field1798 = this.field1799;
        this.field1802 = arg3;
        this.field1795 = arg4;
        int[] var7 = arg0.method2982(0);
        int var8 = var7.length;
        this.field1797 = new class90[arg0.method2929(0)];
        for (int var9 = 0; var9 < var8; var9++) {
            class127 var10 = new class127(arg0.method2920(0, var7[var9]));
            this.field1797[var7[var9]] = new class90(var10);
        }
    }

    @ObfuscatedName("dn.t(D)V")
    public void method2180(double arg0) {
        this.field1802 = arg0;
        this.method2177();
    }

    @ObfuscatedName("dn.x(IS)[I")
    public int[] method2153(int arg0) {
        class90 var2 = this.field1797[arg0];
        if (var2 != null) {
            if (var2.field1471 != null) {
                this.field1796.method3268(var2);
                var2.field1480 = true;
                return var2.field1471;
            }
            boolean var3 = var2.method1799(this.field1802, this.field1795, this.field1800);
            if (var3) {
                if (this.field1798 == 0) {
                    class90 var4 = (class90) this.field1796.method3267();
                    var4.method1804();
                } else {
                    this.field1798--;
                }
                this.field1796.method3268(var2);
                var2.field1480 = true;
                return var2.field1471;
            }
        }
        return null;
    }

    @ObfuscatedName("dn.p(II)I")
    public int method2150(int arg0) {
        return this.field1797[arg0] == null ? 0 : this.field1797[arg0].field1470;
    }

    @ObfuscatedName("dn.k(II)Z")
    public boolean method2151(int arg0) {
        return this.field1797[arg0].field1473;
    }

    @ObfuscatedName("dn.a(II)Z")
    public boolean method2152(int arg0) {
        return this.field1795 == 64;
    }

    @ObfuscatedName("dn.r(B)V")
    public void method2177() {
        for (int var1 = 0; var1 < this.field1797.length; var1++) {
            if (this.field1797[var1] != null) {
                this.field1797[var1].method1804();
            }
        }
        this.field1796 = new class177();
        this.field1798 = this.field1799;
    }

    @ObfuscatedName("dn.g(II)V")
    public void method2178(int arg0) {
        for (int var2 = 0; var2 < this.field1797.length; var2++) {
            class90 var3 = this.field1797[var2];
            if (var3 != null && var3.field1478 != 0 && var3.field1480) {
                var3.method1801(arg0);
                var3.field1480 = false;
            }
        }
    }
}
