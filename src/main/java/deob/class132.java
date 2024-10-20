package deob;

@ObfuscatedName("eh")
public class class132 {

    @ObfuscatedName("eh.o")
    public long field1589;

    @ObfuscatedName("eh.q")
    public int field1588 = -1;

    @ObfuscatedName("eh.l")
    public class337 field1590 = new class337();

    public class132(class440 arg0) {
        this.method2657(arg0);
    }

    @ObfuscatedName("eh.o(Lpx;I)V")
    public void method2657(class440 arg0) {
        this.field1589 = arg0.method7014();
        this.field1588 = arg0.method6898();
        for (int var2 = arg0.method7071(); var2 != 0; var2 = arg0.method7071()) {
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
            var3.method2639(arg0);
            this.field1590.method5493(var3);
        }
    }

    @ObfuscatedName("eh.q(Lek;I)V")
    public void method2652(class140 arg0) {
        if (this.field1589 != arg0.field1636 || this.field1588 != arg0.field1637) {
            throw new RuntimeException("");
        }
        for (class129 var2 = (class129) this.field1590.method5479(); var2 != null; var2 = (class129) this.field1590.method5475()) {
            var2.method2636(arg0);
        }
        arg0.field1637++;
    }
}
