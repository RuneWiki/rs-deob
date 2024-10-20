package deob;

import java.io.IOException;

@ObfuscatedName("ed")
public class class112 {

    @ObfuscatedName("ed.am")
    public class455 field1411;

    @ObfuscatedName("ed.ap")
    public class396 field1401 = new class396();

    @ObfuscatedName("ed.af")
    public int field1402 = 0;

    @ObfuscatedName("ed.aj")
    public class531 field1406 = new class531(5000);

    @ObfuscatedName("ed.aq")
    public class548 field1404;

    @ObfuscatedName("ed.ar")
    public class530 field1405 = new class530(40000);

    @ObfuscatedName("ed.ag")
    public class312 field1414 = null;

    @ObfuscatedName("ed.ao")
    public int field1407 = 0;

    @ObfuscatedName("ed.ae")
    public boolean field1409 = true;

    @ObfuscatedName("ed.aa")
    public int field1400 = 0;

    @ObfuscatedName("ed.au")
    public int field1410 = 0;

    @ObfuscatedName("ed.an")
    public class312 field1403;

    @ObfuscatedName("ed.ad")
    public class312 field1412;

    @ObfuscatedName("ed.ax")
    public class312 field1408;

    @ObfuscatedName("ed.am(I)V")
    public final void method2752() {
        this.field1401.method6707();
        this.field1402 = 0;
    }

    @ObfuscatedName("ed.ap(I)V")
    public final void method2735() throws IOException {
        if (this.field1411 == null || this.field1402 <= 0) {
            return;
        }
        this.field1406.field5181 = 0;
        while (true) {
            class311 var1 = (class311) this.field1401.method6738();
            if (var1 == null || var1.field3280 > this.field1406.field5178.length - this.field1406.field5181) {
                this.field1411.method7661(this.field1406.field5178, 0, this.field1406.field5181);
                this.field1410 = 0;
                break;
            }
            this.field1406.method8554(var1.field3279.field5178, 0, var1.field3280);
            this.field1402 -= var1.field3280;
            var1.method7988();
            var1.field3279.method8543();
            var1.method5419();
        }
    }

    @ObfuscatedName("ed.af(Llr;I)V")
    public final void method2736(class311 arg0) {
        this.field1401.method6749(arg0);
        arg0.field3280 = arg0.field3279.field5181;
        arg0.field3279.field5181 = 0;
        this.field1402 += arg0.field3280;
    }

    @ObfuscatedName("ed.aj(Lri;B)V")
    public void method2741(class455 arg0) {
        this.field1411 = arg0;
    }

    @ObfuscatedName("ed.aq(B)V")
    public void method2738() {
        if (this.field1411 != null) {
            this.field1411.method7662();
            this.field1411 = null;
        }
    }

    @ObfuscatedName("ed.ar(B)V")
    public void method2739() {
        this.field1411 = null;
    }

    @ObfuscatedName("ed.ag(I)Lri;")
    public class455 method2751() {
        return this.field1411;
    }
}
