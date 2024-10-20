package deob;

@ObfuscatedName("eh")
public class class120 extends class453 {

    @ObfuscatedName("eh.aq")
    public final boolean field1465;

    public class120(boolean arg0) {
        this.field1465 = arg0;
    }

    @ObfuscatedName("eh.aq(Lry;Lry;I)I")
    public int method2813(class456 arg0, class456 arg1) {
        if (arg0.field4770 == 0) {
            if (arg1.field4770 != 0) {
                return this.field1465 ? 1 : -1;
            }
        } else if (arg1.field4770 == 0) {
            return this.field1465 ? -1 : 1;
        }
        return this.method7579(arg0, arg1);
    }

    public int compare(Object arg0, Object arg1) {
        return this.method2813((class456) arg0, (class456) arg1);
    }
}
