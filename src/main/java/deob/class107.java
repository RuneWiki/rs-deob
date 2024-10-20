package deob;

import java.io.IOException;

@ObfuscatedName("dc")
public class class107 {

    @ObfuscatedName("dc.a")
    public class397 field1376;

    @ObfuscatedName("dc.f")
    public class351 field1370 = new class351();

    @ObfuscatedName("dc.c")
    public int field1371 = 0;

    @ObfuscatedName("dc.x")
    public class464 field1380 = new class464(5000);

    @ObfuscatedName("dc.h")
    public class480 field1373;

    @ObfuscatedName("dc.j")
    public class463 field1378 = new class463(40000);

    @ObfuscatedName("dc.y")
    public class276 field1375 = null;

    @ObfuscatedName("dc.d")
    public int field1377 = 0;

    @ObfuscatedName("dc.n")
    public boolean field1369 = true;

    @ObfuscatedName("dc.r")
    public int field1372 = 0;

    @ObfuscatedName("dc.l")
    public int field1379 = 0;

    @ObfuscatedName("dc.s")
    public class276 field1381;

    @ObfuscatedName("dc.p")
    public class276 field1374;

    @ObfuscatedName("dc.b")
    public class276 field1382;

    @ObfuscatedName("dc.a(I)V")
    public final void method2538() {
        this.field1370.method6083();
        this.field1371 = 0;
    }

    @ObfuscatedName("dc.f(I)V")
    public final void method2543() throws IOException {
        if (this.field1376 == null || this.field1371 <= 0) {
            return;
        }
        this.field1380.field4864 = 0;
        while (true) {
            class275 var1 = (class275) this.field1370.method6075();
            if (var1 == null || var1.field3126 > this.field1380.field4867.length - this.field1380.field4864) {
                this.field1376.method6852(this.field1380.field4867, 0, this.field1380.field4864);
                this.field1379 = 0;
                break;
            }
            this.field1380.method7708(var1.field3123.field4867, 0, var1.field3126);
            this.field1371 -= var1.field3126;
            var1.method7170();
            var1.field3123.method7697();
            var1.method4866();
        }
    }

    @ObfuscatedName("dc.c(Ljc;I)V")
    public final void method2540(class275 arg0) {
        this.field1370.method6072(arg0);
        arg0.field3126 = arg0.field3123.field4864;
        arg0.field3123.field4864 = 0;
        this.field1371 += arg0.field3126;
    }

    @ObfuscatedName("dc.x(Lok;B)V")
    public void method2559(class397 arg0) {
        this.field1376 = arg0;
    }

    @ObfuscatedName("dc.h(I)V")
    public void method2542() {
        if (this.field1376 != null) {
            this.field1376.method6853();
            this.field1376 = null;
        }
    }

    @ObfuscatedName("dc.j(I)V")
    public void method2562() {
        this.field1376 = null;
    }

    @ObfuscatedName("dc.y(I)Lok;")
    public class397 method2544() {
        return this.field1376;
    }
}
