package deob;

@ObfuscatedName("et")
public class class115 extends class405 {

    @ObfuscatedName("et.aj")
    public final boolean field1419;

    public class115(boolean arg0) {
        this.field1419 = arg0;
    }

    @ObfuscatedName("et.aj(Lpt;Lpt;B)I")
    public int method2722(class408 arg0, class408 arg1) {
        if (arg0.field4533 == 0 || arg1.field4533 == 0) {
            return this.method6939(arg0, arg1);
        } else if (this.field1419) {
            return arg0.field4534 - arg1.field4534;
        } else {
            return arg1.field4534 - arg0.field4534;
        }
    }

    public int compare(Object arg0, Object arg1) {
        return this.method2722((class408) arg0, (class408) arg1);
    }
}
