package deob;

@ObfuscatedName("du")
public class class110 extends class339 {

    @ObfuscatedName("du.l")
    public final boolean field1354;

    public class110(boolean arg0) {
        this.field1354 = arg0;
    }

    @ObfuscatedName("du.l(Lmi;Lmi;I)I")
    public int method2355(class342 arg0, class342 arg1) {
        if (arg0.field3976 == 0 || arg1.field3976 == 0) {
            return this.method5534(arg0, arg1);
        } else if (this.field1354) {
            return arg0.method5508().method6829(arg1.method5508());
        } else {
            return arg1.method5508().method6829(arg0.method5508());
        }
    }

    public int compare(Object arg0, Object arg1) {
        return this.method2355((class342) arg0, (class342) arg1);
    }
}
