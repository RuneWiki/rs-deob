package deob;

@ObfuscatedName("el")
public class class116 extends class405 {

    @ObfuscatedName("el.aj")
    public final boolean field1422;

    public class116(boolean arg0) {
        this.field1422 = arg0;
    }

    @ObfuscatedName("el.aj(Lpt;Lpt;B)I")
    public int method2723(class408 arg0, class408 arg1) {
        if (arg0.field4533 == 0) {
            if (arg1.field4533 != 0) {
                return this.field1422 ? 1 : -1;
            }
        } else if (arg1.field4533 == 0) {
            return this.field1422 ? -1 : 1;
        }
        return this.method6939(arg0, arg1);
    }

    public int compare(Object arg0, Object arg1) {
        return this.method2723((class408) arg0, (class408) arg1);
    }
}
