package deob;

@ObfuscatedName("dd")
public class class107 extends class339 {

    @ObfuscatedName("dd.l")
    public final boolean field1342;

    public class107(boolean arg0) {
        this.field1342 = arg0;
    }

    @ObfuscatedName("dd.l(Lmi;Lmi;I)I")
    public int method2332(class342 arg0, class342 arg1) {
        if (client.field483 == arg0.field3976 && client.field483 == arg1.field3976) {
            return this.field1342 ? arg0.method5508().method6829(arg1.method5508()) : arg1.method5508().method6829(arg0.method5508());
        } else {
            return this.method5534(arg0, arg1);
        }
    }

    public int compare(Object arg0, Object arg1) {
        return this.method2332((class342) arg0, (class342) arg1);
    }
}
