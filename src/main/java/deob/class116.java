package deob;

@ObfuscatedName("du")
public abstract class class116 {

    @ObfuscatedName("du.t")
    public static boolean field1897 = false;

    @ObfuscatedName("ap.o([BZI)Ljava/lang/Object;")
    public static Object method689(byte[] arg0, boolean arg1) {
        if (arg0 == null) {
            return null;
        }
        if (arg0.length > 136 && !field1897) {
            try {
                class109 var2 = new class109();
                var2.method2138(arg0);
                return var2;
            } catch (Throwable var7) {
                field1897 = true;
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

    @ObfuscatedName("dw.c(Ljava/lang/Object;ZI)[B")
    public static byte[] method2103(Object arg0, boolean arg1) {
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
        } else if (arg0 instanceof class116) {
            class116 var6 = (class116) arg0;
            return var6.method2137();
        } else {
            throw new IllegalArgumentException();
        }
    }

    @ObfuscatedName("du.v(I)[B")
    public abstract byte[] method2137();

    @ObfuscatedName("du.t([BI)V")
    public abstract void method2138(byte[] arg0);
}
