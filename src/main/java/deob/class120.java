package deob;

@ObfuscatedName("dg")
public class class120 {

    @ObfuscatedName("dg.i")
    public long field1400;

    @ObfuscatedName("dg.w")
    public int field1397 = -1;

    @ObfuscatedName("dg.s")
    public class311 field1391 = new class311();

    public class120(class401 arg0) {
        this.method2407(arg0);
    }

    @ObfuscatedName("dg.i(Lop;B)V")
    public void method2407(class401 arg0) {
        this.field1400 = arg0.method6249();
        this.field1397 = arg0.method6245();
        for (int var2 = arg0.method6240(); var2 != 0; var2 = arg0.method6240()) {
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
            var3.method2385(arg0);
            this.field1391.method5023(var3);
        }
    }

    @ObfuscatedName("dg.w(Ldm;S)V")
    public void method2406(class128 arg0) {
        if (this.field1400 != arg0.field1457 || this.field1397 != arg0.field1466) {
            throw new RuntimeException("");
        }
        for (class117 var2 = (class117) this.field1391.method5026(); var2 != null; var2 = (class117) this.field1391.method5028()) {
            var2.method2386(arg0);
        }
        arg0.field1466++;
    }
}
