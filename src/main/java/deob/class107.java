package deob;

@ObfuscatedName("dw")
public class class107 extends class373 {

    @ObfuscatedName("dw.s")
    public final boolean field1378;

    public class107(boolean arg0) {
        this.field1378 = arg0;
    }

    @ObfuscatedName("dw.s(Lnt;Lnt;I)I")
    public int method2430(class376 arg0, class376 arg1) {
        if (arg0.field4328 == 0) {
            if (arg1.field4328 != 0) {
                return this.field1378 ? 1 : -1;
            }
        } else if (arg1.field4328 == 0) {
            return this.field1378 ? -1 : 1;
        }
        return this.method6015(arg0, arg1);
    }

    public int compare(Object arg0, Object arg1) {
        return this.method2430((class376) arg0, (class376) arg1);
    }
}
