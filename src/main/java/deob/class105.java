package deob;

@ObfuscatedName("dm")
public class class105 extends class372 {

    @ObfuscatedName("dm.c")
    public final boolean field1381;

    public class105(boolean arg0) {
        this.field1381 = arg0;
    }

    @ObfuscatedName("dm.c(Lnm;Lnm;I)I")
    public int method2442(class375 arg0, class375 arg1) {
        if (client.field697 == arg0.field4325) {
            if (client.field697 != arg1.field4325) {
                return this.field1381 ? -1 : 1;
            }
        } else if (client.field697 == arg1.field4325) {
            return this.field1381 ? 1 : -1;
        }
        return this.method6090(arg0, arg1);
    }

    public int compare(Object arg0, Object arg1) {
        return this.method2442((class375) arg0, (class375) arg1);
    }
}
