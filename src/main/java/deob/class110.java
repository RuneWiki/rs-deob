package deob;

@ObfuscatedName("di")
public class class110 implements class106 {

    @ObfuscatedName("di.g")
    public class90[] field1819;

    @ObfuscatedName("di.h")
    public class177 field1820 = new class177();

    @ObfuscatedName("di.s")
    public int field1812;

    @ObfuscatedName("di.o")
    public int field1813 = 0;

    @ObfuscatedName("di.p")
    public double field1814 = 1.0D;

    @ObfuscatedName("di.x")
    public int field1815 = 128;

    @ObfuscatedName("di.k")
    public class153 field1816;

    public class110(class153 arg0, class153 arg1, int arg2, double arg3, int arg4) {
        this.field1816 = arg1;
        this.field1812 = arg2;
        this.field1813 = this.field1812;
        this.field1814 = arg3;
        this.field1815 = arg4;
        int[] var7 = arg0.method3091(0);
        int var8 = var7.length;
        this.field1819 = new class90[arg0.method3100(0)];
        for (int var9 = 0; var9 < var8; var9++) {
            class127 var10 = new class127(arg0.method3080(0, var7[var9]));
            this.field1819[var7[var9]] = new class90(var10);
        }
    }

    @ObfuscatedName("di.t(D)V")
    public void method2251(double arg0) {
        this.field1814 = arg0;
        this.method2266();
    }

    @ObfuscatedName("di.g(II)[I")
    public int[] method2227(int arg0) {
        class90 var2 = this.field1819[arg0];
        if (var2 != null) {
            if (var2.field1497 != null) {
                this.field1820.method3369(var2);
                var2.field1496 = true;
                return var2.field1497;
            }
            boolean var3 = var2.method1882(this.field1814, this.field1815, this.field1816);
            if (var3) {
                if (this.field1813 == 0) {
                    class90 var4 = (class90) this.field1820.method3398();
                    var4.method1883();
                } else {
                    this.field1813--;
                }
                this.field1820.method3369(var2);
                var2.field1496 = true;
                return var2.field1497;
            }
        }
        return null;
    }

    @ObfuscatedName("di.h(IS)I")
    public int method2226(int arg0) {
        return this.field1819[arg0] == null ? 0 : this.field1819[arg0].field1483;
    }

    @ObfuscatedName("di.s(II)Z")
    public boolean method2225(int arg0) {
        return this.field1819[arg0].field1495;
    }

    @ObfuscatedName("di.o(IB)Z")
    public boolean method2236(int arg0) {
        return this.field1815 == 64;
    }

    @ObfuscatedName("di.q(I)V")
    public void method2266() {
        for (int var1 = 0; var1 < this.field1819.length; var1++) {
            if (this.field1819[var1] != null) {
                this.field1819[var1].method1883();
            }
        }
        this.field1820 = new class177();
        this.field1813 = this.field1812;
    }

    @ObfuscatedName("di.e(IB)V")
    public void method2263(int arg0) {
        for (int var2 = 0; var2 < this.field1819.length; var2++) {
            class90 var3 = this.field1819[var2];
            if (var3 != null && var3.field1488 != 0 && var3.field1496) {
                var3.method1884(arg0);
                var3.field1496 = false;
            }
        }
    }
}
