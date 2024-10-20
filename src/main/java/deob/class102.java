package deob;

@ObfuscatedName("cs")
public class class102 extends class119 {

    @ObfuscatedName("cs.i")
    public class195 field1570 = new class195();

    @ObfuscatedName("cs.j")
    public class195 field1569 = new class195();

    @ObfuscatedName("cs.a")
    public int field1568 = 0;

    @ObfuscatedName("cs.r")
    public int field1571 = -1;

    @ObfuscatedName("cs.i(Lds;)V")
    public final synchronized void method1761(class119 arg0) {
        this.field1570.method3406(arg0);
    }

    @ObfuscatedName("cs.j(Lds;)V")
    public final synchronized void method1726(class119 arg0) {
        arg0.method3397();
    }

    @ObfuscatedName("cs.a()V")
    public void method1727() {
        if (this.field1568 <= 0) {
            return;
        }
        for (class113 var1 = (class113) this.field1569.method3410(); var1 != null; var1 = (class113) this.field1569.method3412()) {
            var1.field1681 -= this.field1568;
        }
        this.field1571 -= this.field1568;
        this.field1568 = 0;
    }

    @ObfuscatedName("cs.r(Lgs;Ldn;)V")
    public void method1728(class194 arg0, class113 arg1) {
        while (this.field1569.field2476 != arg0 && ((class113) arg0).field1681 <= arg1.field1681) {
            arg0 = arg0.field2474;
        }
        class195.method3428(arg1, arg0);
        this.field1571 = ((class113) this.field1569.field2476.field2474).field1681;
    }

    @ObfuscatedName("cs.o(Ldn;)V")
    public void method1729(class113 arg0) {
        arg0.method3397();
        arg0.method1929();
        class194 var2 = this.field1569.field2476.field2474;
        if (this.field1569.field2476 == var2) {
            this.field1571 = -1;
        } else {
            this.field1571 = ((class113) var2).field1681;
        }
    }

    @ObfuscatedName("cs.n()Lds;")
    public class119 method1753() {
        return (class119) this.field1570.method3410();
    }

    @ObfuscatedName("cs.q()Lds;")
    public class119 method1731() {
        return (class119) this.field1570.method3412();
    }

    @ObfuscatedName("cs.b()I")
    public int method1732() {
        return 0;
    }

    @ObfuscatedName("cs.k([III)V")
    public final synchronized void method1733(int[] arg0, int arg1, int arg2) {
        do {
            if (this.field1571 < 0) {
                this.method1734(arg0, arg1, arg2);
                return;
            }
            if (this.field1568 + arg2 < this.field1571) {
                this.field1568 += arg2;
                this.method1734(arg0, arg1, arg2);
                return;
            }
            int var4 = this.field1571 - this.field1568;
            this.method1734(arg0, arg1, var4);
            arg1 += var4;
            arg2 -= var4;
            this.field1568 += var4;
            this.method1727();
            class113 var5 = (class113) this.field1569.method3410();
            synchronized (var5) {
                int var7 = var5.method1926(this);
                if (var7 < 0) {
                    var5.field1681 = 0;
                    this.method1729(var5);
                } else {
                    var5.field1681 = var7;
                    this.method1728(var5.field2474, var5);
                }
            }
        } while (arg2 != 0);
    }

    @ObfuscatedName("cs.s([III)V")
    public void method1734(int[] arg0, int arg1, int arg2) {
        for (class119 var4 = (class119) this.field1570.method3410(); var4 != null; var4 = (class119) this.field1570.method3412()) {
            var4.method2116(arg0, arg1, arg2);
        }
    }

    @ObfuscatedName("cs.d(I)V")
    public final synchronized void method1742(int arg0) {
        do {
            if (this.field1571 < 0) {
                this.method1736(arg0);
                return;
            }
            if (this.field1568 + arg0 < this.field1571) {
                this.field1568 += arg0;
                this.method1736(arg0);
                return;
            }
            int var2 = this.field1571 - this.field1568;
            this.method1736(var2);
            arg0 -= var2;
            this.field1568 += var2;
            this.method1727();
            class113 var3 = (class113) this.field1569.method3410();
            synchronized (var3) {
                int var5 = var3.method1926(this);
                if (var5 < 0) {
                    var3.field1681 = 0;
                    this.method1729(var3);
                } else {
                    var3.field1681 = var5;
                    this.method1728(var3.field2474, var3);
                }
            }
        } while (arg0 != 0);
    }

    @ObfuscatedName("cs.l(I)V")
    public void method1736(int arg0) {
        for (class119 var2 = (class119) this.field1570.method3410(); var2 != null; var2 = (class119) this.field1570.method3412()) {
            var2.method1742(arg0);
        }
    }
}
