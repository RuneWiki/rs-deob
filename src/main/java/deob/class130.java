package deob;

@ObfuscatedName("et")
public class class130 extends class475 {

    @ObfuscatedName("et.ac")
    public final boolean field1546;

    public class130(boolean arg0) {
        this.field1546 = arg0;
    }

    @ObfuscatedName("et.ac(Lsq;Lsq;I)I")
    public int method3070(class478 arg0, class478 arg1) {
        if (arg0.field4998 == 0 || arg1.field4998 == 0) {
            return this.method8083(arg0, arg1);
        } else if (this.field1546) {
            return arg0.method8064().method9625(arg1.method8064());
        } else {
            return arg1.method8064().method9625(arg0.method8064());
        }
    }

    public int compare(Object arg0, Object arg1) {
        return this.method3070((class478) arg0, (class478) arg1);
    }
}
