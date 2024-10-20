package deob;

@ObfuscatedName("dz")
public abstract class class129 {

    @ObfuscatedName("dz.q")
    public static boolean field2098 = false;

    @ObfuscatedName("az.u([BZB)Ljava/lang/Object;")
    public static Object method967(byte[] arg0, boolean arg1) {
        if (arg0 == null) {
            return null;
        }
        if (arg0.length > 136 && !field2098) {
            try {
                class122 var2 = new class122();
                var2.method2407(arg0);
                return var2;
            } catch (Throwable var7) {
                field2098 = true;
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

    @ObfuscatedName("bi.h(Ljava/lang/Object;ZI)[B")
    public static byte[] method1234(Object arg0, boolean arg1) {
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
        } else if (arg0 instanceof class129) {
            class129 var6 = (class129) arg0;
            return var6.method2404();
        } else {
            throw new IllegalArgumentException();
        }
    }

    @ObfuscatedName("dz.k(I)[B")
    public abstract byte[] method2404();

    @ObfuscatedName("dz.q([BB)V")
    public abstract void method2407(byte[] arg0);
}
