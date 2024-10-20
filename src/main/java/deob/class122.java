package deob;

@ObfuscatedName("ec")
public class class122 extends class471 {

    @ObfuscatedName("ec.ak")
    public final boolean field1512;

    public class122(boolean arg0) {
        this.field1512 = arg0;
    }

    @ObfuscatedName("ec.ak(Lso;Lso;B)I")
    public int method2836(class474 arg0, class474 arg1) {
        if (arg0.field4932 == 0) {
            if (arg1.field4932 != 0) {
                return this.field1512 ? 1 : -1;
            }
        } else if (arg1.field4932 == 0) {
            return this.field1512 ? -1 : 1;
        }
        return this.method7897(arg0, arg1);
    }

    public int compare(Object arg0, Object arg1) {
        return this.method2836((class474) arg0, (class474) arg1);
    }
}
