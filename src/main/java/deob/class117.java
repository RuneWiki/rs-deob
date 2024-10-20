package deob;

@ObfuscatedName("dq")
public abstract class class117 {

    @ObfuscatedName("dq.e")
    public static boolean field1938 = false;

    @ObfuscatedName("q.v([BZI)Ljava/lang/Object;")
    public static Object method119(byte[] arg0, boolean arg1) {
        if (arg0 == null) {
            return null;
        }
        if (arg0.length > 136 && !field1938) {
            try {
                class110 var2 = new class110();
                var2.method2102(arg0);
                return var2;
            } catch (Throwable var7) {
                field1938 = true;
            }
        }
        if (arg1) {
            int var4 = arg0.length;
            byte[] var5 = new byte[var4];
            System.arraycopy(arg0, 0, var5, 0, var4);
            return var5;
        } else {
            return arg0;
        }
    }

    @ObfuscatedName("du.n(Ljava/lang/Object;ZI)[B")
    public static byte[] method2073(Object arg0, boolean arg1) {
        if (arg0 == null) {
            return null;
        } else if (arg0 instanceof byte[]) {
            byte[] var2 = (byte[]) ((byte[]) arg0);
            if (arg1) {
                int var3 = var2.length;
                byte[] var4 = new byte[var3];
                System.arraycopy(var2, 0, var4, 0, var3);
                return var4;
            } else {
                return var2;
            }
        } else if (arg0 instanceof class117) {
            class117 var6 = (class117) arg0;
            return var6.method2104();
        } else {
            throw new IllegalArgumentException();
        }
    }

    @ObfuscatedName("dq.b(S)[B")
    public abstract byte[] method2104();

    @ObfuscatedName("dq.e([BB)V")
    public abstract void method2102(byte[] arg0);
}
