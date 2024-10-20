package deob;

@ObfuscatedName("dz")
public abstract class class119 {

    @ObfuscatedName("dz.c")
    public static boolean field2012 = false;

    @ObfuscatedName("aq.c([BZI)Ljava/lang/Object;")
    public static Object method858(byte[] arg0, boolean arg1) {
        if (arg0 == null) {
            return null;
        }
        if (arg0.length > 136 && !field2012) {
            try {
                class125 var2 = new class125();
                var2.method2242(arg0);
                return var2;
            } catch (Throwable var4) {
                field2012 = true;
            }
        }
        return arg1 ? method200(arg0) : arg0;
    }

    @ObfuscatedName("ct.q(Ljava/lang/Object;ZI)[B")
    public static byte[] method1778(Object arg0, boolean arg1) {
        if (arg0 == null) {
            return null;
        } else if (arg0 instanceof byte[]) {
            byte[] var2 = (byte[]) ((byte[]) arg0);
            return arg1 ? method200(var2) : var2;
        } else if (arg0 instanceof class119) {
            class119 var3 = (class119) arg0;
            return var3.method2248();
        } else {
            throw new IllegalArgumentException();
        }
    }

    @ObfuscatedName("k.y([BB)[B")
    public static byte[] method200(byte[] arg0) {
        int var1 = arg0.length;
        byte[] var2 = new byte[var1];
        System.arraycopy(arg0, 0, var2, 0, var1);
        return var2;
    }

    @ObfuscatedName("dz.g([BB)V")
    public abstract void method2242(byte[] arg0);

    @ObfuscatedName("dz.v(I)[B")
    public abstract byte[] method2248();
}
