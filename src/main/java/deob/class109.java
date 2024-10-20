package deob;

@ObfuscatedName("dp")
public class class109 extends class374 {

    @ObfuscatedName("dp.c")
    public final boolean field1383;

    public class109(boolean arg0) {
        this.field1383 = arg0;
    }

    @ObfuscatedName("dp.c(Lnr;Lnr;B)I")
    public int method2641(class377 arg0, class377 arg1) {
        if (arg0.field4366 == arg1.field4366) {
            return this.method6238(arg0, arg1);
        } else if (this.field1383) {
            return arg0.field4366 - arg1.field4366;
        } else {
            return arg1.field4366 - arg0.field4366;
        }
    }

    public int compare(Object arg0, Object arg1) {
        return this.method2641((class377) arg0, (class377) arg1);
    }
}
