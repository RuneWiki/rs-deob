package deob;

@ObfuscatedName("dy")
public abstract class class114 {

    @ObfuscatedName("dy.j")
    public static boolean field1875 = false;

    @ObfuscatedName("aj.b([BZB)Ljava/lang/Object;")
    public static Object method755(byte[] arg0, boolean arg1) {
        if (arg0 == null) {
            return null;
        }
        if (arg0.length > 136 && !field1875) {
            try {
                class107 var2 = new class107();
                var2.method2112(arg0);
                return var2;
            } catch (Throwable var4) {
                field1875 = true;
            }
        }
        return arg1 ? method15(arg0) : arg0;
    }

    @ObfuscatedName("cq.k(Ljava/lang/Object;ZI)[B")
    public static byte[] method1897(Object arg0, boolean arg1) {
        if (arg0 == null) {
            return null;
        } else if (arg0 instanceof byte[]) {
            byte[] var2 = (byte[]) ((byte[]) arg0);
            return arg1 ? method15(var2) : var2;
        } else if (arg0 instanceof class114) {
            class114 var3 = (class114) arg0;
            return var3.method2113();
        } else {
            throw new IllegalArgumentException();
        }
    }

    @ObfuscatedName("y.g([BI)[B")
    public static byte[] method15(byte[] arg0) {
        int var1 = arg0.length;
        byte[] var2 = new byte[var1];
        System.arraycopy(arg0, 0, var2, 0, var1);
        return var2;
    }

    @ObfuscatedName("dy.j([BI)V")
    public abstract void method2112(byte[] arg0);

    @ObfuscatedName("dy.c(I)[B")
    public abstract byte[] method2113();
}
