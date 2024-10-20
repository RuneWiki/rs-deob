package deob;

@ObfuscatedName("cv")
public class class103 extends class120 {

    @ObfuscatedName("cv.i")
    public class194 field1554 = new class194();

    @ObfuscatedName("cv.h")
    public class194 field1556 = new class194();

    @ObfuscatedName("cv.u")
    public int field1555 = 0;

    @ObfuscatedName("cv.q")
    public int field1557 = -1;

    @ObfuscatedName("cv.i(Ldw;)V")
    public final synchronized void method1781(class120 arg0) {
        this.field1554.method3402(arg0);
    }

    @ObfuscatedName("cv.h(Ldw;)V")
    public final synchronized void method1755(class120 arg0) {
        arg0.method3364();
    }

    @ObfuscatedName("cv.u()V")
    public void method1756() {
        if (this.field1555 <= 0) {
            return;
        }
        for (class114 var1 = (class114) this.field1556.method3376(); var1 != null; var1 = (class114) this.field1556.method3377()) {
            var1.field1662 -= this.field1555;
        }
        this.field1557 -= this.field1555;
        this.field1555 = 0;
    }

    @ObfuscatedName("cv.q(Lgn;Lda;)V")
    public void method1785(class193 arg0, class114 arg1) {
        while (this.field1556.field2470 != arg0 && ((class114) arg0).field1662 <= arg1.field1662) {
            arg0 = arg0.field2468;
        }
        class194.method3389(arg1, arg0);
        this.field1557 = ((class114) this.field1556.field2470.field2468).field1662;
    }

    @ObfuscatedName("cv.g(Lda;)V")
    public void method1758(class114 arg0) {
        arg0.method3364();
        arg0.method1952();
        class193 var2 = this.field1556.field2470.field2468;
        if (this.field1556.field2470 == var2) {
            this.field1557 = -1;
        } else {
            this.field1557 = ((class114) var2).field1662;
        }
    }

    @ObfuscatedName("cv.v()Ldw;")
    public class120 method1784() {
        return (class120) this.field1554.method3376();
    }

    @ObfuscatedName("cv.t()Ldw;")
    public class120 method1760() {
        return (class120) this.field1554.method3377();
    }

    @ObfuscatedName("cv.p()I")
    public int method1761() {
        return 0;
    }

    @ObfuscatedName("cv.l([III)V")
    public final synchronized void method1762(int[] arg0, int arg1, int arg2) {
        do {
            if (this.field1557 < 0) {
                this.method1767(arg0, arg1, arg2);
                return;
            }
            if (this.field1555 + arg2 < this.field1557) {
                this.field1555 += arg2;
                this.method1767(arg0, arg1, arg2);
                return;
            }
            int var4 = this.field1557 - this.field1555;
            this.method1767(arg0, arg1, var4);
            arg1 += var4;
            arg2 -= var4;
            this.field1555 += var4;
            this.method1756();
            class114 var5 = (class114) this.field1556.method3376();
            synchronized (var5) {
                int var7 = var5.method1953(this);
                if (var7 < 0) {
                    var5.field1662 = 0;
                    this.method1758(var5);
                } else {
                    var5.field1662 = var7;
                    this.method1785(var5.field2468, var5);
                }
            }
        } while (arg2 != 0);
    }

    @ObfuscatedName("cv.a([III)V")
    public void method1767(int[] arg0, int arg1, int arg2) {
        for (class120 var4 = (class120) this.field1554.method3376(); var4 != null; var4 = (class120) this.field1554.method3377()) {
            var4.method2124(arg0, arg1, arg2);
        }
    }

    @ObfuscatedName("cv.k(I)V")
    public final synchronized void method1757(int arg0) {
        do {
            if (this.field1557 < 0) {
                this.method1765(arg0);
                return;
            }
            if (this.field1555 + arg0 < this.field1557) {
                this.field1555 += arg0;
                this.method1765(arg0);
                return;
            }
            int var2 = this.field1557 - this.field1555;
            this.method1765(var2);
            arg0 -= var2;
            this.field1555 += var2;
            this.method1756();
            class114 var3 = (class114) this.field1556.method3376();
            synchronized (var3) {
                int var5 = var3.method1953(this);
                if (var5 < 0) {
                    var3.field1662 = 0;
                    this.method1758(var3);
                } else {
                    var3.field1662 = var5;
                    this.method1785(var3.field2468, var3);
                }
            }
        } while (arg0 != 0);
    }

    @ObfuscatedName("cv.b(I)V")
    public void method1765(int arg0) {
        for (class120 var2 = (class120) this.field1554.method3376(); var2 != null; var2 = (class120) this.field1554.method3377()) {
            var2.method1757(arg0);
        }
    }
}
