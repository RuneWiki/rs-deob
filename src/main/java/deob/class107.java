package deob;

@ObfuscatedName("df")
public class class107 extends class356 {

    @ObfuscatedName("df.c")
    public final boolean field1365;

    public class107(boolean arg0) {
        this.field1365 = arg0;
    }

    @ObfuscatedName("df.c(Lmd;Lmd;I)I")
    public int method2367(class359 arg0, class359 arg1) {
        if (client.field496 == arg0.field4172 && client.field496 == arg1.field4172) {
            return this.field1365 ? arg0.method5770().method7234(arg1.method5770()) : arg1.method5770().method7234(arg0.method5770());
        } else {
            return this.method5777(arg0, arg1);
        }
    }

    public int compare(Object arg0, Object arg1) {
        return this.method2367((class359) arg0, (class359) arg1);
    }
}
