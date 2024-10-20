package deob;

@ObfuscatedName("du")
public abstract class class129 {

    @ObfuscatedName("du.l")
    public static boolean field2093 = false;

    @ObfuscatedName("ax.u([BZB)Ljava/lang/Object;")
    public static Object method856(byte[] arg0, boolean arg1) {
        if (arg0 == null) {
            return null;
        }
        if (arg0.length > 136 && !field2093) {
            try {
                class122 var2 = new class122();
                var2.method2443(arg0);
                return var2;
            } catch (Throwable var7) {
                field2093 = true;
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

    @ObfuscatedName("z.o(Ljava/lang/Object;ZI)[B")
    public static byte[] method160(Object arg0, boolean arg1) {
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
            return var6.method2447();
        } else {
            throw new IllegalArgumentException();
        }
    }

    @ObfuscatedName("du.l([BI)V")
    public abstract void method2443(byte[] arg0);

    @ObfuscatedName("du.e(I)[B")
    public abstract byte[] method2447();
}
