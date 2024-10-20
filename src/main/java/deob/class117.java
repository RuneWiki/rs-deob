package deob;

@ObfuscatedName("dd")
public abstract class class117 {

    @ObfuscatedName("dd.k")
    public static boolean field1940 = false;

    @ObfuscatedName("cd.v([BZI)Ljava/lang/Object;")
    public static Object method1800(byte[] arg0, boolean arg1) {
        if (arg0 == null) {
            return null;
        }
        if (arg0.length > 136 && !field1940) {
            try {
                class110 var2 = new class110();
                var2.method2139(arg0);
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

    @ObfuscatedName("z.b(Ljava/lang/Object;ZB)[B")
    public static byte[] method79(Object arg0, boolean arg1) {
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
            return var6.method2136();
        } else {
            throw new IllegalArgumentException();
        }
    }

    @ObfuscatedName("dd.y(S)[B")
    public abstract byte[] method2136();

    @ObfuscatedName("dd.k([BB)V")
    public abstract void method2139(byte[] arg0);
}
