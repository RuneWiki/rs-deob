package deob;

@ObfuscatedName("ey")
public class class123 extends class475 {

    @ObfuscatedName("ey.ac")
    public final boolean field1519;

    public class123(boolean arg0) {
        this.field1519 = arg0;
    }

    @ObfuscatedName("ey.ac(Lsq;Lsq;I)I")
    public int method3016(class478 arg0, class478 arg1) {
        if (client.field516 == arg0.field4998) {
            if (client.field516 != arg1.field4998) {
                return this.field1519 ? -1 : 1;
            }
        } else if (client.field516 == arg1.field4998) {
            return this.field1519 ? 1 : -1;
        }
        return this.method8083(arg0, arg1);
    }

    public int compare(Object arg0, Object arg1) {
        return this.method3016((class478) arg0, (class478) arg1);
    }
}
