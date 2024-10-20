package deob;

import java.io.IOException;

@ObfuscatedName("ev")
public class class115 {

    @ObfuscatedName("ev.aq")
    public class479 field1452;

    @ObfuscatedName("ev.ad")
    public class409 field1453 = new class409();

    @ObfuscatedName("ev.ag")
    public int field1454 = 0;

    @ObfuscatedName("ev.ak")
    public class547 field1455 = new class547(5000);

    @ObfuscatedName("ev.ap")
    public class564 field1456;

    @ObfuscatedName("ev.an")
    public class546 field1461 = new class546(40000);

    @ObfuscatedName("ev.aj")
    public class323 field1464 = null;

    @ObfuscatedName("ev.av")
    public int field1459 = 0;

    @ObfuscatedName("ev.ab")
    public boolean field1462 = true;

    @ObfuscatedName("ev.ai")
    public int field1458 = 0;

    @ObfuscatedName("ev.ae")
    public int field1457 = 0;

    @ObfuscatedName("ev.au")
    public class323 field1463;

    @ObfuscatedName("ev.ah")
    public class323 field1460;

    @ObfuscatedName("ev.az")
    public class323 field1465;

    @ObfuscatedName("ev.aq(B)V")
    public final void method2781() {
        this.field1453.method6838();
        this.field1454 = 0;
    }

    @ObfuscatedName("ev.ad(I)V")
    public final void method2772() throws IOException {
        if (this.field1452 == null || this.field1454 <= 0) {
            return;
        }
        this.field1455.field5363 = 0;
        while (true) {
            class322 var1 = (class322) this.field1453.method6842();
            if (var1 == null || var1.field3395 > this.field1455.field5364.length - this.field1455.field5363) {
                this.field1452.method7965(this.field1455.field5364, 0, this.field1455.field5363);
                this.field1457 = 0;
                break;
            }
            this.field1455.method8721(var1.field3394.field5364, 0, var1.field3395);
            this.field1454 -= var1.field3395;
            var1.method8130();
            var1.field3394.method8710();
            var1.method5520();
        }
    }

    @ObfuscatedName("ev.ag(Lmb;B)V")
    public final void method2773(class322 arg0) {
        this.field1453.method6890(arg0);
        arg0.field3395 = arg0.field3394.field5363;
        arg0.field3394.field5363 = 0;
        this.field1454 += arg0.field3395;
    }

    @ObfuscatedName("ev.ak(Lsp;S)V")
    public void method2789(class479 arg0) {
        this.field1452 = arg0;
    }

    @ObfuscatedName("ev.ap(I)V")
    public void method2775() {
        if (this.field1452 != null) {
            this.field1452.method7966();
            this.field1452 = null;
        }
    }

    @ObfuscatedName("ev.an(I)V")
    public void method2776() {
        this.field1452 = null;
    }

    @ObfuscatedName("ev.aj(I)Lsp;")
    public class479 method2777() {
        return this.field1452;
    }
}
