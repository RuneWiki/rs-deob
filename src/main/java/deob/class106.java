package deob;

@ObfuscatedName("dj")
public class class106 extends class372 {

    @ObfuscatedName("dj.v")
    public final boolean field1352;

    public class106(boolean arg0) {
        this.field1352 = arg0;
    }

    @ObfuscatedName("dj.v(Lnf;Lnf;I)I")
    public int method2460(class375 arg0, class375 arg1) {
        if (arg0.field4269 == 0 || arg1.field4269 == 0) {
            return this.method6118(arg0, arg1);
        } else if (this.field1352) {
            return arg0.field4268 - arg1.field4268;
        } else {
            return arg1.field4268 - arg0.field4268;
        }
    }

    public int compare(Object arg0, Object arg1) {
        return this.method2460((class375) arg0, (class375) arg1);
    }
}
