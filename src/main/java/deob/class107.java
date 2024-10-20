package deob;

import java.io.IOException;

@ObfuscatedName("db")
public class class107 {

    @ObfuscatedName("db.f")
    public class407 field1400;

    @ObfuscatedName("db.w")
    public class358 field1391 = new class358();

    @ObfuscatedName("db.v")
    public int field1392 = 0;

    @ObfuscatedName("db.s")
    public class474 field1393 = new class474(5000);

    @ObfuscatedName("db.z")
    public class491 field1390;

    @ObfuscatedName("db.j")
    public class473 field1397 = new class473(40000);

    @ObfuscatedName("db.i")
    public class283 field1396 = null;

    @ObfuscatedName("db.n")
    public int field1394 = 0;

    @ObfuscatedName("db.l")
    public boolean field1398 = true;

    @ObfuscatedName("db.k")
    public int field1399 = 0;

    @ObfuscatedName("db.c")
    public int field1401 = 0;

    @ObfuscatedName("db.r")
    public class283 field1406;

    @ObfuscatedName("db.b")
    public class283 field1402;

    @ObfuscatedName("db.m")
    public class283 field1403;

    @ObfuscatedName("db.f(S)V")
    public final void method2685() {
        this.field1391.method6284();
        this.field1392 = 0;
    }

    @ObfuscatedName("db.w(B)V")
    public final void method2687() throws IOException {
        if (this.field1400 == null || this.field1392 <= 0) {
            return;
        }
        this.field1393.field4939 = 0;
        while (true) {
            class282 var1 = (class282) this.field1391.method6318();
            if (var1 == null || var1.field3188 > this.field1393.field4936.length - this.field1393.field4939) {
                this.field1400.method7152(this.field1393.field4936, 0, this.field1393.field4939);
                this.field1401 = 0;
                break;
            }
            this.field1393.method7957(var1.field3187.field4936, 0, var1.field3188);
            this.field1392 -= var1.field3188;
            var1.method7431();
            var1.field3187.method7946();
            var1.method5052();
        }
    }

    @ObfuscatedName("db.v(Lji;B)V")
    public final void method2694(class282 arg0) {
        this.field1391.method6285(arg0);
        arg0.field3188 = arg0.field3187.field4939;
        arg0.field3187.field4939 = 0;
        this.field1392 += arg0.field3188;
    }

    @ObfuscatedName("db.s(Lov;S)V")
    public void method2688(class407 arg0) {
        this.field1400 = arg0;
    }

    @ObfuscatedName("db.z(I)V")
    public void method2690() {
        if (this.field1400 != null) {
            this.field1400.method7150();
            this.field1400 = null;
        }
    }

    @ObfuscatedName("db.j(B)V")
    public void method2691() {
        this.field1400 = null;
    }

    @ObfuscatedName("db.i(B)Lov;")
    public class407 method2699() {
        return this.field1400;
    }
}
