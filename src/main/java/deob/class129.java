package deob;

@ObfuscatedName("dy")
public abstract class class129 {

    @ObfuscatedName("dy.g")
    public static boolean field2091 = false;

    @ObfuscatedName("bc.k([BZI)Ljava/lang/Object;")
    public static Object method1106(byte[] arg0, boolean arg1) {
        if (arg0 == null) {
            return null;
        }
        if (arg0.length > 136 && !field2091) {
            try {
                class122 var2 = new class122();
                var2.method2470(arg0);
                return var2;
            } catch (Throwable var4) {
                field2091 = true;
            }
        }
        return arg1 ? method2418(arg0) : arg0;
    }

    @ObfuscatedName("au.u(Ljava/lang/Object;ZI)[B")
    public static byte[] method979(Object arg0, boolean arg1) {
        if (arg0 == null) {
            return null;
        } else if (arg0 instanceof byte[]) {
            byte[] var2 = (byte[]) ((byte[]) arg0);
            return arg1 ? method2418(var2) : var2;
        } else if (arg0 instanceof class129) {
            class129 var3 = (class129) arg0;
            return var3.method2469();
        } else {
            throw new IllegalArgumentException();
        }
    }

    @ObfuscatedName("dh.n([BI)[B")
    public static byte[] method2418(byte[] arg0) {
        int var1 = arg0.length;
        byte[] var2 = new byte[var1];
        System.arraycopy(arg0, 0, var2, 0, var1);
        return var2;
    }

    @ObfuscatedName("dy.l(I)[B")
    public abstract byte[] method2469();

    @ObfuscatedName("dy.g([BI)V")
    public abstract void method2470(byte[] arg0);
}
