package deob;

@ObfuscatedName("du")
public class class107 extends class374 {

    @ObfuscatedName("du.c")
    public final boolean field1381;

    public class107(boolean arg0) {
        this.field1381 = arg0;
    }

    @ObfuscatedName("du.c(Lnr;Lnr;B)I")
    public int method2620(class377 arg0, class377 arg1) {
        if (arg0.field4366 == 0 || arg1.field4366 == 0) {
            return this.method6238(arg0, arg1);
        } else if (this.field1381) {
            return arg0.field4367 - arg1.field4367;
        } else {
            return arg1.field4367 - arg0.field4367;
        }
    }

    public int compare(Object arg0, Object arg1) {
        return this.method2620((class377) arg0, (class377) arg1);
    }
}
