package deob;

@ObfuscatedName("eg")
public class class126 extends class471 {

    @ObfuscatedName("eg.ak")
    public final boolean field1522;

    public class126(boolean arg0) {
        this.field1522 = arg0;
    }

    @ObfuscatedName("eg.ak(Lso;Lso;I)I")
    public int method2867(class474 arg0, class474 arg1) {
        if (arg0.field4934 == arg1.field4934) {
            return this.method7897(arg0, arg1);
        } else if (this.field1522) {
            return arg0.field4934 - arg1.field4934;
        } else {
            return arg1.field4934 - arg0.field4934;
        }
    }

    public int compare(Object arg0, Object arg1) {
        return this.method2867((class474) arg0, (class474) arg1);
    }
}
