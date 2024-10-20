package deob;

@ObfuscatedName("ep")
public class class119 extends class422 {

    @ObfuscatedName("ep.at")
    public final boolean field1433;

    public class119(boolean arg0) {
        this.field1433 = arg0;
    }

    @ObfuscatedName("ep.at(Lqg;Lqg;I)I")
    public int method2725(class425 arg0, class425 arg1) {
        if (arg0.field4612 == arg1.field4612) {
            return this.method7169(arg0, arg1);
        } else if (this.field1433) {
            return arg0.field4612 - arg1.field4612;
        } else {
            return arg1.field4612 - arg0.field4612;
        }
    }

    public int compare(Object arg0, Object arg1) {
        return this.method2725((class425) arg0, (class425) arg1);
    }
}
