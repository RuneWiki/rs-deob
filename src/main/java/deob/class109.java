package deob;

import java.io.IOException;

@ObfuscatedName("ep")
public class class109 {

    @ObfuscatedName("ep.aj")
    public class410 field1378;

    @ObfuscatedName("ep.al")
    public class361 field1379 = new class361();

    @ObfuscatedName("ep.ac")
    public int field1388 = 0;

    @ObfuscatedName("ep.ab")
    public class478 field1381 = new class478(5000);

    @ObfuscatedName("ep.an")
    public class495 field1380;

    @ObfuscatedName("ep.ao")
    public class477 field1383 = new class477(40000);

    @ObfuscatedName("ep.av")
    public class286 field1382 = null;

    @ObfuscatedName("ep.aq")
    public int field1385 = 0;

    @ObfuscatedName("ep.ap")
    public boolean field1386 = true;

    @ObfuscatedName("ep.ar")
    public int field1384 = 0;

    @ObfuscatedName("ep.ak")
    public int field1387 = 0;

    @ObfuscatedName("ep.ax")
    public class286 field1389;

    @ObfuscatedName("ep.as")
    public class286 field1390;

    @ObfuscatedName("ep.ay")
    public class286 field1391;

    @ObfuscatedName("ep.aj(I)V")
    public final void method2633() {
        this.field1379.method6137();
        this.field1388 = 0;
    }

    @ObfuscatedName("ep.al(B)V")
    public final void method2634() throws IOException {
        if (this.field1378 == null || this.field1388 <= 0) {
            return;
        }
        this.field1381.field4904 = 0;
        while (true) {
            class285 var1 = (class285) this.field1379.method6141();
            if (var1 == null || var1.field3168 > this.field1381.field4906.length - this.field1381.field4904) {
                this.field1378.method7039(this.field1381.field4906, 0, this.field1381.field4904);
                this.field1387 = 0;
                break;
            }
            this.field1381.method7896(var1.field3169.field4906, 0, var1.field3168);
            this.field1388 -= var1.field3168;
            var1.method7335();
            var1.field3169.method7998();
            var1.method4946();
        }
    }

    @ObfuscatedName("ep.ac(Lkp;I)V")
    public final void method2635(class285 arg0) {
        this.field1379.method6158(arg0);
        arg0.field3168 = arg0.field3169.field4904;
        arg0.field3169.field4904 = 0;
        this.field1388 += arg0.field3168;
    }

    @ObfuscatedName("ep.ab(Lpj;I)V")
    public void method2638(class410 arg0) {
        this.field1378 = arg0;
    }

    @ObfuscatedName("ep.an(B)V")
    public void method2637() {
        if (this.field1378 != null) {
            this.field1378.method7040();
            this.field1378 = null;
        }
    }

    @ObfuscatedName("ep.ao(I)V")
    public void method2650() {
        this.field1378 = null;
    }

    @ObfuscatedName("ep.av(B)Lpj;")
    public class410 method2639() {
        return this.field1378;
    }
}
