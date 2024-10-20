package deob;

@ObfuscatedName("ee")
public class class119 extends class435 {

    @ObfuscatedName("ee.aw")
    public final boolean field1459;

    public class119(boolean arg0) {
        this.field1459 = arg0;
    }

    @ObfuscatedName("ee.aw(Lqa;Lqa;I)I")
    public int method2744(class438 arg0, class438 arg1) {
        if (arg0.field4669 == 0) {
            if (arg1.field4669 != 0) {
                return this.field1459 ? 1 : -1;
            }
        } else if (arg1.field4669 == 0) {
            return this.field1459 ? -1 : 1;
        }
        return this.method7250(arg0, arg1);
    }

    public int compare(Object arg0, Object arg1) {
        return this.method2744((class438) arg0, (class438) arg1);
    }
}
