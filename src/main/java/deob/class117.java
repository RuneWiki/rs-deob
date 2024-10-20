package deob;

@ObfuscatedName("dv")
public abstract class class117 {

    @ObfuscatedName("dv.w")
    public static boolean field1929 = false;

    @ObfuscatedName("aw.c([BZI)Ljava/lang/Object;")
    public static Object method640(byte[] arg0, boolean arg1) {
        if (arg0 == null) {
            return null;
        }
        if (arg0.length > 136 && !field1929) {
            try {
                class110 var2 = new class110();
                var2.method2134(arg0);
                return var2;
            } catch (Throwable var4) {
                field1929 = true;
            }
        }
        return arg1 ? method764(arg0) : arg0;
    }

    @ObfuscatedName("g.f(Ljava/lang/Object;ZI)[B")
    public static byte[] method160(Object arg0, boolean arg1) {
        if (arg0 == null) {
            return null;
        } else if (arg0 instanceof byte[]) {
            byte[] var2 = (byte[]) ((byte[]) arg0);
            return arg1 ? method764(var2) : var2;
        } else if (arg0 instanceof class117) {
            class117 var3 = (class117) arg0;
            return var3.method2135();
        } else {
            throw new IllegalArgumentException();
        }
    }

    @ObfuscatedName("ac.s([BI)[B")
    public static byte[] method764(byte[] arg0) {
        int var1 = arg0.length;
        byte[] var2 = new byte[var1];
        System.arraycopy(arg0, 0, var2, 0, var1);
        return var2;
    }

    @ObfuscatedName("dv.n(I)[B")
    public abstract byte[] method2135();

    @ObfuscatedName("dv.w([BB)V")
    public abstract void method2134(byte[] arg0);
}
