package deob;

@ObfuscatedName("de")
public abstract class class125 {

    @ObfuscatedName("de.l")
    public static boolean field2037 = false;

    @ObfuscatedName("cz.h([BZI)Ljava/lang/Object;")
    public static Object method2040(byte[] arg0, boolean arg1) {
        if (arg0 == null) {
            return null;
        }
        if (arg0.length > 136 && !field2037) {
            try {
                class118 var2 = new class118();
                var2.method2294(arg0);
                return var2;
            } catch (Throwable var7) {
                field2037 = true;
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

    @ObfuscatedName("d.n(Ljava/lang/Object;ZB)[B")
    public static byte[] method185(Object arg0, boolean arg1) {
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
            return var6.method2292();
        } else {
            throw new IllegalArgumentException();
        }
    }

    @ObfuscatedName("de.j(I)[B")
    public abstract byte[] method2292();

    @ObfuscatedName("de.l([BI)V")
    public abstract void method2294(byte[] arg0);
}
