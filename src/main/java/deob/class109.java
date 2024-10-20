package deob;

@ObfuscatedName("db")
public class class109 extends class338 {

    @ObfuscatedName("db.n")
    public final boolean field1342;

    public class109(boolean arg0) {
        this.field1342 = arg0;
    }

    @ObfuscatedName("db.n(Lmm;Lmm;I)I")
    public int method2323(class341 arg0, class341 arg1) {
        if (arg0.field3962 == arg1.field3962) {
            return this.method5476(arg0, arg1);
        } else if (this.field1342) {
            return arg0.field3962 - arg1.field3962;
        } else {
            return arg1.field3962 - arg0.field3962;
        }
    }

    public int compare(Object arg0, Object arg1) {
        return this.method2323((class341) arg0, (class341) arg1);
    }
}
