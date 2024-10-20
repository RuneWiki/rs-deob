package deob;

@ObfuscatedName("ej")
public class class128 extends class475 {

    @ObfuscatedName("ej.ac")
    public final boolean field1538;

    public class128(boolean arg0) {
        this.field1538 = arg0;
    }

    @ObfuscatedName("ej.ac(Lsq;Lsq;B)I")
    public int method3056(class478 arg0, class478 arg1) {
        if (client.field516 == arg0.field4998 && client.field516 == arg1.field4998) {
            return this.field1538 ? arg0.field4997 - arg1.field4997 : arg1.field4997 - arg0.field4997;
        } else {
            return this.method8083(arg0, arg1);
        }
    }

    public int compare(Object arg0, Object arg1) {
        return this.method3056((class478) arg0, (class478) arg1);
    }
}
