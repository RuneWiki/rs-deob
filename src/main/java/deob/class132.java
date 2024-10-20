package deob;

@ObfuscatedName("ei")
public class class132 {

    @ObfuscatedName("ei.s")
    public long field1551;

    @ObfuscatedName("ei.h")
    public int field1559 = -1;

    @ObfuscatedName("ei.w")
    public class337 field1552 = new class337();

    public class132(class444 arg0) {
        this.method2639(arg0);
    }

    @ObfuscatedName("ei.s(Lqr;B)V")
    public void method2639(class444 arg0) {
        this.field1551 = arg0.method6935();
        this.field1559 = arg0.method6934();
        for (int var2 = arg0.method6929(); var2 != 0; var2 = arg0.method6929()) {
            class129 var3;
            if (var2 == 3) {
                var3 = new class151(this);
            } else if (var2 == 1) {
                var3 = new class127(this);
            } else if (var2 == 13) {
                var3 = new class144(this);
            } else if (var2 == 4) {
                var3 = new class136(this);
            } else if (var2 == 6) {
                var3 = new class143(this);
            } else if (var2 == 5) {
                var3 = new class128(this);
            } else if (var2 == 2) {
                var3 = new class133(this);
            } else if (var2 == 7) {
                var3 = new class126(this);
            } else if (var2 == 14) {
                var3 = new class130(this);
            } else if (var2 == 8) {
                var3 = new class147(this);
            } else if (var2 == 9) {
                var3 = new class153(this);
            } else if (var2 == 10) {
                var3 = new class139(this);
            } else if (var2 == 11) {
                var3 = new class134(this);
            } else if (var2 == 12) {
                var3 = new class138(this);
            } else if (var2 == 15) {
                var3 = new class148(this);
            } else {
                throw new RuntimeException("");
            }
            var3.method2621(arg0);
            this.field1552.method5531(var3);
        }
    }

    @ObfuscatedName("ei.h(Leh;B)V")
    public void method2640(class140 arg0) {
        if (this.field1551 != arg0.field1603 || this.field1559 != arg0.field1604) {
            throw new RuntimeException("");
        }
        for (class129 var2 = (class129) this.field1552.method5482(); var2 != null; var2 = (class129) this.field1552.method5484()) {
            var2.method2622(arg0);
        }
        arg0.field1604++;
    }
}
