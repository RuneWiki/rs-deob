package deob;

@ObfuscatedName("dp")
public class class108 extends class339 {

    @ObfuscatedName("dp.l")
    public final boolean field1345;

    public class108(boolean arg0) {
        this.field1345 = arg0;
    }

    @ObfuscatedName("dp.l(Lmi;Lmi;I)I")
    public int method2338(class342 arg0, class342 arg1) {
        if (client.field483 == arg0.field3976 && client.field483 == arg1.field3976) {
            return this.field1345 ? arg0.field3975 - arg1.field3975 : arg1.field3975 - arg0.field3975;
        } else {
            return this.method5534(arg0, arg1);
        }
    }

    public int compare(Object arg0, Object arg1) {
        return this.method2338((class342) arg0, (class342) arg1);
    }
}
