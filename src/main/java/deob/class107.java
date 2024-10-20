package deob;

@ObfuscatedName("dz")
public class class107 extends class372 {

    @ObfuscatedName("dz.c")
    public final boolean field1391;

    public class107(boolean arg0) {
        this.field1391 = arg0;
    }

    @ObfuscatedName("dz.c(Lnm;Lnm;B)I")
    public int method2462(class375 arg0, class375 arg1) {
        if (arg0.field4325 == 0) {
            if (arg1.field4325 != 0) {
                return this.field1391 ? 1 : -1;
            }
        } else if (arg1.field4325 == 0) {
            return this.field1391 ? -1 : 1;
        }
        return this.method6090(arg0, arg1);
    }

    public int compare(Object arg0, Object arg1) {
        return this.method2462((class375) arg0, (class375) arg1);
    }
}
