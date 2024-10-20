package deob;

@ObfuscatedName("eb")
public class class121 extends class422 {

    @ObfuscatedName("eb.at")
    public final boolean field1441;

    public class121(boolean arg0) {
        this.field1441 = arg0;
    }

    @ObfuscatedName("eb.at(Lqg;Lqg;I)I")
    public int method2736(class425 arg0, class425 arg1) {
        if (client.field504 == arg0.field4612 && client.field504 == arg1.field4612) {
            return this.field1441 ? arg0.field4613 - arg1.field4613 : arg1.field4613 - arg0.field4613;
        } else {
            return this.method7169(arg0, arg1);
        }
    }

    public int compare(Object arg0, Object arg1) {
        return this.method2736((class425) arg0, (class425) arg1);
    }
}
