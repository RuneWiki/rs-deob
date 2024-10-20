package deob;

@ObfuscatedName("et")
public class class123 extends class453 {

    @ObfuscatedName("et.aq")
    public final boolean field1473;

    public class123(boolean arg0) {
        this.field1473 = arg0;
    }

    @ObfuscatedName("et.aq(Lry;Lry;I)I")
    public int method2832(class456 arg0, class456 arg1) {
        if (client.field522 == arg0.field4770 && client.field522 == arg1.field4770) {
            return this.field1473 ? arg0.field4771 - arg1.field4771 : arg1.field4771 - arg0.field4771;
        } else {
            return this.method7579(arg0, arg1);
        }
    }

    public int compare(Object arg0, Object arg1) {
        return this.method2832((class456) arg0, (class456) arg1);
    }
}
