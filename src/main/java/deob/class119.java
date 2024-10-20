package deob;

@ObfuscatedName("dl")
public class class119 extends class392 {

    @ObfuscatedName("dl.a")
    public final boolean field1437;

    public class119(boolean arg0) {
        this.field1437 = arg0;
    }

    @ObfuscatedName("dl.a(Lof;Lof;B)I")
    public int method2683(class395 arg0, class395 arg1) {
        if (arg0.field4495 == 0 || arg1.field4495 == 0) {
            return this.method6747(arg0, arg1);
        } else if (this.field1437) {
            return arg0.method6728().method8304(arg1.method6728());
        } else {
            return arg1.method6728().method8304(arg0.method6728());
        }
    }

    public int compare(Object arg0, Object arg1) {
        return this.method2683((class395) arg0, (class395) arg1);
    }
}
