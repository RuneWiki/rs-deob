package deob;

@ObfuscatedName("ec")
public class class129 extends class475 {

    @ObfuscatedName("ec.ac")
    public final boolean field1542;

    public class129(boolean arg0) {
        this.field1542 = arg0;
    }

    @ObfuscatedName("ec.ac(Lsq;Lsq;I)I")
    public int method3064(class478 arg0, class478 arg1) {
        if (arg0.field4999 == arg1.field4999) {
            return this.method8083(arg0, arg1);
        } else if (this.field1542) {
            return arg0.field4999 - arg1.field4999;
        } else {
            return arg1.field4999 - arg0.field4999;
        }
    }

    public int compare(Object arg0, Object arg1) {
        return this.method3064((class478) arg0, (class478) arg1);
    }
}
