package deob;

@ObfuscatedName("du")
public abstract class class125 {

    @ObfuscatedName("du.q")
    public static boolean field2029 = false;

    @ObfuscatedName("eg.j([BZI)Ljava/lang/Object;")
    public static Object method2781(byte[] arg0, boolean arg1) {
        if (arg0 == null) {
            return null;
        }
        if (arg0.length > 136 && !field2029) {
            try {
                class118 var2 = new class118();
                var2.method2339(arg0);
                return var2;
            } catch (Throwable var4) {
                field2029 = true;
            }
        }
        return arg1 ? method2308(arg0) : arg0;
    }

    @ObfuscatedName("bn.w(Ljava/lang/Object;ZB)[B")
    public static byte[] method1082(Object arg0, boolean arg1) {
        if (arg0 == null) {
            return null;
        } else if (arg0 instanceof byte[]) {
            byte[] var2 = (byte[]) ((byte[]) arg0);
            return arg1 ? method2308(var2) : var2;
        } else if (arg0 instanceof class125) {
            class125 var3 = (class125) arg0;
            return var3.method2338();
        } else {
            throw new IllegalArgumentException();
        }
    }

    @ObfuscatedName("di.y([BI)[B")
    public static byte[] method2308(byte[] arg0) {
        int var1 = arg0.length;
        byte[] var2 = new byte[var1];
        System.arraycopy(arg0, 0, var2, 0, var1);
        return var2;
    }

    @ObfuscatedName("du.n(B)[B")
    public abstract byte[] method2338();

    @ObfuscatedName("du.q([BI)V")
    public abstract void method2339(byte[] arg0);
}
