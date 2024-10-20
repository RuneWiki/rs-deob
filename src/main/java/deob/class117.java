package deob;

@ObfuscatedName("ds")
public abstract class class117 {

    @ObfuscatedName("ds.k")
    public static boolean field1931 = false;

    @ObfuscatedName("ar.s([BZI)Ljava/lang/Object;")
    public static Object method630(byte[] arg0, boolean arg1) {
        if (arg0 == null) {
            return null;
        }
        if (arg0.length > 136 && !field1931) {
            try {
                class110 var2 = new class110();
                var2.method2154(arg0);
                return var2;
            } catch (Throwable var4) {
                field1931 = true;
            }
        }
        return arg1 ? method3164(arg0) : arg0;
    }

    @ObfuscatedName("dm.c(Ljava/lang/Object;ZI)[B")
    public static byte[] method2515(Object arg0, boolean arg1) {
        if (arg0 == null) {
            return null;
        } else if (arg0 instanceof byte[]) {
            byte[] var2 = (byte[]) ((byte[]) arg0);
            return arg1 ? method3164(var2) : var2;
        } else if (arg0 instanceof class117) {
            class117 var3 = (class117) arg0;
            return var3.method2158();
        } else {
            throw new IllegalArgumentException();
        }
    }

    @ObfuscatedName("fg.d([BB)[B")
    public static byte[] method3164(byte[] arg0) {
        int var1 = arg0.length;
        byte[] var2 = new byte[var1];
        System.arraycopy(arg0, 0, var2, 0, var1);
        return var2;
    }

    @ObfuscatedName("ds.k([BI)V")
    public abstract void method2154(byte[] arg0);

    @ObfuscatedName("ds.p(I)[B")
    public abstract byte[] method2158();
}
