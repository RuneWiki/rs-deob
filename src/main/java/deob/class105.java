package deob;

@ObfuscatedName("db")
public class class105 extends class339 {

    @ObfuscatedName("db.l")
    public final boolean field1333;

    public class105(boolean arg0) {
        this.field1333 = arg0;
    }

    @ObfuscatedName("db.l(Lmi;Lmi;I)I")
    public int method2317(class342 arg0, class342 arg1) {
        if (arg0.field3976 == 0) {
            if (arg1.field3976 != 0) {
                return this.field1333 ? 1 : -1;
            }
        } else if (arg1.field3976 == 0) {
            return this.field1333 ? -1 : 1;
        }
        return this.method5534(arg0, arg1);
    }

    public int compare(Object arg0, Object arg1) {
        return this.method2317((class342) arg0, (class342) arg1);
    }
}
