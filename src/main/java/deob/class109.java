package deob;

@ObfuscatedName("dt")
public class class109 implements class105 {

    @ObfuscatedName("dt.c")
    public class89[] field1802;

    @ObfuscatedName("dt.j")
    public class175 field1806 = new class175();

    @ObfuscatedName("dt.f")
    public int field1805;

    @ObfuscatedName("dt.y")
    public int field1804 = 0;

    @ObfuscatedName("dt.x")
    public double field1803 = 1.0D;

    @ObfuscatedName("dt.e")
    public int field1801 = 128;

    @ObfuscatedName("dt.m")
    public class150 field1807;

    public class109(class150 arg0, class150 arg1, int arg2, double arg3, int arg4) {
        this.field1807 = arg1;
        this.field1805 = arg2;
        this.field1804 = this.field1805;
        this.field1803 = arg3;
        this.field1801 = arg4;
        int[] var7 = arg0.method2830(0);
        int var8 = var7.length;
        this.field1802 = new class89[arg0.method2866(0)];
        for (int var9 = 0; var9 < var8; var9++) {
            class125 var10 = new class125(arg0.method2821(0, var7[var9]));
            this.field1802[var7[var9]] = new class89(var10);
        }
    }

    @ObfuscatedName("dt.l(D)V")
    public void method2111(double arg0) {
        this.field1803 = arg0;
        this.method2110();
    }

    @ObfuscatedName("dt.c(IB)[I")
    public int[] method2090(int arg0) {
        class89 var2 = this.field1802[arg0];
        if (var2 != null) {
            if (var2.field1478 != null) {
                this.field1806.method3148(var2);
                var2.field1479 = true;
                return var2.field1478;
            }
            boolean var3 = var2.method1749(this.field1803, this.field1801, this.field1807);
            if (var3) {
                if (this.field1804 == 0) {
                    class89 var4 = (class89) this.field1806.method3151();
                    var4.method1746();
                } else {
                    this.field1804--;
                }
                this.field1806.method3148(var2);
                var2.field1479 = true;
                return var2.field1478;
            }
        }
        return null;
    }

    @ObfuscatedName("dt.j(II)I")
    public int method2077(int arg0) {
        return this.field1802[arg0] == null ? 0 : this.field1802[arg0].field1470;
    }

    @ObfuscatedName("dt.f(IB)Z")
    public boolean method2078(int arg0) {
        return this.field1802[arg0].field1480;
    }

    @ObfuscatedName("dt.y(II)Z")
    public boolean method2079(int arg0) {
        return this.field1801 == 64;
    }

    @ObfuscatedName("dt.t(I)V")
    public void method2110() {
        for (int var1 = 0; var1 < this.field1802.length; var1++) {
            if (this.field1802[var1] != null) {
                this.field1802[var1].method1746();
            }
        }
        this.field1806 = new class175();
        this.field1804 = this.field1805;
    }

    @ObfuscatedName("dt.g(II)V")
    public void method2106(int arg0) {
        for (int var2 = 0; var2 < this.field1802.length; var2++) {
            class89 var3 = this.field1802[var2];
            if (var3 != null && var3.field1476 != 0 && var3.field1479) {
                var3.method1747(arg0);
                var3.field1479 = false;
            }
        }
    }
}
