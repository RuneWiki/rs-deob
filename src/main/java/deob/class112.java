package deob;

@ObfuscatedName("dd")
public class class112 extends class373 {

    @ObfuscatedName("dd.o")
    public final boolean field1417;

    public class112(boolean arg0) {
        this.field1417 = arg0;
    }

    @ObfuscatedName("dd.o(Lns;Lns;B)I")
    public int method2475(class376 arg0, class376 arg1) {
        if (arg0.field4335 == 0 || arg1.field4335 == 0) {
            return this.method6016(arg0, arg1);
        } else if (this.field1417) {
            return arg0.method6011().method7497(arg1.method6011());
        } else {
            return arg1.method6011().method7497(arg0.method6011());
        }
    }

    public int compare(Object arg0, Object arg1) {
        return this.method2475((class376) arg0, (class376) arg1);
    }
}
