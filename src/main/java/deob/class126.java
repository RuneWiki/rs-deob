package deob;

@ObfuscatedName("ey")
public class class126 extends class449 {

    @ObfuscatedName("ey.ac")
    public final boolean field1489;

    public class126(boolean arg0) {
        this.field1489 = arg0;
    }

    @ObfuscatedName("ey.ac(Lri;Lri;B)I")
    public int method2802(class452 arg0, class452 arg1) {
        if (arg0.field4712 == 0 || arg1.field4712 == 0) {
            return this.method7354(arg0, arg1);
        } else if (this.field1489) {
            return arg0.method7329().method8989(arg1.method7329());
        } else {
            return arg1.method7329().method8989(arg0.method7329());
        }
    }

    public int compare(Object arg0, Object arg1) {
        return this.method2802((class452) arg0, (class452) arg1);
    }
}
