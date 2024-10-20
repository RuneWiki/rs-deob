package deob;

@ObfuscatedName("ci")
public final class class101 {

    @ObfuscatedName("ci.r")
    public class142 field1492 = new class142();

    public class101() {
        this.field1492.field1902 = this.field1492;
        this.field1492.field1901 = this.field1492;
    }

    @ObfuscatedName("ci.r(Len;)V")
    public void method1256(class142 arg0) {
        if (arg0.field1901 != null) {
            arg0.method1841();
        }
        arg0.field1901 = this.field1492.field1901;
        arg0.field1902 = this.field1492;
        arg0.field1901.field1902 = arg0;
        arg0.field1902.field1901 = arg0;
    }

    @ObfuscatedName("ci.d(Len;)V")
    public void method1257(class142 arg0) {
        if (arg0.field1901 != null) {
            arg0.method1841();
        }
        arg0.field1901 = this.field1492;
        arg0.field1902 = this.field1492.field1902;
        arg0.field1901.field1902 = arg0;
        arg0.field1902.field1901 = arg0;
    }

    @ObfuscatedName("ci.l()Len;")
    public class142 method1258() {
        class142 var1 = this.field1492.field1902;
        if (this.field1492 == var1) {
            return null;
        } else {
            var1.method1841();
            return var1;
        }
    }

    @ObfuscatedName("ci.m()Len;")
    public class142 method1259() {
        class142 var1 = this.field1492.field1902;
        return this.field1492 == var1 ? null : var1;
    }

    @ObfuscatedName("ci.c()V")
    public void method1260() {
        while (true) {
            class142 var1 = this.field1492.field1902;
            if (this.field1492 == var1) {
                return;
            }
            var1.method1841();
        }
    }
}
