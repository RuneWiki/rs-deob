package deob;

@ObfuscatedName("dp")
public class class106 extends class373 {

    @ObfuscatedName("dp.o")
    public final boolean field1382;

    public class106(boolean arg0) {
        this.field1382 = arg0;
    }

    @ObfuscatedName("dp.o(Lns;Lns;B)I")
    public int method2445(class376 arg0, class376 arg1) {
        if (arg0.field4335 == 0 || arg1.field4335 == 0) {
            return this.method6016(arg0, arg1);
        } else if (this.field1382) {
            return arg0.field4336 - arg1.field4336;
        } else {
            return arg1.field4336 - arg0.field4336;
        }
    }

    public int compare(Object arg0, Object arg1) {
        return this.method2445((class376) arg0, (class376) arg1);
    }
}
