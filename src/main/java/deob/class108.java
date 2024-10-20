package deob;

@ObfuscatedName("dy")
public class class108 extends class373 {

    @ObfuscatedName("dy.o")
    public final boolean field1394;

    public class108(boolean arg0) {
        this.field1394 = arg0;
    }

    @ObfuscatedName("dy.o(Lns;Lns;B)I")
    public int method2458(class376 arg0, class376 arg1) {
        if (arg0.field4335 == arg1.field4335) {
            return this.method6016(arg0, arg1);
        } else if (this.field1394) {
            return arg0.field4335 - arg1.field4335;
        } else {
            return arg1.field4335 - arg0.field4335;
        }
    }

    public int compare(Object arg0, Object arg1) {
        return this.method2458((class376) arg0, (class376) arg1);
    }
}
