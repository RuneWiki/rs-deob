package deob;

@ObfuscatedName("cg")
public class class104 {

    @ObfuscatedName("cg.r")
    public class106 field1500 = new class106();

    @ObfuscatedName("cg.d")
    public class106 field1501;

    public class104() {
        this.field1500.field1505 = this.field1500;
        this.field1500.field1504 = this.field1500;
    }

    @ObfuscatedName("cg.r()V")
    public void method1291() {
        while (true) {
            class106 var1 = this.field1500.field1505;
            if (this.field1500 == var1) {
                this.field1501 = null;
                return;
            }
            var1.method1325();
        }
    }

    @ObfuscatedName("cg.d(Ldg;)V")
    public void method1292(class106 arg0) {
        if (arg0.field1504 != null) {
            arg0.method1325();
        }
        arg0.field1504 = this.field1500.field1504;
        arg0.field1505 = this.field1500;
        arg0.field1504.field1505 = arg0;
        arg0.field1505.field1504 = arg0;
    }

    @ObfuscatedName("cg.l(Ldg;)V")
    public void method1312(class106 arg0) {
        if (arg0.field1504 != null) {
            arg0.method1325();
        }
        arg0.field1504 = this.field1500;
        arg0.field1505 = this.field1500.field1505;
        arg0.field1504.field1505 = arg0;
        arg0.field1505.field1504 = arg0;
    }

    @ObfuscatedName("cg.m(Ldg;Ldg;)V")
    public static void method1294(class106 arg0, class106 arg1) {
        if (arg0.field1504 != null) {
            arg0.method1325();
        }
        arg0.field1504 = arg1.field1504;
        arg0.field1505 = arg1;
        arg0.field1504.field1505 = arg0;
        arg0.field1505.field1504 = arg0;
    }

    @ObfuscatedName("cg.c()Ldg;")
    public class106 method1295() {
        class106 var1 = this.field1500.field1505;
        if (this.field1500 == var1) {
            return null;
        } else {
            var1.method1325();
            return var1;
        }
    }

    @ObfuscatedName("cg.n()Ldg;")
    public class106 method1290() {
        class106 var1 = this.field1500.field1504;
        if (this.field1500 == var1) {
            return null;
        } else {
            var1.method1325();
            return var1;
        }
    }

    @ObfuscatedName("cg.j()Ldg;")
    public class106 method1297() {
        class106 var1 = this.field1500.field1505;
        if (this.field1500 == var1) {
            this.field1501 = null;
            return null;
        } else {
            this.field1501 = var1.field1505;
            return var1;
        }
    }

    @ObfuscatedName("cg.z()Ldg;")
    public class106 method1304() {
        class106 var1 = this.field1500.field1504;
        if (this.field1500 == var1) {
            this.field1501 = null;
            return null;
        } else {
            this.field1501 = var1.field1504;
            return var1;
        }
    }

    @ObfuscatedName("cg.g()Ldg;")
    public class106 method1299() {
        class106 var1 = this.field1501;
        if (this.field1500 == var1) {
            this.field1501 = null;
            return null;
        } else {
            this.field1501 = var1.field1505;
            return var1;
        }
    }

    @ObfuscatedName("cg.q()Ldg;")
    public class106 method1300() {
        class106 var1 = this.field1501;
        if (this.field1500 == var1) {
            this.field1501 = null;
            return null;
        } else {
            this.field1501 = var1.field1504;
            return var1;
        }
    }
}
