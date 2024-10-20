package deob;

@ObfuscatedName("dm")
public class class105 {

    @ObfuscatedName("dm.q")
    public class107 field1509 = new class107();

    @ObfuscatedName("dm.l")
    public class107 field1508;

    public class105() {
        this.field1509.field1512 = this.field1509;
        this.field1509.field1514 = this.field1509;
    }

    @ObfuscatedName("dm.q()V")
    public void method1292() {
        while (true) {
            class107 var1 = this.field1509.field1512;
            if (this.field1509 == var1) {
                this.field1508 = null;
                return;
            }
            var1.method1328();
        }
    }

    @ObfuscatedName("dm.l(Ldn;)V")
    public void method1293(class107 arg0) {
        if (arg0.field1514 != null) {
            arg0.method1328();
        }
        arg0.field1514 = this.field1509.field1514;
        arg0.field1512 = this.field1509;
        arg0.field1514.field1512 = arg0;
        arg0.field1512.field1514 = arg0;
    }

    @ObfuscatedName("dm.a(Ldn;)V")
    public void method1320(class107 arg0) {
        if (arg0.field1514 != null) {
            arg0.method1328();
        }
        arg0.field1514 = this.field1509;
        arg0.field1512 = this.field1509.field1512;
        arg0.field1514.field1512 = arg0;
        arg0.field1512.field1514 = arg0;
    }

    @ObfuscatedName("dm.o(Ldn;Ldn;)V")
    public static void method1295(class107 arg0, class107 arg1) {
        if (arg0.field1514 != null) {
            arg0.method1328();
        }
        arg0.field1514 = arg1.field1514;
        arg0.field1512 = arg1;
        arg0.field1514.field1512 = arg0;
        arg0.field1512.field1514 = arg0;
    }

    @ObfuscatedName("dm.c()Ldn;")
    public class107 method1294() {
        class107 var1 = this.field1509.field1512;
        if (this.field1509 == var1) {
            return null;
        } else {
            var1.method1328();
            return var1;
        }
    }

    @ObfuscatedName("dm.h()Ldn;")
    public class107 method1297() {
        class107 var1 = this.field1509.field1514;
        if (this.field1509 == var1) {
            return null;
        } else {
            var1.method1328();
            return var1;
        }
    }

    @ObfuscatedName("dm.r()Ldn;")
    public class107 method1298() {
        class107 var1 = this.field1509.field1512;
        if (this.field1509 == var1) {
            this.field1508 = null;
            return null;
        } else {
            this.field1508 = var1.field1512;
            return var1;
        }
    }

    @ObfuscatedName("dm.d()Ldn;")
    public class107 method1296() {
        class107 var1 = this.field1509.field1514;
        if (this.field1509 == var1) {
            this.field1508 = null;
            return null;
        } else {
            this.field1508 = var1.field1514;
            return var1;
        }
    }

    @ObfuscatedName("dm.k()Ldn;")
    public class107 method1299() {
        class107 var1 = this.field1508;
        if (this.field1509 == var1) {
            this.field1508 = null;
            return null;
        } else {
            this.field1508 = var1.field1512;
            return var1;
        }
    }

    @ObfuscatedName("dm.u()Ldn;")
    public class107 method1300() {
        class107 var1 = this.field1508;
        if (this.field1509 == var1) {
            this.field1508 = null;
            return null;
        } else {
            this.field1508 = var1.field1514;
            return var1;
        }
    }
}
