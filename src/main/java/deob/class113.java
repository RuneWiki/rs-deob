package deob;

import java.io.IOException;

@ObfuscatedName("dq")
public class class113 {

    @ObfuscatedName("dq.f")
    public class330 field1414;

    @ObfuscatedName("dq.e")
    public class297 field1403 = new class297();

    @ObfuscatedName("dq.v")
    public int field1402 = 0;

    @ObfuscatedName("dq.y")
    public class384 field1408 = new class384(5000);

    @ObfuscatedName("dq.j")
    public class400 field1410;

    @ObfuscatedName("dq.o")
    public class383 field1405 = new class383(40000);

    @ObfuscatedName("dq.m")
    public class229 field1406 = null;

    @ObfuscatedName("dq.r")
    public int field1407 = 0;

    @ObfuscatedName("dq.h")
    public boolean field1413 = true;

    @ObfuscatedName("dq.d")
    public int field1409 = 0;

    @ObfuscatedName("dq.z")
    public int field1401 = 0;

    @ObfuscatedName("dq.b")
    public class229 field1411;

    @ObfuscatedName("dq.i")
    public class229 field1412;

    @ObfuscatedName("dq.k")
    public class229 field1400;

    @ObfuscatedName("dq.f(I)V")
    public final void method2197() {
        this.field1403.method4788();
        this.field1402 = 0;
    }

    @ObfuscatedName("dq.e(I)V")
    public final void method2201() throws IOException {
        if (this.field1414 == null || this.field1402 <= 0) {
            return;
        }
        this.field1408.field4161 = 0;
        while (true) {
            class228 var1 = (class228) this.field1403.method4771();
            if (var1 == null || var1.field2699 > this.field1408.field4160.length - this.field1408.field4161) {
                this.field1414.method2370(this.field1408.field4160, 0, this.field1408.field4161);
                this.field1401 = 0;
                break;
            }
            this.field1408.method5878(var1.field2700.field4160, 0, var1.field2699);
            this.field1402 -= var1.field2699;
            var1.method5407();
            var1.field2700.method5879();
            var1.method4009();
        }
    }

    @ObfuscatedName("dq.v(Lhg;I)V")
    public final void method2200(class228 arg0) {
        this.field1403.method4768(arg0);
        arg0.field2699 = arg0.field2700.field4161;
        arg0.field2700.field4161 = 0;
        this.field1402 += arg0.field2699;
    }

    @ObfuscatedName("dq.y(Llk;S)V")
    public void method2199(class330 arg0) {
        this.field1414 = arg0;
    }

    @ObfuscatedName("dq.j(I)V")
    public void method2203() {
        if (this.field1414 != null) {
            this.field1414.method2364();
            this.field1414 = null;
        }
    }

    @ObfuscatedName("dq.o(I)V")
    public void method2210() {
        this.field1414 = null;
    }

    @ObfuscatedName("dq.m(I)Llk;")
    public class330 method2206() {
        return this.field1414;
    }
}
