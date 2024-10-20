package deob;

@ObfuscatedName("er")
public class class118 extends class409 {

    @ObfuscatedName("er.af")
    public final boolean field1445;

    public class118(boolean arg0) {
        this.field1445 = arg0;
    }

    @ObfuscatedName("er.af(Lpb;Lpb;B)I")
    public int method2802(class412 arg0, class412 arg1) {
        if (arg0.field4599 == arg1.field4599) {
            return this.method7183(arg0, arg1);
        } else if (this.field1445) {
            return arg0.field4599 - arg1.field4599;
        } else {
            return arg1.field4599 - arg0.field4599;
        }
    }

    public int compare(Object arg0, Object arg1) {
        return this.method2802((class412) arg0, (class412) arg1);
    }
}
