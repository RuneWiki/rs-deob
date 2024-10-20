package deob;

@ObfuscatedName("dk")
public abstract class class116 {

    @ObfuscatedName("dk.v")
    public static boolean field1904 = false;

    @ObfuscatedName("h.n([BZB)Ljava/lang/Object;")
    public static Object method493(byte[] arg0, boolean arg1) {
        if (arg0 == null) {
            return null;
        }
        if (arg0.length > 136 && !field1904) {
            try {
                class109 var2 = new class109();
                var2.method2109(arg0);
                return var2;
            } catch (Throwable var4) {
                field1904 = true;
            }
        }
        return arg1 ? method562(arg0) : arg0;
    }

    @ObfuscatedName("ce.s(Ljava/lang/Object;ZI)[B")
    public static byte[] method1974(Object arg0, boolean arg1) {
        if (arg0 == null) {
            return null;
        } else if (arg0 instanceof byte[]) {
            byte[] var2 = (byte[]) ((byte[]) arg0);
            return arg1 ? method562(var2) : var2;
        } else if (arg0 instanceof class116) {
            class116 var3 = (class116) arg0;
            return var3.method2108();
        } else {
            throw new IllegalArgumentException();
        }
    }

    @ObfuscatedName("as.k([BB)[B")
    public static byte[] method562(byte[] arg0) {
        int var1 = arg0.length;
        byte[] var2 = new byte[var1];
        System.arraycopy(arg0, 0, var2, 0, var1);
        return var2;
    }

    @ObfuscatedName("dk.v([BB)V")
    public abstract void method2109(byte[] arg0);

    @ObfuscatedName("dk.a(B)[B")
    public abstract byte[] method2108();
}
