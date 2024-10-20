package deob;

@ObfuscatedName("dg")
public class class120 {

    @ObfuscatedName("dg.l")
    public long field1397;

    @ObfuscatedName("dg.q")
    public int field1400 = -1;

    @ObfuscatedName("dg.f")
    public class311 field1398 = new class311();

    public class120(class401 arg0) {
        this.method2386(arg0);
    }

    @ObfuscatedName("dg.l(Lot;I)V")
    public void method2386(class401 arg0) {
        this.field1397 = arg0.method6275();
        this.field1400 = arg0.method6277();
        for (int var2 = arg0.method6272(); var2 != 0; var2 = arg0.method6272()) {
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
            var3.method2365(arg0);
            this.field1398.method5089(var3);
        }
    }

    @ObfuscatedName("dg.q(Ldk;I)V")
    public void method2387(class128 arg0) {
        if (this.field1397 != arg0.field1447 || this.field1400 != arg0.field1448) {
            throw new RuntimeException("");
        }
        for (class117 var2 = (class117) this.field1398.method5074(); var2 != null; var2 = (class117) this.field1398.method5094()) {
            var2.method2366(arg0);
        }
        arg0.field1448++;
    }
}
