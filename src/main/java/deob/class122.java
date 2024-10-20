package deob;

@ObfuscatedName("eo")
public class class122 extends class422 {

    @ObfuscatedName("eo.at")
    public final boolean field1447;

    public class122(boolean arg0) {
        this.field1447 = arg0;
    }

    @ObfuscatedName("eo.at(Lqg;Lqg;B)I")
    public int method2743(class425 arg0, class425 arg1) {
        if (arg0.field4614 == arg1.field4614) {
            return this.method7169(arg0, arg1);
        } else if (this.field1447) {
            return arg0.field4614 - arg1.field4614;
        } else {
            return arg1.field4614 - arg0.field4614;
        }
    }

    public int compare(Object arg0, Object arg1) {
        return this.method2743((class425) arg0, (class425) arg1);
    }
}
