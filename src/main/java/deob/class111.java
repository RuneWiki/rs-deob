package deob;

@ObfuscatedName("dq")
public class class111 extends class374 {

    @ObfuscatedName("dq.c")
    public final boolean field1392;

    public class111(boolean arg0) {
        this.field1392 = arg0;
    }

    @ObfuscatedName("dq.c(Lnr;Lnr;I)I")
    public int method2655(class377 arg0, class377 arg1) {
        if (client.field493 == arg0.field4366 && client.field493 == arg1.field4366) {
            return this.field1392 ? arg0.field4367 - arg1.field4367 : arg1.field4367 - arg0.field4367;
        } else {
            return this.method6238(arg0, arg1);
        }
    }

    public int compare(Object arg0, Object arg1) {
        return this.method2655((class377) arg0, (class377) arg1);
    }
}
