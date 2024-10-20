package deob;

@ObfuscatedName("eg")
public class class118 extends class405 {

    @ObfuscatedName("eg.aj")
    public final boolean field1434;

    public class118(boolean arg0) {
        this.field1434 = arg0;
    }

    @ObfuscatedName("eg.aj(Lpt;Lpt;I)I")
    public int method2737(class408 arg0, class408 arg1) {
        if (client.field482 == arg0.field4533 && client.field482 == arg1.field4533) {
            return this.field1434 ? arg0.method6921().method8502(arg1.method6921()) : arg1.method6921().method8502(arg0.method6921());
        } else {
            return this.method6939(arg0, arg1);
        }
    }

    public int compare(Object arg0, Object arg1) {
        return this.method2737((class408) arg0, (class408) arg1);
    }
}
