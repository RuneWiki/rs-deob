package deob;

@ObfuscatedName("ce")
public class class103 extends class120 {

    @ObfuscatedName("ce.a")
    public class194 field1559 = new class194();

    @ObfuscatedName("ce.j")
    public class194 field1557 = new class194();

    @ObfuscatedName("ce.n")
    public int field1558 = 0;

    @ObfuscatedName("ce.r")
    public int field1556 = -1;

    @ObfuscatedName("ce.a(Ldf;)V")
    public final synchronized void method1720(class120 arg0) {
        this.field1559.method3341(arg0);
    }

    @ObfuscatedName("ce.j(Ldf;)V")
    public final synchronized void method1707(class120 arg0) {
        arg0.method3308();
    }

    @ObfuscatedName("ce.n()V")
    public void method1695() {
        if (this.field1558 <= 0) {
            return;
        }
        for (class114 var1 = (class114) this.field1557.method3318(); var1 != null; var1 = (class114) this.field1557.method3338()) {
            var1.field1662 -= this.field1558;
        }
        this.field1556 -= this.field1558;
        this.field1558 = 0;
    }

    @ObfuscatedName("ce.r(Lge;Ldn;)V")
    public void method1696(class193 arg0, class114 arg1) {
        while (this.field1557.field2468 != arg0 && ((class114) arg0).field1662 <= arg1.field1662) {
            arg0 = arg0.field2466;
        }
        class194.method3322(arg1, arg0);
        this.field1556 = ((class114) this.field1557.field2468.field2466).field1662;
    }

    @ObfuscatedName("ce.v(Ldn;)V")
    public void method1697(class114 arg0) {
        arg0.method3308();
        arg0.method1897();
        class193 var2 = this.field1557.field2468.field2466;
        if (this.field1557.field2468 == var2) {
            this.field1556 = -1;
        } else {
            this.field1556 = ((class114) var2).field1662;
        }
    }

    @ObfuscatedName("ce.e()Ldf;")
    public class120 method1698() {
        return (class120) this.field1559.method3318();
    }

    @ObfuscatedName("ce.l()Ldf;")
    public class120 method1719() {
        return (class120) this.field1559.method3338();
    }

    @ObfuscatedName("ce.s()I")
    public int method1700() {
        return 0;
    }

    @ObfuscatedName("ce.w([III)V")
    public final synchronized void method1721(int[] arg0, int arg1, int arg2) {
        do {
            if (this.field1556 < 0) {
                this.method1702(arg0, arg1, arg2);
                return;
            }
            if (this.field1558 + arg2 < this.field1556) {
                this.field1558 += arg2;
                this.method1702(arg0, arg1, arg2);
                return;
            }
            int var4 = this.field1556 - this.field1558;
            this.method1702(arg0, arg1, var4);
            arg1 += var4;
            arg2 -= var4;
            this.field1558 += var4;
            this.method1695();
            class114 var5 = (class114) this.field1557.method3318();
            synchronized (var5) {
                int var7 = var5.method1898(this);
                if (var7 < 0) {
                    var5.field1662 = 0;
                    this.method1697(var5);
                } else {
                    var5.field1662 = var7;
                    this.method1696(var5.field2466, var5);
                }
            }
        } while (arg2 != 0);
    }

    @ObfuscatedName("ce.p([III)V")
    public void method1702(int[] arg0, int arg1, int arg2) {
        for (class120 var4 = (class120) this.field1559.method3318(); var4 != null; var4 = (class120) this.field1559.method3338()) {
            var4.method2089(arg0, arg1, arg2);
        }
    }

    @ObfuscatedName("ce.m(I)V")
    public final synchronized void method1703(int arg0) {
        do {
            if (this.field1556 < 0) {
                this.method1704(arg0);
                return;
            }
            if (this.field1558 + arg0 < this.field1556) {
                this.field1558 += arg0;
                this.method1704(arg0);
                return;
            }
            int var2 = this.field1556 - this.field1558;
            this.method1704(var2);
            arg0 -= var2;
            this.field1558 += var2;
            this.method1695();
            class114 var3 = (class114) this.field1557.method3318();
            synchronized (var3) {
                int var5 = var3.method1898(this);
                if (var5 < 0) {
                    var3.field1662 = 0;
                    this.method1697(var3);
                } else {
                    var3.field1662 = var5;
                    this.method1696(var3.field2466, var3);
                }
            }
        } while (arg0 != 0);
    }

    @ObfuscatedName("ce.u(I)V")
    public void method1704(int arg0) {
        for (class120 var2 = (class120) this.field1559.method3318(); var2 != null; var2 = (class120) this.field1559.method3338()) {
            var2.method1703(arg0);
        }
    }
}
