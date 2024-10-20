package deob;

@ObfuscatedName("dq")
public class class109 extends class339 {

    @ObfuscatedName("dq.l")
    public final boolean field1346;

    public class109(boolean arg0) {
        this.field1346 = arg0;
    }

    @ObfuscatedName("dq.l(Lmi;Lmi;I)I")
    public int method2346(class342 arg0, class342 arg1) {
        if (arg0.field3974 == arg1.field3974) {
            return this.method5534(arg0, arg1);
        } else if (this.field1346) {
            return arg0.field3974 - arg1.field3974;
        } else {
            return arg1.field3974 - arg0.field3974;
        }
    }

    public int compare(Object arg0, Object arg1) {
        return this.method2346((class342) arg0, (class342) arg1);
    }
}
