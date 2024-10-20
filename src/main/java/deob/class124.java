package deob;

@ObfuscatedName("ey")
public class class124 extends class473 {

    @ObfuscatedName("ey.ab")
    public final boolean field1489;

    public class124(boolean arg0) {
        this.field1489 = arg0;
    }

    @ObfuscatedName("ey.ab(Lsc;Lsc;B)I")
    public int method2931(class476 arg0, class476 arg1) {
        if (arg0.field4938 == arg1.field4938) {
            return this.method7948(arg0, arg1);
        } else if (this.field1489) {
            return arg0.field4938 - arg1.field4938;
        } else {
            return arg1.field4938 - arg0.field4938;
        }
    }

    public int compare(Object arg0, Object arg1) {
        return this.method2931((class476) arg0, (class476) arg1);
    }
}
