package deob;

@ObfuscatedName("ee")
public class class123 extends class449 {

    @ObfuscatedName("ee.ac")
    public final boolean field1476;

    public class123(boolean arg0) {
        this.field1476 = arg0;
    }

    @ObfuscatedName("ee.ac(Lri;Lri;I)I")
    public int method2781(class452 arg0, class452 arg1) {
        if (client.field519 == arg0.field4712 && client.field519 == arg1.field4712) {
            return this.field1476 ? arg0.method7329().method8989(arg1.method7329()) : arg1.method7329().method8989(arg0.method7329());
        } else {
            return this.method7354(arg0, arg1);
        }
    }

    public int compare(Object arg0, Object arg1) {
        return this.method2781((class452) arg0, (class452) arg1);
    }
}
