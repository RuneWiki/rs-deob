package deob;

@ObfuscatedName("dt")
public class class122 extends class323 {

    @ObfuscatedName("dt.v")
    public final boolean field1461;

    public class122(boolean arg0) {
        this.field1461 = arg0;
    }

    @ObfuscatedName("dt.v(Llv;Llv;B)I")
    public int method2259(class326 arg0, class326 arg1) {
        if (arg0.field3852 == arg1.field3852) {
            return this.method5244(arg0, arg1);
        } else if (this.field1461) {
            return arg0.field3852 - arg1.field3852;
        } else {
            return arg1.field3852 - arg0.field3852;
        }
    }

    public int compare(Object arg0, Object arg1) {
        return this.method2259((class326) arg0, (class326) arg1);
    }
}
