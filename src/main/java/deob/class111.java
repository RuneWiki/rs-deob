package deob;

@ObfuscatedName("di")
public class class111 implements class107 {

    @ObfuscatedName("di.i")
    public class91[] field1834;

    @ObfuscatedName("di.b")
    public class179 field1835 = new class179();

    @ObfuscatedName("di.r")
    public int field1836;

    @ObfuscatedName("di.l")
    public int field1837 = 0;

    @ObfuscatedName("di.s")
    public double field1838 = 1.0D;

    @ObfuscatedName("di.d")
    public int field1839 = 128;

    @ObfuscatedName("di.e")
    public class155 field1840;

    public class111(class155 arg0, class155 arg1, int arg2, double arg3, int arg4) {
        this.field1840 = arg1;
        this.field1836 = arg2;
        this.field1837 = this.field1836;
        this.field1838 = arg3;
        this.field1839 = arg4;
        int[] var7 = arg0.method3052(0);
        int var8 = var7.length;
        this.field1834 = new class91[arg0.method3084(0)];
        for (int var9 = 0; var9 < var8; var9++) {
            class128 var10 = new class128(arg0.method3043(0, var7[var9]));
            this.field1834[var7[var9]] = new class91(var10);
        }
    }

    @ObfuscatedName("di.p(D)V")
    public void method2239(double arg0) {
        this.field1838 = arg0;
        this.method2242();
    }

    @ObfuscatedName("di.i(II)[I")
    public int[] method2210(int arg0) {
        class91 var2 = this.field1834[arg0];
        if (var2 != null) {
            if (var2.field1524 != null) {
                this.field1835.method3335(var2);
                var2.field1525 = true;
                return var2.field1524;
            }
            boolean var3 = var2.method1857(this.field1838, this.field1839, this.field1840);
            if (var3) {
                if (this.field1837 == 0) {
                    class91 var4 = (class91) this.field1835.method3338();
                    var4.method1858();
                } else {
                    this.field1837--;
                }
                this.field1835.method3335(var2);
                var2.field1525 = true;
                return var2.field1524;
            }
        }
        return null;
    }

    @ObfuscatedName("di.b(IB)I")
    public int method2211(int arg0) {
        return this.field1834[arg0] == null ? 0 : this.field1834[arg0].field1520;
    }

    @ObfuscatedName("di.r(II)Z")
    public boolean method2212(int arg0) {
        return this.field1834[arg0].field1517;
    }

    @ObfuscatedName("di.l(IB)Z")
    public boolean method2213(int arg0) {
        return this.field1839 == 64;
    }

    @ObfuscatedName("di.z(I)V")
    public void method2242() {
        for (int var1 = 0; var1 < this.field1834.length; var1++) {
            if (this.field1834[var1] != null) {
                this.field1834[var1].method1858();
            }
        }
        this.field1835 = new class179();
        this.field1837 = this.field1836;
    }

    @ObfuscatedName("di.h(II)V")
    public void method2243(int arg0) {
        for (int var2 = 0; var2 < this.field1834.length; var2++) {
            class91 var3 = this.field1834[var2];
            if (var3 != null && var3.field1522 != 0 && var3.field1525) {
                var3.method1859(arg0);
                var3.field1525 = false;
            }
        }
    }
}
