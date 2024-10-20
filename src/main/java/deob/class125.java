package deob;

@ObfuscatedName("ep")
public class class125 extends class472 {

    @ObfuscatedName("ep.aq")
    public final boolean field1506;

    public class125(boolean arg0) {
        this.field1506 = arg0;
    }

    @ObfuscatedName("ep.aq(Lsh;Lsh;I)I")
    public int method2866(class475 arg0, class475 arg1) {
        if (client.field500 == arg0.field4957 && client.field500 == arg1.field4957) {
            return this.field1506 ? arg0.method7842().method9357(arg1.method7842()) : arg1.method7842().method9357(arg0.method7842());
        } else {
            return this.method7857(arg0, arg1);
        }
    }

    public int compare(Object arg0, Object arg1) {
        return this.method2866((class475) arg0, (class475) arg1);
    }
}
