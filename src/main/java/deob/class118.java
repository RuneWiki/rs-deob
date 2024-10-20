package deob;

@ObfuscatedName("ei")
public class class118 extends class446 {

    @ObfuscatedName("ei.at")
    public final boolean field1444;

    public class118(boolean arg0) {
        this.field1444 = arg0;
    }

    @ObfuscatedName("ei.at(Lrh;Lrh;I)I")
    public int method2807(class449 arg0, class449 arg1) {
        if (arg0.field4703 == 0 || arg1.field4703 == 0) {
            return this.method7430(arg0, arg1);
        } else if (this.field1444) {
            return arg0.field4702 - arg1.field4702;
        } else {
            return arg1.field4702 - arg0.field4702;
        }
    }

    public int compare(Object arg0, Object arg1) {
        return this.method2807((class449) arg0, (class449) arg1);
    }
}
