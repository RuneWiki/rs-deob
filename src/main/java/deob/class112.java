package deob;

@ObfuscatedName("dg")
public abstract class class112 {

    @ObfuscatedName("dg.c")
    public static boolean field1879 = false;

    @ObfuscatedName("ad.u([BZI)Ljava/lang/Object;")
    public static Object method1001(byte[] arg0, boolean arg1) {
        if (arg0 == null) {
            return null;
        }
        if (arg0.length > 136 && !field1879) {
            try {
                class106 var2 = new class106();
                var2.method2131(arg0);
                return var2;
            } catch (Throwable var4) {
                field1879 = true;
            }
        }
        return arg1 ? Statics.method89(arg0) : arg0;
    }

    @ObfuscatedName("dg.i(I)[B")
    public abstract byte[] method2130();

    @ObfuscatedName("dg.c([BI)V")
    public abstract void method2131(byte[] arg0);
}
