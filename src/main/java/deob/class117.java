package deob;

@ObfuscatedName("el")
public class class117 extends class422 {

    @ObfuscatedName("el.at")
    public final boolean field1425;

    public class117(boolean arg0) {
        this.field1425 = arg0;
    }

    @ObfuscatedName("el.at(Lqg;Lqg;I)I")
    public int method2714(class425 arg0, class425 arg1) {
        if (arg0.field4612 == 0 || arg1.field4612 == 0) {
            return this.method7169(arg0, arg1);
        } else if (this.field1425) {
            return arg0.field4613 - arg1.field4613;
        } else {
            return arg1.field4613 - arg0.field4613;
        }
    }

    public int compare(Object arg0, Object arg1) {
        return this.method2714((class425) arg0, (class425) arg1);
    }
}
