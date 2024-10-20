package deob;

@ObfuscatedName("da")
public class class108 extends class374 {

    @ObfuscatedName("da.c")
    public final boolean field1382;

    public class108(boolean arg0) {
        this.field1382 = arg0;
    }

    @ObfuscatedName("da.c(Lnr;Lnr;I)I")
    public int method2628(class377 arg0, class377 arg1) {
        if (arg0.field4366 == 0) {
            if (arg1.field4366 != 0) {
                return this.field1382 ? 1 : -1;
            }
        } else if (arg1.field4366 == 0) {
            return this.field1382 ? -1 : 1;
        }
        return this.method6238(arg0, arg1);
    }

    public int compare(Object arg0, Object arg1) {
        return this.method2628((class377) arg0, (class377) arg1);
    }
}
