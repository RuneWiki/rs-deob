package deob;

@ObfuscatedName("eu")
public class class119 extends class454 {

    @ObfuscatedName("eu.az")
    public final boolean field1480;

    public class119(boolean arg0) {
        this.field1480 = arg0;
    }

    @ObfuscatedName("eu.az(Lrw;Lrw;I)I")
    public int method2747(class457 arg0, class457 arg1) {
        if (arg0.field4807 == 0 || arg1.field4807 == 0) {
            return this.method7450(arg0, arg1);
        } else if (this.field1480) {
            return arg0.field4804 - arg1.field4804;
        } else {
            return arg1.field4804 - arg0.field4804;
        }
    }

    public int compare(Object arg0, Object arg1) {
        return this.method2747((class457) arg0, (class457) arg1);
    }
}
