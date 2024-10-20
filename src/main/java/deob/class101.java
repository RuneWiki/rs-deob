package deob;

@ObfuscatedName("cy")
public class class101 extends class118 {

    @ObfuscatedName("cy.d")
    public class218 field1484 = new class218();

    @ObfuscatedName("cy.z")
    public class218 field1485 = new class218();

    @ObfuscatedName("cy.n")
    public int field1486 = 0;

    @ObfuscatedName("cy.r")
    public int field1487 = -1;

    @ObfuscatedName("cy.d(Ldt;)V")
    public final synchronized void method1942(class118 arg0) {
        this.field1484.method3794(arg0);
    }

    @ObfuscatedName("cy.z(Ldt;)V")
    public final synchronized void method1968(class118 arg0) {
        arg0.method3785();
    }

    @ObfuscatedName("cy.n()V")
    public void method1975() {
        if (this.field1486 <= 0) {
            return;
        }
        for (class113 var1 = (class113) this.field1485.method3798(); var1 != null; var1 = (class113) this.field1485.method3800()) {
            var1.field1596 -= this.field1486;
        }
        this.field1487 -= this.field1486;
        this.field1486 = 0;
    }

    @ObfuscatedName("cy.r(Lho;Ldm;)V")
    public void method1945(class217 arg0, class113 arg1) {
        while (this.field1485.field2656 != arg0 && ((class113) arg0).field1596 <= arg1.field1596) {
            arg0 = arg0.field2654;
        }
        class218.method3795(arg1, arg0);
        this.field1487 = ((class113) this.field1485.field2656.field2654).field1596;
    }

    @ObfuscatedName("cy.e(Ldm;)V")
    public void method1981(class113 arg0) {
        arg0.method3785();
        arg0.method2146();
        class217 var2 = this.field1485.field2656.field2654;
        if (this.field1485.field2656 == var2) {
            this.field1487 = -1;
        } else {
            this.field1487 = ((class113) var2).field1596;
        }
    }

    @ObfuscatedName("cy.y()Ldt;")
    public class118 method1947() {
        return (class118) this.field1484.method3798();
    }

    @ObfuscatedName("cy.k()Ldt;")
    public class118 method1960() {
        return (class118) this.field1484.method3800();
    }

    @ObfuscatedName("cy.s()I")
    public int method1973() {
        return 0;
    }

    @ObfuscatedName("cy.x([III)V")
    public final synchronized void method1949(int[] arg0, int arg1, int arg2) {
        do {
            if (this.field1487 < 0) {
                this.method1951(arg0, arg1, arg2);
                return;
            }
            if (this.field1486 + arg2 < this.field1487) {
                this.field1486 += arg2;
                this.method1951(arg0, arg1, arg2);
                return;
            }
            int var4 = this.field1487 - this.field1486;
            this.method1951(arg0, arg1, var4);
            arg1 += var4;
            arg2 -= var4;
            this.field1486 += var4;
            this.method1975();
            class113 var5 = (class113) this.field1485.method3798();
            synchronized (var5) {
                int var7 = var5.method2152(this);
                if (var7 < 0) {
                    var5.field1596 = 0;
                    this.method1981(var5);
                } else {
                    var5.field1596 = var7;
                    this.method1945(var5.field2654, var5);
                }
            }
        } while (arg2 != 0);
    }

    @ObfuscatedName("cy.h([III)V")
    public void method1951(int[] arg0, int arg1, int arg2) {
        for (class118 var4 = (class118) this.field1484.method3798(); var4 != null; var4 = (class118) this.field1484.method3800()) {
            var4.method2332(arg0, arg1, arg2);
        }
    }

    @ObfuscatedName("cy.t(I)V")
    public final synchronized void method1952(int arg0) {
        do {
            if (this.field1487 < 0) {
                this.method1953(arg0);
                return;
            }
            if (this.field1486 + arg0 < this.field1487) {
                this.field1486 += arg0;
                this.method1953(arg0);
                return;
            }
            int var2 = this.field1487 - this.field1486;
            this.method1953(var2);
            arg0 -= var2;
            this.field1486 += var2;
            this.method1975();
            class113 var3 = (class113) this.field1485.method3798();
            synchronized (var3) {
                int var5 = var3.method2152(this);
                if (var5 < 0) {
                    var3.field1596 = 0;
                    this.method1981(var3);
                } else {
                    var3.field1596 = var5;
                    this.method1945(var3.field2654, var3);
                }
            }
        } while (arg0 != 0);
    }

    @ObfuscatedName("cy.i(I)V")
    public void method1953(int arg0) {
        for (class118 var2 = (class118) this.field1484.method3798(); var2 != null; var2 = (class118) this.field1484.method3800()) {
            var2.method1952(arg0);
        }
    }
}
