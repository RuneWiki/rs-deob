package deob;

import java.io.IOException;

@ObfuscatedName("dx")
public class class105 {

    @ObfuscatedName("dx.z")
    public class315 field1340;

    @ObfuscatedName("dx.k")
    public class271 field1338 = new class271();

    @ObfuscatedName("dx.s")
    public int field1339 = 0;

    @ObfuscatedName("dx.t")
    public class310 field1348 = new class310(5000);

    @ObfuscatedName("dx.i")
    public class338 field1341;

    @ObfuscatedName("dx.o")
    public class309 field1342 = new class309(40000);

    @ObfuscatedName("dx.x")
    public class192 field1343 = null;

    @ObfuscatedName("dx.w")
    public int field1344 = 0;

    @ObfuscatedName("dx.g")
    public boolean field1345 = true;

    @ObfuscatedName("dx.m")
    public int field1346 = 0;

    @ObfuscatedName("dx.n")
    public int field1350 = 0;

    @ObfuscatedName("dx.d")
    public class192 field1337;

    @ObfuscatedName("dx.h")
    public class192 field1349;

    @ObfuscatedName("dx.a")
    public class192 field1347;

    @ObfuscatedName("dx.z(I)V")
    public final void method2157() {
        this.field1338.method4547();
        this.field1339 = 0;
    }

    @ObfuscatedName("dx.k(I)V")
    public final void method2158() throws IOException {
        if (this.field1340 == null || this.field1339 <= 0) {
            return;
        }
        this.field1348.field3734 = 0;
        while (true) {
            class197 var1 = (class197) this.field1338.method4551();
            if (var1 == null || var1.field2378 > this.field1348.field3731.length - this.field1348.field3734) {
                this.field1340.method3315(this.field1348.field3731, 0, this.field1348.field3734);
                this.field1350 = 0;
                break;
            }
            this.field1348.method5186(var1.field2377.field3731, 0, var1.field2378);
            this.field1339 -= var1.field2378;
            var1.method3401();
            var1.field2377.method5180();
            var1.method3423();
        }
    }

    @ObfuscatedName("dx.s(Lgb;I)V")
    public final void method2159(class197 arg0) {
        this.field1338.method4564(arg0);
        arg0.field2378 = arg0.field2377.field3734;
        arg0.field2377.field3734 = 0;
        this.field1339 += arg0.field2378;
    }

    @ObfuscatedName("dx.t(Lln;I)V")
    public void method2180(class315 arg0) {
        this.field1340 = arg0;
    }

    @ObfuscatedName("dx.i(I)V")
    public void method2161() {
        if (this.field1340 != null) {
            this.field1340.method3308();
            this.field1340 = null;
        }
    }

    @ObfuscatedName("dx.o(B)V")
    public void method2162() {
        this.field1340 = null;
    }

    @ObfuscatedName("dx.x(B)Lln;")
    public class315 method2163() {
        return this.field1340;
    }
}
