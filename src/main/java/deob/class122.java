package deob;

@ObfuscatedName("es")
public class class122 extends class453 {

    @ObfuscatedName("es.aq")
    public final boolean field1472;

    public class122(boolean arg0) {
        this.field1472 = arg0;
    }

    @ObfuscatedName("es.aq(Lry;Lry;B)I")
    public int method2823(class456 arg0, class456 arg1) {
        if (client.field522 == arg0.field4770 && client.field522 == arg1.field4770) {
            return this.field1472 ? arg0.method7559().method9190(arg1.method7559()) : arg1.method7559().method9190(arg0.method7559());
        } else {
            return this.method7579(arg0, arg1);
        }
    }

    public int compare(Object arg0, Object arg1) {
        return this.method2823((class456) arg0, (class456) arg1);
    }
}
