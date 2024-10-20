package deob;

@ObfuscatedName("ca")
public class class102 extends class119 {

    @ObfuscatedName("ca.n")
    public class205 field1474 = new class205();

    @ObfuscatedName("ca.v")
    public class205 field1475 = new class205();

    @ObfuscatedName("ca.y")
    public int field1477 = 0;

    @ObfuscatedName("ca.r")
    public int field1476 = -1;

    @ObfuscatedName("ca.n(Ldk;)V")
    public final synchronized void method1787(class119 arg0) {
        this.field1474.method3483(arg0);
    }

    @ObfuscatedName("ca.v(Ldk;)V")
    public final synchronized void method1773(class119 arg0) {
        arg0.method3474();
    }

    @ObfuscatedName("ca.y()V")
    public void method1774() {
        if (this.field1477 <= 0) {
            return;
        }
        for (class114 var1 = (class114) this.field1475.method3492(); var1 != null; var1 = (class114) this.field1475.method3481()) {
            var1.field1584 -= this.field1477;
        }
        this.field1476 -= this.field1477;
        this.field1477 = 0;
    }

    @ObfuscatedName("ca.r(Lgw;Lda;)V")
    public void method1803(class204 arg0, class114 arg1) {
        while (this.field1475.field2599 != arg0 && ((class114) arg0).field1584 <= arg1.field1584) {
            arg0 = arg0.field2598;
        }
        class205.method3484(arg1, arg0);
        this.field1476 = ((class114) this.field1475.field2599.field2598).field1584;
    }

    @ObfuscatedName("ca.h(Lda;)V")
    public void method1776(class114 arg0) {
        arg0.method3474();
        arg0.method1974();
        class204 var2 = this.field1475.field2599.field2598;
        if (this.field1475.field2599 == var2) {
            this.field1476 = -1;
        } else {
            this.field1476 = ((class114) var2).field1584;
        }
    }

    @ObfuscatedName("ca.d()Ldk;")
    public class119 method1779() {
        return (class119) this.field1474.method3492();
    }

    @ObfuscatedName("ca.s()Ldk;")
    public class119 method1778() {
        return (class119) this.field1474.method3481();
    }

    @ObfuscatedName("ca.b()I")
    public int method1815() {
        return 0;
    }

    @ObfuscatedName("ca.e([III)V")
    public final synchronized void method1780(int[] arg0, int arg1, int arg2) {
        do {
            if (this.field1476 < 0) {
                this.method1781(arg0, arg1, arg2);
                return;
            }
            if (this.field1477 + arg2 < this.field1476) {
                this.field1477 += arg2;
                this.method1781(arg0, arg1, arg2);
                return;
            }
            int var4 = this.field1476 - this.field1477;
            this.method1781(arg0, arg1, var4);
            arg1 += var4;
            arg2 -= var4;
            this.field1477 += var4;
            this.method1774();
            class114 var5 = (class114) this.field1475.method3492();
            synchronized (var5) {
                int var7 = var5.method1979(this);
                if (var7 < 0) {
                    var5.field1584 = 0;
                    this.method1776(var5);
                } else {
                    var5.field1584 = var7;
                    this.method1803(var5.field2598, var5);
                }
            }
        } while (arg2 != 0);
    }

    @ObfuscatedName("ca.f([III)V")
    public void method1781(int[] arg0, int arg1, int arg2) {
        for (class119 var4 = (class119) this.field1474.method3492(); var4 != null; var4 = (class119) this.field1474.method3481()) {
            var4.method2151(arg0, arg1, arg2);
        }
    }

    @ObfuscatedName("ca.u(I)V")
    public final synchronized void method1799(int arg0) {
        do {
            if (this.field1476 < 0) {
                this.method1783(arg0);
                return;
            }
            if (this.field1477 + arg0 < this.field1476) {
                this.field1477 += arg0;
                this.method1783(arg0);
                return;
            }
            int var2 = this.field1476 - this.field1477;
            this.method1783(var2);
            arg0 -= var2;
            this.field1477 += var2;
            this.method1774();
            class114 var3 = (class114) this.field1475.method3492();
            synchronized (var3) {
                int var5 = var3.method1979(this);
                if (var5 < 0) {
                    var3.field1584 = 0;
                    this.method1776(var3);
                } else {
                    var3.field1584 = var5;
                    this.method1803(var3.field2598, var3);
                }
            }
        } while (arg0 != 0);
    }

    @ObfuscatedName("ca.t(I)V")
    public void method1783(int arg0) {
        for (class119 var2 = (class119) this.field1474.method3492(); var2 != null; var2 = (class119) this.field1474.method3481()) {
            var2.method1799(arg0);
        }
    }
}
