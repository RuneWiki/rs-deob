package deob;

@ObfuscatedName("dn")
public abstract class class119 {

    @ObfuscatedName("dn.y")
    public static boolean field1995 = false;

    @ObfuscatedName("c.y([BZI)Ljava/lang/Object;")
    public static Object method133(byte[] arg0, boolean arg1) {
        if (arg0 == null) {
            return null;
        }
        if (arg0.length > 136 && !field1995) {
            try {
                class125 var2 = new class125();
                var2.method2386(arg0);
                return var2;
            } catch (Throwable var7) {
                field1995 = true;
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

    @ObfuscatedName("cd.m(Ljava/lang/Object;ZI)[B")
    public static byte[] method1598(Object arg0, boolean arg1) {
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
            return var6.method2374();
        } else {
            throw new IllegalArgumentException();
        }
    }

    @ObfuscatedName("dn.d(B)[B")
    public abstract byte[] method2374();

    @ObfuscatedName("dn.k([BB)V")
    public abstract void method2386(byte[] arg0);
}
