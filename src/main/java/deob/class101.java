package deob;

@ObfuscatedName("cn")
public final class class101 {

    @ObfuscatedName("cn.t")
    public class142 field1486 = new class142();

    public class101() {
        this.field1486.field1896 = this.field1486;
        this.field1486.field1897 = this.field1486;
    }

    @ObfuscatedName("cn.t(Lev;)V")
    public void method1235(class142 arg0) {
        if (arg0.field1897 != null) {
            arg0.method1805();
        }
        arg0.field1897 = this.field1486.field1897;
        arg0.field1896 = this.field1486;
        arg0.field1897.field1896 = arg0;
        arg0.field1896.field1897 = arg0;
    }

    @ObfuscatedName("cn.n(Lev;)V")
    public void method1236(class142 arg0) {
        if (arg0.field1897 != null) {
            arg0.method1805();
        }
        arg0.field1897 = this.field1486;
        arg0.field1896 = this.field1486.field1896;
        arg0.field1897.field1896 = arg0;
        arg0.field1896.field1897 = arg0;
    }

    @ObfuscatedName("cn.q()Lev;")
    public class142 method1238() {
        class142 var1 = this.field1486.field1896;
        if (this.field1486 == var1) {
            return null;
        } else {
            var1.method1805();
            return var1;
        }
    }

    @ObfuscatedName("cn.h()Lev;")
    public class142 method1239() {
        class142 var1 = this.field1486.field1896;
        return this.field1486 == var1 ? null : var1;
    }

    @ObfuscatedName("cn.k()V")
    public void method1246() {
        while (true) {
            class142 var1 = this.field1486.field1896;
            if (this.field1486 == var1) {
                return;
            }
            var1.method1805();
        }
    }
}
