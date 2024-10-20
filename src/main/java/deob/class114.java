package deob;

@ObfuscatedName("dw")
public abstract class class114 {

    @ObfuscatedName("dw.v")
    public static boolean field1888 = false;

    @ObfuscatedName("v.w([BZB)Ljava/lang/Object;")
    public static Object method9(byte[] arg0, boolean arg1) {
        if (arg0 == null) {
            return null;
        }
        if (arg0.length > 136 && !field1888) {
            try {
                class107 var2 = new class107();
                var2.method2099(arg0);
                return var2;
            } catch (Throwable var7) {
                field1888 = true;
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

    @ObfuscatedName("t.j(Ljava/lang/Object;ZI)[B")
    public static byte[] method443(Object arg0, boolean arg1) {
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
        } else if (arg0 instanceof class114) {
            class114 var6 = (class114) arg0;
            return var6.method2098();
        } else {
            throw new IllegalArgumentException();
        }
    }

    @ObfuscatedName("dw.v([BI)V")
    public abstract void method2099(byte[] arg0);

    @ObfuscatedName("dw.e(B)[B")
    public abstract byte[] method2098();
}
