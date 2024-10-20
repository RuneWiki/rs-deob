package deob;

@ObfuscatedName("dv")
public abstract class class112 {

    @ObfuscatedName("dv.b")
    public static boolean field1898 = false;

    @ObfuscatedName("ca.o([BZB)Ljava/lang/Object;")
    public static Object method2047(byte[] arg0, boolean arg1) {
        if (arg0 == null) {
            return null;
        }
        if (arg0.length > 136 && !field1898) {
            try {
                class106 var2 = new class106();
                var2.method2095(arg0);
                return var2;
            } catch (Throwable var4) {
                field1898 = true;
            }
        }
        return arg1 ? method2428(arg0) : arg0;
    }

    @ObfuscatedName("dr.q(Ljava/lang/Object;ZI)[B")
    public static byte[] method2446(Object arg0, boolean arg1) {
        if (arg0 == null) {
            return null;
        } else if (arg0 instanceof byte[]) {
            byte[] var2 = (byte[]) ((byte[]) arg0);
            return arg1 ? method2428(var2) : var2;
        } else if (arg0 instanceof class112) {
            class112 var3 = (class112) arg0;
            return var3.method2096();
        } else {
            throw new IllegalArgumentException();
        }
    }

    @ObfuscatedName("dm.w([BB)[B")
    public static byte[] method2428(byte[] arg0) {
        int var1 = arg0.length;
        byte[] var2 = new byte[var1];
        System.arraycopy(arg0, 0, var2, 0, var1);
        return var2;
    }

    @ObfuscatedName("dv.k(I)[B")
    public abstract byte[] method2096();

    @ObfuscatedName("dv.b([BB)V")
    public abstract void method2095(byte[] arg0);
}
