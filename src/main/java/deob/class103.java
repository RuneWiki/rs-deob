package deob;

@ObfuscatedName("cz")
public class class103 extends class338 {

    @ObfuscatedName("cz.n")
    public final boolean field1314;

    public class103(boolean arg0) {
        this.field1314 = arg0;
    }

    @ObfuscatedName("cz.n(Lmm;Lmm;B)I")
    public int method2265(class341 arg0, class341 arg1) {
        if (client.field654 == arg0.field3965) {
            if (client.field654 != arg1.field3965) {
                return this.field1314 ? -1 : 1;
            }
        } else if (client.field654 == arg1.field3965) {
            return this.field1314 ? 1 : -1;
        }
        return this.method5476(arg0, arg1);
    }

    public int compare(Object arg0, Object arg1) {
        return this.method2265((class341) arg0, (class341) arg1);
    }
}
