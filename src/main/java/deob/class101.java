package deob;

import java.io.IOException;

@ObfuscatedName("cx")
public class class101 {

    @ObfuscatedName("cx.m")
    public class161 field1469;

    @ObfuscatedName("cx.p")
    public class199 field1466 = new class199();

    @ObfuscatedName("cx.i")
    public int field1473 = 0;

    @ObfuscatedName("cx.j")
    public class181 field1468 = new class181(5000);

    @ObfuscatedName("cx.v")
    public class188 field1479;

    @ObfuscatedName("cx.x")
    public class187 field1470 = new class187(40000);

    @ObfuscatedName("cx.e")
    public class167 field1471 = null;

    @ObfuscatedName("cx.l")
    public int field1472 = 0;

    @ObfuscatedName("cx.b")
    public boolean field1475 = true;

    @ObfuscatedName("cx.n")
    public int field1476 = 0;

    @ObfuscatedName("cx.c")
    public int field1467 = 0;

    @ObfuscatedName("cx.a")
    public class167 field1465;

    @ObfuscatedName("cx.y")
    public class167 field1477;

    @ObfuscatedName("cx.w")
    public class167 field1478;

    @ObfuscatedName("cx.m(B)V")
    public final void method1781() {
        this.field1466.method3448();
        this.field1473 = 0;
    }

    @ObfuscatedName("cx.p(I)V")
    public final void method1790() throws IOException {
        if (this.field1469 == null || this.field1473 <= 0) {
            return;
        }
        this.field1468.field2498 = 0;
        while (true) {
            class171 var1 = (class171) this.field1466.method3453();
            if (var1 == null || var1.field2427 > this.field1468.field2499.length - this.field1468.field2498) {
                this.field1469.method2828(this.field1468.field2499, 0, this.field1468.field2498);
                this.field1467 = 0;
                break;
            }
            this.field1468.method3006(var1.field2424.field2499, 0, var1.field2427);
            this.field1473 -= var1.field2427;
            var1.method3476();
            var1.field2424.method3232();
            var1.method2920();
        }
    }

    @ObfuscatedName("cx.i(Lfg;B)V")
    public final void method1783(class171 arg0) {
        this.field1466.method3461(arg0);
        arg0.field2427 = arg0.field2424.field2498;
        arg0.field2424.field2498 = 0;
        this.field1473 += arg0.field2427;
    }

    @ObfuscatedName("cx.j(Lft;I)V")
    public void method1784(class161 arg0) {
        this.field1469 = arg0;
    }

    @ObfuscatedName("cx.v(I)V")
    public void method1802() {
        if (this.field1469 != null) {
            this.field1469.method2851();
            this.field1469 = null;
        }
    }

    @ObfuscatedName("cx.x(B)V")
    public void method1785() {
        this.field1469 = null;
    }

    @ObfuscatedName("cx.e(I)Lft;")
    public class161 method1786() {
        return this.field1469;
    }
}
