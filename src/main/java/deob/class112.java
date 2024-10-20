package deob;

@ObfuscatedName("de")
public abstract class class112 {

    @ObfuscatedName("de.o")
    public static boolean field1865 = false;

    @ObfuscatedName("dv.y([BZB)Ljava/lang/Object;")
    public static Object method2335(byte[] arg0, boolean arg1) {
        if (arg0 == null) {
            return null;
        }
        if (arg0.length > 136 && !field1865) {
            try {
                class106 var2 = new class106();
                var2.method2102(arg0);
                return var2;
            } catch (Throwable var4) {
                field1865 = true;
            }
        }
        return arg1 ? method525(arg0) : arg0;
    }

    @ObfuscatedName("ag.g(Ljava/lang/Object;ZI)[B")
    public static byte[] method986(Object arg0, boolean arg1) {
        if (arg0 == null) {
            return null;
        } else if (arg0 instanceof byte[]) {
            byte[] var2 = (byte[]) ((byte[]) arg0);
            return arg1 ? method525(var2) : var2;
        } else if (arg0 instanceof class112) {
            class112 var3 = (class112) arg0;
            return var3.method2099();
        } else {
            throw new IllegalArgumentException();
        }
    }

    @ObfuscatedName("al.l([BI)[B")
    public static byte[] method525(byte[] arg0) {
        int var1 = arg0.length;
        byte[] var2 = new byte[var1];
        System.arraycopy(arg0, 0, var2, 0, var1);
        return var2;
    }

    @ObfuscatedName("de.t(I)[B")
    public abstract byte[] method2099();

    @ObfuscatedName("de.o([BB)V")
    public abstract void method2102(byte[] arg0);
}
