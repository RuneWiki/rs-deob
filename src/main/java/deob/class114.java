package deob;

@ObfuscatedName("dp")
public class class114 extends class392 {

    @ObfuscatedName("dp.a")
    public final boolean field1417;

    public class114(boolean arg0) {
        this.field1417 = arg0;
    }

    @ObfuscatedName("dp.a(Lof;Lof;I)I")
    public int method2647(class395 arg0, class395 arg1) {
        if (arg0.field4495 == 0) {
            if (arg1.field4495 != 0) {
                return this.field1417 ? 1 : -1;
            }
        } else if (arg1.field4495 == 0) {
            return this.field1417 ? -1 : 1;
        }
        return this.method6747(arg0, arg1);
    }

    public int compare(Object arg0, Object arg1) {
        return this.method2647((class395) arg0, (class395) arg1);
    }
}
