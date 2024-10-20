package deob;

@ObfuscatedName("dd")
public abstract class class112 {

    @ObfuscatedName("dd.z")
    public static boolean field1888 = false;

    @ObfuscatedName("dg.n([BZI)Ljava/lang/Object;")
    public static Object method2514(byte[] arg0, boolean arg1) {
        if (arg0 == null) {
            return null;
        }
        if (arg0.length > 136 && !field1888) {
            try {
                class106 var2 = new class106();
                var2.method2108(arg0);
                return var2;
            } catch (Throwable var4) {
                field1888 = true;
            }
        }
        return arg1 ? method548(arg0) : arg0;
    }

    @ObfuscatedName("h.a(Ljava/lang/Object;ZI)[B")
    public static byte[] method34(Object arg0, boolean arg1) {
        if (arg0 == null) {
            return null;
        } else if (arg0 instanceof byte[]) {
            byte[] var2 = (byte[]) ((byte[]) arg0);
            return arg1 ? method548(var2) : var2;
        } else if (arg0 instanceof class112) {
            class112 var3 = (class112) arg0;
            return var3.method2107();
        } else {
            throw new IllegalArgumentException();
        }
    }

    @ObfuscatedName("ai.q([BI)[B")
    public static byte[] method548(byte[] arg0) {
        int var1 = arg0.length;
        byte[] var2 = new byte[var1];
        System.arraycopy(arg0, 0, var2, 0, var1);
        return var2;
    }

    @ObfuscatedName("dd.j(I)[B")
    public abstract byte[] method2107();

    @ObfuscatedName("dd.z([BI)V")
    public abstract void method2108(byte[] arg0);
}
