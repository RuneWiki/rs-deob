package deob;

@ObfuscatedName("ej")
public class class132 {

    @ObfuscatedName("ej.c")
    public long field1583;

    @ObfuscatedName("ej.v")
    public int field1585 = -1;

    @ObfuscatedName("ej.q")
    public class336 field1586 = new class336();

    public class132(class443 arg0) {
        this.method2700(arg0);
    }

    @ObfuscatedName("ej.c(Lqt;I)V")
    public void method2700(class443 arg0) {
        this.field1583 = arg0.method7106();
        this.field1585 = arg0.method7052();
        for (int var2 = arg0.method7047(); var2 != 0; var2 = arg0.method7047()) {
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
            var3.method2682(arg0);
            this.field1586.method5589(var3);
        }
    }

    @ObfuscatedName("ej.v(Len;I)V")
    public void method2701(class140 arg0) {
        if (this.field1583 != arg0.field1628 || this.field1585 != arg0.field1629) {
            throw new RuntimeException("");
        }
        for (class129 var2 = (class129) this.field1586.method5577(); var2 != null; var2 = (class129) this.field1586.method5579()) {
            var2.method2685(arg0);
        }
        arg0.field1629++;
    }
}
