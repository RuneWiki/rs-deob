package deob;

import java.io.IOException;

@ObfuscatedName("cx")
public class class101 {

    @ObfuscatedName("cx.a")
    public class160 field1455;

    @ObfuscatedName("cx.w")
    public class203 field1449 = new class203();

    @ObfuscatedName("cx.e")
    public int field1448 = 0;

    @ObfuscatedName("cx.k")
    public class185 field1453 = new class185(5000);

    @ObfuscatedName("cx.u")
    public class192 field1450;

    @ObfuscatedName("cx.z")
    public class191 field1451 = new class191(40000);

    @ObfuscatedName("cx.t")
    public class171 field1452 = null;

    @ObfuscatedName("cx.f")
    public int field1446 = 0;

    @ObfuscatedName("cx.g")
    public boolean field1447 = true;

    @ObfuscatedName("cx.j")
    public int field1454 = 0;

    @ObfuscatedName("cx.x")
    public int field1456 = 0;

    @ObfuscatedName("cx.c")
    public class171 field1457;

    @ObfuscatedName("cx.s")
    public class171 field1458;

    @ObfuscatedName("cx.n")
    public class171 field1459;

    @ObfuscatedName("cx.a(B)V")
    public final void method1710() {
        this.field1449.method3394();
        this.field1448 = 0;
    }

    @ObfuscatedName("cx.w(I)V")
    public final void method1705() throws IOException {
        if (this.field1455 == null || this.field1448 <= 0) {
            return;
        }
        this.field1453.field2509 = 0;
        while (true) {
            class175 var1 = (class175) this.field1449.method3399();
            if (var1 == null || var1.field2435 > this.field1453.field2512.length - this.field1453.field2509) {
                this.field1455.method2775(this.field1453.field2512, 0, this.field1453.field2509);
                this.field1456 = 0;
                break;
            }
            this.field1453.method2964(var1.field2434.field2512, 0, var1.field2435);
            this.field1448 -= var1.field2435;
            var1.method3427();
            var1.field2434.method3040();
            var1.method2874();
        }
    }

    @ObfuscatedName("cx.e(Lfg;I)V")
    public final void method1706(class175 arg0) {
        this.field1449.method3417(arg0);
        arg0.field2435 = arg0.field2434.field2509;
        arg0.field2434.field2509 = 0;
        this.field1448 += arg0.field2435;
    }

    @ObfuscatedName("cx.k(Lfx;I)V")
    public void method1707(class160 arg0) {
        this.field1455 = arg0;
    }

    @ObfuscatedName("cx.u(I)V")
    public void method1719() {
        if (this.field1455 != null) {
            this.field1455.method2776();
            this.field1455 = null;
        }
    }

    @ObfuscatedName("cx.z(I)V")
    public void method1717() {
        this.field1455 = null;
    }

    @ObfuscatedName("cx.t(I)Lfx;")
    public class160 method1708() {
        return this.field1455;
    }
}
