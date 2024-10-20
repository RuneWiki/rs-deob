package deob;

@ObfuscatedName("ed")
public class class125 extends class453 {

    @ObfuscatedName("ed.aq")
    public final boolean field1488;

    public class125(boolean arg0) {
        this.field1488 = arg0;
    }

    @ObfuscatedName("ed.aq(Lry;Lry;I)I")
    public int method2843(class456 arg0, class456 arg1) {
        if (arg0.field4770 == 0 || arg1.field4770 == 0) {
            return this.method7579(arg0, arg1);
        } else if (this.field1488) {
            return arg0.method7559().method9190(arg1.method7559());
        } else {
            return arg1.method7559().method9190(arg0.method7559());
        }
    }

    public int compare(Object arg0, Object arg1) {
        return this.method2843((class456) arg0, (class456) arg1);
    }
}
