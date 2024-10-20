package deob;

@ObfuscatedName("ed")
public class class125 extends class475 {

    @ObfuscatedName("ed.ac")
    public final boolean field1526;

    public class125(boolean arg0) {
        this.field1526 = arg0;
    }

    @ObfuscatedName("ed.ac(Lsq;Lsq;I)I")
    public int method3039(class478 arg0, class478 arg1) {
        if (arg0.field4998 == 0) {
            if (arg1.field4998 != 0) {
                return this.field1526 ? 1 : -1;
            }
        } else if (arg1.field4998 == 0) {
            return this.field1526 ? -1 : 1;
        }
        return this.method8083(arg0, arg1);
    }

    public int compare(Object arg0, Object arg1) {
        return this.method3039((class478) arg0, (class478) arg1);
    }
}
