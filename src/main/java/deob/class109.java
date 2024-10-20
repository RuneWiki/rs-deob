package deob;

@ObfuscatedName("dh")
public class class109 extends class373 {

    @ObfuscatedName("dh.o")
    public final boolean field1397;

    public class109(boolean arg0) {
        this.field1397 = arg0;
    }

    @ObfuscatedName("dh.o(Lns;Lns;B)I")
    public int method2463(class376 arg0, class376 arg1) {
        if (client.field539 == arg0.field4335 && client.field539 == arg1.field4335) {
            return this.field1397 ? arg0.method6011().method7497(arg1.method6011()) : arg1.method6011().method7497(arg0.method6011());
        } else {
            return this.method6016(arg0, arg1);
        }
    }

    public int compare(Object arg0, Object arg1) {
        return this.method2463((class376) arg0, (class376) arg1);
    }
}
