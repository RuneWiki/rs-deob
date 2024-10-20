package deob;

@ObfuscatedName("ej")
public class class117 extends class450 {

    @ObfuscatedName("ej.am")
    public final boolean field1449;

    public class117(boolean arg0) {
        this.field1449 = arg0;
    }

    @ObfuscatedName("ej.am(Lrj;Lrj;B)I")
    public int method2819(class453 arg0, class453 arg1) {
        if (client.field499 == arg0.field4743) {
            if (client.field499 != arg1.field4743) {
                return this.field1449 ? -1 : 1;
            }
        } else if (client.field499 == arg1.field4743) {
            return this.field1449 ? 1 : -1;
        }
        return this.method7558(arg0, arg1);
    }

    public int compare(Object arg0, Object arg1) {
        return this.method2819((class453) arg0, (class453) arg1);
    }
}
