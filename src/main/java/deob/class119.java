package deob;

@ObfuscatedName("dn")
public abstract class class119 {

    @ObfuscatedName("dn.a")
    public static boolean field1983 = false;

    @ObfuscatedName("dq.a([BZB)Ljava/lang/Object;")
    public static Object method2294(byte[] arg0, boolean arg1) {
        if (arg0 == null) {
            return null;
        }
        if (arg0.length > 136 && !field1983) {
            try {
                class125 var2 = new class125();
                var2.method2301(arg0);
                return var2;
            } catch (Throwable var7) {
                field1983 = true;
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

    @ObfuscatedName("g.r(Ljava/lang/Object;ZI)[B")
    public static byte[] method50(Object arg0, boolean arg1) {
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
            return var6.method2300();
        } else {
            throw new IllegalArgumentException();
        }
    }

    @ObfuscatedName("dn.u(I)[B")
    public abstract byte[] method2300();

    @ObfuscatedName("dn.t([BI)V")
    public abstract void method2301(byte[] arg0);
}
