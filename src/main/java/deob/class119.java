package deob;

@ObfuscatedName("et")
public class class119 extends class449 {

    @ObfuscatedName("et.ac")
    public final boolean field1463;

    public class119(boolean arg0) {
        this.field1463 = arg0;
    }

    @ObfuscatedName("et.ac(Lri;Lri;B)I")
    public int method2750(class452 arg0, class452 arg1) {
        if (client.field519 == arg0.field4712) {
            if (client.field519 != arg1.field4712) {
                return this.field1463 ? -1 : 1;
            }
        } else if (client.field519 == arg1.field4712) {
            return this.field1463 ? 1 : -1;
        }
        return this.method7354(arg0, arg1);
    }

    public int compare(Object arg0, Object arg1) {
        return this.method2750((class452) arg0, (class452) arg1);
    }
}
