package deob;

@ObfuscatedName("dn")
public abstract class class112 {

    @ObfuscatedName("dn.u")
    public static boolean field1886 = false;

    @ObfuscatedName("h.g([BZI)Ljava/lang/Object;")
    public static Object method471(byte[] arg0, boolean arg1) {
        if (arg0 == null) {
            return null;
        }
        if (arg0.length > 136 && !field1886) {
            try {
                class106 var2 = new class106();
                var2.method2090(arg0);
                return var2;
            } catch (Throwable var4) {
                field1886 = true;
            }
        }
        return arg1 ? method455(arg0) : arg0;
    }

    @ObfuscatedName("q.a(Ljava/lang/Object;ZB)[B")
    public static byte[] method475(Object arg0, boolean arg1) {
        if (arg0 == null) {
            return null;
        } else if (arg0 instanceof byte[]) {
            byte[] var2 = (byte[]) ((byte[]) arg0);
            return arg1 ? method455(var2) : var2;
        } else if (arg0 instanceof class112) {
            class112 var3 = (class112) arg0;
            return var3.method2088();
        } else {
            throw new IllegalArgumentException();
        }
    }

    @ObfuscatedName("b.x([BI)[B")
    public static byte[] method455(byte[] arg0) {
        int var1 = arg0.length;
        byte[] var2 = new byte[var1];
        System.arraycopy(arg0, 0, var2, 0, var1);
        return var2;
    }

    @ObfuscatedName("dn.y(I)[B")
    public abstract byte[] method2088();

    @ObfuscatedName("dn.u([BB)V")
    public abstract void method2090(byte[] arg0);
}
