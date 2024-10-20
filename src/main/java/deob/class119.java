package deob;

@ObfuscatedName("er")
public class class119 extends class453 {

    @ObfuscatedName("er.aq")
    public final boolean field1464;

    public class119(boolean arg0) {
        this.field1464 = arg0;
    }

    @ObfuscatedName("er.aq(Lry;Lry;B)I")
    public int method2807(class456 arg0, class456 arg1) {
        if (arg0.field4770 == 0 || arg1.field4770 == 0) {
            return this.method7579(arg0, arg1);
        } else if (this.field1464) {
            return arg0.field4771 - arg1.field4771;
        } else {
            return arg1.field4771 - arg0.field4771;
        }
    }

    public int compare(Object arg0, Object arg1) {
        return this.method2807((class456) arg0, (class456) arg1);
    }
}
