package deob;

@ObfuscatedName("em")
public class class121 extends class405 {

    @ObfuscatedName("em.aj")
    public final boolean field1442;

    public class121(boolean arg0) {
        this.field1442 = arg0;
    }

    @ObfuscatedName("em.aj(Lpt;Lpt;I)I")
    public int method2754(class408 arg0, class408 arg1) {
        if (arg0.field4533 == 0 || arg1.field4533 == 0) {
            return this.method6939(arg0, arg1);
        } else if (this.field1442) {
            return arg0.method6921().method8502(arg1.method6921());
        } else {
            return arg1.method6921().method8502(arg0.method6921());
        }
    }

    public int compare(Object arg0, Object arg1) {
        return this.method2754((class408) arg0, (class408) arg1);
    }
}
