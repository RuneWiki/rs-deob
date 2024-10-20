package deob;

@ObfuscatedName("er")
public class class120 extends class446 {

    @ObfuscatedName("er.at")
    public final boolean field1450;

    public class120(boolean arg0) {
        this.field1450 = arg0;
    }

    @ObfuscatedName("er.at(Lrh;Lrh;I)I")
    public int method2828(class449 arg0, class449 arg1) {
        if (arg0.field4703 == arg1.field4703) {
            return this.method7430(arg0, arg1);
        } else if (this.field1450) {
            return arg0.field4703 - arg1.field4703;
        } else {
            return arg1.field4703 - arg0.field4703;
        }
    }

    public int compare(Object arg0, Object arg1) {
        return this.method2828((class449) arg0, (class449) arg1);
    }
}
