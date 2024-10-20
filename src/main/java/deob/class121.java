package deob;

@ObfuscatedName("ec")
public class class121 extends class454 {

    @ObfuscatedName("ec.az")
    public final boolean field1489;

    public class121(boolean arg0) {
        this.field1489 = arg0;
    }

    @ObfuscatedName("ec.az(Lrw;Lrw;I)I")
    public int method2765(class457 arg0, class457 arg1) {
        if (arg0.field4807 == arg1.field4807) {
            return this.method7450(arg0, arg1);
        } else if (this.field1489) {
            return arg0.field4807 - arg1.field4807;
        } else {
            return arg1.field4807 - arg0.field4807;
        }
    }

    public int compare(Object arg0, Object arg1) {
        return this.method2765((class457) arg0, (class457) arg1);
    }
}
