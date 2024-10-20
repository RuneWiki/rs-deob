package deob;

@ObfuscatedName("cu")
public final class class100 {

    @ObfuscatedName("cu.t")
    public class142 field1483 = new class142();

    @ObfuscatedName("cu.n")
    public int field1482;

    @ObfuscatedName("cu.q")
    public int field1481;

    @ObfuscatedName("cu.h")
    public class103 field1484;

    @ObfuscatedName("cu.k")
    public class101 field1485 = new class101();

    public class100(int arg0) {
        this.field1482 = arg0;
        this.field1481 = arg0;
        int var2;
        for (var2 = 1; var2 + var2 < arg0; var2 += var2) {
        }
        this.field1484 = new class103(var2);
    }

    @ObfuscatedName("cu.t(J)Lev;")
    public class142 method1231(long arg0) {
        class142 var3 = (class142) this.field1484.method1259(arg0);
        if (var3 != null) {
            this.field1485.method1235(var3);
        }
        return var3;
    }

    @ObfuscatedName("cu.n(J)V")
    public void method1226(long arg0) {
        class142 var3 = (class142) this.field1484.method1259(arg0);
        if (var3 != null) {
            var3.method1307();
            var3.method1805();
            this.field1481++;
        }
    }

    @ObfuscatedName("cu.q(Lev;J)V")
    public void method1232(class142 arg0, long arg1) {
        if (this.field1481 == 0) {
            class142 var4 = this.field1485.method1238();
            var4.method1307();
            var4.method1805();
            if (this.field1483 == var4) {
                class142 var5 = this.field1485.method1238();
                var5.method1307();
                var5.method1805();
            }
        } else {
            this.field1481--;
        }
        this.field1484.method1265(arg0, arg1);
        this.field1485.method1235(arg0);
    }

    @ObfuscatedName("cu.h()V")
    public void method1221() {
        this.field1485.method1246();
        this.field1484.method1258();
        this.field1483 = new class142();
        this.field1481 = this.field1482;
    }
}
