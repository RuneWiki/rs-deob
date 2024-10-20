package deob;

@ObfuscatedName("da")
public abstract class class112 {

    @ObfuscatedName("da.g")
    public static boolean field1874 = false;

    @ObfuscatedName("x.w([BZI)Ljava/lang/Object;")
    public static Object method33(byte[] arg0, boolean arg1) {
        if (arg0 == null) {
            return null;
        }
        if (arg0.length > 136 && !field1874) {
            try {
                class106 var2 = new class106();
                var2.method2152(arg0);
                return var2;
            } catch (Throwable var4) {
                field1874 = true;
            }
        }
        return arg1 ? method589(arg0) : arg0;
    }

    @ObfuscatedName("p.u(Ljava/lang/Object;ZB)[B")
    public static byte[] method3(Object arg0, boolean arg1) {
        if (arg0 == null) {
            return null;
        } else if (arg0 instanceof byte[]) {
            byte[] var2 = (byte[]) ((byte[]) arg0);
            return arg1 ? method589(var2) : var2;
        } else if (arg0 instanceof class112) {
            class112 var3 = (class112) arg0;
            return var3.method2155();
        } else {
            throw new IllegalArgumentException();
        }
    }

    @ObfuscatedName("at.d([BI)[B")
    public static byte[] method589(byte[] arg0) {
        int var1 = arg0.length;
        byte[] var2 = new byte[var1];
        System.arraycopy(arg0, 0, var2, 0, var1);
        return var2;
    }

    @ObfuscatedName("da.g([BS)V")
    public abstract void method2152(byte[] arg0);

    @ObfuscatedName("da.p(I)[B")
    public abstract byte[] method2155();
}
