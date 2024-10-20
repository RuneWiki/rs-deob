package deob;

@ObfuscatedName("di")
public class class121 {

    @ObfuscatedName("di.s")
    public long field1419;

    @ObfuscatedName("di.t")
    public long field1413 = -1L;

    @ObfuscatedName("di.v")
    public class298 field1411 = new class298();

    public class121(class385 arg0) {
        this.method2235(arg0);
    }

    @ObfuscatedName("di.s(Lnv;B)V")
    public void method2235(class385 arg0) {
        this.field1419 = arg0.method5964();
        this.field1413 = arg0.method5964();
        for (int var2 = arg0.method5958(); var2 != 0; var2 = arg0.method5958()) {
            class120 var3;
            if (var2 == 1) {
                var3 = new class116(this);
            } else if (var2 == 4) {
                var3 = new class127(this);
            } else if (var2 == 3) {
                var3 = new class112(this);
            } else if (var2 == 2) {
                var3 = new class110(this);
            } else if (var2 == 5) {
                var3 = new class117(this);
            } else {
                throw new RuntimeException("");
            }
            var3.method2140(arg0);
            this.field1411.method4755(var3);
        }
    }

    @ObfuscatedName("di.t(Ldt;I)V")
    public void method2227(class124 arg0) {
        if (this.field1419 != arg0.field3966 || this.field1413 != arg0.field1434) {
            throw new RuntimeException("");
        }
        for (class120 var2 = (class120) this.field1411.method4758(); var2 != null; var2 = (class120) this.field1411.method4760()) {
            var2.method2135(arg0);
        }
        arg0.field1434++;
    }
}
