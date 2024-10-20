package deob;

@ObfuscatedName("de")
public class class108 extends class125 {

    @ObfuscatedName("de.h")
    public class273 field1359 = new class273();

    @ObfuscatedName("de.v")
    public class273 field1358 = new class273();

    @ObfuscatedName("de.x")
    public int field1357 = 0;

    @ObfuscatedName("de.t")
    public int field1360 = -1;

    @ObfuscatedName("de.h(Ldi;)V")
    public final synchronized void method2184(class125 arg0) {
        this.field1359.method4539(arg0);
    }

    @ObfuscatedName("de.v(Ldi;)V")
    public final synchronized void method2185(class125 arg0) {
        arg0.method3359();
    }

    @ObfuscatedName("de.x()V")
    public void method2186() {
        if (this.field1357 <= 0) {
            return;
        }
        for (class120 var1 = (class120) this.field1358.method4540(); var1 != null; var1 = (class120) this.field1358.method4545()) {
            var1.field1465 -= this.field1357;
        }
        this.field1360 -= this.field1357;
        this.field1357 = 0;
    }

    @ObfuscatedName("de.w(Lgu;Ldd;)V")
    public void method2187(class190 arg0, class120 arg1) {
        while (this.field1358.field3569 != arg0 && ((class120) arg0).field1465 <= arg1.field1465) {
            arg0 = arg0.field2137;
        }
        class273.method4546(arg1, arg0);
        this.field1360 = ((class120) this.field1358.field3569.field2137).field1465;
    }

    @ObfuscatedName("de.t(Ldd;)V")
    public void method2183(class120 arg0) {
        arg0.method3359();
        arg0.method2389();
        class190 var2 = this.field1358.field3569.field2137;
        if (this.field1358.field3569 == var2) {
            this.field1360 = -1;
        } else {
            this.field1360 = ((class120) var2).field1465;
        }
    }

    @ObfuscatedName("de.j()Ldi;")
    public class125 method2189() {
        return (class125) this.field1359.method4540();
    }

    @ObfuscatedName("de.n()Ldi;")
    public class125 method2188() {
        return (class125) this.field1359.method4545();
    }

    @ObfuscatedName("de.p()I")
    public int method2215() {
        return 0;
    }

    @ObfuscatedName("de.l([III)V")
    public final synchronized void method2192(int[] arg0, int arg1, int arg2) {
        do {
            if (this.field1360 < 0) {
                this.method2193(arg0, arg1, arg2);
                return;
            }
            if (this.field1357 + arg2 < this.field1360) {
                this.field1357 += arg2;
                this.method2193(arg0, arg1, arg2);
                return;
            }
            int var4 = this.field1360 - this.field1357;
            this.method2193(arg0, arg1, var4);
            arg1 += var4;
            arg2 -= var4;
            this.field1357 += var4;
            this.method2186();
            class120 var5 = (class120) this.field1358.method4540();
            synchronized (var5) {
                int var7 = var5.method2387(this);
                if (var7 < 0) {
                    var5.field1465 = 0;
                    this.method2183(var5);
                } else {
                    var5.field1465 = var7;
                    this.method2187(var5.field2137, var5);
                }
            }
        } while (arg2 != 0);
    }

    @ObfuscatedName("de.z([III)V")
    public void method2193(int[] arg0, int arg1, int arg2) {
        for (class125 var4 = (class125) this.field1359.method4540(); var4 != null; var4 = (class125) this.field1359.method4545()) {
            var4.method2574(arg0, arg1, arg2);
        }
    }

    @ObfuscatedName("de.u(I)V")
    public final synchronized void method2197(int arg0) {
        do {
            if (this.field1360 < 0) {
                this.method2195(arg0);
                return;
            }
            if (this.field1357 + arg0 < this.field1360) {
                this.field1357 += arg0;
                this.method2195(arg0);
                return;
            }
            int var2 = this.field1360 - this.field1357;
            this.method2195(var2);
            arg0 -= var2;
            this.field1357 += var2;
            this.method2186();
            class120 var3 = (class120) this.field1358.method4540();
            synchronized (var3) {
                int var5 = var3.method2387(this);
                if (var5 < 0) {
                    var3.field1465 = 0;
                    this.method2183(var3);
                } else {
                    var3.field1465 = var5;
                    this.method2187(var3.field2137, var3);
                }
            }
        } while (arg0 != 0);
    }

    @ObfuscatedName("de.e(I)V")
    public void method2195(int arg0) {
        for (class125 var2 = (class125) this.field1359.method4540(); var2 != null; var2 = (class125) this.field1359.method4545()) {
            var2.method2197(arg0);
        }
    }
}
