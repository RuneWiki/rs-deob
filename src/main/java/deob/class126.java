package deob;

@ObfuscatedName("dd")
public abstract class class126 {

    @ObfuscatedName("dd.w")
    public static boolean field2038 = false;

    @ObfuscatedName("ch.m([BZB)Ljava/lang/Object;")
    public static Object method2124(byte[] arg0, boolean arg1) {
        if (arg0 == null) {
            return null;
        }
        if (arg0.length > 136 && !field2038) {
            try {
                class119 var2 = new class119();
                var2.method2439(arg0);
                return var2;
            } catch (Throwable var7) {
                field2038 = true;
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

    @ObfuscatedName("au.e(Ljava/lang/Object;ZI)[B")
    public static byte[] method923(Object arg0, boolean arg1) {
        if (arg0 == null) {
            return null;
        } else if (arg0 instanceof byte[]) {
            byte[] var2 = (byte[]) ((byte[]) arg0);
            if (arg1) {
                int var3 = var2.length;
                byte[] var4 = new byte[var3];
                System.arraycopy(var2, 0, var4, 0, var3);
                return var4;
            } else {
                return var2;
            }
        } else if (arg0 instanceof class126) {
            class126 var6 = (class126) arg0;
            return var6.method2438();
        } else {
            throw new IllegalArgumentException();
        }
    }

    @ObfuscatedName("dd.a(I)[B")
    public abstract byte[] method2438();

    @ObfuscatedName("dd.w([BI)V")
    public abstract void method2439(byte[] arg0);
}
