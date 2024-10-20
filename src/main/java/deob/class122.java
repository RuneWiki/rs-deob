package deob;

@ObfuscatedName("eu")
public class class122 extends class450 {

    @ObfuscatedName("eu.am")
    public final boolean field1464;

    public class122(boolean arg0) {
        this.field1464 = arg0;
    }

    @ObfuscatedName("eu.am(Lrj;Lrj;B)I")
    public int method2862(class453 arg0, class453 arg1) {
        if (client.field499 == arg0.field4743 && client.field499 == arg1.field4743) {
            return this.field1464 ? arg0.field4741 - arg1.field4741 : arg1.field4741 - arg0.field4741;
        } else {
            return this.method7558(arg0, arg1);
        }
    }

    public int compare(Object arg0, Object arg1) {
        return this.method2862((class453) arg0, (class453) arg1);
    }
}
