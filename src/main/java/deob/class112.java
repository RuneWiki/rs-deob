package deob;

@ObfuscatedName("dj")
public abstract class class112 {

    @ObfuscatedName("dj.y")
    public static boolean field1881 = false;

    @ObfuscatedName("ax.j([BZI)Ljava/lang/Object;")
    public static Object method1024(byte[] arg0, boolean arg1) {
        if (arg0 == null) {
            return null;
        }
        if (arg0.length > 136 && !field1881) {
            try {
                class106 var2 = new class106();
                var2.method2114(arg0);
                return var2;
            } catch (Throwable var4) {
                field1881 = true;
            }
        }
        return arg1 ? method2814(arg0) : arg0;
    }

    @ObfuscatedName("ei.d([BI)[B")
    public static byte[] method2814(byte[] arg0) {
        int var1 = arg0.length;
        byte[] var2 = new byte[var1];
        System.arraycopy(arg0, 0, var2, 0, var1);
        return var2;
    }

    @ObfuscatedName("dj.k(I)[B")
    public abstract byte[] method2115();

    @ObfuscatedName("dj.y([BS)V")
    public abstract void method2114(byte[] arg0);
}
