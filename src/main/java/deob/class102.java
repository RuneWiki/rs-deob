package deob;

@ObfuscatedName("cr")
public class class102 extends class119 {

    @ObfuscatedName("cr.b")
    public class201 field1473 = new class201();

    @ObfuscatedName("cr.s")
    public class201 field1472 = new class201();

    @ObfuscatedName("cr.r")
    public int field1471 = 0;

    @ObfuscatedName("cr.g")
    public int field1474 = -1;

    @ObfuscatedName("cr.b(Ldk;)V")
    public final synchronized void method1774(class119 arg0) {
        this.field1473.method3401(arg0);
    }

    @ObfuscatedName("cr.s(Ldk;)V")
    public final synchronized void method1740(class119 arg0) {
        arg0.method3392();
    }

    @ObfuscatedName("cr.r()V")
    public void method1773() {
        if (this.field1471 <= 0) {
            return;
        }
        for (class113 var1 = (class113) this.field1472.method3405(); var1 != null; var1 = (class113) this.field1472.method3414()) {
            var1.field1585 -= this.field1471;
        }
        this.field1474 -= this.field1471;
        this.field1471 = 0;
    }

    @ObfuscatedName("cr.g(Lgt;Ldr;)V")
    public void method1742(class200 arg0, class113 arg1) {
        while (this.field1472.field2558 != arg0 && ((class113) arg0).field1585 <= arg1.field1585) {
            arg0 = arg0.field2556;
        }
        class201.method3427(arg1, arg0);
        this.field1474 = ((class113) this.field1472.field2558.field2556).field1585;
    }

    @ObfuscatedName("cr.x(Ldr;)V")
    public void method1747(class113 arg0) {
        arg0.method3392();
        arg0.method1943();
        class200 var2 = this.field1472.field2558.field2556;
        if (this.field1472.field2558 == var2) {
            this.field1474 = -1;
        } else {
            this.field1474 = ((class113) var2).field1585;
        }
    }

    @ObfuscatedName("cr.f()Ldk;")
    public class119 method1761() {
        return (class119) this.field1473.method3405();
    }

    @ObfuscatedName("cr.u()Ldk;")
    public class119 method1745() {
        return (class119) this.field1473.method3414();
    }

    @ObfuscatedName("cr.t()I")
    public int method1739() {
        return 0;
    }

    @ObfuscatedName("cr.k([III)V")
    public final synchronized void method1744(int[] arg0, int arg1, int arg2) {
        do {
            if (this.field1474 < 0) {
                this.method1746(arg0, arg1, arg2);
                return;
            }
            if (this.field1471 + arg2 < this.field1474) {
                this.field1471 += arg2;
                this.method1746(arg0, arg1, arg2);
                return;
            }
            int var4 = this.field1474 - this.field1471;
            this.method1746(arg0, arg1, var4);
            arg1 += var4;
            arg2 -= var4;
            this.field1471 += var4;
            this.method1773();
            class113 var5 = (class113) this.field1472.method3405();
            synchronized (var5) {
                int var7 = var5.method1944(this);
                if (var7 < 0) {
                    var5.field1585 = 0;
                    this.method1747(var5);
                } else {
                    var5.field1585 = var7;
                    this.method1742(var5.field2556, var5);
                }
            }
        } while (arg2 != 0);
    }

    @ObfuscatedName("cr.n([III)V")
    public void method1746(int[] arg0, int arg1, int arg2) {
        for (class119 var4 = (class119) this.field1473.method3405(); var4 != null; var4 = (class119) this.field1473.method3414()) {
            var4.method2114(arg0, arg1, arg2);
        }
    }

    @ObfuscatedName("cr.d(I)V")
    public final synchronized void method1748(int arg0) {
        do {
            if (this.field1474 < 0) {
                this.method1749(arg0);
                return;
            }
            if (this.field1471 + arg0 < this.field1474) {
                this.field1471 += arg0;
                this.method1749(arg0);
                return;
            }
            int var2 = this.field1474 - this.field1471;
            this.method1749(var2);
            arg0 -= var2;
            this.field1471 += var2;
            this.method1773();
            class113 var3 = (class113) this.field1472.method3405();
            synchronized (var3) {
                int var5 = var3.method1944(this);
                if (var5 < 0) {
                    var3.field1585 = 0;
                    this.method1747(var3);
                } else {
                    var3.field1585 = var5;
                    this.method1742(var3.field2556, var3);
                }
            }
        } while (arg0 != 0);
    }

    @ObfuscatedName("cr.o(I)V")
    public void method1749(int arg0) {
        for (class119 var2 = (class119) this.field1473.method3405(); var2 != null; var2 = (class119) this.field1473.method3414()) {
            var2.method1748(arg0);
        }
    }
}
