package deob;

import java.io.IOException;

@ObfuscatedName("cq")
public class class100 {

    @ObfuscatedName("cq.o")
    public class170 field1484;

    @ObfuscatedName("cq.k")
    public class216 field1489 = new class216();

    @ObfuscatedName("cq.t")
    public int field1483 = 0;

    @ObfuscatedName("cq.d")
    public class195 field1491 = new class195(5000);

    @ObfuscatedName("cq.h")
    public class203 field1485;

    @ObfuscatedName("cq.m")
    public class202 field1492 = new class202(40000);

    @ObfuscatedName("cq.z")
    public class181 field1487 = null;

    @ObfuscatedName("cq.i")
    public int field1482 = 0;

    @ObfuscatedName("cq.u")
    public boolean field1490 = true;

    @ObfuscatedName("cq.x")
    public int field1481 = 0;

    @ObfuscatedName("cq.y")
    public int field1486 = 0;

    @ObfuscatedName("cq.a")
    public class181 field1496;

    @ObfuscatedName("cq.w")
    public class181 field1493;

    @ObfuscatedName("cq.n")
    public class181 field1494;

    @ObfuscatedName("cq.o(I)V")
    public final void method1868() {
        this.field1489.method3651();
        this.field1483 = 0;
    }

    @ObfuscatedName("cq.k(I)V")
    public final void method1869() throws IOException {
        if (this.field1484 == null || this.field1483 <= 0) {
            return;
        }
        this.field1491.field2575 = 0;
        while (true) {
            class185 var1 = (class185) this.field1489.method3655();
            if (var1 == null || var1.field2506 > this.field1491.field2574.length - this.field1491.field2575) {
                this.field1484.method3020(this.field1491.field2574, 0, this.field1491.field2575);
                this.field1486 = 0;
                break;
            }
            this.field1491.method3345(var1.field2505.field2574, 0, var1.field2506);
            this.field1483 -= var1.field2506;
            var1.method3681();
            var1.field2505.method3188();
            var1.method3124();
        }
    }

    @ObfuscatedName("cq.t(Lgh;I)V")
    public final void method1882(class185 arg0) {
        this.field1489.method3652(arg0);
        arg0.field2506 = arg0.field2505.field2575;
        arg0.field2505.field2575 = 0;
        this.field1483 += arg0.field2506;
    }

    @ObfuscatedName("cq.d(Lfd;B)V")
    public void method1871(class170 arg0) {
        this.field1484 = arg0;
    }

    @ObfuscatedName("cq.h(B)V")
    public void method1874() {
        if (this.field1484 != null) {
            this.field1484.method3014();
            this.field1484 = null;
        }
    }

    @ObfuscatedName("cq.m(B)V")
    public void method1873() {
        this.field1484 = null;
    }

    @ObfuscatedName("cq.z(B)Lfd;")
    public class170 method1870() {
        return this.field1484;
    }
}
