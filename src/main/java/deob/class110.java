package deob;

@ObfuscatedName("de")
public class class110 implements class106 {

    @ObfuscatedName("de.i")
    public class90[] field1832;

    @ObfuscatedName("de.w")
    public class177 field1838 = new class177();

    @ObfuscatedName("de.f")
    public int field1833;

    @ObfuscatedName("de.e")
    public int field1831 = 0;

    @ObfuscatedName("de.t")
    public double field1834 = 1.0D;

    @ObfuscatedName("de.d")
    public int field1836 = 128;

    @ObfuscatedName("de.p")
    public class152 field1837;

    public class110(class152 arg0, class152 arg1, int arg2, double arg3, int arg4) {
        this.field1837 = arg1;
        this.field1833 = arg2;
        this.field1831 = this.field1833;
        this.field1834 = arg3;
        this.field1836 = arg4;
        int[] var7 = arg0.method3014(0);
        int var8 = var7.length;
        this.field1832 = new class90[arg0.method2980(0)];
        for (int var9 = 0; var9 < var8; var9++) {
            class127 var10 = new class127(arg0.method2970(0, var7[var9]));
            this.field1832[var7[var9]] = new class90(var10);
        }
    }

    @ObfuscatedName("de.m(D)V")
    public void method2225(double arg0) {
        this.field1834 = arg0;
        this.method2228();
    }

    @ObfuscatedName("de.i(II)[I")
    public int[] method2201(int arg0) {
        class90 var2 = this.field1832[arg0];
        if (var2 != null) {
            if (var2.field1502 != null) {
                this.field1838.method3290(var2);
                var2.field1491 = true;
                return var2.field1502;
            }
            boolean var3 = var2.method1852(this.field1834, this.field1836, this.field1837);
            if (var3) {
                if (this.field1831 == 0) {
                    class90 var4 = (class90) this.field1838.method3293();
                    var4.method1856();
                } else {
                    this.field1831--;
                }
                this.field1838.method3290(var2);
                var2.field1491 = true;
                return var2.field1502;
            }
        }
        return null;
    }

    @ObfuscatedName("de.w(II)I")
    public int method2200(int arg0) {
        return this.field1832[arg0] == null ? 0 : this.field1832[arg0].field1494;
    }

    @ObfuscatedName("de.f(II)Z")
    public boolean method2198(int arg0) {
        return this.field1832[arg0].field1495;
    }

    @ObfuscatedName("de.e(II)Z")
    public boolean method2207(int arg0) {
        return this.field1836 == 64;
    }

    @ObfuscatedName("de.u(I)V")
    public void method2228() {
        for (int var1 = 0; var1 < this.field1832.length; var1++) {
            if (this.field1832[var1] != null) {
                this.field1832[var1].method1856();
            }
        }
        this.field1838 = new class177();
        this.field1831 = this.field1833;
    }

    @ObfuscatedName("de.g(II)V")
    public void method2226(int arg0) {
        for (int var2 = 0; var2 < this.field1832.length; var2++) {
            class90 var3 = this.field1832[var2];
            if (var3 != null && var3.field1500 != 0 && var3.field1491) {
                var3.method1851(arg0);
                var3.field1491 = false;
            }
        }
    }
}
