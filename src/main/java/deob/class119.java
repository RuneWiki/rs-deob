package deob;

@ObfuscatedName("dg")
public abstract class class119 {

    @ObfuscatedName("dg.a")
    public static boolean field1988 = false;

    @ObfuscatedName("n.a([BZI)Ljava/lang/Object;")
    public static Object method45(byte[] arg0, boolean arg1) {
        if (arg0 == null) {
            return null;
        }
        if (arg0.length > 136 && !field1988) {
            try {
                class125 var2 = new class125();
                var2.method2319(arg0);
                return var2;
            } catch (Throwable var4) {
                field1988 = true;
            }
        }
        return arg1 ? method247(arg0) : arg0;
    }

    @ObfuscatedName("dj.x(Ljava/lang/Object;ZI)[B")
    public static byte[] method2262(Object arg0, boolean arg1) {
        if (arg0 == null) {
            return null;
        } else if (arg0 instanceof byte[]) {
            byte[] var2 = (byte[]) ((byte[]) arg0);
            return arg1 ? method247(var2) : var2;
        } else if (arg0 instanceof class119) {
            class119 var3 = (class119) arg0;
            return var3.method2318();
        } else {
            throw new IllegalArgumentException();
        }
    }

    @ObfuscatedName("u.e([BI)[B")
    public static byte[] method247(byte[] arg0) {
        int var1 = arg0.length;
        byte[] var2 = new byte[var1];
        System.arraycopy(arg0, 0, var2, 0, var1);
        return var2;
    }

    @ObfuscatedName("dg.r(B)[B")
    public abstract byte[] method2318();

    @ObfuscatedName("dg.p([BI)V")
    public abstract void method2319(byte[] arg0);
}
