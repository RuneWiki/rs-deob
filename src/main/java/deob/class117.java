package deob;

@ObfuscatedName("do")
public abstract class class117 {

    @ObfuscatedName("do.s")
    public static boolean field1898 = false;

    @ObfuscatedName("dt.n([BZB)Ljava/lang/Object;")
    public static Object method2438(byte[] arg0, boolean arg1) {
        if (arg0 == null) {
            return null;
        }
        if (arg0.length > 136 && !field1898) {
            try {
                class110 var2 = new class110();
                var2.method2128(arg0);
                return var2;
            } catch (Throwable var4) {
                field1898 = true;
            }
        }
        return arg1 ? Statics.method1360(arg0) : arg0;
    }

    @ObfuscatedName("hu.t(Ljava/lang/Object;ZB)[B")
    public static byte[] method3587(Object arg0, boolean arg1) {
        if (arg0 == null) {
            return null;
        } else if (arg0 instanceof byte[]) {
            byte[] var2 = (byte[]) ((byte[]) arg0);
            return arg1 ? Statics.method1360(var2) : var2;
        } else if (arg0 instanceof class117) {
            class117 var3 = (class117) arg0;
            return var3.method2127();
        } else {
            throw new IllegalArgumentException();
        }
    }

    @ObfuscatedName("do.q(I)[B")
    public abstract byte[] method2127();

    @ObfuscatedName("do.s([BB)V")
    public abstract void method2128(byte[] arg0);
}
