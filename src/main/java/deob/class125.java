package deob;

@ObfuscatedName("ek")
public class class125 extends class471 {

    @ObfuscatedName("ek.ak")
    public final boolean field1519;

    public class125(boolean arg0) {
        this.field1519 = arg0;
    }

    @ObfuscatedName("ek.ak(Lso;Lso;I)I")
    public int method2858(class474 arg0, class474 arg1) {
        if (client.field600 == arg0.field4932 && client.field600 == arg1.field4932) {
            return this.field1519 ? arg0.field4933 - arg1.field4933 : arg1.field4933 - arg0.field4933;
        } else {
            return this.method7897(arg0, arg1);
        }
    }

    public int compare(Object arg0, Object arg1) {
        return this.method2858((class474) arg0, (class474) arg1);
    }
}
