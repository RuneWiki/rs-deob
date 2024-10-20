package deob;

@ObfuscatedName("dm")
public class class116 extends class392 {

    @ObfuscatedName("dm.a")
    public final boolean field1424;

    public class116(boolean arg0) {
        this.field1424 = arg0;
    }

    @ObfuscatedName("dm.a(Lof;Lof;I)I")
    public int method2656(class395 arg0, class395 arg1) {
        if (client.field726 == arg0.field4495 && client.field726 == arg1.field4495) {
            return this.field1424 ? arg0.method6728().method8304(arg1.method6728()) : arg1.method6728().method8304(arg0.method6728());
        } else {
            return this.method6747(arg0, arg1);
        }
    }

    public int compare(Object arg0, Object arg1) {
        return this.method2656((class395) arg0, (class395) arg1);
    }
}
