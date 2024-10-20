package deob;

@ObfuscatedName("ea")
public class class120 extends class405 {

    @ObfuscatedName("ea.aj")
    public final boolean field1441;

    public class120(boolean arg0) {
        this.field1441 = arg0;
    }

    @ObfuscatedName("ea.aj(Lpt;Lpt;B)I")
    public int method2747(class408 arg0, class408 arg1) {
        if (arg0.field4532 == arg1.field4532) {
            return this.method6939(arg0, arg1);
        } else if (this.field1441) {
            return arg0.field4532 - arg1.field4532;
        } else {
            return arg1.field4532 - arg0.field4532;
        }
    }

    public int compare(Object arg0, Object arg1) {
        return this.method2747((class408) arg0, (class408) arg1);
    }
}
