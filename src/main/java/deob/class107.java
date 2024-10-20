package deob;

@ObfuscatedName("ds")
public class class107 extends class338 {

    @ObfuscatedName("ds.n")
    public final boolean field1332;

    public class107(boolean arg0) {
        this.field1332 = arg0;
    }

    @ObfuscatedName("ds.n(Lmm;Lmm;I)I")
    public int method2306(class341 arg0, class341 arg1) {
        if (client.field654 == arg0.field3965 && client.field654 == arg1.field3965) {
            return this.field1332 ? arg0.method5455().method6784(arg1.method5455()) : arg1.method5455().method6784(arg0.method5455());
        } else {
            return this.method5476(arg0, arg1);
        }
    }

    public int compare(Object arg0, Object arg1) {
        return this.method2306((class341) arg0, (class341) arg1);
    }
}
