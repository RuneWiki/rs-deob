package deob;

@ObfuscatedName("ck")
public class class104 extends class121 {

    @ObfuscatedName("ck.j")
    public class195 field1567 = new class195();

    @ObfuscatedName("ck.h")
    public class195 field1568 = new class195();

    @ObfuscatedName("ck.f")
    public int field1569 = 0;

    @ObfuscatedName("ck.p")
    public int field1570 = -1;

    @ObfuscatedName("ck.j(Lda;)V")
    public final synchronized void method1737(class121 arg0) {
        this.field1567.method3318(arg0);
    }

    @ObfuscatedName("ck.h(Lda;)V")
    public final synchronized void method1766(class121 arg0) {
        arg0.method3314();
    }

    @ObfuscatedName("ck.f()V")
    public void method1739() {
        if (this.field1569 <= 0) {
            return;
        }
        for (class115 var1 = (class115) this.field1568.method3326(); var1 != null; var1 = (class115) this.field1568.method3323()) {
            var1.field1681 -= this.field1569;
        }
        this.field1570 -= this.field1569;
        this.field1569 = 0;
    }

    @ObfuscatedName("ck.p(Lga;Ldv;)V")
    public void method1740(class194 arg0, class115 arg1) {
        while (this.field1568.field2472 != arg0 && ((class115) arg0).field1681 <= arg1.field1681) {
            arg0 = arg0.field2470;
        }
        class195.method3319(arg1, arg0);
        this.field1570 = ((class115) this.field1568.field2472.field2470).field1681;
    }

    @ObfuscatedName("ck.x(Ldv;)V")
    public void method1769(class115 arg0) {
        arg0.method3314();
        arg0.method1938();
        class194 var2 = this.field1568.field2472.field2470;
        if (this.field1568.field2472 == var2) {
            this.field1570 = -1;
        } else {
            this.field1570 = ((class115) var2).field1681;
        }
    }

    @ObfuscatedName("ck.g()Lda;")
    public class121 method1742() {
        return (class121) this.field1567.method3326();
    }

    @ObfuscatedName("ck.c()Lda;")
    public class121 method1743() {
        return (class121) this.field1567.method3323();
    }

    @ObfuscatedName("ck.l()I")
    public int method1744() {
        return 0;
    }

    @ObfuscatedName("ck.w([III)V")
    public final synchronized void method1745(int[] arg0, int arg1, int arg2) {
        do {
            if (this.field1570 < 0) {
                this.method1771(arg0, arg1, arg2);
                return;
            }
            if (this.field1569 + arg2 < this.field1570) {
                this.field1569 += arg2;
                this.method1771(arg0, arg1, arg2);
                return;
            }
            int var4 = this.field1570 - this.field1569;
            this.method1771(arg0, arg1, var4);
            arg1 += var4;
            arg2 -= var4;
            this.field1569 += var4;
            this.method1739();
            class115 var5 = (class115) this.field1568.method3326();
            synchronized (var5) {
                int var7 = var5.method1942(this);
                if (var7 < 0) {
                    var5.field1681 = 0;
                    this.method1769(var5);
                } else {
                    var5.field1681 = var7;
                    this.method1740(var5.field2470, var5);
                }
            }
        } while (arg2 != 0);
    }

    @ObfuscatedName("ck.b([III)V")
    public void method1771(int[] arg0, int arg1, int arg2) {
        for (class121 var4 = (class121) this.field1567.method3326(); var4 != null; var4 = (class121) this.field1567.method3323()) {
            var4.method2116(arg0, arg1, arg2);
        }
    }

    @ObfuscatedName("ck.o(I)V")
    public final synchronized void method1747(int arg0) {
        do {
            if (this.field1570 < 0) {
                this.method1748(arg0);
                return;
            }
            if (this.field1569 + arg0 < this.field1570) {
                this.field1569 += arg0;
                this.method1748(arg0);
                return;
            }
            int var2 = this.field1570 - this.field1569;
            this.method1748(var2);
            arg0 -= var2;
            this.field1569 += var2;
            this.method1739();
            class115 var3 = (class115) this.field1568.method3326();
            synchronized (var3) {
                int var5 = var3.method1942(this);
                if (var5 < 0) {
                    var3.field1681 = 0;
                    this.method1769(var3);
                } else {
                    var3.field1681 = var5;
                    this.method1740(var3.field2470, var3);
                }
            }
        } while (arg0 != 0);
    }

    @ObfuscatedName("ck.m(I)V")
    public void method1748(int arg0) {
        for (class121 var2 = (class121) this.field1567.method3326(); var2 != null; var2 = (class121) this.field1567.method3323()) {
            var2.method1747(arg0);
        }
    }
}
