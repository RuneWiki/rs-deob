package deob;

@ObfuscatedName("dr")
public class class110 extends class374 {

    @ObfuscatedName("dr.c")
    public final boolean field1387;

    public class110(boolean arg0) {
        this.field1387 = arg0;
    }

    @ObfuscatedName("dr.c(Lnr;Lnr;I)I")
    public int method2647(class377 arg0, class377 arg1) {
        if (client.field493 == arg0.field4366 && client.field493 == arg1.field4366) {
            return this.field1387 ? arg0.method6224().method7777(arg1.method6224()) : arg1.method6224().method7777(arg0.method6224());
        } else {
            return this.method6238(arg0, arg1);
        }
    }

    public int compare(Object arg0, Object arg1) {
        return this.method2647((class377) arg0, (class377) arg1);
    }
}
