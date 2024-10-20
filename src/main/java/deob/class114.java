package deob;

@ObfuscatedName("ef")
public class class114 extends class405 {

    @ObfuscatedName("ef.aj")
    public final boolean field1411;

    public class114(boolean arg0) {
        this.field1411 = arg0;
    }

    @ObfuscatedName("ef.aj(Lpt;Lpt;I)I")
    public int method2711(class408 arg0, class408 arg1) {
        if (client.field482 == arg0.field4533) {
            if (client.field482 != arg1.field4533) {
                return this.field1411 ? -1 : 1;
            }
        } else if (client.field482 == arg1.field4533) {
            return this.field1411 ? 1 : -1;
        }
        return this.method6939(arg0, arg1);
    }

    public int compare(Object arg0, Object arg1) {
        return this.method2711((class408) arg0, (class408) arg1);
    }
}
