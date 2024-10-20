package deob;

@ObfuscatedName("ds")
public abstract class class119 {

    @ObfuscatedName("ds.b")
    public static boolean field2011 = false;

    @ObfuscatedName("dk.b([BZB)Ljava/lang/Object;")
    public static Object method2149(byte[] arg0, boolean arg1) {
        if (arg0 == null) {
            return null;
        }
        if (arg0.length > 136 && !field2011) {
            try {
                class125 var2 = new class125();
                var2.method2312(arg0);
                return var2;
            } catch (Throwable var7) {
                field2011 = true;
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

    @ObfuscatedName("at.c(Ljava/lang/Object;ZI)[B")
    public static byte[] method670(Object arg0, boolean arg1) {
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
        } else if (arg0 instanceof class119) {
            class119 var6 = (class119) arg0;
            return var6.method2311();
        } else {
            throw new IllegalArgumentException();
        }
    }

    @ObfuscatedName("ds.j(I)[B")
    public abstract byte[] method2311();

    @ObfuscatedName("ds.i([BI)V")
    public abstract void method2312(byte[] arg0);
}
