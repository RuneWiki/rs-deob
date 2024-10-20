package deob;

@ObfuscatedName("eb")
public class class121 extends class450 {

    @ObfuscatedName("eb.am")
    public final boolean field1463;

    public class121(boolean arg0) {
        this.field1463 = arg0;
    }

    @ObfuscatedName("eb.am(Lrj;Lrj;B)I")
    public int method2853(class453 arg0, class453 arg1) {
        if (client.field499 == arg0.field4743 && client.field499 == arg1.field4743) {
            return this.field1463 ? arg0.method7544().method9159(arg1.method7544()) : arg1.method7544().method9159(arg0.method7544());
        } else {
            return this.method7558(arg0, arg1);
        }
    }

    public int compare(Object arg0, Object arg1) {
        return this.method2853((class453) arg0, (class453) arg1);
    }
}
