package deob;

@ObfuscatedName("dc")
public class class120 {

    @ObfuscatedName("dc.n")
    public long field1404;

    @ObfuscatedName("dc.c")
    public int field1400 = -1;

    @ObfuscatedName("dc.m")
    public class311 field1401 = new class311();

    public class120(class400 arg0) {
        this.method2359(arg0);
    }

    @ObfuscatedName("dc.n(Lot;I)V")
    public void method2359(class400 arg0) {
        this.field1404 = arg0.method6223();
        this.field1400 = arg0.method6222();
        for (int var2 = arg0.method6217(); var2 != 0; var2 = arg0.method6217()) {
            class117 var3;
            if (var2 == 3) {
                var3 = new class139(this);
            } else if (var2 == 1) {
                var3 = new class115(this);
            } else if (var2 == 13) {
                var3 = new class132(this);
            } else if (var2 == 4) {
                var3 = new class124(this);
            } else if (var2 == 6) {
                var3 = new class131(this);
            } else if (var2 == 5) {
                var3 = new class116(this);
            } else if (var2 == 2) {
                var3 = new class121(this);
            } else if (var2 == 7) {
                var3 = new class114(this);
            } else if (var2 == 14) {
                var3 = new class118(this);
            } else if (var2 == 8) {
                var3 = new class135(this);
            } else if (var2 == 9) {
                var3 = new class141(this);
            } else if (var2 == 10) {
                var3 = new class127(this);
            } else if (var2 == 11) {
                var3 = new class122(this);
            } else if (var2 == 12) {
                var3 = new class126(this);
            } else if (var2 == 15) {
                var3 = new class136(this);
            } else {
                throw new RuntimeException("");
            }
            var3.method2345(arg0);
            this.field1401.method5004(var3);
        }
    }

    @ObfuscatedName("dc.c(Ldi;I)V")
    public void method2364(class128 arg0) {
        if (this.field1404 != arg0.field1451 || this.field1400 != arg0.field1452) {
            throw new RuntimeException("");
        }
        for (class117 var2 = (class117) this.field1401.method5007(); var2 != null; var2 = (class117) this.field1401.method5009()) {
            var2.method2348(arg0);
        }
        arg0.field1452++;
    }
}
