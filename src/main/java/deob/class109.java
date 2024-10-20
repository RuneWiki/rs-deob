package deob;

@ObfuscatedName("dv")
public class class109 extends class372 {

    @ObfuscatedName("dv.c")
    public final boolean field1404;

    public class109(boolean arg0) {
        this.field1404 = arg0;
    }

    @ObfuscatedName("dv.c(Lnm;Lnm;I)I")
    public int method2472(class375 arg0, class375 arg1) {
        if (client.field697 == arg0.field4325 && client.field697 == arg1.field4325) {
            return this.field1404 ? arg0.method6075().method7621(arg1.method6075()) : arg1.method6075().method7621(arg0.method6075());
        } else {
            return this.method6090(arg0, arg1);
        }
    }

    public int compare(Object arg0, Object arg1) {
        return this.method2472((class375) arg0, (class375) arg1);
    }
}
