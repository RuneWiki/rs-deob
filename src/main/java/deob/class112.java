package deob;

@ObfuscatedName("dl")
public abstract class class112 {

    @ObfuscatedName("dl.x")
    public static boolean field1869 = false;

    @ObfuscatedName("bl.w([BZB)Ljava/lang/Object;")
    public static Object method1344(byte[] arg0, boolean arg1) {
        if (arg0 == null) {
            return null;
        }
        if (arg0.length > 136 && !field1869) {
            try {
                class106 var2 = new class106();
                var2.method2115(arg0);
                return var2;
            } catch (Throwable var4) {
                field1869 = true;
            }
        }
        return arg1 ? method694(arg0) : arg0;
    }

    @ObfuscatedName("ci.e(Ljava/lang/Object;ZI)[B")
    public static byte[] method1979(Object arg0, boolean arg1) {
        if (arg0 == null) {
            return null;
        } else if (arg0 instanceof byte[]) {
            byte[] var2 = (byte[]) ((byte[]) arg0);
            return arg1 ? method694(var2) : var2;
        } else if (arg0 instanceof class112) {
            class112 var3 = (class112) arg0;
            return var3.method2119();
        } else {
            throw new IllegalArgumentException();
        }
    }

    @ObfuscatedName("ae.o([BI)[B")
    public static byte[] method694(byte[] arg0) {
        int var1 = arg0.length;
        byte[] var2 = new byte[var1];
        System.arraycopy(arg0, 0, var2, 0, var1);
        return var2;
    }

    @ObfuscatedName("dl.x([BI)V")
    public abstract void method2115(byte[] arg0);

    @ObfuscatedName("dl.n(I)[B")
    public abstract byte[] method2119();
}
