package deob;

@ObfuscatedName("df")
public class class126 implements class146 {

    @ObfuscatedName("df.i")
    public class131[] field1788;

    @ObfuscatedName("df.c")
    public class194 field1795 = new class194();

    @ObfuscatedName("df.e")
    public int field1789;

    @ObfuscatedName("df.v")
    public int field1787 = 0;

    @ObfuscatedName("df.b")
    public double field1791 = 1.0D;

    @ObfuscatedName("df.y")
    public int field1792 = 128;

    @ObfuscatedName("df.h")
    public class236 field1793;

    public class126(class236 arg0, class236 arg1, int arg2, double arg3, int arg4) {
        this.field1793 = arg1;
        this.field1789 = arg2;
        this.field1787 = this.field1789;
        this.field1791 = arg3;
        this.field1792 = arg4;
        int[] var7 = arg0.method3821(0);
        int var8 = var7.length;
        this.field1788 = new class131[arg0.method3847(0)];
        for (int var9 = 0; var9 < var8; var9++) {
            class174 var10 = new class174(arg0.method3769(0, var7[var9]));
            this.field1788[var7[var9]] = new class131(var10);
        }
    }

    @ObfuscatedName("df.i(D)V")
    public void method2148(double arg0) {
        this.field1791 = arg0;
        this.method2153();
    }

    @ObfuscatedName("df.c(II)[I")
    public int[] method2149(int arg0) {
        class131 var2 = this.field1788[arg0];
        if (var2 != null) {
            if (var2.field1902 != null) {
                this.field1795.method3290(var2);
                var2.field1891 = true;
                return var2.field1902;
            }
            boolean var3 = var2.method2261(this.field1791, this.field1792, this.field1793);
            if (var3) {
                if (this.field1787 == 0) {
                    class131 var4 = (class131) this.field1795.method3293();
                    var4.method2262();
                } else {
                    this.field1787--;
                }
                this.field1795.method3290(var2);
                var2.field1891 = true;
                return var2.field1902;
            }
        }
        return null;
    }

    @ObfuscatedName("df.e(II)I")
    public int method2150(int arg0) {
        return this.field1788[arg0] == null ? 0 : this.field1788[arg0].field1889;
    }

    @ObfuscatedName("df.v(IB)Z")
    public boolean method2151(int arg0) {
        return this.field1788[arg0].field1894;
    }

    @ObfuscatedName("df.b(IB)Z")
    public boolean method2161(int arg0) {
        return this.field1792 == 64;
    }

    @ObfuscatedName("df.y(I)V")
    public void method2153() {
        for (int var1 = 0; var1 < this.field1788.length; var1++) {
            if (this.field1788[var1] != null) {
                this.field1788[var1].method2262();
            }
        }
        this.field1795 = new class194();
        this.field1787 = this.field1789;
    }

    @ObfuscatedName("df.h(IB)V")
    public void method2154(int arg0) {
        for (int var2 = 0; var2 < this.field1788.length; var2++) {
            class131 var3 = this.field1788[var2];
            if (var3 != null && var3.field1899 != 0 && var3.field1891) {
                var3.method2268(arg0);
                var3.field1891 = false;
            }
        }
    }
}
