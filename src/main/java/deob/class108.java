package deob;

@ObfuscatedName("df")
public class class108 extends class125 {

    @ObfuscatedName("df.f")
    public class273 field1371 = new class273();

    @ObfuscatedName("df.b")
    public class273 field1369 = new class273();

    @ObfuscatedName("df.l")
    public int field1370 = 0;

    @ObfuscatedName("df.m")
    public int field1368 = -1;

    @ObfuscatedName("df.f(Lde;)V")
    public final synchronized void method2222(class125 arg0) {
        this.field1371.method4652(arg0);
    }

    @ObfuscatedName("df.b(Lde;)V")
    public final synchronized void method2225(class125 arg0) {
        arg0.method3407();
    }

    @ObfuscatedName("df.l()V")
    public void method2248() {
        if (this.field1370 <= 0) {
            return;
        }
        for (class120 var1 = (class120) this.field1369.method4638(); var1 != null; var1 = (class120) this.field1369.method4640()) {
            var1.field1478 -= this.field1370;
        }
        this.field1368 -= this.field1370;
        this.field1370 = 0;
    }

    @ObfuscatedName("df.m(Lgn;Ldy;)V")
    public void method2253(class190 arg0, class120 arg1) {
        while (this.field1369.field3558 != arg0 && ((class120) arg0).field1478 <= arg1.field1478) {
            arg0 = arg0.field2141;
        }
        class273.method4635(arg1, arg0);
        this.field1368 = ((class120) this.field1369.field3558.field2141).field1478;
    }

    @ObfuscatedName("df.z(Ldy;)V")
    public void method2223(class120 arg0) {
        arg0.method3407();
        arg0.method2422();
        class190 var2 = this.field1369.field3558.field2141;
        if (this.field1369.field3558 == var2) {
            this.field1368 = -1;
        } else {
            this.field1368 = ((class120) var2).field1478;
        }
    }

    @ObfuscatedName("df.q()Lde;")
    public class125 method2226() {
        return (class125) this.field1371.method4638();
    }

    @ObfuscatedName("df.k()Lde;")
    public class125 method2227() {
        return (class125) this.field1371.method4640();
    }

    @ObfuscatedName("df.c()I")
    public int method2237() {
        return 0;
    }

    @ObfuscatedName("df.u([III)V")
    public final synchronized void method2229(int[] arg0, int arg1, int arg2) {
        do {
            if (this.field1368 < 0) {
                this.method2230(arg0, arg1, arg2);
                return;
            }
            if (this.field1370 + arg2 < this.field1368) {
                this.field1370 += arg2;
                this.method2230(arg0, arg1, arg2);
                return;
            }
            int var4 = this.field1368 - this.field1370;
            this.method2230(arg0, arg1, var4);
            arg1 += var4;
            arg2 -= var4;
            this.field1370 += var4;
            this.method2248();
            class120 var5 = (class120) this.field1369.method4638();
            synchronized (var5) {
                int var7 = var5.method2420(this);
                if (var7 < 0) {
                    var5.field1478 = 0;
                    this.method2223(var5);
                } else {
                    var5.field1478 = var7;
                    this.method2253(var5.field2141, var5);
                }
            }
        } while (arg2 != 0);
    }

    @ObfuscatedName("df.t([III)V")
    public void method2230(int[] arg0, int arg1, int arg2) {
        for (class125 var4 = (class125) this.field1371.method4638(); var4 != null; var4 = (class125) this.field1371.method4640()) {
            var4.method2606(arg0, arg1, arg2);
        }
    }

    @ObfuscatedName("df.e(I)V")
    public final synchronized void method2231(int arg0) {
        do {
            if (this.field1368 < 0) {
                this.method2232(arg0);
                return;
            }
            if (this.field1370 + arg0 < this.field1368) {
                this.field1370 += arg0;
                this.method2232(arg0);
                return;
            }
            int var2 = this.field1368 - this.field1370;
            this.method2232(var2);
            arg0 -= var2;
            this.field1370 += var2;
            this.method2248();
            class120 var3 = (class120) this.field1369.method4638();
            synchronized (var3) {
                int var5 = var3.method2420(this);
                if (var5 < 0) {
                    var3.field1478 = 0;
                    this.method2223(var3);
                } else {
                    var3.field1478 = var5;
                    this.method2253(var3.field2141, var3);
                }
            }
        } while (arg0 != 0);
    }

    @ObfuscatedName("df.o(I)V")
    public void method2232(int arg0) {
        for (class125 var2 = (class125) this.field1371.method4638(); var2 != null; var2 = (class125) this.field1371.method4640()) {
            var2.method2231(arg0);
        }
    }
}
