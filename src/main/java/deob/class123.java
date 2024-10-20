package deob;

@ObfuscatedName("es")
public class class123 extends class422 {

    @ObfuscatedName("es.at")
    public final boolean field1454;

    public class123(boolean arg0) {
        this.field1454 = arg0;
    }

    @ObfuscatedName("es.at(Lqg;Lqg;I)I")
    public int method2750(class425 arg0, class425 arg1) {
        if (arg0.field4612 == 0 || arg1.field4612 == 0) {
            return this.method7169(arg0, arg1);
        } else if (this.field1454) {
            return arg0.method7150().method8760(arg1.method7150());
        } else {
            return arg1.method7150().method8760(arg0.method7150());
        }
    }

    public int compare(Object arg0, Object arg1) {
        return this.method2750((class425) arg0, (class425) arg1);
    }
}
