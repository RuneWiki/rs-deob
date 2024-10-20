package deob;

@ObfuscatedName("dp")
public class class110 extends class372 {

    @ObfuscatedName("dp.v")
    public final boolean field1362;

    public class110(boolean arg0) {
        this.field1362 = arg0;
    }

    @ObfuscatedName("dp.v(Lnf;Lnf;I)I")
    public int method2503(class375 arg0, class375 arg1) {
        if (client.field723 == arg0.field4269 && client.field723 == arg1.field4269) {
            return this.field1362 ? arg0.field4268 - arg1.field4268 : arg1.field4268 - arg0.field4268;
        } else {
            return this.method6118(arg0, arg1);
        }
    }

    public int compare(Object arg0, Object arg1) {
        return this.method2503((class375) arg0, (class375) arg1);
    }
}
