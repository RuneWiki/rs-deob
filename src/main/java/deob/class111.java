package deob;

@ObfuscatedName("dx")
public class class111 extends class372 {

    @ObfuscatedName("dx.v")
    public final boolean field1364;

    public class111(boolean arg0) {
        this.field1364 = arg0;
    }

    @ObfuscatedName("dx.v(Lnf;Lnf;I)I")
    public int method2509(class375 arg0, class375 arg1) {
        if (arg0.field4267 == arg1.field4267) {
            return this.method6118(arg0, arg1);
        } else if (this.field1364) {
            return arg0.field4267 - arg1.field4267;
        } else {
            return arg1.field4267 - arg0.field4267;
        }
    }

    public int compare(Object arg0, Object arg1) {
        return this.method2509((class375) arg0, (class375) arg1);
    }
}
