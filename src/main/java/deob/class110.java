package deob;

@ObfuscatedName("dw")
public class class110 implements class106 {

    @ObfuscatedName("dw.j")
    public class90[] field1813;

    @ObfuscatedName("dw.r")
    public class177 field1807 = new class177();

    @ObfuscatedName("dw.v")
    public int field1808;

    @ObfuscatedName("dw.p")
    public int field1809 = 0;

    @ObfuscatedName("dw.e")
    public double field1815 = 1.0D;

    @ObfuscatedName("dw.d")
    public int field1811 = 128;

    @ObfuscatedName("dw.y")
    public class152 field1812;

    public class110(class152 arg0, class152 arg1, int arg2, double arg3, int arg4) {
        this.field1812 = arg1;
        this.field1808 = arg2;
        this.field1809 = this.field1808;
        this.field1815 = arg3;
        this.field1811 = arg4;
        int[] var7 = arg0.method2968(0);
        int var8 = var7.length;
        this.field1813 = new class90[arg0.method2969(0)];
        for (int var9 = 0; var9 < var8; var9++) {
            class127 var10 = new class127(arg0.method3016(0, var7[var9]));
            this.field1813[var7[var9]] = new class90(var10);
        }
    }

    @ObfuscatedName("dw.u(D)V")
    public void method2224(double arg0) {
        this.field1815 = arg0;
        this.method2219();
    }

    @ObfuscatedName("dw.j(IB)[I")
    public int[] method2204(int arg0) {
        class90 var2 = this.field1813[arg0];
        if (var2 != null) {
            if (var2.field1485 != null) {
                this.field1807.method3333(var2);
                var2.field1473 = true;
                return var2.field1485;
            }
            boolean var3 = var2.method1841(this.field1815, this.field1811, this.field1812);
            if (var3) {
                if (this.field1809 == 0) {
                    class90 var4 = (class90) this.field1807.method3325();
                    var4.method1838();
                } else {
                    this.field1809--;
                }
                this.field1807.method3333(var2);
                var2.field1473 = true;
                return var2.field1485;
            }
        }
        return null;
    }

    @ObfuscatedName("dw.r(IB)I")
    public int method2198(int arg0) {
        return this.field1813[arg0] == null ? 0 : this.field1813[arg0].field1475;
    }

    @ObfuscatedName("dw.v(II)Z")
    public boolean method2199(int arg0) {
        return this.field1813[arg0].field1478;
    }

    @ObfuscatedName("dw.p(IB)Z")
    public boolean method2200(int arg0) {
        return this.field1811 == 64;
    }

    @ObfuscatedName("dw.f(B)V")
    public void method2219() {
        for (int var1 = 0; var1 < this.field1813.length; var1++) {
            if (this.field1813[var1] != null) {
                this.field1813[var1].method1838();
            }
        }
        this.field1807 = new class177();
        this.field1809 = this.field1808;
    }

    @ObfuscatedName("dw.k(IB)V")
    public void method2220(int arg0) {
        for (int var2 = 0; var2 < this.field1813.length; var2++) {
            class90 var3 = this.field1813[var2];
            if (var3 != null && var3.field1483 != 0 && var3.field1473) {
                var3.method1839(arg0);
                var3.field1473 = false;
            }
        }
    }
}
