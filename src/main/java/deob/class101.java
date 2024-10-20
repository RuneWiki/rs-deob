package deob;

import java.io.IOException;

@ObfuscatedName("ct")
public class class101 {

    @ObfuscatedName("ct.d")
    public class161 field1478;

    @ObfuscatedName("ct.x")
    public class199 field1467 = new class199();

    @ObfuscatedName("ct.k")
    public int field1468 = 0;

    @ObfuscatedName("ct.z")
    public class181 field1470 = new class181(5000);

    @ObfuscatedName("ct.v")
    public class188 field1471;

    @ObfuscatedName("ct.m")
    public class187 field1466 = new class187(40000);

    @ObfuscatedName("ct.b")
    public class167 field1472 = null;

    @ObfuscatedName("ct.t")
    public int field1473 = 0;

    @ObfuscatedName("ct.p")
    public boolean field1474 = true;

    @ObfuscatedName("ct.r")
    public int field1475 = 0;

    @ObfuscatedName("ct.l")
    public int field1469 = 0;

    @ObfuscatedName("ct.u")
    public class167 field1477;

    @ObfuscatedName("ct.n")
    public class167 field1476;

    @ObfuscatedName("ct.c")
    public class167 field1479;

    @ObfuscatedName("ct.d(I)V")
    public final void method1778() {
        this.field1467.method3448();
        this.field1468 = 0;
    }

    @ObfuscatedName("ct.x(I)V")
    public final void method1779() throws IOException {
        if (this.field1478 == null || this.field1468 <= 0) {
            return;
        }
        this.field1470.field2498 = 0;
        while (true) {
            class171 var1 = (class171) this.field1467.method3453();
            if (var1 == null || var1.field2424 > this.field1470.field2496.length - this.field1470.field2498) {
                this.field1478.method2871(this.field1470.field2496, 0, this.field1470.field2498);
                this.field1469 = 0;
                break;
            }
            this.field1470.method3198(var1.field2423.field2496, 0, var1.field2424);
            this.field1468 -= var1.field2424;
            var1.method3475();
            var1.field2423.method3209();
            var1.method2952();
        }
    }

    @ObfuscatedName("ct.k(Lfq;I)V")
    public final void method1777(class171 arg0) {
        this.field1467.method3455(arg0);
        arg0.field2424 = arg0.field2423.field2498;
        arg0.field2423.field2498 = 0;
        this.field1468 += arg0.field2424;
    }

    @ObfuscatedName("ct.z(Lfa;I)V")
    public void method1781(class161 arg0) {
        this.field1478 = arg0;
    }

    @ObfuscatedName("ct.v(B)V")
    public void method1782() {
        if (this.field1478 != null) {
            this.field1478.method2867();
            this.field1478 = null;
        }
    }

    @ObfuscatedName("ct.m(I)V")
    public void method1791() {
        this.field1478 = null;
    }

    @ObfuscatedName("ct.b(I)Lfa;")
    public class161 method1785() {
        return this.field1478;
    }
}
