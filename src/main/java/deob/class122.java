package deob;

@ObfuscatedName("em")
public class class122 extends class454 {

    @ObfuscatedName("em.az")
    public final boolean field1495;

    public class122(boolean arg0) {
        this.field1495 = arg0;
    }

    @ObfuscatedName("em.az(Lrw;Lrw;I)I")
    public int method2773(class457 arg0, class457 arg1) {
        if (client.field509 == arg0.field4807 && client.field509 == arg1.field4807) {
            return this.field1495 ? arg0.method7433().method9080(arg1.method7433()) : arg1.method7433().method9080(arg0.method7433());
        } else {
            return this.method7450(arg0, arg1);
        }
    }

    public int compare(Object arg0, Object arg1) {
        return this.method2773((class457) arg0, (class457) arg1);
    }
}
