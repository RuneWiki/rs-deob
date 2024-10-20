package deob;

@ObfuscatedName("dr")
public class class109 implements class105 {

    @ObfuscatedName("dr.z")
    public class89[] field1809;

    @ObfuscatedName("dr.h")
    public class175 field1814 = new class175();

    @ObfuscatedName("dr.c")
    public int field1807;

    @ObfuscatedName("dr.p")
    public int field1806 = 0;

    @ObfuscatedName("dr.i")
    public double field1810 = 1.0D;

    @ObfuscatedName("dr.v")
    public int field1811 = 128;

    @ObfuscatedName("dr.l")
    public class150 field1812;

    public class109(class150 arg0, class150 arg1, int arg2, double arg3, int arg4) {
        this.field1812 = arg1;
        this.field1807 = arg2;
        this.field1806 = this.field1807;
        this.field1810 = arg3;
        this.field1811 = arg4;
        int[] var7 = arg0.method2964(0);
        int var8 = var7.length;
        this.field1809 = new class89[arg0.method2961(0)];
        for (int var9 = 0; var9 < var8; var9++) {
            class126 var10 = new class126(arg0.method2951(0, var7[var9]));
            this.field1809[var7[var9]] = new class89(var10);
        }
    }

    @ObfuscatedName("dr.o(D)V")
    public void method2200(double arg0) {
        this.field1810 = arg0;
        this.method2201();
    }

    @ObfuscatedName("dr.z(II)[I")
    public int[] method2183(int arg0) {
        class89 var2 = this.field1809[arg0];
        if (var2 != null) {
            if (var2.field1494 != null) {
                this.field1814.method3304(var2);
                var2.field1495 = true;
                return var2.field1494;
            }
            boolean var3 = var2.method1820(this.field1810, this.field1811, this.field1812);
            if (var3) {
                if (this.field1806 == 0) {
                    class89 var4 = (class89) this.field1814.method3341();
                    var4.method1812();
                } else {
                    this.field1806--;
                }
                this.field1814.method3304(var2);
                var2.field1495 = true;
                return var2.field1494;
            }
        }
        return null;
    }

    @ObfuscatedName("dr.h(II)I")
    public int method2175(int arg0) {
        return this.field1809[arg0] == null ? 0 : this.field1809[arg0].field1486;
    }

    @ObfuscatedName("dr.c(IB)Z")
    public boolean method2178(int arg0) {
        return this.field1809[arg0].field1487;
    }

    @ObfuscatedName("dr.p(IB)Z")
    public boolean method2176(int arg0) {
        return this.field1811 == 64;
    }

    @ObfuscatedName("dr.b(I)V")
    public void method2201() {
        for (int var1 = 0; var1 < this.field1809.length; var1++) {
            if (this.field1809[var1] != null) {
                this.field1809[var1].method1812();
            }
        }
        this.field1814 = new class175();
        this.field1806 = this.field1807;
    }

    @ObfuscatedName("dr.d(IB)V")
    public void method2202(int arg0) {
        for (int var2 = 0; var2 < this.field1809.length; var2++) {
            class89 var3 = this.field1809[var2];
            if (var3 != null && var3.field1482 != 0 && var3.field1495) {
                var3.method1810(arg0);
                var3.field1495 = false;
            }
        }
    }
}
