package deob;

@ObfuscatedName("es")
public class class119 extends class434 {

    @ObfuscatedName("es.au")
    public final boolean field1475;

    public class119(boolean arg0) {
        this.field1475 = arg0;
    }

    @ObfuscatedName("es.au(Lqb;Lqb;B)I")
    public int method2759(class437 arg0, class437 arg1) {
        if (arg0.field4671 == 0) {
            if (arg1.field4671 != 0) {
                return this.field1475 ? 1 : -1;
            }
        } else if (arg1.field4671 == 0) {
            return this.field1475 ? -1 : 1;
        }
        return this.method7262(arg0, arg1);
    }

    public int compare(Object arg0, Object arg1) {
        return this.method2759((class437) arg0, (class437) arg1);
    }
}
