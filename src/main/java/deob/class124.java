package deob;

@ObfuscatedName("ex")
public class class124 extends class435 {

    @ObfuscatedName("ex.aw")
    public final boolean field1480;

    public class124(boolean arg0) {
        this.field1480 = arg0;
    }

    @ObfuscatedName("ex.aw(Lqa;Lqa;B)I")
    public int method2787(class438 arg0, class438 arg1) {
        if (arg0.field4669 == 0 || arg1.field4669 == 0) {
            return this.method7250(arg0, arg1);
        } else if (this.field1480) {
            return arg0.method7233().method8880(arg1.method7233());
        } else {
            return arg1.method7233().method8880(arg0.method7233());
        }
    }

    public int compare(Object arg0, Object arg1) {
        return this.method2787((class438) arg0, (class438) arg1);
    }
}
