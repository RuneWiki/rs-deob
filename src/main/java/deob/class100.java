package deob;

@ObfuscatedName("cz")
public class class100 extends class117 {

    @ObfuscatedName("cz.b")
    public class214 field1446 = new class214();

    @ObfuscatedName("cz.q")
    public class214 field1447 = new class214();

    @ObfuscatedName("cz.o")
    public int field1448 = 0;

    @ObfuscatedName("cz.p")
    public int field1449 = -1;

    @ObfuscatedName("cz.b(Ldn;)V")
    public final synchronized void method1918(class117 arg0) {
        this.field1446.method3747(arg0);
    }

    @ObfuscatedName("cz.q(Ldn;)V")
    public final synchronized void method1923(class117 arg0) {
        arg0.method3726();
    }

    @ObfuscatedName("cz.o()V")
    public void method1920() {
        if (this.field1448 <= 0) {
            return;
        }
        for (class112 var1 = (class112) this.field1447.method3739(); var1 != null; var1 = (class112) this.field1447.method3745()) {
            var1.field1556 -= this.field1448;
        }
        this.field1449 -= this.field1448;
        this.field1448 = 0;
    }

    @ObfuscatedName("cz.p(Lhe;Ldq;)V")
    public void method1921(class213 arg0, class112 arg1) {
        while (this.field1447.field2615 != arg0 && ((class112) arg0).field1556 <= arg1.field1556) {
            arg0 = arg0.field2612;
        }
        class214.method3736(arg1, arg0);
        this.field1449 = ((class112) this.field1447.field2615.field2612).field1556;
    }

    @ObfuscatedName("cz.a(Ldq;)V")
    public void method1933(class112 arg0) {
        arg0.method3726();
        arg0.method2115();
        class213 var2 = this.field1447.field2615.field2612;
        if (this.field1447.field2615 == var2) {
            this.field1449 = -1;
        } else {
            this.field1449 = ((class112) var2).field1556;
        }
    }

    @ObfuscatedName("cz.h()Ldn;")
    public class117 method1949() {
        return (class117) this.field1446.method3739();
    }

    @ObfuscatedName("cz.l()Ldn;")
    public class117 method1922() {
        return (class117) this.field1446.method3745();
    }

    @ObfuscatedName("cz.y()I")
    public int method1925() {
        return 0;
    }

    @ObfuscatedName("cz.g([III)V")
    public final synchronized void method1926(int[] arg0, int arg1, int arg2) {
        do {
            if (this.field1449 < 0) {
                this.method1927(arg0, arg1, arg2);
                return;
            }
            if (this.field1448 + arg2 < this.field1449) {
                this.field1448 += arg2;
                this.method1927(arg0, arg1, arg2);
                return;
            }
            int var4 = this.field1449 - this.field1448;
            this.method1927(arg0, arg1, var4);
            arg1 += var4;
            arg2 -= var4;
            this.field1448 += var4;
            this.method1920();
            class112 var5 = (class112) this.field1447.method3739();
            synchronized (var5) {
                int var7 = var5.method2114(this);
                if (var7 < 0) {
                    var5.field1556 = 0;
                    this.method1933(var5);
                } else {
                    var5.field1556 = var7;
                    this.method1921(var5.field2612, var5);
                }
            }
        } while (arg2 != 0);
    }

    @ObfuscatedName("cz.c([III)V")
    public void method1927(int[] arg0, int arg1, int arg2) {
        for (class117 var4 = (class117) this.field1446.method3739(); var4 != null; var4 = (class117) this.field1446.method3745()) {
            var4.method2290(arg0, arg1, arg2);
        }
    }

    @ObfuscatedName("cz.u(I)V")
    public final synchronized void method1928(int arg0) {
        do {
            if (this.field1449 < 0) {
                this.method1929(arg0);
                return;
            }
            if (this.field1448 + arg0 < this.field1449) {
                this.field1448 += arg0;
                this.method1929(arg0);
                return;
            }
            int var2 = this.field1449 - this.field1448;
            this.method1929(var2);
            arg0 -= var2;
            this.field1448 += var2;
            this.method1920();
            class112 var3 = (class112) this.field1447.method3739();
            synchronized (var3) {
                int var5 = var3.method2114(this);
                if (var5 < 0) {
                    var3.field1556 = 0;
                    this.method1933(var3);
                } else {
                    var3.field1556 = var5;
                    this.method1921(var3.field2612, var3);
                }
            }
        } while (arg0 != 0);
    }

    @ObfuscatedName("cz.t(I)V")
    public void method1929(int arg0) {
        for (class117 var2 = (class117) this.field1446.method3739(); var2 != null; var2 = (class117) this.field1446.method3745()) {
            var2.method1928(arg0);
        }
    }
}
