package deob;

@ObfuscatedName("eb")
public class class115 extends class409 {

    @ObfuscatedName("eb.af")
    public final boolean field1429;

    public class115(boolean arg0) {
        this.field1429 = arg0;
    }

    @ObfuscatedName("eb.af(Lpb;Lpb;B)I")
    public int method2774(class412 arg0, class412 arg1) {
        if (arg0.field4600 == arg1.field4600) {
            return this.method7183(arg0, arg1);
        } else if (this.field1429) {
            return arg0.field4600 - arg1.field4600;
        } else {
            return arg1.field4600 - arg0.field4600;
        }
    }

    public int compare(Object arg0, Object arg1) {
        return this.method2774((class412) arg0, (class412) arg1);
    }
}
