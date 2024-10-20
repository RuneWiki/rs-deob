package deob;

@ObfuscatedName("da")
public class class107 extends class339 {

    @ObfuscatedName("da.i")
    public final boolean field1325;

    public class107(boolean arg0) {
        this.field1325 = arg0;
    }

    @ObfuscatedName("da.i(Lmt;Lmt;I)I")
    public int method2350(class342 arg0, class342 arg1) {
        if (client.field463 == arg0.field3965 && client.field463 == arg1.field3965) {
            return this.field1325 ? arg0.method5471().method6815(arg1.method5471()) : arg1.method5471().method6815(arg0.method5471());
        } else {
            return this.method5491(arg0, arg1);
        }
    }

    public int compare(Object arg0, Object arg1) {
        return this.method2350((class342) arg0, (class342) arg1);
    }
}
