package deob;

@ObfuscatedName("ee")
public class class118 extends class454 {

    @ObfuscatedName("ee.az")
    public final boolean field1479;

    public class118(boolean arg0) {
        this.field1479 = arg0;
    }

    @ObfuscatedName("ee.az(Lrw;Lrw;I)I")
    public int method2745(class457 arg0, class457 arg1) {
        if (client.field509 == arg0.field4807) {
            if (client.field509 != arg1.field4807) {
                return this.field1479 ? -1 : 1;
            }
        } else if (client.field509 == arg1.field4807) {
            return this.field1479 ? 1 : -1;
        }
        return this.method7450(arg0, arg1);
    }

    public int compare(Object arg0, Object arg1) {
        return this.method2745((class457) arg0, (class457) arg1);
    }
}
