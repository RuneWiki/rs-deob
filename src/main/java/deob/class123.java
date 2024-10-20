package deob;

@ObfuscatedName("eq")
public class class123 extends class454 {

    @ObfuscatedName("eq.az")
    public final boolean field1502;

    public class123(boolean arg0) {
        this.field1502 = arg0;
    }

    @ObfuscatedName("eq.az(Lrw;Lrw;B)I")
    public int method2787(class457 arg0, class457 arg1) {
        if (client.field509 == arg0.field4807 && client.field509 == arg1.field4807) {
            return this.field1502 ? arg0.field4804 - arg1.field4804 : arg1.field4804 - arg0.field4804;
        } else {
            return this.method7450(arg0, arg1);
        }
    }

    public int compare(Object arg0, Object arg1) {
        return this.method2787((class457) arg0, (class457) arg1);
    }
}
