package deob;

@ObfuscatedName("df")
public class class113 extends class402 {

    @ObfuscatedName("df.f")
    public final boolean field1444;

    public class113(boolean arg0) {
        this.field1444 = arg0;
    }

    @ObfuscatedName("df.f(Loa;Loa;I)I")
    public int method2778(class405 arg0, class405 arg1) {
        if (arg0.field4577 == 0 || arg1.field4577 == 0) {
            return this.method7039(arg0, arg1);
        } else if (this.field1444) {
            return arg0.field4575 - arg1.field4575;
        } else {
            return arg1.field4575 - arg0.field4575;
        }
    }

    public int compare(Object arg0, Object arg1) {
        return this.method2778((class405) arg0, (class405) arg1);
    }
}
