package deob;

@ObfuscatedName("eg")
public class class123 extends class446 {

    @ObfuscatedName("eg.at")
    public final boolean field1458;

    public class123(boolean arg0) {
        this.field1458 = arg0;
    }

    @ObfuscatedName("eg.at(Lrh;Lrh;B)I")
    public int method2854(class449 arg0, class449 arg1) {
        if (arg0.field4704 == arg1.field4704) {
            return this.method7430(arg0, arg1);
        } else if (this.field1458) {
            return arg0.field4704 - arg1.field4704;
        } else {
            return arg1.field4704 - arg0.field4704;
        }
    }

    public int compare(Object arg0, Object arg1) {
        return this.method2854((class449) arg0, (class449) arg1);
    }
}
