package deob;

@ObfuscatedName("er")
public class class124 extends class475 {

    @ObfuscatedName("er.ac")
    public final boolean field1521;

    public class124(boolean arg0) {
        this.field1521 = arg0;
    }

    @ObfuscatedName("er.ac(Lsq;Lsq;I)I")
    public int method3027(class478 arg0, class478 arg1) {
        if (arg0.field4998 == 0 || arg1.field4998 == 0) {
            return this.method8083(arg0, arg1);
        } else if (this.field1521) {
            return arg0.field4997 - arg1.field4997;
        } else {
            return arg1.field4997 - arg0.field4997;
        }
    }

    public int compare(Object arg0, Object arg1) {
        return this.method3027((class478) arg0, (class478) arg1);
    }
}
