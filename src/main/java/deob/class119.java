package deob;

@ObfuscatedName("eg")
public class class119 extends class409 {

    @ObfuscatedName("eg.af")
    public final boolean field1447;

    public class119(boolean arg0) {
        this.field1447 = arg0;
    }

    @ObfuscatedName("eg.af(Lpb;Lpb;I)I")
    public int method2814(class412 arg0, class412 arg1) {
        if (arg0.field4600 == 0 || arg1.field4600 == 0) {
            return this.method7183(arg0, arg1);
        } else if (this.field1447) {
            return arg0.method7167().method8845(arg1.method7167());
        } else {
            return arg1.method7167().method8845(arg0.method7167());
        }
    }

    public int compare(Object arg0, Object arg1) {
        return this.method2814((class412) arg0, (class412) arg1);
    }
}
