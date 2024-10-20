package deob;

import java.io.IOException;

@ObfuscatedName("cq")
public class class100 {

    @ObfuscatedName("cq.g")
    public class170 field1463;

    @ObfuscatedName("cq.e")
    public class216 field1458 = new class216();

    @ObfuscatedName("cq.b")
    public int field1460 = 0;

    @ObfuscatedName("cq.z")
    public class195 field1465 = new class195(5000);

    @ObfuscatedName("cq.n")
    public class203 field1461;

    @ObfuscatedName("cq.l")
    public class202 field1457 = new class202(40000);

    @ObfuscatedName("cq.s")
    public class181 field1470 = null;

    @ObfuscatedName("cq.y")
    public int field1464 = 0;

    @ObfuscatedName("cq.c")
    public boolean field1462 = true;

    @ObfuscatedName("cq.h")
    public int field1466 = 0;

    @ObfuscatedName("cq.i")
    public int field1467 = 0;

    @ObfuscatedName("cq.o")
    public class181 field1468;

    @ObfuscatedName("cq.d")
    public class181 field1469;

    @ObfuscatedName("cq.r")
    public class181 field1459;

    @ObfuscatedName("cq.g(I)V")
    public final void method1997() {
        this.field1458.method3758();
        this.field1460 = 0;
    }

    @ObfuscatedName("cq.e(B)V")
    public final void method1998() throws IOException {
        if (this.field1463 == null || this.field1460 <= 0) {
            return;
        }
        this.field1465.field2562 = 0;
        while (true) {
            class185 var1 = (class185) this.field1458.method3767();
            if (var1 == null || var1.field2490 > this.field1465.field2563.length - this.field1465.field2562) {
                this.field1463.method3107(this.field1465.field2563, 0, this.field1465.field2562);
                this.field1467 = 0;
                break;
            }
            this.field1465.method3504(var1.field2489.field2563, 0, var1.field2490);
            this.field1460 -= var1.field2490;
            var1.method3796();
            var1.field2489.method3292();
            var1.method3218();
        }
    }

    @ObfuscatedName("cq.b(Lgj;I)V")
    public final void method1999(class185 arg0) {
        this.field1458.method3757(arg0);
        arg0.field2490 = arg0.field2489.field2562;
        arg0.field2489.field2562 = 0;
        this.field1460 += arg0.field2490;
    }

    @ObfuscatedName("cq.z(Lfs;I)V")
    public void method2000(class170 arg0) {
        this.field1463 = arg0;
    }

    @ObfuscatedName("cq.n(B)V")
    public void method2010() {
        if (this.field1463 != null) {
            this.field1463.method3108();
            this.field1463 = null;
        }
    }

    @ObfuscatedName("cq.l(I)V")
    public void method2002() {
        this.field1463 = null;
    }

    @ObfuscatedName("cq.s(I)Lfs;")
    public class170 method2003() {
        return this.field1463;
    }
}
