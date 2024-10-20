package deob;

@ObfuscatedName("en")
public class class124 extends class453 {

    @ObfuscatedName("en.aq")
    public final boolean field1480;

    public class124(boolean arg0) {
        this.field1480 = arg0;
    }

    @ObfuscatedName("en.aq(Lry;Lry;I)I")
    public int method2835(class456 arg0, class456 arg1) {
        if (arg0.field4772 == arg1.field4772) {
            return this.method7579(arg0, arg1);
        } else if (this.field1480) {
            return arg0.field4772 - arg1.field4772;
        } else {
            return arg1.field4772 - arg0.field4772;
        }
    }

    public int compare(Object arg0, Object arg1) {
        return this.method2835((class456) arg0, (class456) arg1);
    }
}
