package deob;

import java.io.IOException;

@ObfuscatedName("de")
public class class108 {

    @ObfuscatedName("de.h")
    public class400 field1437;

    @ObfuscatedName("de.e")
    public class354 field1429 = new class354();

    @ObfuscatedName("de.v")
    public int field1423 = 0;

    @ObfuscatedName("de.x")
    public class467 field1435 = new class467(5000);

    @ObfuscatedName("de.m")
    public class484 field1425;

    @ObfuscatedName("de.q")
    public class466 field1426 = new class466(40000);

    @ObfuscatedName("de.f")
    public class279 field1427 = null;

    @ObfuscatedName("de.r")
    public int field1430 = 0;

    @ObfuscatedName("de.u")
    public boolean field1431 = true;

    @ObfuscatedName("de.b")
    public int field1421 = 0;

    @ObfuscatedName("de.j")
    public int field1428 = 0;

    @ObfuscatedName("de.g")
    public class279 field1432;

    @ObfuscatedName("de.i")
    public class279 field1433;

    @ObfuscatedName("de.o")
    public class279 field1434;

    @ObfuscatedName("de.h(I)V")
    public final void method2581() {
        this.field1429.method6132();
        this.field1423 = 0;
    }

    @ObfuscatedName("de.e(I)V")
    public final void method2594() throws IOException {
        if (this.field1437 == null || this.field1423 <= 0) {
            return;
        }
        this.field1435.field4915 = 0;
        while (true) {
            class278 var1 = (class278) this.field1429.method6176();
            if (var1 == null || var1.field3176 > this.field1435.field4917.length - this.field1435.field4915) {
                this.field1437.method6944(this.field1435.field4917, 0, this.field1435.field4915);
                this.field1428 = 0;
                break;
            }
            this.field1435.method7785(var1.field3177.field4917, 0, var1.field3176);
            this.field1423 -= var1.field3176;
            var1.method7230();
            var1.field3177.method7774();
            var1.method4942();
        }
    }

    @ObfuscatedName("de.v(Ljx;S)V")
    public final void method2603(class278 arg0) {
        this.field1429.method6143(arg0);
        arg0.field3176 = arg0.field3177.field4915;
        arg0.field3177.field4915 = 0;
        this.field1423 += arg0.field3176;
    }

    @ObfuscatedName("de.x(Lou;B)V")
    public void method2584(class400 arg0) {
        this.field1437 = arg0;
    }

    @ObfuscatedName("de.m(I)V")
    public void method2585() {
        if (this.field1437 != null) {
            this.field1437.method6948();
            this.field1437 = null;
        }
    }

    @ObfuscatedName("de.q(I)V")
    public void method2586() {
        this.field1437 = null;
    }

    @ObfuscatedName("de.f(B)Lou;")
    public class400 method2587() {
        return this.field1437;
    }
}
