package deob;

@ObfuscatedName("ep")
public class class121 extends class453 {

    @ObfuscatedName("ep.aq")
    public final boolean field1469;

    public class121(boolean arg0) {
        this.field1469 = arg0;
    }

    @ObfuscatedName("ep.aq(Lry;Lry;B)I")
    public int method2818(class456 arg0, class456 arg1) {
        if (arg0.field4770 == arg1.field4770) {
            return this.method7579(arg0, arg1);
        } else if (this.field1469) {
            return arg0.field4770 - arg1.field4770;
        } else {
            return arg1.field4770 - arg0.field4770;
        }
    }

    public int compare(Object arg0, Object arg1) {
        return this.method2818((class456) arg0, (class456) arg1);
    }
}
