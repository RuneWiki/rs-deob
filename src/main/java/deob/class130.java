package deob;

@ObfuscatedName("da")
public class class130 {

    @ObfuscatedName("da.c")
    public long field1514;

    @ObfuscatedName("da.b")
    public int field1512 = -1;

    @ObfuscatedName("da.p")
    public class323 field1513 = new class323();

    public class130(class419 arg0) {
        this.method2608(arg0);
    }

    @ObfuscatedName("da.c(Lpi;B)V")
    public void method2608(class419 arg0) {
        this.field1514 = arg0.method6676();
        this.field1512 = arg0.method6675();
        for (int var2 = arg0.method6781(); var2 != 0; var2 = arg0.method6781()) {
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
            var3.method2590(arg0);
            this.field1513.method5345(var3);
        }
    }

    @ObfuscatedName("da.b(Lej;I)V")
    public void method2609(class138 arg0) {
        if (this.field1514 != arg0.field1563 || this.field1512 != arg0.field1564) {
            throw new RuntimeException("");
        }
        for (class127 var2 = (class127) this.field1513.method5348(); var2 != null; var2 = (class127) this.field1513.method5350()) {
            var2.method2591(arg0);
        }
        arg0.field1564++;
    }
}
