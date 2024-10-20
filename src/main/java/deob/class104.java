package deob;

@ObfuscatedName("cq")
public class class104 {

    @ObfuscatedName("cq.t")
    public class106 field1495 = new class106();

    @ObfuscatedName("cq.n")
    public class106 field1494;

    public class104() {
        this.field1495.field1498 = this.field1495;
        this.field1495.field1499 = this.field1495;
    }

    @ObfuscatedName("cq.t()V")
    public void method1279() {
        while (true) {
            class106 var1 = this.field1495.field1498;
            if (this.field1495 == var1) {
                this.field1494 = null;
                return;
            }
            var1.method1307();
        }
    }

    @ObfuscatedName("cq.n(Ldd;)V")
    public void method1284(class106 arg0) {
        if (arg0.field1499 != null) {
            arg0.method1307();
        }
        arg0.field1499 = this.field1495.field1499;
        arg0.field1498 = this.field1495;
        arg0.field1499.field1498 = arg0;
        arg0.field1498.field1499 = arg0;
    }

    @ObfuscatedName("cq.q(Ldd;)V")
    public void method1281(class106 arg0) {
        if (arg0.field1499 != null) {
            arg0.method1307();
        }
        arg0.field1499 = this.field1495;
        arg0.field1498 = this.field1495.field1498;
        arg0.field1499.field1498 = arg0;
        arg0.field1498.field1499 = arg0;
    }

    @ObfuscatedName("cq.h(Ldd;Ldd;)V")
    public static void method1282(class106 arg0, class106 arg1) {
        if (arg0.field1499 != null) {
            arg0.method1307();
        }
        arg0.field1499 = arg1.field1499;
        arg0.field1498 = arg1;
        arg0.field1499.field1498 = arg0;
        arg0.field1498.field1499 = arg0;
    }

    @ObfuscatedName("cq.k()Ldd;")
    public class106 method1293() {
        class106 var1 = this.field1495.field1498;
        if (this.field1495 == var1) {
            return null;
        } else {
            var1.method1307();
            return var1;
        }
    }

    @ObfuscatedName("cq.r()Ldd;")
    public class106 method1278() {
        class106 var1 = this.field1495.field1499;
        if (this.field1495 == var1) {
            return null;
        } else {
            var1.method1307();
            return var1;
        }
    }

    @ObfuscatedName("cq.l()Ldd;")
    public class106 method1305() {
        class106 var1 = this.field1495.field1498;
        if (this.field1495 == var1) {
            this.field1494 = null;
            return null;
        } else {
            this.field1494 = var1.field1498;
            return var1;
        }
    }

    @ObfuscatedName("cq.i()Ldd;")
    public class106 method1286() {
        class106 var1 = this.field1495.field1499;
        if (this.field1495 == var1) {
            this.field1494 = null;
            return null;
        } else {
            this.field1494 = var1.field1499;
            return var1;
        }
    }

    @ObfuscatedName("cq.e()Ldd;")
    public class106 method1287() {
        class106 var1 = this.field1494;
        if (this.field1495 == var1) {
            this.field1494 = null;
            return null;
        } else {
            this.field1494 = var1.field1498;
            return var1;
        }
    }

    @ObfuscatedName("cq.a()Ldd;")
    public class106 method1288() {
        class106 var1 = this.field1494;
        if (this.field1495 == var1) {
            this.field1494 = null;
            return null;
        } else {
            this.field1494 = var1.field1499;
            return var1;
        }
    }
}
