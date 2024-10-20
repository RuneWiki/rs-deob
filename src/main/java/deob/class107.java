package deob;

@ObfuscatedName("dn")
public class class107 {

    @ObfuscatedName("dn.s")
    public long field1309;

    @ObfuscatedName("dn.t")
    public int field1310 = -1;

    @ObfuscatedName("dn.v")
    public class298 field1311 = new class298();

    public class107(class385 arg0) {
        this.method2121(arg0);
    }

    @ObfuscatedName("dn.s(Lnv;B)V")
    public void method2121(class385 arg0) {
        this.field1309 = arg0.method5964();
        this.field1310 = arg0.method6182();
        for (int var2 = arg0.method5958(); var2 != 0; var2 = arg0.method5958()) {
            class104 var3;
            if (var2 == 3) {
                var3 = new class126(this);
            } else if (var2 == 1) {
                var3 = new class102(this);
            } else if (var2 == 13) {
                var3 = new class119(this);
            } else if (var2 == 4) {
                var3 = new class111(this);
            } else if (var2 == 6) {
                var3 = new class118(this);
            } else if (var2 == 5) {
                var3 = new class103(this);
            } else if (var2 == 2) {
                var3 = new class108(this);
            } else if (var2 == 7) {
                var3 = new class101(this);
            } else if (var2 == 14) {
                var3 = new class105(this);
            } else if (var2 == 8) {
                var3 = new class122(this);
            } else if (var2 == 9) {
                var3 = new class128(this);
            } else if (var2 == 10) {
                var3 = new class114(this);
            } else if (var2 == 11) {
                var3 = new class109(this);
            } else if (var2 == 12) {
                var3 = new class113(this);
            } else if (var2 == 15) {
                var3 = new class123(this);
            } else {
                throw new RuntimeException("");
            }
            var3.method2102(arg0);
            this.field1311.method4755(var3);
        }
    }

    @ObfuscatedName("dn.t(Ldj;I)V")
    public void method2120(class115 arg0) {
        if (this.field1309 != arg0.field1371 || this.field1310 != arg0.field1364) {
            throw new RuntimeException("");
        }
        for (class104 var2 = (class104) this.field1311.method4758(); var2 != null; var2 = (class104) this.field1311.method4760()) {
            var2.method2100(arg0);
        }
        arg0.field1364++;
    }
}
