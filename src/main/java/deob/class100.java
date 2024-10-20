package deob;

import java.io.IOException;

@ObfuscatedName("cl")
public class class100 {

    @ObfuscatedName("cl.v")
    public class377 field1322;

    @ObfuscatedName("cl.c")
    public class337 field1315 = new class337();

    @ObfuscatedName("cl.i")
    public int field1316 = 0;

    @ObfuscatedName("cl.f")
    public class438 field1317 = new class438(5000);

    @ObfuscatedName("cl.b")
    public class454 field1328;

    @ObfuscatedName("cl.n")
    public class437 field1319 = new class437(40000);

    @ObfuscatedName("cl.s")
    public class266 field1320 = null;

    @ObfuscatedName("cl.l")
    public int field1321 = 0;

    @ObfuscatedName("cl.q")
    public boolean field1318 = true;

    @ObfuscatedName("cl.o")
    public int field1323 = 0;

    @ObfuscatedName("cl.r")
    public int field1324 = 0;

    @ObfuscatedName("cl.p")
    public class266 field1325;

    @ObfuscatedName("cl.w")
    public class266 field1326;

    @ObfuscatedName("cl.k")
    public class266 field1314;

    @ObfuscatedName("cl.v(B)V")
    public final void method2392() {
        this.field1315.method5607();
        this.field1316 = 0;
    }

    @ObfuscatedName("cl.c(I)V")
    public final void method2375() throws IOException {
        if (this.field1322 == null || this.field1316 <= 0) {
            return;
        }
        this.field1317.field4621 = 0;
        while (true) {
            class265 var1 = (class265) this.field1315.method5574();
            if (var1 == null || var1.field3020 > this.field1317.field4618.length - this.field1317.field4621) {
                this.field1322.method2992(this.field1317.field4618, 0, this.field1317.field4621);
                this.field1324 = 0;
                break;
            }
            this.field1317.method6964(var1.field3019.field4618, 0, var1.field3020);
            this.field1316 -= var1.field3020;
            var1.method6503();
            var1.field3019.method6953();
            var1.method4668();
        }
    }

    @ObfuscatedName("cl.i(Ljd;I)V")
    public final void method2395(class265 arg0) {
        this.field1315.method5604(arg0);
        arg0.field3020 = arg0.field3019.field4621;
        arg0.field3019.field4621 = 0;
        this.field1316 += arg0.field3020;
    }

    @ObfuscatedName("cl.f(Lny;I)V")
    public void method2396(class377 arg0) {
        this.field1322 = arg0;
    }

    @ObfuscatedName("cl.b(I)V")
    public void method2378() {
        if (this.field1322 != null) {
            this.field1322.method2972();
            this.field1322 = null;
        }
    }

    @ObfuscatedName("cl.n(B)V")
    public void method2379() {
        this.field1322 = null;
    }

    @ObfuscatedName("cl.s(I)Lny;")
    public class377 method2380() {
        return this.field1322;
    }
}
