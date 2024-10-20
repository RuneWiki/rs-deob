package deob;

import java.io.IOException;

@ObfuscatedName("cg")
public class class101 {

    @ObfuscatedName("cg.n")
    public class160 field1472;

    @ObfuscatedName("cg.v")
    public class203 field1462 = new class203();

    @ObfuscatedName("cg.y")
    public int field1461 = 0;

    @ObfuscatedName("cg.r")
    public class185 field1470 = new class185(5000);

    @ObfuscatedName("cg.h")
    public class192 field1463;

    @ObfuscatedName("cg.d")
    public class191 field1464 = new class191(40000);

    @ObfuscatedName("cg.s")
    public class171 field1465 = null;

    @ObfuscatedName("cg.b")
    public int field1467 = 0;

    @ObfuscatedName("cg.e")
    public boolean field1459 = true;

    @ObfuscatedName("cg.f")
    public int field1466 = 0;

    @ObfuscatedName("cg.z")
    public int field1469 = 0;

    @ObfuscatedName("cg.u")
    public class171 field1460;

    @ObfuscatedName("cg.p")
    public class171 field1471;

    @ObfuscatedName("cg.w")
    public class171 field1468;

    @ObfuscatedName("cg.n(I)V")
    public final void method1760() {
        this.field1462.method3460();
        this.field1461 = 0;
    }

    @ObfuscatedName("cg.v(B)V")
    public final void method1749() throws IOException {
        if (this.field1472 == null || this.field1461 <= 0) {
            return;
        }
        this.field1470.field2529 = 0;
        while (true) {
            class175 var1 = (class175) this.field1462.method3442();
            if (var1 == null || var1.field2452 > this.field1470.field2528.length - this.field1470.field2529) {
                this.field1472.method2811(this.field1470.field2528, 0, this.field1470.field2529);
                this.field1469 = 0;
                break;
            }
            this.field1470.method3147(var1.field2451.field2528, 0, var1.field2452);
            this.field1461 -= var1.field2452;
            var1.method3474();
            var1.field2451.method3004();
            var1.method2938();
        }
    }

    @ObfuscatedName("cg.y(Lfy;I)V")
    public final void method1747(class175 arg0) {
        this.field1462.method3438(arg0);
        arg0.field2452 = arg0.field2451.field2529;
        arg0.field2451.field2529 = 0;
        this.field1461 += arg0.field2452;
    }

    @ObfuscatedName("cg.r(Lfl;I)V")
    public void method1750(class160 arg0) {
        this.field1472 = arg0;
    }

    @ObfuscatedName("cg.h(B)V")
    public void method1751() {
        if (this.field1472 != null) {
            this.field1472.method2826();
            this.field1472 = null;
        }
    }

    @ObfuscatedName("cg.d(I)V")
    public void method1752() {
        this.field1472 = null;
    }

    @ObfuscatedName("cg.s(B)Lfl;")
    public class160 method1753() {
        return this.field1472;
    }
}
