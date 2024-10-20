package deob;

@ObfuscatedName("de")
public class class106 extends class356 {

    @ObfuscatedName("de.c")
    public final boolean field1363;

    public class106(boolean arg0) {
        this.field1363 = arg0;
    }

    @ObfuscatedName("de.c(Lmd;Lmd;I)I")
    public int method2356(class359 arg0, class359 arg1) {
        if (arg0.field4172 == arg1.field4172) {
            return this.method5777(arg0, arg1);
        } else if (this.field1363) {
            return arg0.field4172 - arg1.field4172;
        } else {
            return arg1.field4172 - arg0.field4172;
        }
    }

    public int compare(Object arg0, Object arg1) {
        return this.method2356((class359) arg0, (class359) arg1);
    }
}
