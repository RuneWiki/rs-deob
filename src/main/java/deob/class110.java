package deob;

@ObfuscatedName("du")
public class class110 implements class106 {

    @ObfuscatedName("du.l")
    public class90[] field1800;

    @ObfuscatedName("du.b")
    public class178 field1801 = new class178();

    @ObfuscatedName("du.o")
    public int field1806;

    @ObfuscatedName("du.w")
    public int field1802 = 0;

    @ObfuscatedName("du.r")
    public double field1803 = 1.0D;

    @ObfuscatedName("du.k")
    public int field1804 = 128;

    @ObfuscatedName("du.z")
    public class154 field1805;

    public class110(class154 arg0, class154 arg1, int arg2, double arg3, int arg4) {
        this.field1805 = arg1;
        this.field1806 = arg2;
        this.field1802 = this.field1806;
        this.field1803 = arg3;
        this.field1804 = arg4;
        int[] var7 = arg0.method3038(0);
        int var8 = var7.length;
        this.field1800 = new class90[arg0.method3074(0)];
        for (int var9 = 0; var9 < var8; var9++) {
            class127 var10 = new class127(arg0.method3029(0, var7[var9]));
            this.field1800[var7[var9]] = new class90(var10);
        }
    }

    @ObfuscatedName("du.y(D)V")
    public void method2215(double arg0) {
        this.field1803 = arg0;
        this.method2211();
    }

    @ObfuscatedName("du.l(II)[I")
    public int[] method2187(int arg0) {
        class90 var2 = this.field1800[arg0];
        if (var2 != null) {
            if (var2.field1487 != null) {
                this.field1801.method3322(var2);
                var2.field1498 = true;
                return var2.field1487;
            }
            boolean var3 = var2.method1827(this.field1803, this.field1804, this.field1805);
            if (var3) {
                if (this.field1802 == 0) {
                    class90 var4 = (class90) this.field1801.method3325();
                    var4.method1828();
                } else {
                    this.field1802--;
                }
                this.field1801.method3322(var2);
                var2.field1498 = true;
                return var2.field1487;
            }
        }
        return null;
    }

    @ObfuscatedName("du.b(IB)I")
    public int method2184(int arg0) {
        return this.field1800[arg0] == null ? 0 : this.field1800[arg0].field1489;
    }

    @ObfuscatedName("du.o(IB)Z")
    public boolean method2191(int arg0) {
        return this.field1800[arg0].field1497;
    }

    @ObfuscatedName("du.w(II)Z")
    public boolean method2186(int arg0) {
        return this.field1804 == 64;
    }

    @ObfuscatedName("du.v(I)V")
    public void method2211() {
        for (int var1 = 0; var1 < this.field1800.length; var1++) {
            if (this.field1800[var1] != null) {
                this.field1800[var1].method1828();
            }
        }
        this.field1801 = new class178();
        this.field1802 = this.field1806;
    }

    @ObfuscatedName("du.s(II)V")
    public void method2213(int arg0) {
        for (int var2 = 0; var2 < this.field1800.length; var2++) {
            class90 var3 = this.field1800[var2];
            if (var3 != null && var3.field1495 != 0 && var3.field1498) {
                var3.method1829(arg0);
                var3.field1498 = false;
            }
        }
    }
}
