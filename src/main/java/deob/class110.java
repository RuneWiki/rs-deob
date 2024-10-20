package deob;

@ObfuscatedName("db")
public class class110 implements class106 {

    @ObfuscatedName("db.t")
    public class90[] field1853;

    @ObfuscatedName("db.l")
    public class177 field1850 = new class177();

    @ObfuscatedName("db.c")
    public int field1851;

    @ObfuscatedName("db.d")
    public int field1849 = 0;

    @ObfuscatedName("db.b")
    public double field1855 = 1.0D;

    @ObfuscatedName("db.i")
    public int field1852 = 128;

    @ObfuscatedName("db.p")
    public class152 field1854;

    public class110(class152 arg0, class152 arg1, int arg2, double arg3, int arg4) {
        this.field1854 = arg1;
        this.field1851 = arg2;
        this.field1849 = this.field1851;
        this.field1855 = arg3;
        this.field1852 = arg4;
        int[] var7 = arg0.method3020(0);
        int var8 = var7.length;
        this.field1853 = new class90[arg0.method3048(0)];
        for (int var9 = 0; var9 < var8; var9++) {
            class127 var10 = new class127(arg0.method2987(0, var7[var9]));
            this.field1853[var7[var9]] = new class90(var10);
        }
    }

    @ObfuscatedName("db.f(D)V")
    public void method2217(double arg0) {
        this.field1855 = arg0;
        this.method2219();
    }

    @ObfuscatedName("db.t(II)[I")
    public int[] method2196(int arg0) {
        class90 var2 = this.field1853[arg0];
        if (var2 != null) {
            if (var2.field1531 != null) {
                this.field1850.method3318(var2);
                var2.field1544 = true;
                return var2.field1531;
            }
            boolean var3 = var2.method1866(this.field1855, this.field1852, this.field1854);
            if (var3) {
                if (this.field1849 == 0) {
                    class90 var4 = (class90) this.field1850.method3321();
                    var4.method1864();
                } else {
                    this.field1849--;
                }
                this.field1850.method3318(var2);
                var2.field1544 = true;
                return var2.field1531;
            }
        }
        return null;
    }

    @ObfuscatedName("db.l(II)I")
    public int method2193(int arg0) {
        return this.field1853[arg0] == null ? 0 : this.field1853[arg0].field1541;
    }

    @ObfuscatedName("db.c(IB)Z")
    public boolean method2194(int arg0) {
        return this.field1853[arg0].field1536;
    }

    @ObfuscatedName("db.d(II)Z")
    public boolean method2195(int arg0) {
        return this.field1852 == 64;
    }

    @ObfuscatedName("db.r(I)V")
    public void method2219() {
        for (int var1 = 0; var1 < this.field1853.length; var1++) {
            if (this.field1853[var1] != null) {
                this.field1853[var1].method1864();
            }
        }
        this.field1850 = new class177();
        this.field1849 = this.field1851;
    }

    @ObfuscatedName("db.s(IB)V")
    public void method2220(int arg0) {
        for (int var2 = 0; var2 < this.field1853.length; var2++) {
            class90 var3 = this.field1853[var2];
            if (var3 != null && var3.field1539 != 0 && var3.field1544) {
                var3.method1865(arg0);
                var3.field1544 = false;
            }
        }
    }
}
