package deob;

@ObfuscatedName("dw")
public class class108 extends class339 {

    @ObfuscatedName("dw.i")
    public final boolean field1329;

    public class108(boolean arg0) {
        this.field1329 = arg0;
    }

    @ObfuscatedName("dw.i(Lmt;Lmt;I)I")
    public int method2358(class342 arg0, class342 arg1) {
        if (client.field463 == arg0.field3965 && client.field463 == arg1.field3965) {
            return this.field1329 ? arg0.field3966 - arg1.field3966 : arg1.field3966 - arg0.field3966;
        } else {
            return this.method5491(arg0, arg1);
        }
    }

    public int compare(Object arg0, Object arg1) {
        return this.method2358((class342) arg0, (class342) arg1);
    }
}
