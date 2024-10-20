package deob;

@ObfuscatedName("du")
public abstract class class125 {

    @ObfuscatedName("du.m")
    public static boolean field2024 = false;

    @ObfuscatedName("ag.t([BZI)Ljava/lang/Object;")
    public static Object method924(byte[] arg0, boolean arg1) {
        if (arg0 == null) {
            return null;
        }
        if (arg0.length > 136 && !field2024) {
            try {
                class118 var2 = new class118();
                var2.method2349(arg0);
                return var2;
            } catch (Throwable var4) {
                field2024 = true;
            }
        }
        return arg1 ? method2839(arg0) : arg0;
    }

    @ObfuscatedName("h.k(Ljava/lang/Object;ZI)[B")
    public static byte[] method115(Object arg0, boolean arg1) {
        if (arg0 == null) {
            return null;
        } else if (arg0 instanceof byte[]) {
            byte[] var2 = (byte[]) ((byte[]) arg0);
            return arg1 ? method2839(var2) : var2;
        } else if (arg0 instanceof class125) {
            class125 var3 = (class125) arg0;
            return var3.method2354();
        } else {
            throw new IllegalArgumentException();
        }
    }

    @ObfuscatedName("ey.s([BI)[B")
    public static byte[] method2839(byte[] arg0) {
        int var1 = arg0.length;
        byte[] var2 = new byte[var1];
        System.arraycopy(arg0, 0, var2, 0, var1);
        return var2;
    }

    @ObfuscatedName("du.j(I)[B")
    public abstract byte[] method2354();

    @ObfuscatedName("du.m([BI)V")
    public abstract void method2349(byte[] arg0);
}
