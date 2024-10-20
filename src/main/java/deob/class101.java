package deob;

@ObfuscatedName("ct")
public class class101 extends class118 {

    @ObfuscatedName("ct.g")
    public class218 field1474 = new class218();

    @ObfuscatedName("ct.e")
    public class218 field1472 = new class218();

    @ObfuscatedName("ct.b")
    public int field1473 = 0;

    @ObfuscatedName("ct.z")
    public int field1471 = -1;

    @ObfuscatedName("ct.g(Ldh;)V")
    public final synchronized void method2030(class118 arg0) {
        this.field1474.method3805(arg0);
    }

    @ObfuscatedName("ct.e(Ldh;)V")
    public final synchronized void method2031(class118 arg0) {
        arg0.method3796();
    }

    @ObfuscatedName("ct.b()V")
    public void method2045() {
        if (this.field1473 <= 0) {
            return;
        }
        for (class113 var1 = (class113) this.field1472.method3809(); var1 != null; var1 = (class113) this.field1472.method3832()) {
            var1.field1578 -= this.field1473;
        }
        this.field1471 -= this.field1473;
        this.field1473 = 0;
    }

    @ObfuscatedName("ct.z(Lht;Lds;)V")
    public void method2033(class217 arg0, class113 arg1) {
        while (this.field1472.field2662 != arg0 && ((class113) arg0).field1578 <= arg1.field1578) {
            arg0 = arg0.field2659;
        }
        class218.method3806(arg1, arg0);
        this.field1471 = ((class113) this.field1472.field2662.field2659).field1578;
    }

    @ObfuscatedName("ct.n(Lds;)V")
    public void method2034(class113 arg0) {
        arg0.method3796();
        arg0.method2217();
        class217 var2 = this.field1472.field2662.field2659;
        if (this.field1472.field2662 == var2) {
            this.field1471 = -1;
        } else {
            this.field1471 = ((class113) var2).field1578;
        }
    }

    @ObfuscatedName("ct.l()Ldh;")
    public class118 method2035() {
        return (class118) this.field1474.method3809();
    }

    @ObfuscatedName("ct.s()Ldh;")
    public class118 method2032() {
        return (class118) this.field1474.method3832();
    }

    @ObfuscatedName("ct.y()I")
    public int method2061() {
        return 0;
    }

    @ObfuscatedName("ct.c([III)V")
    public final synchronized void method2038(int[] arg0, int arg1, int arg2) {
        do {
            if (this.field1471 < 0) {
                this.method2070(arg0, arg1, arg2);
                return;
            }
            if (this.field1473 + arg2 < this.field1471) {
                this.field1473 += arg2;
                this.method2070(arg0, arg1, arg2);
                return;
            }
            int var4 = this.field1471 - this.field1473;
            this.method2070(arg0, arg1, var4);
            arg1 += var4;
            arg2 -= var4;
            this.field1473 += var4;
            this.method2045();
            class113 var5 = (class113) this.field1472.method3809();
            synchronized (var5) {
                int var7 = var5.method2219(this);
                if (var7 < 0) {
                    var5.field1578 = 0;
                    this.method2034(var5);
                } else {
                    var5.field1578 = var7;
                    this.method2033(var5.field2659, var5);
                }
            }
        } while (arg2 != 0);
    }

    @ObfuscatedName("ct.o([III)V")
    public void method2070(int[] arg0, int arg1, int arg2) {
        for (class118 var4 = (class118) this.field1474.method3809(); var4 != null; var4 = (class118) this.field1474.method3832()) {
            var4.method2387(arg0, arg1, arg2);
        }
    }

    @ObfuscatedName("ct.d(I)V")
    public final synchronized void method2040(int arg0) {
        do {
            if (this.field1471 < 0) {
                this.method2041(arg0);
                return;
            }
            if (this.field1473 + arg0 < this.field1471) {
                this.field1473 += arg0;
                this.method2041(arg0);
                return;
            }
            int var2 = this.field1471 - this.field1473;
            this.method2041(var2);
            arg0 -= var2;
            this.field1473 += var2;
            this.method2045();
            class113 var3 = (class113) this.field1472.method3809();
            synchronized (var3) {
                int var5 = var3.method2219(this);
                if (var5 < 0) {
                    var3.field1578 = 0;
                    this.method2034(var3);
                } else {
                    var3.field1578 = var5;
                    this.method2033(var3.field2659, var3);
                }
            }
        } while (arg0 != 0);
    }

    @ObfuscatedName("ct.r(I)V")
    public void method2041(int arg0) {
        for (class118 var2 = (class118) this.field1474.method3809(); var2 != null; var2 = (class118) this.field1474.method3832()) {
            var2.method2040(arg0);
        }
    }
}
