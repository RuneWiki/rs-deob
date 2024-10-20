package deob;

@ObfuscatedName("dw")
public class class124 implements class144 {

    @ObfuscatedName("dw.c")
    public class129[] field1703;

    @ObfuscatedName("dw.i")
    public class218 field1693 = new class218();

    @ObfuscatedName("dw.o")
    public int field1694;

    @ObfuscatedName("dw.j")
    public int field1695 = 0;

    @ObfuscatedName("dw.k")
    public double field1697 = 1.0D;

    @ObfuscatedName("dw.x")
    public int field1699 = 128;

    @ObfuscatedName("dw.z")
    public class262 field1698;

    public class124(class262 arg0, class262 arg1, int arg2, double arg3, int arg4) {
        this.field1698 = arg1;
        this.field1694 = arg2;
        this.field1695 = this.field1694;
        this.field1697 = arg3;
        this.field1699 = arg4;
        int[] var7 = arg0.method4201(0);
        int var8 = var7.length;
        this.field1703 = new class129[arg0.method4202(0)];
        for (int var9 = 0; var9 < var8; var9++) {
            class195 var10 = new class195(arg0.method4190(0, var7[var9]));
            this.field1703[var7[var9]] = new class129(var10);
        }
    }

    @ObfuscatedName("dw.c(I)I")
    public int method2343() {
        int var1 = 0;
        int var2 = 0;
        class129[] var3 = this.field1703;
        for (int var4 = 0; var4 < var3.length; var4++) {
            class129 var5 = var3[var4];
            if (var5 != null && var5.field1797 != null) {
                var1 += var5.field1797.length;
                int[] var6 = var5.field1797;
                for (int var7 = 0; var7 < var6.length; var7++) {
                    int var8 = var6[var7];
                    if (this.field1698.method4269(var8)) {
                        var2++;
                    }
                }
            }
        }
        if (var1 == 0) {
            return 0;
        } else {
            return var2 * 100 / var1;
        }
    }

    @ObfuscatedName("dw.i(D)V")
    public void method2362(double arg0) {
        this.field1697 = arg0;
        this.method2349();
    }

    @ObfuscatedName("dw.o(IS)[I")
    public int[] method2342(int arg0) {
        class129 var2 = this.field1703[arg0];
        if (var2 != null) {
            if (var2.field1803 != null) {
                this.field1693.method3717(var2);
                var2.field1804 = true;
                return var2.field1803;
            }
            boolean var3 = var2.method2459(this.field1697, this.field1699, this.field1698);
            if (var3) {
                if (this.field1695 == 0) {
                    class129 var4 = (class129) this.field1693.method3720();
                    var4.method2458();
                } else {
                    this.field1695--;
                }
                this.field1693.method3717(var2);
                var2.field1804 = true;
                return var2.field1803;
            }
        }
        return null;
    }

    @ObfuscatedName("dw.j(II)I")
    public int method2346(int arg0) {
        return this.field1703[arg0] == null ? 0 : this.field1703[arg0].field1795;
    }

    @ObfuscatedName("dw.k(II)Z")
    public boolean method2347(int arg0) {
        return this.field1703[arg0].field1794;
    }

    @ObfuscatedName("dw.x(II)Z")
    public boolean method2348(int arg0) {
        return this.field1699 == 64;
    }

    @ObfuscatedName("dw.z(I)V")
    public void method2349() {
        for (int var1 = 0; var1 < this.field1703.length; var1++) {
            if (this.field1703[var1] != null) {
                this.field1703[var1].method2458();
            }
        }
        this.field1693 = new class218();
        this.field1695 = this.field1694;
    }

    @ObfuscatedName("dw.p(II)V")
    public void method2350(int arg0) {
        for (int var2 = 0; var2 < this.field1703.length; var2++) {
            class129 var3 = this.field1703[var2];
            if (var3 != null && var3.field1791 != 0 && var3.field1804) {
                var3.method2456(arg0);
                var3.field1804 = false;
            }
        }
    }
}
