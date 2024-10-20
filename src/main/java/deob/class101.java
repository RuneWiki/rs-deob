package deob;

import java.io.IOException;

@ObfuscatedName("cs")
public class class101 {

    @ObfuscatedName("cs.c")
    public class379 field1347;

    @ObfuscatedName("cs.p")
    public class338 field1339 = new class338();

    @ObfuscatedName("cs.f")
    public int field1340 = 0;

    @ObfuscatedName("cs.n")
    public class445 field1338 = new class445(5000);

    @ObfuscatedName("cs.k")
    public class461 field1342;

    @ObfuscatedName("cs.w")
    public class444 field1343 = new class444(40000);

    @ObfuscatedName("cs.s")
    public class267 field1344 = null;

    @ObfuscatedName("cs.q")
    public int field1345 = 0;

    @ObfuscatedName("cs.m")
    public boolean field1341 = true;

    @ObfuscatedName("cs.x")
    public int field1350 = 0;

    @ObfuscatedName("cs.j")
    public int field1348 = 0;

    @ObfuscatedName("cs.v")
    public class267 field1349;

    @ObfuscatedName("cs.h")
    public class267 field1351;

    @ObfuscatedName("cs.t")
    public class267 field1346;

    @ObfuscatedName("cs.c(I)V")
    public final void method2532() {
        this.field1339.method5690();
        this.field1340 = 0;
    }

    @ObfuscatedName("cs.p(I)V")
    public final void method2544() throws IOException {
        if (this.field1347 == null || this.field1340 <= 0) {
            return;
        }
        this.field1338.field4735 = 0;
        while (true) {
            class266 var1 = (class266) this.field1339.method5708();
            if (var1 == null || var1.field3065 > this.field1338.field4733.length - this.field1338.field4735) {
                this.field1347.method6356(this.field1338.field4733, 0, this.field1338.field4735);
                this.field1348 = 0;
                break;
            }
            this.field1338.method7326(var1.field3064.field4733, 0, var1.field3065);
            this.field1340 -= var1.field3065;
            var1.method6657();
            var1.field3064.method7322();
            var1.method4807();
        }
    }

    @ObfuscatedName("cs.f(Ljm;I)V")
    public final void method2534(class266 arg0) {
        this.field1339.method5704(arg0);
        arg0.field3065 = arg0.field3064.field4735;
        arg0.field3064.field4735 = 0;
        this.field1340 += arg0.field3065;
    }

    @ObfuscatedName("cs.n(Lnl;I)V")
    public void method2535(class379 arg0) {
        this.field1347 = arg0;
    }

    @ObfuscatedName("cs.k(B)V")
    public void method2536() {
        if (this.field1347 != null) {
            this.field1347.method6345();
            this.field1347 = null;
        }
    }

    @ObfuscatedName("cs.w(I)V")
    public void method2543() {
        this.field1347 = null;
    }

    @ObfuscatedName("cs.s(B)Lnl;")
    public class379 method2549() {
        return this.field1347;
    }
}
