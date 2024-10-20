package deob;

@ObfuscatedName("eq")
public class class127 extends class475 {

    @ObfuscatedName("eq.ac")
    public final boolean field1531;

    public class127(boolean arg0) {
        this.field1531 = arg0;
    }

    @ObfuscatedName("eq.ac(Lsq;Lsq;I)I")
    public int method3049(class478 arg0, class478 arg1) {
        if (client.field516 == arg0.field4998 && client.field516 == arg1.field4998) {
            return this.field1531 ? arg0.method8064().method9625(arg1.method8064()) : arg1.method8064().method9625(arg0.method8064());
        } else {
            return this.method8083(arg0, arg1);
        }
    }

    public int compare(Object arg0, Object arg1) {
        return this.method3049((class478) arg0, (class478) arg1);
    }
}
