package deob;

@ObfuscatedName("dd")
public abstract class class119 {

    @ObfuscatedName("dd.g")
    public static boolean field1983 = false;

    @ObfuscatedName("bt.g([BZB)Ljava/lang/Object;")
    public static Object method1360(byte[] arg0, boolean arg1) {
        if (arg0 == null) {
            return null;
        }
        if (arg0.length > 136 && !field1983) {
            try {
                class125 var2 = new class125();
                var2.method2330(arg0);
                return var2;
            } catch (Throwable var4) {
                field1983 = true;
            }
        }
        return arg1 ? method110(arg0) : arg0;
    }

    @ObfuscatedName("t.m(Ljava/lang/Object;ZI)[B")
    public static byte[] method97(Object arg0, boolean arg1) {
        if (arg0 == null) {
            return null;
        } else if (arg0 instanceof byte[]) {
            byte[] var2 = (byte[]) ((byte[]) arg0);
            return arg1 ? method110(var2) : var2;
        } else if (arg0 instanceof class119) {
            class119 var3 = (class119) arg0;
            return var3.method2329();
        } else {
            throw new IllegalArgumentException();
        }
    }

    @ObfuscatedName("b.v([BI)[B")
    public static byte[] method110(byte[] arg0) {
        int var1 = arg0.length;
        byte[] var2 = new byte[var1];
        System.arraycopy(arg0, 0, var2, 0, var1);
        return var2;
    }

    @ObfuscatedName("dd.r(B)[B")
    public abstract byte[] method2329();

    @ObfuscatedName("dd.n([BI)V")
    public abstract void method2330(byte[] arg0);
}
