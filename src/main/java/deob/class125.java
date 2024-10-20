package deob;

@ObfuscatedName("dl")
public abstract class class125 {

    @ObfuscatedName("dl.s")
    public static boolean field2046 = false;

    @ObfuscatedName("aq.i([BZI)Ljava/lang/Object;")
    public static Object method739(byte[] arg0, boolean arg1) {
        if (arg0 == null) {
            return null;
        }
        if (arg0.length > 136 && !field2046) {
            try {
                class118 var2 = new class118();
                var2.method2341(arg0);
                return var2;
            } catch (Throwable var7) {
                field2046 = true;
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

    @ObfuscatedName("av.w(Ljava/lang/Object;ZI)[B")
    public static byte[] method832(Object arg0, boolean arg1) {
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
        } else if (arg0 instanceof class125) {
            class125 var6 = (class125) arg0;
            return var6.method2339();
        } else {
            throw new IllegalArgumentException();
        }
    }

    @ObfuscatedName("dl.f(B)[B")
    public abstract byte[] method2339();

    @ObfuscatedName("dl.s([BI)V")
    public abstract void method2341(byte[] arg0);
}
