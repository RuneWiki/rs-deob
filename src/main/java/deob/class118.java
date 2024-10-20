package deob;

@ObfuscatedName("ey")
public class class118 extends class450 {

    @ObfuscatedName("ey.am")
    public final boolean field1452;

    public class118(boolean arg0) {
        this.field1452 = arg0;
    }

    @ObfuscatedName("ey.am(Lrj;Lrj;I)I")
    public int method2826(class453 arg0, class453 arg1) {
        if (arg0.field4743 == 0 || arg1.field4743 == 0) {
            return this.method7558(arg0, arg1);
        } else if (this.field1452) {
            return arg0.field4741 - arg1.field4741;
        } else {
            return arg1.field4741 - arg0.field4741;
        }
    }

    public int compare(Object arg0, Object arg1) {
        return this.method2826((class453) arg0, (class453) arg1);
    }
}
