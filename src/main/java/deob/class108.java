package deob;

@ObfuscatedName("db")
public class class108 extends class356 {

    @ObfuscatedName("db.c")
    public final boolean field1372;

    public class108(boolean arg0) {
        this.field1372 = arg0;
    }

    @ObfuscatedName("db.c(Lmd;Lmd;B)I")
    public int method2373(class359 arg0, class359 arg1) {
        if (client.field496 == arg0.field4172 && client.field496 == arg1.field4172) {
            return this.field1372 ? arg0.field4173 - arg1.field4173 : arg1.field4173 - arg0.field4173;
        } else {
            return this.method5777(arg0, arg1);
        }
    }

    public int compare(Object arg0, Object arg1) {
        return this.method2373((class359) arg0, (class359) arg1);
    }
}
