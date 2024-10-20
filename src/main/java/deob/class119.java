package deob;

@ObfuscatedName("eh")
public class class119 extends class450 {

    @ObfuscatedName("eh.am")
    public final boolean field1453;

    public class119(boolean arg0) {
        this.field1453 = arg0;
    }

    @ObfuscatedName("eh.am(Lrj;Lrj;B)I")
    public int method2835(class453 arg0, class453 arg1) {
        if (arg0.field4743 == 0) {
            if (arg1.field4743 != 0) {
                return this.field1453 ? 1 : -1;
            }
        } else if (arg1.field4743 == 0) {
            return this.field1453 ? -1 : 1;
        }
        return this.method7558(arg0, arg1);
    }

    public int compare(Object arg0, Object arg1) {
        return this.method2835((class453) arg0, (class453) arg1);
    }
}
