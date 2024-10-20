package deob;

@ObfuscatedName("dn")
public abstract class class125 {

    @ObfuscatedName("dn.e")
    public static boolean field2020 = false;

    @ObfuscatedName("ad.y([BZI)Ljava/lang/Object;")
    public static Object method929(byte[] arg0, boolean arg1) {
        if (arg0 == null) {
            return null;
        }
        if (arg0.length > 136 && !field2020) {
            try {
                class118 var2 = new class118();
                var2.method2317(arg0);
                return var2;
            } catch (Throwable var4) {
                field2020 = true;
            }
        }
        return arg1 ? method1740(arg0) : arg0;
    }

    @ObfuscatedName("dl.t(Ljava/lang/Object;ZI)[B")
    public static byte[] method2252(Object arg0, boolean arg1) {
        if (arg0 == null) {
            return null;
        } else if (arg0 instanceof byte[]) {
            byte[] var2 = (byte[]) ((byte[]) arg0);
            return arg1 ? method1740(var2) : var2;
        } else if (arg0 instanceof class125) {
            class125 var3 = (class125) arg0;
            return var3.method2316();
        } else {
            throw new IllegalArgumentException();
        }
    }

    @ObfuscatedName("cs.w([BI)[B")
    public static byte[] method1740(byte[] arg0) {
        int var1 = arg0.length;
        byte[] var2 = new byte[var1];
        System.arraycopy(arg0, 0, var2, 0, var1);
        return var2;
    }

    @ObfuscatedName("dn.o(I)[B")
    public abstract byte[] method2316();

    @ObfuscatedName("dn.e([BS)V")
    public abstract void method2317(byte[] arg0);
}
