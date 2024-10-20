package deob;

@ObfuscatedName("cs")
public class class103 extends class120 {

    @ObfuscatedName("cs.i")
    public class194 field1582 = new class194();

    @ObfuscatedName("cs.a")
    public class194 field1585 = new class194();

    @ObfuscatedName("cs.t")
    public int field1584 = 0;

    @ObfuscatedName("cs.s")
    public int field1583 = -1;

    @ObfuscatedName("cs.i(Ldq;)V")
    public final synchronized void method1733(class120 arg0) {
        this.field1582.method3299(arg0);
    }

    @ObfuscatedName("cs.w(Ldq;)V")
    public final synchronized void method1730(class120 arg0) {
        arg0.method3290();
    }

    @ObfuscatedName("cs.a()V")
    public void method1731() {
        if (this.field1584 <= 0) {
            return;
        }
        for (class114 var1 = (class114) this.field1585.method3303(); var1 != null; var1 = (class114) this.field1585.method3297()) {
            var1.field1684 -= this.field1584;
        }
        this.field1583 -= this.field1584;
        this.field1584 = 0;
    }

    @ObfuscatedName("cs.t(Lgm;Lds;)V")
    public void method1732(class193 arg0, class114 arg1) {
        while (this.field1585.field2477 != arg0 && ((class114) arg0).field1684 <= arg1.field1684) {
            arg0 = arg0.field2474;
        }
        class194.method3300(arg1, arg0);
        this.field1583 = ((class114) this.field1585.field2477.field2474).field1684;
    }

    @ObfuscatedName("cs.s(Lds;)V")
    public void method1735(class114 arg0) {
        arg0.method3290();
        arg0.method1920();
        class193 var2 = this.field1585.field2477.field2474;
        if (this.field1585.field2477 == var2) {
            this.field1583 = -1;
        } else {
            this.field1583 = ((class114) var2).field1684;
        }
    }

    @ObfuscatedName("cs.r()Ldq;")
    public class120 method1734() {
        return (class120) this.field1582.method3303();
    }

    @ObfuscatedName("cs.v()Ldq;")
    public class120 method1742() {
        return (class120) this.field1582.method3297();
    }

    @ObfuscatedName("cs.y()I")
    public int method1748() {
        return 0;
    }

    @ObfuscatedName("cs.j([III)V")
    public final synchronized void method1737(int[] arg0, int arg1, int arg2) {
        do {
            if (this.field1583 < 0) {
                this.method1745(arg0, arg1, arg2);
                return;
            }
            if (this.field1584 + arg2 < this.field1583) {
                this.field1584 += arg2;
                this.method1745(arg0, arg1, arg2);
                return;
            }
            int var4 = this.field1583 - this.field1584;
            this.method1745(arg0, arg1, var4);
            arg1 += var4;
            arg2 -= var4;
            this.field1584 += var4;
            this.method1731();
            class114 var5 = (class114) this.field1585.method3303();
            synchronized (var5) {
                int var7 = var5.method1919(this);
                if (var7 < 0) {
                    var5.field1684 = 0;
                    this.method1735(var5);
                } else {
                    var5.field1684 = var7;
                    this.method1732(var5.field2474, var5);
                }
            }
        } while (arg2 != 0);
    }

    @ObfuscatedName("cs.k([III)V")
    public void method1745(int[] arg0, int arg1, int arg2) {
        for (class120 var4 = (class120) this.field1582.method3303(); var4 != null; var4 = (class120) this.field1582.method3297()) {
            var4.method2091(arg0, arg1, arg2);
        }
    }

    @ObfuscatedName("cs.e(I)V")
    public final synchronized void method1739(int arg0) {
        do {
            if (this.field1583 < 0) {
                this.method1740(arg0);
                return;
            }
            if (this.field1584 + arg0 < this.field1583) {
                this.field1584 += arg0;
                this.method1740(arg0);
                return;
            }
            int var2 = this.field1583 - this.field1584;
            this.method1740(var2);
            arg0 -= var2;
            this.field1584 += var2;
            this.method1731();
            class114 var3 = (class114) this.field1585.method3303();
            synchronized (var3) {
                int var5 = var3.method1919(this);
                if (var5 < 0) {
                    var3.field1684 = 0;
                    this.method1735(var3);
                } else {
                    var3.field1684 = var5;
                    this.method1732(var3.field2474, var3);
                }
            }
        } while (arg0 != 0);
    }

    @ObfuscatedName("cs.o(I)V")
    public void method1740(int arg0) {
        for (class120 var2 = (class120) this.field1582.method3303(); var2 != null; var2 = (class120) this.field1582.method3297()) {
            var2.method1739(arg0);
        }
    }
}
