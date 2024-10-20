package deob;

@ObfuscatedName("dz")
public abstract class class114 {

    @ObfuscatedName("dz.v")
    public static boolean field1890 = false;

    @ObfuscatedName("br.j([BZI)Ljava/lang/Object;")
    public static Object method1357(byte[] arg0, boolean arg1) {
        if (arg0 == null) {
            return null;
        }
        if (arg0.length > 136 && !field1890) {
            try {
                class107 var2 = new class107();
                var2.method2111(arg0);
                return var2;
            } catch (Throwable var4) {
                field1890 = true;
            }
        }
        return arg1 ? method3168(arg0) : arg0;
    }

    @ObfuscatedName("co.i(Ljava/lang/Object;ZI)[B")
    public static byte[] method2074(Object arg0, boolean arg1) {
        if (arg0 == null) {
            return null;
        } else if (arg0 instanceof byte[]) {
            byte[] var2 = (byte[]) ((byte[]) arg0);
            return arg1 ? method3168(var2) : var2;
        } else if (arg0 instanceof class114) {
            class114 var3 = (class114) arg0;
            return var3.method2107();
        } else {
            throw new IllegalArgumentException();
        }
    }

    @ObfuscatedName("fa.u([BI)[B")
    public static byte[] method3168(byte[] arg0) {
        int var1 = arg0.length;
        byte[] var2 = new byte[var1];
        System.arraycopy(arg0, 0, var2, 0, var1);
        return var2;
    }

    @ObfuscatedName("dz.x(S)[B")
    public abstract byte[] method2107();

    @ObfuscatedName("dz.v([BI)V")
    public abstract void method2111(byte[] arg0);
}
