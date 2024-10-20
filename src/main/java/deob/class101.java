package deob;

import java.io.IOException;

@ObfuscatedName("ci")
public class class101 {

    @ObfuscatedName("ci.b")
    public class161 field1467;

    @ObfuscatedName("ci.s")
    public class199 field1470 = new class199();

    @ObfuscatedName("ci.r")
    public int field1459 = 0;

    @ObfuscatedName("ci.g")
    public class181 field1463 = new class181(5000);

    @ObfuscatedName("ci.x")
    public class188 field1461;

    @ObfuscatedName("ci.f")
    public class187 field1462 = new class187(40000);

    @ObfuscatedName("ci.u")
    public class167 field1464 = null;

    @ObfuscatedName("ci.t")
    public int field1466 = 0;

    @ObfuscatedName("ci.k")
    public boolean field1465 = true;

    @ObfuscatedName("ci.n")
    public int field1458 = 0;

    @ObfuscatedName("ci.d")
    public int field1457 = 0;

    @ObfuscatedName("ci.o")
    public class167 field1468;

    @ObfuscatedName("ci.a")
    public class167 field1469;

    @ObfuscatedName("ci.q")
    public class167 field1460;

    @ObfuscatedName("ci.b(I)V")
    public final void method1728() {
        this.field1470.method3357();
        this.field1459 = 0;
    }

    @ObfuscatedName("ci.s(S)V")
    public final void method1726() throws IOException {
        if (this.field1467 == null || this.field1459 <= 0) {
            return;
        }
        this.field1463.field2488 = 0;
        while (true) {
            class171 var1 = (class171) this.field1470.method3362();
            if (var1 == null || var1.field2424 > this.field1463.field2495.length - this.field1463.field2488) {
                this.field1467.method2768(this.field1463.field2495, 0, this.field1463.field2488);
                this.field1457 = 0;
                break;
            }
            this.field1463.method2939(var1.field2423.field2495, 0, var1.field2424);
            this.field1459 -= var1.field2424;
            var1.method3392();
            var1.field2423.method2928();
            var1.method2865();
        }
    }

    @ObfuscatedName("ci.r(Lfc;I)V")
    public final void method1715(class171 arg0) {
        this.field1470.method3369(arg0);
        arg0.field2424 = arg0.field2423.field2488;
        arg0.field2423.field2488 = 0;
        this.field1459 += arg0.field2424;
    }

    @ObfuscatedName("ci.g(Lfx;B)V")
    public void method1716(class161 arg0) {
        this.field1467 = arg0;
    }

    @ObfuscatedName("ci.x(I)V")
    public void method1717() {
        if (this.field1467 != null) {
            this.field1467.method2763();
            this.field1467 = null;
        }
    }

    @ObfuscatedName("ci.f(B)V")
    public void method1718() {
        this.field1467 = null;
    }

    @ObfuscatedName("ci.u(I)Lfx;")
    public class161 method1733() {
        return this.field1467;
    }
}
