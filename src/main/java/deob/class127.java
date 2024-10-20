package deob;

@ObfuscatedName("ee")
public class class127 extends class472 {

    @ObfuscatedName("ee.aq")
    public final boolean field1515;

    public class127(boolean arg0) {
        this.field1515 = arg0;
    }

    @ObfuscatedName("ee.aq(Lsh;Lsh;I)I")
    public int method2882(class475 arg0, class475 arg1) {
        if (arg0.field4955 == arg1.field4955) {
            return this.method7857(arg0, arg1);
        } else if (this.field1515) {
            return arg0.field4955 - arg1.field4955;
        } else {
            return arg1.field4955 - arg0.field4955;
        }
    }

    public int compare(Object arg0, Object arg1) {
        return this.method2882((class475) arg0, (class475) arg1);
    }
}
