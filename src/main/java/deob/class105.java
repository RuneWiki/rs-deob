package deob;

import java.io.IOException;

@ObfuscatedName("dx")
public class class105 {

    @ObfuscatedName("dx.m")
    public class315 field1341;

    @ObfuscatedName("dx.o")
    public class271 field1355 = new class271();

    @ObfuscatedName("dx.q")
    public int field1342 = 0;

    @ObfuscatedName("dx.j")
    public class310 field1353 = new class310(5000);

    @ObfuscatedName("dx.p")
    public class338 field1340;

    @ObfuscatedName("dx.g")
    public class309 field1345 = new class309(40000);

    @ObfuscatedName("dx.n")
    public class192 field1346 = null;

    @ObfuscatedName("dx.u")
    public int field1347 = 0;

    @ObfuscatedName("dx.a")
    public boolean field1348 = true;

    @ObfuscatedName("dx.z")
    public int field1349 = 0;

    @ObfuscatedName("dx.w")
    public int field1350 = 0;

    @ObfuscatedName("dx.y")
    public class192 field1351;

    @ObfuscatedName("dx.c")
    public class192 field1352;

    @ObfuscatedName("dx.h")
    public class192 field1343;

    @ObfuscatedName("dx.m(B)V")
    public final void method2160() {
        this.field1355.method4584();
        this.field1342 = 0;
    }

    @ObfuscatedName("dx.o(I)V")
    public final void method2159() throws IOException {
        if (this.field1341 == null || this.field1342 <= 0) {
            return;
        }
        this.field1353.field3734 = 0;
        while (true) {
            class197 var1 = (class197) this.field1355.method4569();
            if (var1 == null || var1.field2373 > this.field1353.field3736.length - this.field1353.field3734) {
                this.field1341.method3304(this.field1353.field3736, 0, this.field1353.field3734);
                this.field1350 = 0;
                break;
            }
            this.field1353.method5220(var1.field2375.field3736, 0, var1.field2373);
            this.field1342 -= var1.field2373;
            var1.method3388();
            var1.field2375.method5338();
            var1.method3403();
        }
    }

    @ObfuscatedName("dx.q(Lgj;I)V")
    public final void method2161(class197 arg0) {
        this.field1355.method4566(arg0);
        arg0.field2373 = arg0.field2375.field3734;
        arg0.field2375.field3734 = 0;
        this.field1342 += arg0.field2373;
    }

    @ObfuscatedName("dx.j(Llj;I)V")
    public void method2174(class315 arg0) {
        this.field1341 = arg0;
    }

    @ObfuscatedName("dx.p(I)V")
    public void method2163() {
        if (this.field1341 != null) {
            this.field1341.method3322();
            this.field1341 = null;
        }
    }

    @ObfuscatedName("dx.g(I)V")
    public void method2164() {
        this.field1341 = null;
    }

    @ObfuscatedName("dx.n(I)Llj;")
    public class315 method2165() {
        return this.field1341;
    }
}
