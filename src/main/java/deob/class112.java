package deob;

@ObfuscatedName("dl")
public class class112 extends class374 {

    @ObfuscatedName("dl.c")
    public final boolean field1398;

    public class112(boolean arg0) {
        this.field1398 = arg0;
    }

    @ObfuscatedName("dl.c(Lnr;Lnr;I)I")
    public int method2661(class377 arg0, class377 arg1) {
        if (arg0.field4368 == arg1.field4368) {
            return this.method6238(arg0, arg1);
        } else if (this.field1398) {
            return arg0.field4368 - arg1.field4368;
        } else {
            return arg1.field4368 - arg0.field4368;
        }
    }

    public int compare(Object arg0, Object arg1) {
        return this.method2661((class377) arg0, (class377) arg1);
    }
}
