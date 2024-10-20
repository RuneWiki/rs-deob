package deob;

@ObfuscatedName("de")
public class class109 extends class372 {

    @ObfuscatedName("de.v")
    public final boolean field1359;

    public class109(boolean arg0) {
        this.field1359 = arg0;
    }

    @ObfuscatedName("de.v(Lnf;Lnf;I)I")
    public int method2488(class375 arg0, class375 arg1) {
        if (client.field723 == arg0.field4269 && client.field723 == arg1.field4269) {
            return this.field1359 ? arg0.method6104().method7527(arg1.method6104()) : arg1.method6104().method7527(arg0.method6104());
        } else {
            return this.method6118(arg0, arg1);
        }
    }

    public int compare(Object arg0, Object arg1) {
        return this.method2488((class375) arg0, (class375) arg1);
    }
}
