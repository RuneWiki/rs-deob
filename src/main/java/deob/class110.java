package deob;

@ObfuscatedName("dh")
public class class110 implements class106 {

    @ObfuscatedName("dh.p")
    public class90[] field1834;

    @ObfuscatedName("dh.e")
    public class177 field1825 = new class177();

    @ObfuscatedName("dh.a")
    public int field1826;

    @ObfuscatedName("dh.h")
    public int field1827 = 0;

    @ObfuscatedName("dh.y")
    public double field1828 = 1.0D;

    @ObfuscatedName("dh.j")
    public int field1833 = 128;

    @ObfuscatedName("dh.l")
    public class153 field1829;

    public class110(class153 arg0, class153 arg1, int arg2, double arg3, int arg4) {
        this.field1829 = arg1;
        this.field1826 = arg2;
        this.field1827 = this.field1826;
        this.field1828 = arg3;
        this.field1833 = arg4;
        int[] var7 = arg0.method3093(0);
        int var8 = var7.length;
        this.field1834 = new class90[arg0.method3058(0)];
        for (int var9 = 0; var9 < var8; var9++) {
            class127 var10 = new class127(arg0.method3048(0, var7[var9]));
            this.field1834[var7[var9]] = new class90(var10);
        }
    }

    @ObfuscatedName("dh.w(D)V")
    public void method2242(double arg0) {
        this.field1828 = arg0;
        this.method2239();
    }

    @ObfuscatedName("dh.p(II)[I")
    public int[] method2233(int arg0) {
        class90 var2 = this.field1834[arg0];
        if (var2 != null) {
            if (var2.field1515 != null) {
                this.field1825.method3334(var2);
                var2.field1504 = true;
                return var2.field1515;
            }
            boolean var3 = var2.method1877(this.field1828, this.field1833, this.field1829);
            if (var3) {
                if (this.field1827 == 0) {
                    class90 var4 = (class90) this.field1825.method3329();
                    var4.method1866();
                } else {
                    this.field1827--;
                }
                this.field1825.method3334(var2);
                var2.field1504 = true;
                return var2.field1515;
            }
        }
        return null;
    }

    @ObfuscatedName("dh.e(II)I")
    public int method2225(int arg0) {
        return this.field1834[arg0] == null ? 0 : this.field1834[arg0].field1507;
    }

    @ObfuscatedName("dh.a(II)Z")
    public boolean method2226(int arg0) {
        return this.field1834[arg0].field1508;
    }

    @ObfuscatedName("dh.h(IS)Z")
    public boolean method2224(int arg0) {
        return this.field1833 == 64;
    }

    @ObfuscatedName("dh.v(I)V")
    public void method2239() {
        for (int var1 = 0; var1 < this.field1834.length; var1++) {
            if (this.field1834[var1] != null) {
                this.field1834[var1].method1866();
            }
        }
        this.field1825 = new class177();
        this.field1827 = this.field1826;
    }

    @ObfuscatedName("dh.z(IB)V")
    public void method2241(int arg0) {
        for (int var2 = 0; var2 < this.field1834.length; var2++) {
            class90 var3 = this.field1834[var2];
            if (var3 != null && var3.field1509 != 0 && var3.field1504) {
                var3.method1867(arg0);
                var3.field1504 = false;
            }
        }
    }
}
