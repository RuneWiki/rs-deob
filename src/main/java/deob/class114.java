package deob;

@ObfuscatedName("dn")
public abstract class class114 {

    @ObfuscatedName("dn.k")
    public static boolean field1902 = false;

    @ObfuscatedName("aj.n([BZB)Ljava/lang/Object;")
    public static Object method564(byte[] arg0, boolean arg1) {
        if (arg0 == null) {
            return null;
        }
        if (arg0.length > 136 && !field1902) {
            try {
                class107 var2 = new class107();
                var2.method2139(arg0);
                return var2;
            } catch (Throwable var4) {
                field1902 = true;
            }
        }
        return arg1 ? method799(arg0) : arg0;
    }

    @ObfuscatedName("ah.x(Ljava/lang/Object;ZI)[B")
    public static byte[] method554(Object arg0, boolean arg1) {
        if (arg0 == null) {
            return null;
        } else if (arg0 instanceof byte[]) {
            byte[] var2 = (byte[]) ((byte[]) arg0);
            return arg1 ? method799(var2) : var2;
        } else if (arg0 instanceof class114) {
            class114 var3 = (class114) arg0;
            return var3.method2138();
        } else {
            throw new IllegalArgumentException();
        }
    }

    @ObfuscatedName("ap.g([BB)[B")
    public static byte[] method799(byte[] arg0) {
        int var1 = arg0.length;
        byte[] var2 = new byte[var1];
        System.arraycopy(arg0, 0, var2, 0, var1);
        return var2;
    }

    @ObfuscatedName("dn.k([BI)V")
    public abstract void method2139(byte[] arg0);

    @ObfuscatedName("dn.f(I)[B")
    public abstract byte[] method2138();
}
