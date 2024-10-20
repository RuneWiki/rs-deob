package deob;

import java.io.IOException;

@ObfuscatedName("cz")
public class class100 {

    @ObfuscatedName("cz.s")
    public class378 field1334;

    @ObfuscatedName("cz.h")
    public class337 field1329 = new class337();

    @ObfuscatedName("cz.w")
    public int field1330 = 0;

    @ObfuscatedName("cz.v")
    public class444 field1341 = new class444(5000);

    @ObfuscatedName("cz.c")
    public class460 field1339;

    @ObfuscatedName("cz.q")
    public class443 field1333 = new class443(40000);

    @ObfuscatedName("cz.i")
    public class266 field1332 = null;

    @ObfuscatedName("cz.k")
    public int field1335 = 0;

    @ObfuscatedName("cz.o")
    public boolean field1336 = true;

    @ObfuscatedName("cz.n")
    public int field1337 = 0;

    @ObfuscatedName("cz.d")
    public int field1328 = 0;

    @ObfuscatedName("cz.a")
    public class266 field1338;

    @ObfuscatedName("cz.m")
    public class266 field1340;

    @ObfuscatedName("cz.u")
    public class266 field1331;

    @ObfuscatedName("cz.s(I)V")
    public final void method2334() {
        this.field1329.method5478();
        this.field1330 = 0;
    }

    @ObfuscatedName("cz.h(S)V")
    public final void method2323() throws IOException {
        if (this.field1334 == null || this.field1330 <= 0) {
            return;
        }
        this.field1341.field4708 = 0;
        while (true) {
            class265 var1 = (class265) this.field1329.method5482();
            if (var1 == null || var1.field3042 > this.field1341.field4707.length - this.field1341.field4708) {
                this.field1334.method6112(this.field1341.field4707, 0, this.field1341.field4708);
                this.field1328 = 0;
                break;
            }
            this.field1341.method6922(var1.field3039.field4707, 0, var1.field3042);
            this.field1330 -= var1.field3042;
            var1.method6409();
            var1.field3039.method6911();
            var1.method4619();
        }
    }

    @ObfuscatedName("cz.w(Ljg;I)V")
    public final void method2330(class265 arg0) {
        this.field1329.method5531(arg0);
        arg0.field3042 = arg0.field3039.field4708;
        arg0.field3039.field4708 = 0;
        this.field1330 += arg0.field3042;
    }

    @ObfuscatedName("cz.v(Lnc;I)V")
    public void method2325(class378 arg0) {
        this.field1334 = arg0;
    }

    @ObfuscatedName("cz.c(I)V")
    public void method2326() {
        if (this.field1334 != null) {
            this.field1334.method6121();
            this.field1334 = null;
        }
    }

    @ObfuscatedName("cz.q(B)V")
    public void method2343() {
        this.field1334 = null;
    }

    @ObfuscatedName("cz.i(B)Lnc;")
    public class378 method2328() {
        return this.field1334;
    }
}
