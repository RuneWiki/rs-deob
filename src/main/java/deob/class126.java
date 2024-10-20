package deob;

@ObfuscatedName("ee")
public class class126 extends class475 {

    @ObfuscatedName("ee.ac")
    public final boolean field1529;

    public class126(boolean arg0) {
        this.field1529 = arg0;
    }

    @ObfuscatedName("ee.ac(Lsq;Lsq;I)I")
    public int method3044(class478 arg0, class478 arg1) {
        if (arg0.field4998 == arg1.field4998) {
            return this.method8083(arg0, arg1);
        } else if (this.field1529) {
            return arg0.field4998 - arg1.field4998;
        } else {
            return arg1.field4998 - arg0.field4998;
        }
    }

    public int compare(Object arg0, Object arg1) {
        return this.method3044((class478) arg0, (class478) arg1);
    }
}
