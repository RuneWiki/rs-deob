package deob;

@ObfuscatedName("dp")
public abstract class class126 {

    @ObfuscatedName("dp.g")
    public static boolean field2027 = false;

    @ObfuscatedName("dn.r([BZI)Ljava/lang/Object;")
    public static Object method2259(byte[] arg0, boolean arg1) {
        if (arg0 == null) {
            return null;
        }
        if (arg0.length > 136 && !field2027) {
            try {
                class119 var2 = new class119();
                var2.method2322(arg0);
                return var2;
            } catch (Throwable var7) {
                field2027 = true;
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

    @ObfuscatedName("aj.c(Ljava/lang/Object;ZI)[B")
    public static byte[] method656(Object arg0, boolean arg1) {
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
        } else if (arg0 instanceof class126) {
            class126 var6 = (class126) arg0;
            return var6.method2323();
        } else {
            throw new IllegalArgumentException();
        }
    }

    @ObfuscatedName("dp.b(B)[B")
    public abstract byte[] method2323();

    @ObfuscatedName("dp.g([BI)V")
    public abstract void method2322(byte[] arg0);
}
