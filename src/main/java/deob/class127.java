package deob;

@ObfuscatedName("dw")
public class class127 implements class147 {

    @ObfuscatedName("dw.j")
    public class132[] field1784;

    @ObfuscatedName("dw.h")
    public class195 field1781 = new class195();

    @ObfuscatedName("dw.f")
    public int field1787;

    @ObfuscatedName("dw.p")
    public int field1782 = 0;

    @ObfuscatedName("dw.x")
    public double field1780 = 1.0D;

    @ObfuscatedName("dw.g")
    public int field1783 = 128;

    @ObfuscatedName("dw.c")
    public class237 field1786;

    public class127(class237 arg0, class237 arg1, int arg2, double arg3, int arg4) {
        this.field1786 = arg1;
        this.field1787 = arg2;
        this.field1782 = this.field1787;
        this.field1780 = arg3;
        this.field1783 = arg4;
        int[] var7 = arg0.method3783(0);
        int var8 = var7.length;
        this.field1784 = new class132[arg0.method3784(0)];
        for (int var9 = 0; var9 < var8; var9++) {
            class175 var10 = new class175(arg0.method3773(0, var7[var9]));
            this.field1784[var7[var9]] = new class132(var10);
        }
    }

    @ObfuscatedName("dw.j(D)V")
    public void method2182(double arg0) {
        this.field1780 = arg0;
        this.method2181();
    }

    @ObfuscatedName("dw.h(II)[I")
    public int[] method2189(int arg0) {
        class132 var2 = this.field1784[arg0];
        if (var2 != null) {
            if (var2.field1888 != null) {
                this.field1781.method3318(var2);
                var2.field1883 = true;
                return var2.field1888;
            }
            boolean var3 = var2.method2287(this.field1780, this.field1783, this.field1786);
            if (var3) {
                if (this.field1782 == 0) {
                    class132 var4 = (class132) this.field1781.method3320();
                    var4.method2288();
                } else {
                    this.field1782--;
                }
                this.field1781.method3318(var2);
                var2.field1883 = true;
                return var2.field1888;
            }
        }
        return null;
    }

    @ObfuscatedName("dw.f(II)I")
    public int method2186(int arg0) {
        return this.field1784[arg0] == null ? 0 : this.field1784[arg0].field1880;
    }

    @ObfuscatedName("dw.p(II)Z")
    public boolean method2200(int arg0) {
        return this.field1784[arg0].field1881;
    }

    @ObfuscatedName("dw.x(IB)Z")
    public boolean method2185(int arg0) {
        return this.field1783 == 64;
    }

    @ObfuscatedName("dw.g(I)V")
    public void method2181() {
        for (int var1 = 0; var1 < this.field1784.length; var1++) {
            if (this.field1784[var1] != null) {
                this.field1784[var1].method2288();
            }
        }
        this.field1781 = new class195();
        this.field1782 = this.field1787;
    }

    @ObfuscatedName("dw.c(II)V")
    public void method2187(int arg0) {
        for (int var2 = 0; var2 < this.field1784.length; var2++) {
            class132 var3 = this.field1784[var2];
            if (var3 != null && var3.field1886 != 0 && var3.field1883) {
                var3.method2286(arg0);
                var3.field1883 = false;
            }
        }
    }
}
