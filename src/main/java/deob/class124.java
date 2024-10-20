package deob;

@ObfuscatedName("ea")
public class class124 extends class449 {

    @ObfuscatedName("ea.ac")
    public final boolean field1479;

    public class124(boolean arg0) {
        this.field1479 = arg0;
    }

    @ObfuscatedName("ea.ac(Lri;Lri;B)I")
    public int method2785(class452 arg0, class452 arg1) {
        if (client.field519 == arg0.field4712 && client.field519 == arg1.field4712) {
            return this.field1479 ? arg0.field4711 - arg1.field4711 : arg1.field4711 - arg0.field4711;
        } else {
            return this.method7354(arg0, arg1);
        }
    }

    public int compare(Object arg0, Object arg1) {
        return this.method2785((class452) arg0, (class452) arg1);
    }
}
