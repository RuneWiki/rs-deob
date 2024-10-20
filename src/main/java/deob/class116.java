package deob;

@ObfuscatedName("dl")
public abstract class class116 {

    @ObfuscatedName("dl.e")
    public static boolean field1903 = false;

    @ObfuscatedName("ap.o([BZB)Ljava/lang/Object;")
    public static Object method888(byte[] arg0, boolean arg1) {
        if (arg0 == null) {
            return null;
        }
        if (arg0.length > 136 && !field1903) {
            try {
                class109 var2 = new class109();
                var2.method2121(arg0);
                return var2;
            } catch (Throwable var4) {
                field1903 = true;
            }
        }
        return arg1 ? method839(arg0) : arg0;
    }

    @ObfuscatedName("eu.g(Ljava/lang/Object;ZI)[B")
    public static byte[] method2733(Object arg0, boolean arg1) {
        if (arg0 == null) {
            return null;
        } else if (arg0 instanceof byte[]) {
            byte[] var2 = (byte[]) ((byte[]) arg0);
            return arg1 ? method839(var2) : var2;
        } else if (arg0 instanceof class116) {
            class116 var3 = (class116) arg0;
            return var3.method2122();
        } else {
            throw new IllegalArgumentException();
        }
    }

    @ObfuscatedName("av.z([BB)[B")
    public static byte[] method839(byte[] arg0) {
        int var1 = arg0.length;
        byte[] var2 = new byte[var1];
        System.arraycopy(arg0, 0, var2, 0, var1);
        return var2;
    }

    @ObfuscatedName("dl.b(I)[B")
    public abstract byte[] method2122();

    @ObfuscatedName("dl.e([BI)V")
    public abstract void method2121(byte[] arg0);
}
