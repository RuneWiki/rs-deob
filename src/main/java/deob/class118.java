package deob;

@ObfuscatedName("ds")
public abstract class class118 {

    @ObfuscatedName("ds.u")
    public static boolean field1978 = false;

    @ObfuscatedName("cp.u([BZI)Ljava/lang/Object;")
    public static Object method1641(byte[] arg0, boolean arg1) {
        if (arg0 == null) {
            return null;
        }
        if (arg0.length > 136 && !field1978) {
            try {
                class124 var2 = new class124();
                var2.method2358(arg0);
                return var2;
            } catch (Throwable var7) {
                field1978 = true;
            }
        }
        if (arg1) {
            int var4 = arg0.length;
            byte[] var5 = new byte[var4];
            System.arraycopy(arg0, 0, var5, 0, var4);
            return var5;
        } else {
            return arg0;
        }
    }

    @ObfuscatedName("ds.m([BI)V")
    public abstract void method2358(byte[] arg0);

    @ObfuscatedName("ds.x(B)[B")
    public abstract byte[] method2360();
}
