package deob;

@ObfuscatedName("da")
public abstract class class119 {

    @ObfuscatedName("da.i")
    public static boolean field2008 = false;

    @ObfuscatedName("dj.i([BZI)Ljava/lang/Object;")
    public static Object method2350(byte[] arg0, boolean arg1) {
        if (arg0 == null) {
            return null;
        }
        if (arg0.length > 136 && !field2008) {
            try {
                class125 var2 = new class125();
                var2.method2372(arg0);
                return var2;
            } catch (Throwable var4) {
                field2008 = true;
            }
        }
        return arg1 ? method911(arg0) : arg0;
    }

    @ObfuscatedName("al.f([BI)[B")
    public static byte[] method911(byte[] arg0) {
        int var1 = arg0.length;
        byte[] var2 = new byte[var1];
        System.arraycopy(arg0, 0, var2, 0, var1);
        return var2;
    }

    @ObfuscatedName("da.t([BB)V")
    public abstract void method2372(byte[] arg0);

    @ObfuscatedName("da.e(B)[B")
    public abstract byte[] method2376();
}
