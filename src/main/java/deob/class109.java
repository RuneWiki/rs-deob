package deob;

@ObfuscatedName("dv")
public abstract class class109 {

    @ObfuscatedName("dv.n")
    public static boolean field1858 = false;

    @ObfuscatedName("y.k([BZB)Ljava/lang/Object;")
    public static Object method543(byte[] arg0, boolean arg1) {
        if (arg0 == null) {
            return null;
        }
        if (arg0.length > 136 && !field1858) {
            try {
                class103 var2 = new class103();
                var2.method2105(arg0);
                return var2;
            } catch (Throwable var4) {
                field1858 = true;
            }
        }
        return arg1 ? method618(arg0) : arg0;
    }

    @ObfuscatedName("j.g(Ljava/lang/Object;ZB)[B")
    public static byte[] method133(Object arg0, boolean arg1) {
        if (arg0 == null) {
            return null;
        } else if (arg0 instanceof byte[]) {
            byte[] var2 = (byte[]) ((byte[]) arg0);
            return arg1 ? method618(var2) : var2;
        } else if (arg0 instanceof class109) {
            class109 var3 = (class109) arg0;
            return var3.method2102();
        } else {
            throw new IllegalArgumentException();
        }
    }

    @ObfuscatedName("as.d([BI)[B")
    public static byte[] method618(byte[] arg0) {
        int var1 = arg0.length;
        byte[] var2 = new byte[var1];
        System.arraycopy(arg0, 0, var2, 0, var1);
        return var2;
    }

    @ObfuscatedName("dv.n([BI)V")
    public abstract void method2105(byte[] arg0);

    @ObfuscatedName("dv.z(I)[B")
    public abstract byte[] method2102();
}
