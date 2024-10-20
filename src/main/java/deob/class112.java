package deob;

import java.io.IOException;

@ObfuscatedName("ef")
public class class112 {

    @ObfuscatedName("ef.at")
    public class451 field1408;

    @ObfuscatedName("ef.ah")
    public class392 field1404 = new class392();

    @ObfuscatedName("ef.ar")
    public int field1406 = 0;

    @ObfuscatedName("ef.ao")
    public class527 field1407 = new class527(5000);

    @ObfuscatedName("ef.ab")
    public class544 field1405;

    @ObfuscatedName("ef.au")
    public class526 field1409 = new class526(40000);

    @ObfuscatedName("ef.aa")
    public class309 field1418 = null;

    @ObfuscatedName("ef.ac")
    public int field1411 = 0;

    @ObfuscatedName("ef.al")
    public boolean field1412 = true;

    @ObfuscatedName("ef.az")
    public int field1413 = 0;

    @ObfuscatedName("ef.ap")
    public int field1414 = 0;

    @ObfuscatedName("ef.av")
    public class309 field1415;

    @ObfuscatedName("ef.ax")
    public class309 field1410;

    @ObfuscatedName("ef.as")
    public class309 field1417;

    @ObfuscatedName("ef.at(B)V")
    public final void method2717() {
        this.field1404.method6600();
        this.field1406 = 0;
    }

    @ObfuscatedName("ef.ah(S)V")
    public final void method2723() throws IOException {
        if (this.field1408 == null || this.field1406 <= 0) {
            return;
        }
        this.field1407.field5137 = 0;
        while (true) {
            class308 var1 = (class308) this.field1404.method6604();
            if (var1 == null || var1.field3242 > this.field1407.field5140.length - this.field1407.field5137) {
                this.field1408.method7532(this.field1407.field5140, 0, this.field1407.field5137);
                this.field1414 = 0;
                break;
            }
            this.field1407.method8575(var1.field3243.field5140, 0, var1.field3242);
            this.field1406 -= var1.field3242;
            var1.method7828();
            var1.field3243.method8392();
            var1.method5324();
        }
    }

    @ObfuscatedName("ef.ar(Lld;I)V")
    public final void method2719(class308 arg0) {
        this.field1404.method6601(arg0);
        arg0.field3242 = arg0.field3243.field5137;
        arg0.field3243.field5137 = 0;
        this.field1406 += arg0.field3242;
    }

    @ObfuscatedName("ef.ao(Lro;I)V")
    public void method2720(class451 arg0) {
        this.field1408 = arg0;
    }

    @ObfuscatedName("ef.ab(B)V")
    public void method2718() {
        if (this.field1408 != null) {
            this.field1408.method7538();
            this.field1408 = null;
        }
    }

    @ObfuscatedName("ef.au(B)V")
    public void method2722() {
        this.field1408 = null;
    }

    @ObfuscatedName("ef.aa(I)Lro;")
    public class451 method2737() {
        return this.field1408;
    }
}
