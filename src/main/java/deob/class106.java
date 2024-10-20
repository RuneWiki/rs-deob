package deob;

@ObfuscatedName("dd")
public class class106 extends class372 {

    @ObfuscatedName("dd.c")
    public final boolean field1385;

    public class106(boolean arg0) {
        this.field1385 = arg0;
    }

    @ObfuscatedName("dd.c(Lnm;Lnm;I)I")
    public int method2451(class375 arg0, class375 arg1) {
        if (arg0.field4325 == 0 || arg1.field4325 == 0) {
            return this.method6090(arg0, arg1);
        } else if (this.field1385) {
            return arg0.field4326 - arg1.field4326;
        } else {
            return arg1.field4326 - arg0.field4326;
        }
    }

    public int compare(Object arg0, Object arg1) {
        return this.method2451((class375) arg0, (class375) arg1);
    }
}
