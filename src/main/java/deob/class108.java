package deob;

@ObfuscatedName("dy")
public class class108 extends class373 {

    @ObfuscatedName("dy.s")
    public final boolean field1385;

    public class108(boolean arg0) {
        this.field1385 = arg0;
    }

    @ObfuscatedName("dy.s(Lnt;Lnt;I)I")
    public int method2439(class376 arg0, class376 arg1) {
        if (arg0.field4328 == arg1.field4328) {
            return this.method6015(arg0, arg1);
        } else if (this.field1385) {
            return arg0.field4328 - arg1.field4328;
        } else {
            return arg1.field4328 - arg0.field4328;
        }
    }

    public int compare(Object arg0, Object arg1) {
        return this.method2439((class376) arg0, (class376) arg1);
    }
}
