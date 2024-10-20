package deob;

@ObfuscatedName("ed")
public class class118 extends class422 {

    @ObfuscatedName("ed.at")
    public final boolean field1428;

    public class118(boolean arg0) {
        this.field1428 = arg0;
    }

    @ObfuscatedName("ed.at(Lqg;Lqg;I)I")
    public int method2719(class425 arg0, class425 arg1) {
        if (arg0.field4612 == 0) {
            if (arg1.field4612 != 0) {
                return this.field1428 ? 1 : -1;
            }
        } else if (arg1.field4612 == 0) {
            return this.field1428 ? -1 : 1;
        }
        return this.method7169(arg0, arg1);
    }

    public int compare(Object arg0, Object arg1) {
        return this.method2719((class425) arg0, (class425) arg1);
    }
}
