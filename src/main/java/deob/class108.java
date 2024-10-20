package deob;

@ObfuscatedName("df")
public class class108 extends class338 {

    @ObfuscatedName("df.n")
    public final boolean field1341;

    public class108(boolean arg0) {
        this.field1341 = arg0;
    }

    @ObfuscatedName("df.n(Lmm;Lmm;B)I")
    public int method2321(class341 arg0, class341 arg1) {
        if (client.field654 == arg0.field3965 && client.field654 == arg1.field3965) {
            return this.field1341 ? arg0.field3963 - arg1.field3963 : arg1.field3963 - arg0.field3963;
        } else {
            return this.method5476(arg0, arg1);
        }
    }

    public int compare(Object arg0, Object arg1) {
        return this.method2321((class341) arg0, (class341) arg1);
    }
}
