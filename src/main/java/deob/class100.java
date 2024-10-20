package deob;

import java.io.IOException;

@ObfuscatedName("cb")
public class class100 {

    @ObfuscatedName("cb.d")
    public class170 field1482;

    @ObfuscatedName("cb.z")
    public class216 field1470 = new class216();

    @ObfuscatedName("cb.n")
    public int field1468 = 0;

    @ObfuscatedName("cb.r")
    public class195 field1476 = new class195(5000);

    @ObfuscatedName("cb.e")
    public class203 field1471;

    @ObfuscatedName("cb.y")
    public class202 field1473 = new class202(40000);

    @ObfuscatedName("cb.k")
    public class181 field1474 = null;

    @ObfuscatedName("cb.s")
    public int field1469 = 0;

    @ObfuscatedName("cb.p")
    public boolean field1475 = true;

    @ObfuscatedName("cb.x")
    public int field1477 = 0;

    @ObfuscatedName("cb.m")
    public int field1478 = 0;

    @ObfuscatedName("cb.h")
    public class181 field1479;

    @ObfuscatedName("cb.t")
    public class181 field1480;

    @ObfuscatedName("cb.i")
    public class181 field1481;

    @ObfuscatedName("cb.d(I)V")
    public final void method1918() {
        this.field1470.method3749();
        this.field1468 = 0;
    }

    @ObfuscatedName("cb.z(B)V")
    public final void method1919() throws IOException {
        if (this.field1482 == null || this.field1468 <= 0) {
            return;
        }
        this.field1476.field2568 = 0;
        while (true) {
            class185 var1 = (class185) this.field1470.method3762();
            if (var1 == null || var1.field2496 > this.field1476.field2569.length - this.field1476.field2568) {
                this.field1482.method3050(this.field1476.field2569, 0, this.field1476.field2568);
                this.field1478 = 0;
                break;
            }
            this.field1476.method3253(var1.field2497.field2569, 0, var1.field2496);
            this.field1468 -= var1.field2496;
            var1.method3785();
            var1.field2497.method3419();
            var1.method3163();
        }
    }

    @ObfuscatedName("cb.n(Lgl;I)V")
    public final void method1921(class185 arg0) {
        this.field1470.method3750(arg0);
        arg0.field2496 = arg0.field2497.field2568;
        arg0.field2497.field2568 = 0;
        this.field1468 += arg0.field2496;
    }

    @ObfuscatedName("cb.r(Lfi;I)V")
    public void method1920(class170 arg0) {
        this.field1482 = arg0;
    }

    @ObfuscatedName("cb.e(I)V")
    public void method1931() {
        if (this.field1482 != null) {
            this.field1482.method3049();
            this.field1482 = null;
        }
    }

    @ObfuscatedName("cb.y(B)V")
    public void method1922() {
        this.field1482 = null;
    }

    @ObfuscatedName("cb.k(I)Lfi;")
    public class170 method1917() {
        return this.field1482;
    }
}
