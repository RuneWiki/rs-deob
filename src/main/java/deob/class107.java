package deob;

@ObfuscatedName("dd")
public class class107 extends class372 {

    @ObfuscatedName("dd.v")
    public final boolean field1354;

    public class107(boolean arg0) {
        this.field1354 = arg0;
    }

    @ObfuscatedName("dd.v(Lnf;Lnf;I)I")
    public int method2471(class375 arg0, class375 arg1) {
        if (arg0.field4269 == 0) {
            if (arg1.field4269 != 0) {
                return this.field1354 ? 1 : -1;
            }
        } else if (arg1.field4269 == 0) {
            return this.field1354 ? -1 : 1;
        }
        return this.method6118(arg0, arg1);
    }

    public int compare(Object arg0, Object arg1) {
        return this.method2471((class375) arg0, (class375) arg1);
    }
}
