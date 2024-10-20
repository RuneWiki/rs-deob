package deob;

@ObfuscatedName("dr")
public abstract class class117 {

    @ObfuscatedName("dr.g")
    public static boolean field1940 = false;

    @ObfuscatedName("bw.f([BZI)Ljava/lang/Object;")
    public static Object method1416(byte[] arg0, boolean arg1) {
        if (arg0 == null) {
            return null;
        }
        if (arg0.length > 136 && !field1940) {
            try {
                class110 var2 = new class110();
                var2.method2198(arg0);
                return var2;
            } catch (Throwable var7) {
                field1940 = true;
            }
        }
        if (arg1) {
            int var4 = arg0.length;
            byte[] var5 = new byte[var4];
            System.arraycopy(arg0, 0, var5, 0, var4);
            return var5;
        } else {
            return arg0;
        }
    }

    @ObfuscatedName("u.b(Ljava/lang/Object;ZI)[B")
    public static byte[] method529(Object arg0, boolean arg1) {
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
        } else if (arg0 instanceof class117) {
            class117 var6 = (class117) arg0;
            return var6.method2194();
        } else {
            throw new IllegalArgumentException();
        }
    }

    @ObfuscatedName("dr.n(I)[B")
    public abstract byte[] method2194();

    @ObfuscatedName("dr.g([BB)V")
    public abstract void method2198(byte[] arg0);
}
