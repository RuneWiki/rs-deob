package deob;

@ObfuscatedName("da")
public class class126 implements class146 {

    @ObfuscatedName("da.a")
    public class131[] field1766;

    @ObfuscatedName("da.j")
    public class194 field1762 = new class194();

    @ObfuscatedName("da.n")
    public int field1774;

    @ObfuscatedName("da.r")
    public int field1764 = 0;

    @ObfuscatedName("da.v")
    public double field1765 = 1.0D;

    @ObfuscatedName("da.e")
    public int field1771 = 128;

    @ObfuscatedName("da.l")
    public class236 field1767;

    public class126(class236 arg0, class236 arg1, int arg2, double arg3, int arg4) {
        this.field1767 = arg1;
        this.field1774 = arg2;
        this.field1764 = this.field1774;
        this.field1765 = arg3;
        this.field1771 = arg4;
        int[] var7 = arg0.method3772(0);
        int var8 = var7.length;
        this.field1766 = new class131[arg0.method3793(0)];
        for (int var9 = 0; var9 < var8; var9++) {
            class174 var10 = new class174(arg0.method3787(0, var7[var9]));
            this.field1766[var7[var9]] = new class131(var10);
        }
    }

    @ObfuscatedName("da.a(D)V")
    public void method2147(double arg0) {
        this.field1765 = arg0;
        this.method2152();
    }

    @ObfuscatedName("da.j(II)[I")
    public int[] method2148(int arg0) {
        class131 var2 = this.field1766[arg0];
        if (var2 != null) {
            if (var2.field1877 != null) {
                this.field1762.method3341(var2);
                var2.field1878 = true;
                return var2.field1877;
            }
            boolean var3 = var2.method2264(this.field1765, this.field1771, this.field1767);
            if (var3) {
                if (this.field1764 == 0) {
                    class131 var4 = (class131) this.field1762.method3339();
                    var4.method2260();
                } else {
                    this.field1764--;
                }
                this.field1762.method3341(var2);
                var2.field1878 = true;
                return var2.field1877;
            }
        }
        return null;
    }

    @ObfuscatedName("da.n(II)I")
    public int method2149(int arg0) {
        return this.field1766[arg0] == null ? 0 : this.field1766[arg0].field1869;
    }

    @ObfuscatedName("da.r(II)Z")
    public boolean method2150(int arg0) {
        return this.field1766[arg0].field1870;
    }

    @ObfuscatedName("da.v(II)Z")
    public boolean method2151(int arg0) {
        return this.field1771 == 64;
    }

    @ObfuscatedName("da.e(B)V")
    public void method2152() {
        for (int var1 = 0; var1 < this.field1766.length; var1++) {
            if (this.field1766[var1] != null) {
                this.field1766[var1].method2260();
            }
        }
        this.field1762 = new class194();
        this.field1764 = this.field1774;
    }

    @ObfuscatedName("da.l(II)V")
    public void method2146(int arg0) {
        for (int var2 = 0; var2 < this.field1766.length; var2++) {
            class131 var3 = this.field1766[var2];
            if (var3 != null && var3.field1875 != 0 && var3.field1878) {
                var3.method2265(arg0);
                var3.field1878 = false;
            }
        }
    }
}
