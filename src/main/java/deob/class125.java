package deob;

@ObfuscatedName("du")
public abstract class class125 {

    @ObfuscatedName("du.v")
    public static boolean field2026 = false;

    @ObfuscatedName("ab.d([BZI)Ljava/lang/Object;")
    public static Object method753(byte[] arg0, boolean arg1) {
        if (arg0 == null) {
            return null;
        }
        if (arg0.length > 136 && !field2026) {
            try {
                class118 var2 = new class118();
                var2.method2326(arg0);
                return var2;
            } catch (Throwable var4) {
                field2026 = true;
            }
        }
        return arg1 ? method1014(arg0) : arg0;
    }

    @ObfuscatedName("dv.c(Ljava/lang/Object;ZI)[B")
    public static byte[] method2595(Object arg0, boolean arg1) {
        if (arg0 == null) {
            return null;
        } else if (arg0 instanceof byte[]) {
            byte[] var2 = (byte[]) ((byte[]) arg0);
            return arg1 ? method1014(var2) : var2;
        } else if (arg0 instanceof class125) {
            class125 var3 = (class125) arg0;
            return var3.method2322();
        } else {
            throw new IllegalArgumentException();
        }
    }

    @ObfuscatedName("ag.y([BI)[B")
    public static byte[] method1014(byte[] arg0) {
        int var1 = arg0.length;
        byte[] var2 = new byte[var1];
        System.arraycopy(arg0, 0, var2, 0, var1);
        return var2;
    }

    @ObfuscatedName("du.i(B)[B")
    public abstract byte[] method2322();

    @ObfuscatedName("du.v([BI)V")
    public abstract void method2326(byte[] arg0);
}
