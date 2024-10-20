package deob;

@ObfuscatedName("eu")
public class class122 extends class446 {

    @ObfuscatedName("eu.at")
    public final boolean field1456;

    public class122(boolean arg0) {
        this.field1456 = arg0;
    }

    @ObfuscatedName("eu.at(Lrh;Lrh;I)I")
    public int method2845(class449 arg0, class449 arg1) {
        if (client.field591 == arg0.field4703 && client.field591 == arg1.field4703) {
            return this.field1456 ? arg0.field4702 - arg1.field4702 : arg1.field4702 - arg0.field4702;
        } else {
            return this.method7430(arg0, arg1);
        }
    }

    public int compare(Object arg0, Object arg1) {
        return this.method2845((class449) arg0, (class449) arg1);
    }
}
