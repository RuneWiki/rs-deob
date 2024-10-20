package deob;

@ObfuscatedName("df")
public abstract class class126 {

    @ObfuscatedName("df.u")
    public static boolean field2044 = false;

    @ObfuscatedName("ae.d([BZS)Ljava/lang/Object;")
    public static Object method995(byte[] arg0, boolean arg1) {
        if (arg0 == null) {
            return null;
        }
        if (arg0.length > 136 && !field2044) {
            try {
                class119 var2 = new class119();
                var2.method2365(arg0);
                return var2;
            } catch (Throwable var4) {
                field2044 = true;
            }
        }
        return arg1 ? method2187(arg0) : arg0;
    }

    @ObfuscatedName("am.n(Ljava/lang/Object;ZB)[B")
    public static byte[] method751(Object arg0, boolean arg1) {
        if (arg0 == null) {
            return null;
        } else if (arg0 instanceof byte[]) {
            byte[] var2 = (byte[]) ((byte[]) arg0);
            return arg1 ? method2187(var2) : var2;
        } else if (arg0 instanceof class126) {
            class126 var3 = (class126) arg0;
            return var3.method2364();
        } else {
            throw new IllegalArgumentException();
        }
    }

    @ObfuscatedName("dh.m([BB)[B")
    public static byte[] method2187(byte[] arg0) {
        int var1 = arg0.length;
        byte[] var2 = new byte[var1];
        System.arraycopy(arg0, 0, var2, 0, var1);
        return var2;
    }

    @ObfuscatedName("df.u([BB)V")
    public abstract void method2365(byte[] arg0);

    @ObfuscatedName("df.f(I)[B")
    public abstract byte[] method2364();
}
