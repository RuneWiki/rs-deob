package deob;

@ObfuscatedName("es")
public class class132 {

    @ObfuscatedName("es.v")
    public long field1540;

    @ObfuscatedName("es.c")
    public int field1536 = -1;

    @ObfuscatedName("es.i")
    public class337 field1537 = new class337();

    public class132(class438 arg0) {
        this.method2699(arg0);
    }

    @ObfuscatedName("es.v(Lpi;I)V")
    public void method2699(class438 arg0) {
        this.field1540 = arg0.method7003();
        this.field1536 = arg0.method6976();
        for (int var2 = arg0.method6971(); var2 != 0; var2 = arg0.method6971()) {
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
            var3.method2678(arg0);
            this.field1537.method5604(var3);
        }
    }

    @ObfuscatedName("es.c(Lex;I)V")
    public void method2700(class140 arg0) {
        if (this.field1540 != arg0.field1587 || this.field1536 != arg0.field1584) {
            throw new RuntimeException("");
        }
        for (class129 var2 = (class129) this.field1537.method5574(); var2 != null; var2 = (class129) this.field1537.method5619()) {
            var2.method2679(arg0);
        }
        arg0.field1584++;
    }
}
