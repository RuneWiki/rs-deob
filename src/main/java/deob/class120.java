package deob;

@ObfuscatedName("er")
public class class120 extends class471 {

    @ObfuscatedName("er.ak")
    public final boolean field1501;

    public class120(boolean arg0) {
        this.field1501 = arg0;
    }

    @ObfuscatedName("er.ak(Lso;Lso;B)I")
    public int method2819(class474 arg0, class474 arg1) {
        if (client.field600 == arg0.field4932) {
            if (client.field600 != arg1.field4932) {
                return this.field1501 ? -1 : 1;
            }
        } else if (client.field600 == arg1.field4932) {
            return this.field1501 ? 1 : -1;
        }
        return this.method7897(arg0, arg1);
    }

    public int compare(Object arg0, Object arg1) {
        return this.method2819((class474) arg0, (class474) arg1);
    }
}
