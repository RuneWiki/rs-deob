package deob;

@ObfuscatedName("es")
public class class123 extends class450 {

    @ObfuscatedName("es.am")
    public final boolean field1466;

    public class123(boolean arg0) {
        this.field1466 = arg0;
    }

    @ObfuscatedName("es.am(Lrj;Lrj;I)I")
    public int method2870(class453 arg0, class453 arg1) {
        if (arg0.field4742 == arg1.field4742) {
            return this.method7558(arg0, arg1);
        } else if (this.field1466) {
            return arg0.field4742 - arg1.field4742;
        } else {
            return arg1.field4742 - arg0.field4742;
        }
    }

    public int compare(Object arg0, Object arg1) {
        return this.method2870((class453) arg0, (class453) arg1);
    }
}
