package deob;

@ObfuscatedName("dn")
public class class109 extends class339 {

    @ObfuscatedName("dn.i")
    public final boolean field1333;

    public class109(boolean arg0) {
        this.field1333 = arg0;
    }

    @ObfuscatedName("dn.i(Lmt;Lmt;B)I")
    public int method2364(class342 arg0, class342 arg1) {
        if (arg0.field3964 == arg1.field3964) {
            return this.method5491(arg0, arg1);
        } else if (this.field1333) {
            return arg0.field3964 - arg1.field3964;
        } else {
            return arg1.field3964 - arg0.field3964;
        }
    }

    public int compare(Object arg0, Object arg1) {
        return this.method2364((class342) arg0, (class342) arg1);
    }
}
