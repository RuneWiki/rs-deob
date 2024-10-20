package deob;

@ObfuscatedName("dy")
public final class class126 {

    @ObfuscatedName("dy.u")
    public int field1863;

    @ObfuscatedName("dy.x")
    public class128[] field1861;

    @ObfuscatedName("dy.i")
    public class128 field1862;

    @ObfuscatedName("dy.a")
    public class128 field1860;

    @ObfuscatedName("dy.f")
    public int field1864 = 0;

    public class126(int arg0) {
        this.field1863 = arg0;
        this.field1861 = new class128[arg0];
        for (int var2 = 0; var2 < arg0; var2++) {
            class128 var3 = this.field1861[var2] = new class128();
            var3.field1868 = var3;
            var3.field1869 = var3;
        }
    }

    @ObfuscatedName("dy.u(J)Ldv;")
    public class128 method2190(long arg0) {
        class128 var3 = this.field1861[(int) (arg0 & (long) (this.field1863 - 1))];
        for (this.field1862 = var3.field1868; this.field1862 != var3; this.field1862 = this.field1862.field1868) {
            if (this.field1862.field1867 == arg0) {
                class128 var4 = this.field1862;
                this.field1862 = this.field1862.field1868;
                return var4;
            }
        }
        this.field1862 = null;
        return null;
    }

    @ObfuscatedName("dy.x(Ldv;J)V")
    public void method2191(class128 arg0, long arg1) {
        if (arg0.field1869 != null) {
            arg0.method2228();
        }
        class128 var4 = this.field1861[(int) (arg1 & (long) (this.field1863 - 1))];
        arg0.field1869 = var4.field1869;
        arg0.field1868 = var4;
        arg0.field1869.field1868 = arg0;
        arg0.field1868.field1869 = arg0;
        arg0.field1867 = arg1;
    }

    @ObfuscatedName("dy.i()V")
    public void method2192() {
        for (int var1 = 0; var1 < this.field1863; var1++) {
            class128 var2 = this.field1861[var1];
            while (true) {
                class128 var3 = var2.field1868;
                if (var2 == var3) {
                    break;
                }
                var3.method2228();
            }
        }
        this.field1862 = null;
        this.field1860 = null;
    }

    @ObfuscatedName("dy.a()Ldv;")
    public class128 method2195() {
        this.field1864 = 0;
        return this.method2194();
    }

    @ObfuscatedName("dy.c()Ldv;")
    public class128 method2194() {
        if (this.field1864 > 0 && this.field1861[this.field1864 - 1] != this.field1860) {
            class128 var1 = this.field1860;
            this.field1860 = var1.field1868;
            return var1;
        }
        class128 var2;
        do {
            if (this.field1864 >= this.field1863) {
                return null;
            }
            var2 = this.field1861[this.field1864++].field1868;
        } while (this.field1861[this.field1864 - 1] == var2);
        this.field1860 = var2.field1868;
        return var2;
    }
}
