package deob;

@ObfuscatedName("da")
public abstract class class112 {

    @ObfuscatedName("da.s")
    public static boolean field1886 = false;

    @ObfuscatedName("a.i([BZB)Ljava/lang/Object;")
    public static Object method494(byte[] arg0, boolean arg1) {
        if (arg0 == null) {
            return null;
        }
        if (arg0.length > 136 && !field1886) {
            try {
                class106 var2 = new class106();
                var2.method2071(arg0);
                return var2;
            } catch (Throwable var4) {
                field1886 = true;
            }
        }
        return arg1 ? method834(arg0) : arg0;
    }

    @ObfuscatedName("c.t(Ljava/lang/Object;ZB)[B")
    public static byte[] method140(Object arg0, boolean arg1) {
        if (arg0 == null) {
            return null;
        } else if (arg0 instanceof byte[]) {
            byte[] var2 = (byte[]) ((byte[]) arg0);
            return arg1 ? method834(var2) : var2;
        } else if (arg0 instanceof class112) {
            class112 var3 = (class112) arg0;
            return var3.method2072();
        } else {
            throw new IllegalArgumentException();
        }
    }

    @ObfuscatedName("aw.l([BB)[B")
    public static byte[] method834(byte[] arg0) {
        int var1 = arg0.length;
        byte[] var2 = new byte[var1];
        System.arraycopy(arg0, 0, var2, 0, var1);
        return var2;
    }

    @ObfuscatedName("da.s([BI)V")
    public abstract void method2071(byte[] arg0);

    @ObfuscatedName("da.g(I)[B")
    public abstract byte[] method2072();
}
