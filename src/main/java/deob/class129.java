package deob;

@ObfuscatedName("dk")
public class class129 {

    @ObfuscatedName("dk.k")
    public class128 field1877 = new class128();

    @ObfuscatedName("dk.y")
    public class128 field1876;

    public class129() {
        this.field1877.field1875 = this.field1877;
        this.field1877.field1873 = this.field1877;
    }

    @ObfuscatedName("dk.k()V")
    public void method2219() {
        while (true) {
            class128 var1 = this.field1877.field1875;
            if (this.field1877 == var1) {
                this.field1876 = null;
                return;
            }
            var1.method2214();
        }
    }

    @ObfuscatedName("dk.y(Ldb;)V")
    public void method2220(class128 arg0) {
        if (arg0.field1873 != null) {
            arg0.method2214();
        }
        arg0.field1873 = this.field1877.field1873;
        arg0.field1875 = this.field1877;
        arg0.field1873.field1875 = arg0;
        arg0.field1875.field1873 = arg0;
    }

    @ObfuscatedName("dk.o(Ldb;)V")
    public void method2221(class128 arg0) {
        if (arg0.field1873 != null) {
            arg0.method2214();
        }
        arg0.field1873 = this.field1877;
        arg0.field1875 = this.field1877.field1875;
        arg0.field1873.field1875 = arg0;
        arg0.field1875.field1873 = arg0;
    }

    @ObfuscatedName("dk.r(Ldb;Ldb;)V")
    public static void method2222(class128 arg0, class128 arg1) {
        if (arg0.field1873 != null) {
            arg0.method2214();
        }
        arg0.field1873 = arg1.field1873;
        arg0.field1875 = arg1;
        arg0.field1873.field1875 = arg0;
        arg0.field1875.field1873 = arg0;
    }

    @ObfuscatedName("dk.w()Ldb;")
    public class128 method2223() {
        class128 var1 = this.field1877.field1875;
        if (this.field1877 == var1) {
            return null;
        } else {
            var1.method2214();
            return var1;
        }
    }

    @ObfuscatedName("dk.j()Ldb;")
    public class128 method2224() {
        class128 var1 = this.field1877.field1873;
        if (this.field1877 == var1) {
            return null;
        } else {
            var1.method2214();
            return var1;
        }
    }

    @ObfuscatedName("dk.c()Ldb;")
    public class128 method2243() {
        class128 var1 = this.field1877.field1875;
        if (this.field1877 == var1) {
            this.field1876 = null;
            return null;
        } else {
            this.field1876 = var1.field1875;
            return var1;
        }
    }

    @ObfuscatedName("dk.g()Ldb;")
    public class128 method2226() {
        class128 var1 = this.field1877.field1873;
        if (this.field1877 == var1) {
            this.field1876 = null;
            return null;
        } else {
            this.field1876 = var1.field1873;
            return var1;
        }
    }

    @ObfuscatedName("dk.i()Ldb;")
    public class128 method2238() {
        class128 var1 = this.field1876;
        if (this.field1877 == var1) {
            this.field1876 = null;
            return null;
        } else {
            this.field1876 = var1.field1875;
            return var1;
        }
    }

    @ObfuscatedName("dk.v()Ldb;")
    public class128 method2249() {
        class128 var1 = this.field1876;
        if (this.field1877 == var1) {
            this.field1876 = null;
            return null;
        } else {
            this.field1876 = var1.field1873;
            return var1;
        }
    }
}
