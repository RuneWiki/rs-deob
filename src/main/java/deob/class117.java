package deob;

@ObfuscatedName("ds")
public abstract class class117 {

    @ObfuscatedName("ds.o")
    public static boolean field1937 = false;

    @ObfuscatedName("c.r([BZI)Ljava/lang/Object;")
    public static Object method558(byte[] arg0, boolean arg1) {
        if (arg0 == null) {
            return null;
        }
        if (arg0.length > 136 && !field1937) {
            try {
                class110 var2 = new class110();
                var2.method2212(arg0);
                return var2;
            } catch (Throwable var4) {
                field1937 = true;
            }
        }
        return arg1 ? method510(arg0) : arg0;
    }

    @ObfuscatedName("am.l(Ljava/lang/Object;ZI)[B")
    public static byte[] method1105(Object arg0, boolean arg1) {
        if (arg0 == null) {
            return null;
        } else if (arg0 instanceof byte[]) {
            byte[] var2 = (byte[]) ((byte[]) arg0);
            return arg1 ? method510(var2) : var2;
        } else if (arg0 instanceof class117) {
            class117 var3 = (class117) arg0;
            return var3.method2213();
        } else {
            throw new IllegalArgumentException();
        }
    }

    @ObfuscatedName("d.f([BI)[B")
    public static byte[] method510(byte[] arg0) {
        int var1 = arg0.length;
        byte[] var2 = new byte[var1];
        System.arraycopy(arg0, 0, var2, 0, var1);
        return var2;
    }

    @ObfuscatedName("ds.n(I)[B")
    public abstract byte[] method2213();

    @ObfuscatedName("ds.o([BB)V")
    public abstract void method2212(byte[] arg0);
}
