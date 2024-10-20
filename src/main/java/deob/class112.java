package deob;

import java.io.IOException;

@ObfuscatedName("ds")
public class class112 {

    @ObfuscatedName("ds.v")
    public class329 field1405;

    @ObfuscatedName("ds.n")
    public class296 field1402 = new class296();

    @ObfuscatedName("ds.f")
    public int field1414 = 0;

    @ObfuscatedName("ds.y")
    public class383 field1404 = new class383(5000);

    @ObfuscatedName("ds.p")
    public class399 field1415;

    @ObfuscatedName("ds.j")
    public class382 field1406 = new class382(40000);

    @ObfuscatedName("ds.r")
    public class228 field1407 = null;

    @ObfuscatedName("ds.b")
    public int field1411 = 0;

    @ObfuscatedName("ds.d")
    public boolean field1409 = true;

    @ObfuscatedName("ds.s")
    public int field1410 = 0;

    @ObfuscatedName("ds.u")
    public int field1403 = 0;

    @ObfuscatedName("ds.l")
    public class228 field1412;

    @ObfuscatedName("ds.o")
    public class228 field1413;

    @ObfuscatedName("ds.c")
    public class228 field1401;

    @ObfuscatedName("ds.v(I)V")
    public final void method2165() {
        this.field1402.method4763();
        this.field1414 = 0;
    }

    @ObfuscatedName("ds.n(I)V")
    public final void method2164() throws IOException {
        if (this.field1405 == null || this.field1414 <= 0) {
            return;
        }
        this.field1404.field4158 = 0;
        while (true) {
            class227 var1 = (class227) this.field1402.method4767();
            if (var1 == null || var1.field2694 > this.field1404.field4155.length - this.field1404.field4158) {
                this.field1405.method2333(this.field1404.field4155, 0, this.field1404.field4158);
                this.field1403 = 0;
                break;
            }
            this.field1404.method5995(var1.field2693.field4155, 0, var1.field2694);
            this.field1414 -= var1.field2694;
            var1.method5496();
            var1.field2693.method5947();
            var1.method3968();
        }
    }

    @ObfuscatedName("ds.f(Lhq;I)V")
    public final void method2167(class227 arg0) {
        this.field1402.method4764(arg0);
        arg0.field2694 = arg0.field2693.field4158;
        arg0.field2693.field4158 = 0;
        this.field1414 += arg0.field2694;
    }

    @ObfuscatedName("ds.y(Lls;I)V")
    public void method2168(class329 arg0) {
        this.field1405 = arg0;
    }

    @ObfuscatedName("ds.p(B)V")
    public void method2185() {
        if (this.field1405 != null) {
            this.field1405.method2357();
            this.field1405 = null;
        }
    }

    @ObfuscatedName("ds.j(I)V")
    public void method2170() {
        this.field1405 = null;
    }

    @ObfuscatedName("ds.r(I)Lls;")
    public class329 method2171() {
        return this.field1405;
    }
}
