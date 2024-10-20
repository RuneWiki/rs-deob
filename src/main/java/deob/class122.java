package deob;

@ObfuscatedName("ez")
public class class122 extends class473 {

    @ObfuscatedName("ez.ab")
    public final boolean field1484;

    public class122(boolean arg0) {
        this.field1484 = arg0;
    }

    @ObfuscatedName("ez.ab(Lsc;Lsc;I)I")
    public int method2920(class476 arg0, class476 arg1) {
        if (arg0.field4938 == 0 || arg1.field4938 == 0) {
            return this.method7948(arg0, arg1);
        } else if (this.field1484) {
            return arg0.field4934 - arg1.field4934;
        } else {
            return arg1.field4934 - arg0.field4934;
        }
    }

    public int compare(Object arg0, Object arg1) {
        return this.method2920((class476) arg0, (class476) arg1);
    }
}
