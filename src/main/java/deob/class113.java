package deob;

@ObfuscatedName("do")
public class class113 extends class374 {

    @ObfuscatedName("do.c")
    public final boolean field1403;

    public class113(boolean arg0) {
        this.field1403 = arg0;
    }

    @ObfuscatedName("do.c(Lnr;Lnr;I)I")
    public int method2669(class377 arg0, class377 arg1) {
        if (arg0.field4366 == 0 || arg1.field4366 == 0) {
            return this.method6238(arg0, arg1);
        } else if (this.field1403) {
            return arg0.method6224().method7777(arg1.method6224());
        } else {
            return arg1.method6224().method7777(arg0.method6224());
        }
    }

    public int compare(Object arg0, Object arg1) {
        return this.method2669((class377) arg0, (class377) arg1);
    }
}
