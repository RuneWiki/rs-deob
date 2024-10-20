package deob;

@ObfuscatedName("ca")
public final class class101 {

    @ObfuscatedName("ca.q")
    public class143 field1499 = new class143();

    @ObfuscatedName("ca.l")
    public int field1496;

    @ObfuscatedName("ca.a")
    public int field1495;

    @ObfuscatedName("ca.o")
    public class104 field1497;

    @ObfuscatedName("ca.c")
    public class102 field1498 = new class102();

    public class101(int arg0) {
        this.field1496 = arg0;
        this.field1495 = arg0;
        int var2;
        for (var2 = 1; var2 + var2 < arg0; var2 += var2) {
        }
        this.field1497 = new class104(var2);
    }

    @ObfuscatedName("ca.q(J)Lee;")
    public class143 method1236(long arg0) {
        class143 var3 = (class143) this.field1497.method1290(arg0);
        if (var3 != null) {
            this.field1498.method1247(var3);
        }
        return var3;
    }

    @ObfuscatedName("ca.l(J)V")
    public void method1237(long arg0) {
        class143 var3 = (class143) this.field1497.method1290(arg0);
        if (var3 != null) {
            var3.method1328();
            var3.method1831();
            this.field1495++;
        }
    }

    @ObfuscatedName("ca.a(Lee;J)V")
    public void method1238(class143 arg0, long arg1) {
        if (this.field1495 == 0) {
            class143 var4 = this.field1498.method1250();
            var4.method1328();
            var4.method1831();
            if (this.field1499 == var4) {
                class143 var5 = this.field1498.method1250();
                var5.method1328();
                var5.method1831();
            }
        } else {
            this.field1495--;
        }
        this.field1497.method1279(arg0, arg1);
        this.field1498.method1247(arg0);
    }

    @ObfuscatedName("ca.o()V")
    public void method1239() {
        this.field1498.method1252();
        this.field1497.method1277();
        this.field1499 = new class143();
        this.field1495 = this.field1496;
    }
}
