package deob;

@ObfuscatedName("dn")
public class class109 implements class105 {

    @ObfuscatedName("dn.j")
    public class89[] field1812;

    @ObfuscatedName("dn.y")
    public class175 field1810 = new class175();

    @ObfuscatedName("dn.x")
    public int field1809;

    @ObfuscatedName("dn.z")
    public int field1811 = 0;

    @ObfuscatedName("dn.c")
    public double field1813 = 1.0D;

    @ObfuscatedName("dn.e")
    public int field1814 = 128;

    @ObfuscatedName("dn.s")
    public class150 field1815;

    public class109(class150 arg0, class150 arg1, int arg2, double arg3, int arg4) {
        this.field1815 = arg1;
        this.field1809 = arg2;
        this.field1811 = this.field1809;
        this.field1813 = arg3;
        this.field1814 = arg4;
        int[] var7 = arg0.method2952(0);
        int var8 = var7.length;
        this.field1812 = new class89[arg0.method2913(0)];
        for (int var9 = 0; var9 < var8; var9++) {
            class126 var10 = new class126(arg0.method2903(0, var7[var9]));
            this.field1812[var7[var9]] = new class89(var10);
        }
    }

    @ObfuscatedName("dn.n(D)V")
    public void method2160(double arg0) {
        this.field1813 = arg0;
        this.method2153();
    }

    @ObfuscatedName("dn.j(IB)[I")
    public int[] method2141(int arg0) {
        class89 var2 = this.field1812[arg0];
        if (var2 != null) {
            if (var2.field1480 != null) {
                this.field1810.method3244(var2);
                var2.field1493 = true;
                return var2.field1480;
            }
            boolean var3 = var2.method1804(this.field1813, this.field1814, this.field1815);
            if (var3) {
                if (this.field1811 == 0) {
                    class89 var4 = (class89) this.field1810.method3247();
                    var4.method1815();
                } else {
                    this.field1811--;
                }
                this.field1810.method3244(var2);
                var2.field1493 = true;
                return var2.field1480;
            }
        }
        return null;
    }

    @ObfuscatedName("dn.y(IB)I")
    public int method2136(int arg0) {
        return this.field1812[arg0] == null ? 0 : this.field1812[arg0].field1488;
    }

    @ObfuscatedName("dn.x(IS)Z")
    public boolean method2143(int arg0) {
        return this.field1812[arg0].field1485;
    }

    @ObfuscatedName("dn.z(II)Z")
    public boolean method2133(int arg0) {
        return this.field1814 == 64;
    }

    @ObfuscatedName("dn.b(B)V")
    public void method2153() {
        for (int var1 = 0; var1 < this.field1812.length; var1++) {
            if (this.field1812[var1] != null) {
                this.field1812[var1].method1815();
            }
        }
        this.field1810 = new class175();
        this.field1811 = this.field1809;
    }

    @ObfuscatedName("dn.p(II)V")
    public void method2154(int arg0) {
        for (int var2 = 0; var2 < this.field1812.length; var2++) {
            class89 var3 = this.field1812[var2];
            if (var3 != null && var3.field1494 != 0 && var3.field1493) {
                var3.method1806(arg0);
                var3.field1493 = false;
            }
        }
    }
}
