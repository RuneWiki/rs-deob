package deob;

@ObfuscatedName("eu")
public class class126 extends class473 {

    @ObfuscatedName("eu.ab")
    public final boolean field1496;

    public class126(boolean arg0) {
        this.field1496 = arg0;
    }

    @ObfuscatedName("eu.ab(Lsc;Lsc;I)I")
    public int method2947(class476 arg0, class476 arg1) {
        if (client.field798 == arg0.field4938 && client.field798 == arg1.field4938) {
            return this.field1496 ? arg0.field4934 - arg1.field4934 : arg1.field4934 - arg0.field4934;
        } else {
            return this.method7948(arg0, arg1);
        }
    }

    public int compare(Object arg0, Object arg1) {
        return this.method2947((class476) arg0, (class476) arg1);
    }
}
