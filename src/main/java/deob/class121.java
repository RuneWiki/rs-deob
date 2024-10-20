package deob;

@ObfuscatedName("ew")
public class class121 extends class471 {

    @ObfuscatedName("ew.ak")
    public final boolean field1505;

    public class121(boolean arg0) {
        this.field1505 = arg0;
    }

    @ObfuscatedName("ew.ak(Lso;Lso;I)I")
    public int method2835(class474 arg0, class474 arg1) {
        if (arg0.field4932 == 0 || arg1.field4932 == 0) {
            return this.method7897(arg0, arg1);
        } else if (this.field1505) {
            return arg0.field4933 - arg1.field4933;
        } else {
            return arg1.field4933 - arg0.field4933;
        }
    }

    public int compare(Object arg0, Object arg1) {
        return this.method2835((class474) arg0, (class474) arg1);
    }
}
