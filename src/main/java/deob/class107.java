package deob;

import java.io.IOException;

@ObfuscatedName("eq")
public class class107 {

    @ObfuscatedName("eq.af")
    public class414 field1394;

    @ObfuscatedName("eq.an")
    public class365 field1381 = new class365();

    @ObfuscatedName("eq.aw")
    public int field1383 = 0;

    @ObfuscatedName("eq.ac")
    public class489 field1384 = new class489(5000);

    @ObfuscatedName("eq.au")
    public class506 field1385;

    @ObfuscatedName("eq.ab")
    public class488 field1386 = new class488(40000);

    @ObfuscatedName("eq.aq")
    public class290 field1382 = null;

    @ObfuscatedName("eq.al")
    public int field1388 = 0;

    @ObfuscatedName("eq.at")
    public boolean field1389 = true;

    @ObfuscatedName("eq.aa")
    public int field1390 = 0;

    @ObfuscatedName("eq.ay")
    public int field1391 = 0;

    @ObfuscatedName("eq.ao")
    public class290 field1392;

    @ObfuscatedName("eq.ax")
    public class290 field1393;

    @ObfuscatedName("eq.ai")
    public class290 field1387;

    @ObfuscatedName("eq.af(I)V")
    public final void method2657() {
        this.field1381.method6366();
        this.field1383 = 0;
    }

    @ObfuscatedName("eq.an(I)V")
    public final void method2666() throws IOException {
        if (this.field1394 == null || this.field1383 <= 0) {
            return;
        }
        this.field1384.field4989 = 0;
        while (true) {
            class289 var1 = (class289) this.field1381.method6413();
            if (var1 == null || var1.field3213 > this.field1384.field4991.length - this.field1384.field4989) {
                this.field1394.method7286(this.field1384.field4991, 0, this.field1384.field4989);
                this.field1391 = 0;
                break;
            }
            this.field1384.method8476(var1.field3212.field4991, 0, var1.field3213);
            this.field1383 -= var1.field3213;
            var1.method7651();
            var1.field3212.method8312();
            var1.method5145();
        }
    }

    @ObfuscatedName("eq.aw(Llg;I)V")
    public final void method2650(class289 arg0) {
        this.field1381.method6408(arg0);
        arg0.field3213 = arg0.field3212.field4989;
        arg0.field3212.field4989 = 0;
        this.field1383 += arg0.field3213;
    }

    @ObfuscatedName("eq.ac(Lph;B)V")
    public void method2651(class414 arg0) {
        this.field1394 = arg0;
    }

    @ObfuscatedName("eq.au(I)V")
    public void method2652() {
        if (this.field1394 != null) {
            this.field1394.method7287();
            this.field1394 = null;
        }
    }

    @ObfuscatedName("eq.ab(I)V")
    public void method2653() {
        this.field1394 = null;
    }

    @ObfuscatedName("eq.aq(B)Lph;")
    public class414 method2655() {
        return this.field1394;
    }
}
