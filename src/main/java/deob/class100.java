package deob;

import java.io.IOException;

@ObfuscatedName("co")
public class class100 {

    @ObfuscatedName("co.c")
    public class170 field1487;

    @ObfuscatedName("co.i")
    public class216 field1473 = new class216();

    @ObfuscatedName("co.o")
    public int field1484 = 0;

    @ObfuscatedName("co.j")
    public class195 field1485 = new class195(5000);

    @ObfuscatedName("co.k")
    public class203 field1476;

    @ObfuscatedName("co.x")
    public class202 field1477 = new class202(40000);

    @ObfuscatedName("co.z")
    public class181 field1478 = null;

    @ObfuscatedName("co.p")
    public int field1479 = 0;

    @ObfuscatedName("co.w")
    public boolean field1480 = true;

    @ObfuscatedName("co.r")
    public int field1481 = 0;

    @ObfuscatedName("co.d")
    public int field1482 = 0;

    @ObfuscatedName("co.a")
    public class181 field1486;

    @ObfuscatedName("co.e")
    public class181 field1474;

    @ObfuscatedName("co.f")
    public class181 field1472;

    @ObfuscatedName("co.c(I)V")
    public final void method1881() {
        this.field1473.method3679();
        this.field1484 = 0;
    }

    @ObfuscatedName("co.i(I)V")
    public final void method1883() throws IOException {
        if (this.field1487 == null || this.field1484 <= 0) {
            return;
        }
        this.field1485.field2566 = 0;
        while (true) {
            class185 var1 = (class185) this.field1473.method3684();
            if (var1 == null || var1.field2495 > this.field1485.field2567.length - this.field1485.field2566) {
                this.field1487.method3021(this.field1485.field2567, 0, this.field1485.field2566);
                this.field1482 = 0;
                break;
            }
            this.field1485.method3267(var1.field2501.field2567, 0, var1.field2495);
            this.field1484 -= var1.field2495;
            var1.method3710();
            var1.field2501.method3208();
            var1.method3137();
        }
    }

    @ObfuscatedName("co.o(Lgg;B)V")
    public final void method1884(class185 arg0) {
        this.field1473.method3680(arg0);
        arg0.field2495 = arg0.field2501.field2566;
        arg0.field2501.field2566 = 0;
        this.field1484 += arg0.field2495;
    }

    @ObfuscatedName("co.j(Lfr;I)V")
    public void method1891(class170 arg0) {
        this.field1487 = arg0;
    }

    @ObfuscatedName("co.k(B)V")
    public void method1885() {
        if (this.field1487 != null) {
            this.field1487.method3022();
            this.field1487 = null;
        }
    }

    @ObfuscatedName("co.x(S)V")
    public void method1886() {
        this.field1487 = null;
    }

    @ObfuscatedName("co.z(I)Lfr;")
    public class170 method1900() {
        return this.field1487;
    }
}
