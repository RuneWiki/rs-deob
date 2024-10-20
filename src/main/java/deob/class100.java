package deob;

import java.io.IOException;

@ObfuscatedName("cn")
public class class100 {

    @ObfuscatedName("cn.t")
    public class170 field1455;

    @ObfuscatedName("cn.q")
    public class216 field1469 = new class216();

    @ObfuscatedName("cn.i")
    public int field1467 = 0;

    @ObfuscatedName("cn.a")
    public class195 field1456 = new class195(5000);

    @ObfuscatedName("cn.l")
    public class203 field1457;

    @ObfuscatedName("cn.b")
    public class202 field1460 = new class202(40000);

    @ObfuscatedName("cn.e")
    public class181 field1459 = null;

    @ObfuscatedName("cn.x")
    public int field1453 = 0;

    @ObfuscatedName("cn.p")
    public boolean field1454 = true;

    @ObfuscatedName("cn.g")
    public int field1465 = 0;

    @ObfuscatedName("cn.n")
    public int field1463 = 0;

    @ObfuscatedName("cn.o")
    public class181 field1464;

    @ObfuscatedName("cn.c")
    public class181 field1458;

    @ObfuscatedName("cn.v")
    public class181 field1466;

    @ObfuscatedName("cn.t(I)V")
    public final void method1910() {
        this.field1469.method3697();
        this.field1467 = 0;
    }

    @ObfuscatedName("cn.q(I)V")
    public final void method1920() throws IOException {
        if (this.field1455 == null || this.field1467 <= 0) {
            return;
        }
        this.field1456.field2545 = 0;
        while (true) {
            class185 var1 = (class185) this.field1469.method3683();
            if (var1 == null || var1.field2471 > this.field1456.field2544.length - this.field1456.field2545) {
                this.field1455.method3021(this.field1456.field2544, 0, this.field1456.field2545);
                this.field1463 = 0;
                break;
            }
            this.field1456.method3230(var1.field2478.field2544, 0, var1.field2471);
            this.field1467 -= var1.field2471;
            var1.method3721();
            var1.field2478.method3219();
            var1.method3136();
        }
    }

    @ObfuscatedName("cn.i(Lgd;I)V")
    public final void method1916(class185 arg0) {
        this.field1469.method3710(arg0);
        arg0.field2471 = arg0.field2478.field2545;
        arg0.field2478.field2545 = 0;
        this.field1467 += arg0.field2471;
    }

    @ObfuscatedName("cn.a(Lfy;B)V")
    public void method1913(class170 arg0) {
        this.field1455 = arg0;
    }

    @ObfuscatedName("cn.l(I)V")
    public void method1914() {
        if (this.field1455 != null) {
            this.field1455.method3022();
            this.field1455 = null;
        }
    }

    @ObfuscatedName("cn.b(B)V")
    public void method1925() {
        this.field1455 = null;
    }

    @ObfuscatedName("cn.e(I)Lfy;")
    public class170 method1915() {
        return this.field1455;
    }
}
