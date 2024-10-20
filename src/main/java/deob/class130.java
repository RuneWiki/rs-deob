package deob;

@ObfuscatedName("dk")
public class class130 {

    @ObfuscatedName("dk.c")
    public long field1539;

    @ObfuscatedName("dk.l")
    public int field1531 = -1;

    @ObfuscatedName("dk.s")
    public class328 field1532 = new class328();

    public class130(class421 arg0) {
        this.method2610(arg0);
    }

    @ObfuscatedName("dk.c(Lpi;I)V")
    public void method2610(class421 arg0) {
        this.field1539 = arg0.method6670();
        this.field1531 = arg0.method6669();
        for (int var2 = arg0.method6686(); var2 != 0; var2 = arg0.method6686()) {
            class127 var3;
            if (var2 == 3) {
                var3 = new class149(this);
            } else if (var2 == 1) {
                var3 = new class125(this);
            } else if (var2 == 13) {
                var3 = new class142(this);
            } else if (var2 == 4) {
                var3 = new class134(this);
            } else if (var2 == 6) {
                var3 = new class141(this);
            } else if (var2 == 5) {
                var3 = new class126(this);
            } else if (var2 == 2) {
                var3 = new class131(this);
            } else if (var2 == 7) {
                var3 = new class124(this);
            } else if (var2 == 14) {
                var3 = new class128(this);
            } else if (var2 == 8) {
                var3 = new class145(this);
            } else if (var2 == 9) {
                var3 = new class151(this);
            } else if (var2 == 10) {
                var3 = new class137(this);
            } else if (var2 == 11) {
                var3 = new class132(this);
            } else if (var2 == 12) {
                var3 = new class136(this);
            } else if (var2 == 15) {
                var3 = new class146(this);
            } else {
                throw new RuntimeException("");
            }
            var3.method2583(arg0);
            this.field1532.method5347(var3);
        }
    }

    @ObfuscatedName("dk.l(Ley;I)V")
    public void method2608(class138 arg0) {
        if (this.field1539 != arg0.field1589 || this.field1531 != arg0.field1590) {
            throw new RuntimeException("");
        }
        for (class127 var2 = (class127) this.field1532.method5311(); var2 != null; var2 = (class127) this.field1532.method5313()) {
            var2.method2576(arg0);
        }
        arg0.field1590++;
    }
}
