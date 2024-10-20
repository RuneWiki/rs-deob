package deob;

@ObfuscatedName("cy")
public class class101 extends class118 {

    @ObfuscatedName("cy.s")
    public class194 field1553 = new class194();

    @ObfuscatedName("cy.q")
    public class194 field1552 = new class194();

    @ObfuscatedName("cy.o")
    public int field1554 = 0;

    @ObfuscatedName("cy.g")
    public int field1555 = -1;

    @ObfuscatedName("cy.w(Ldm;)V")
    public final synchronized void method1779(class118 arg0) {
        this.field1553.method3430(arg0);
    }

    @ObfuscatedName("cy.s(Ldm;)V")
    public final synchronized void method1780(class118 arg0) {
        arg0.method3425();
    }

    @ObfuscatedName("cy.q()V")
    public void method1783() {
        if (this.field1554 <= 0) {
            return;
        }
        for (class112 var1 = (class112) this.field1552.method3427(); var1 != null; var1 = (class112) this.field1552.method3435()) {
            var1.field1657 -= this.field1554;
        }
        this.field1555 -= this.field1554;
        this.field1554 = 0;
    }

    @ObfuscatedName("cy.o(Lgd;Ldh;)V")
    public void method1781(class193 arg0, class112 arg1) {
        while (this.field1552.field2467 != arg0 && ((class112) arg0).field1657 <= arg1.field1657) {
            arg0 = arg0.field2465;
        }
        class194.method3431(arg1, arg0);
        this.field1555 = ((class112) this.field1552.field2467.field2465).field1657;
    }

    @ObfuscatedName("cy.g(Ldh;)V")
    public void method1782(class112 arg0) {
        arg0.method3425();
        arg0.method1984();
        class193 var2 = this.field1552.field2467.field2465;
        if (this.field1552.field2467 == var2) {
            this.field1555 = -1;
        } else {
            this.field1555 = ((class112) var2).field1657;
        }
    }

    @ObfuscatedName("cy.v()Ldm;")
    public class118 method1817() {
        return (class118) this.field1553.method3427();
    }

    @ObfuscatedName("cy.p()Ldm;")
    public class118 method1784() {
        return (class118) this.field1553.method3435();
    }

    @ObfuscatedName("cy.e()I")
    public int method1785() {
        return 0;
    }

    @ObfuscatedName("cy.d([III)V")
    public final synchronized void method1786(int[] arg0, int arg1, int arg2) {
        do {
            if (this.field1555 < 0) {
                this.method1814(arg0, arg1, arg2);
                return;
            }
            if (this.field1554 + arg2 < this.field1555) {
                this.field1554 += arg2;
                this.method1814(arg0, arg1, arg2);
                return;
            }
            int var4 = this.field1555 - this.field1554;
            this.method1814(arg0, arg1, var4);
            arg1 += var4;
            arg2 -= var4;
            this.field1554 += var4;
            this.method1783();
            class112 var5 = (class112) this.field1552.method3427();
            synchronized (var5) {
                int var7 = var5.method1985(this);
                if (var7 < 0) {
                    var5.field1657 = 0;
                    this.method1782(var5);
                } else {
                    var5.field1657 = var7;
                    this.method1781(var5.field2465, var5);
                }
            }
        } while (arg2 != 0);
    }

    @ObfuscatedName("cy.x([III)V")
    public void method1814(int[] arg0, int arg1, int arg2) {
        for (class118 var4 = (class118) this.field1553.method3427(); var4 != null; var4 = (class118) this.field1553.method3435()) {
            var4.method2162(arg0, arg1, arg2);
        }
    }

    @ObfuscatedName("cy.u(I)V")
    public final synchronized void method1815(int arg0) {
        do {
            if (this.field1555 < 0) {
                this.method1789(arg0);
                return;
            }
            if (this.field1554 + arg0 < this.field1555) {
                this.field1554 += arg0;
                this.method1789(arg0);
                return;
            }
            int var2 = this.field1555 - this.field1554;
            this.method1789(var2);
            arg0 -= var2;
            this.field1554 += var2;
            this.method1783();
            class112 var3 = (class112) this.field1552.method3427();
            synchronized (var3) {
                int var5 = var3.method1985(this);
                if (var5 < 0) {
                    var3.field1657 = 0;
                    this.method1782(var3);
                } else {
                    var3.field1657 = var5;
                    this.method1781(var3.field2465, var3);
                }
            }
        } while (arg0 != 0);
    }

    @ObfuscatedName("cy.i(I)V")
    public void method1789(int arg0) {
        for (class118 var2 = (class118) this.field1553.method3427(); var2 != null; var2 = (class118) this.field1553.method3435()) {
            var2.method1815(arg0);
        }
    }
}
