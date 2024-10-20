package deob;

@ObfuscatedName("dh")
public abstract class class119 {

    @ObfuscatedName("dh.x")
    public static boolean field1970 = false;

    @ObfuscatedName("ab.x([BZB)Ljava/lang/Object;")
    public static Object method662(byte[] arg0, boolean arg1) {
        if (arg0 == null) {
            return null;
        }
        if (arg0.length > 136 && !field1970) {
            try {
                class125 var2 = new class125();
                var2.method2311(arg0);
                return var2;
            } catch (Throwable var4) {
                field1970 = true;
            }
        }
        return arg1 ? method205(arg0) : arg0;
    }

    @ObfuscatedName("am.p(Ljava/lang/Object;ZI)[B")
    public static byte[] method651(Object arg0, boolean arg1) {
        if (arg0 == null) {
            return null;
        } else if (arg0 instanceof byte[]) {
            byte[] var2 = (byte[]) ((byte[]) arg0);
            return arg1 ? method205(var2) : var2;
        } else if (arg0 instanceof class119) {
            class119 var3 = (class119) arg0;
            return var3.method2324();
        } else {
            throw new IllegalArgumentException();
        }
    }

    @ObfuscatedName("f.k([BB)[B")
    public static byte[] method205(byte[] arg0) {
        int var1 = arg0.length;
        byte[] var2 = new byte[var1];
        System.arraycopy(arg0, 0, var2, 0, var1);
        return var2;
    }

    @ObfuscatedName("dh.q([BB)V")
    public abstract void method2311(byte[] arg0);

    @ObfuscatedName("dh.a(I)[B")
    public abstract byte[] method2324();
}
