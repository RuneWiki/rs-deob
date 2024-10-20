package deob;

@ObfuscatedName("eu")
public class class123 extends class471 {

    @ObfuscatedName("eu.ak")
    public final boolean field1513;

    public class123(boolean arg0) {
        this.field1513 = arg0;
    }

    @ObfuscatedName("eu.ak(Lso;Lso;I)I")
    public int method2843(class474 arg0, class474 arg1) {
        if (arg0.field4932 == arg1.field4932) {
            return this.method7897(arg0, arg1);
        } else if (this.field1513) {
            return arg0.field4932 - arg1.field4932;
        } else {
            return arg1.field4932 - arg0.field4932;
        }
    }

    public int compare(Object arg0, Object arg1) {
        return this.method2843((class474) arg0, (class474) arg1);
    }
}
