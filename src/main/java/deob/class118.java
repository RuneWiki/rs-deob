package deob;

@ObfuscatedName("do")
public abstract class class118 {

    @ObfuscatedName("do.g")
    public static boolean field1967 = false;

    @ObfuscatedName("bn.g([BZI)Ljava/lang/Object;")
    public static Object method1562(byte[] arg0, boolean arg1) {
        if (arg0 == null) {
            return null;
        }
        if (arg0.length > 136 && !field1967) {
            try {
                class124 var2 = new class124();
                var2.method2400(arg0);
                return var2;
            } catch (Throwable var4) {
                field1967 = true;
            }
        }
        return arg1 ? method551(arg0) : arg0;
    }

    @ObfuscatedName("af.e(Ljava/lang/Object;ZI)[B")
    public static byte[] method681(Object arg0, boolean arg1) {
        if (arg0 == null) {
            return null;
        } else if (arg0 instanceof byte[]) {
            byte[] var2 = (byte[]) ((byte[]) arg0);
            return arg1 ? method551(var2) : var2;
        } else if (arg0 instanceof class118) {
            class118 var3 = (class118) arg0;
            return var3.method2398();
        } else {
            throw new IllegalArgumentException();
        }
    }

    @ObfuscatedName("al.n([BI)[B")
    public static byte[] method551(byte[] arg0) {
        int var1 = arg0.length;
        byte[] var2 = new byte[var1];
        System.arraycopy(arg0, 0, var2, 0, var1);
        return var2;
    }

    @ObfuscatedName("do.j(B)[B")
    public abstract byte[] method2398();

    @ObfuscatedName("do.i([BI)V")
    public abstract void method2400(byte[] arg0);
}
