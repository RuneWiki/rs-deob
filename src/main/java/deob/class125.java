package deob;

@ObfuscatedName("ds")
public abstract class class125 {

    @ObfuscatedName("ds.d")
    public static boolean field2026 = false;

    @ObfuscatedName("bk.i([BZI)Ljava/lang/Object;")
    public static Object method1463(byte[] arg0, boolean arg1) {
        if (arg0 == null) {
            return null;
        }
        if (arg0.length > 136 && !field2026) {
            try {
                class118 var2 = new class118();
                var2.method2317(arg0);
                return var2;
            } catch (Throwable var4) {
                field2026 = true;
            }
        }
        return arg1 ? method582(arg0) : arg0;
    }

    @ObfuscatedName("al.m(Ljava/lang/Object;ZI)[B")
    public static byte[] method696(Object arg0, boolean arg1) {
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
        } else if (arg0 instanceof class125) {
            class125 var6 = (class125) arg0;
            return var6.method2316();
        } else {
            throw new IllegalArgumentException();
        }
    }

    @ObfuscatedName("l.p([BI)[B")
    public static byte[] method582(byte[] arg0) {
        int var1 = arg0.length;
        byte[] var2 = new byte[var1];
        System.arraycopy(arg0, 0, var2, 0, var1);
        return var2;
    }

    @ObfuscatedName("ds.n(I)[B")
    public abstract byte[] method2316();

    @ObfuscatedName("ds.d([BI)V")
    public abstract void method2317(byte[] arg0);
}
