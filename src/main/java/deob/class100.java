package deob;

import java.io.IOException;

@ObfuscatedName("cs")
public class class100 {

    @ObfuscatedName("cs.c")
    public class377 field1340;

    @ObfuscatedName("cs.v")
    public class336 field1341 = new class336();

    @ObfuscatedName("cs.q")
    public int field1357 = 0;

    @ObfuscatedName("cs.f")
    public class443 field1349 = new class443(5000);

    @ObfuscatedName("cs.j")
    public class459 field1344;

    @ObfuscatedName("cs.e")
    public class442 field1345 = new class442(40000);

    @ObfuscatedName("cs.g")
    public class265 field1346 = null;

    @ObfuscatedName("cs.w")
    public int field1347 = 0;

    @ObfuscatedName("cs.y")
    public boolean field1342 = true;

    @ObfuscatedName("cs.i")
    public int field1343 = 0;

    @ObfuscatedName("cs.s")
    public int field1350 = 0;

    @ObfuscatedName("cs.t")
    public class265 field1351;

    @ObfuscatedName("cs.z")
    public class265 field1348;

    @ObfuscatedName("cs.r")
    public class265 field1353;

    @ObfuscatedName("cs.c(I)V")
    public final void method2376() {
        this.field1341.method5574();
        this.field1357 = 0;
    }

    @ObfuscatedName("cs.v(I)V")
    public final void method2385() throws IOException {
        if (this.field1340 == null || this.field1357 <= 0) {
            return;
        }
        this.field1349.field4700 = 0;
        while (true) {
            class264 var1 = (class264) this.field1341.method5577();
            if (var1 == null || var1.field3032 > this.field1349.field4701.length - this.field1349.field4700) {
                this.field1340.method6210(this.field1349.field4701, 0, this.field1349.field4700);
                this.field1350 = 0;
                break;
            }
            this.field1349.method7053(var1.field3031.field4701, 0, var1.field3032);
            this.field1357 -= var1.field3032;
            var1.method6497();
            var1.field3031.method7282();
            var1.method4714();
        }
    }

    @ObfuscatedName("cs.q(Ljt;B)V")
    public final void method2378(class264 arg0) {
        this.field1341.method5589(arg0);
        arg0.field3032 = arg0.field3031.field4700;
        arg0.field3031.field4700 = 0;
        this.field1357 += arg0.field3032;
    }

    @ObfuscatedName("cs.f(Lnl;I)V")
    public void method2379(class377 arg0) {
        this.field1340 = arg0;
    }

    @ObfuscatedName("cs.j(I)V")
    public void method2380() {
        if (this.field1340 != null) {
            this.field1340.method6196();
            this.field1340 = null;
        }
    }

    @ObfuscatedName("cs.e(B)V")
    public void method2381() {
        this.field1340 = null;
    }

    @ObfuscatedName("cs.g(S)Lnl;")
    public class377 method2388() {
        return this.field1340;
    }
}
