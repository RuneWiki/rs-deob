package deob;

@ObfuscatedName("cq")
public class class102 extends class119 {

    @ObfuscatedName("cq.s")
    public class205 field1479 = new class205();

    @ObfuscatedName("cq.g")
    public class205 field1477 = new class205();

    @ObfuscatedName("cq.m")
    public int field1478 = 0;

    @ObfuscatedName("cq.h")
    public int field1480 = -1;

    @ObfuscatedName("cq.s(Ldb;)V")
    public final synchronized void method1992(class119 arg0) {
        this.field1479.method3748(arg0);
    }

    @ObfuscatedName("cq.g(Ldb;)V")
    public final synchronized void method1980(class119 arg0) {
        arg0.method3740();
    }

    @ObfuscatedName("cq.m()V")
    public void method1981() {
        if (this.field1478 <= 0) {
            return;
        }
        for (class113 var1 = (class113) this.field1477.method3752(); var1 != null; var1 = (class113) this.field1477.method3762()) {
            var1.field1585 -= this.field1478;
        }
        this.field1480 -= this.field1478;
        this.field1478 = 0;
    }

    @ObfuscatedName("cq.h(Lgf;Ldj;)V")
    public void method1996(class204 arg0, class113 arg1) {
        while (this.field1477.field2588 != arg0 && ((class113) arg0).field1585 <= arg1.field1585) {
            arg0 = arg0.field2584;
        }
        class205.method3749(arg1, arg0);
        this.field1480 = ((class113) this.field1477.field2588.field2584).field1585;
    }

    @ObfuscatedName("cq.i(Ldj;)V")
    public void method1983(class113 arg0) {
        arg0.method3740();
        arg0.method2192();
        class204 var2 = this.field1477.field2588.field2584;
        if (this.field1477.field2588 == var2) {
            this.field1480 = -1;
        } else {
            this.field1480 = ((class113) var2).field1585;
        }
    }

    @ObfuscatedName("cq.w()Ldb;")
    public class119 method1984() {
        return (class119) this.field1479.method3752();
    }

    @ObfuscatedName("cq.t()Ldb;")
    public class119 method1985() {
        return (class119) this.field1479.method3762();
    }

    @ObfuscatedName("cq.d()I")
    public int method1986() {
        return 0;
    }

    @ObfuscatedName("cq.z([III)V")
    public final synchronized void method1999(int[] arg0, int arg1, int arg2) {
        do {
            if (this.field1480 < 0) {
                this.method1988(arg0, arg1, arg2);
                return;
            }
            if (this.field1478 + arg2 < this.field1480) {
                this.field1478 += arg2;
                this.method1988(arg0, arg1, arg2);
                return;
            }
            int var4 = this.field1480 - this.field1478;
            this.method1988(arg0, arg1, var4);
            arg1 += var4;
            arg2 -= var4;
            this.field1478 += var4;
            this.method1981();
            class113 var5 = (class113) this.field1477.method3752();
            synchronized (var5) {
                int var7 = var5.method2193(this);
                if (var7 < 0) {
                    var5.field1585 = 0;
                    this.method1983(var5);
                } else {
                    var5.field1585 = var7;
                    this.method1996(var5.field2584, var5);
                }
            }
        } while (arg2 != 0);
    }

    @ObfuscatedName("cq.k([III)V")
    public void method1988(int[] arg0, int arg1, int arg2) {
        for (class119 var4 = (class119) this.field1479.method3752(); var4 != null; var4 = (class119) this.field1479.method3762()) {
            var4.method2382(arg0, arg1, arg2);
        }
    }

    @ObfuscatedName("cq.c(I)V")
    public final synchronized void method1989(int arg0) {
        do {
            if (this.field1480 < 0) {
                this.method1987(arg0);
                return;
            }
            if (this.field1478 + arg0 < this.field1480) {
                this.field1478 += arg0;
                this.method1987(arg0);
                return;
            }
            int var2 = this.field1480 - this.field1478;
            this.method1987(var2);
            arg0 -= var2;
            this.field1478 += var2;
            this.method1981();
            class113 var3 = (class113) this.field1477.method3752();
            synchronized (var3) {
                int var5 = var3.method2193(this);
                if (var5 < 0) {
                    var3.field1585 = 0;
                    this.method1983(var3);
                } else {
                    var3.field1585 = var5;
                    this.method1996(var3.field2584, var3);
                }
            }
        } while (arg0 != 0);
    }

    @ObfuscatedName("cq.o(I)V")
    public void method1987(int arg0) {
        for (class119 var2 = (class119) this.field1479.method3752(); var2 != null; var2 = (class119) this.field1479.method3762()) {
            var2.method1989(arg0);
        }
    }
}
