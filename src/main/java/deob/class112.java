package deob;

@ObfuscatedName("dw")
public abstract class class112 {

    @ObfuscatedName("dw.j")
    public static boolean field1863 = false;

    @ObfuscatedName("al.b([BZI)Ljava/lang/Object;")
    public static Object method626(byte[] arg0, boolean arg1) {
        if (arg0 == null) {
            return null;
        }
        if (arg0.length > 136 && !field1863) {
            try {
                class106 var2 = new class106();
                var2.method2103(arg0);
                return var2;
            } catch (Throwable var4) {
                field1863 = true;
            }
        }
        return arg1 ? method813(arg0) : arg0;
    }

    @ObfuscatedName("cl.s(Ljava/lang/Object;ZI)[B")
    public static byte[] method1965(Object arg0, boolean arg1) {
        if (arg0 == null) {
            return null;
        } else if (arg0 instanceof byte[]) {
            byte[] var2 = (byte[]) ((byte[]) arg0);
            return arg1 ? method813(var2) : var2;
        } else if (arg0 instanceof class112) {
            class112 var3 = (class112) arg0;
            return var3.method2104();
        } else {
            throw new IllegalArgumentException();
        }
    }

    @ObfuscatedName("ae.q([BI)[B")
    public static byte[] method813(byte[] arg0) {
        int var1 = arg0.length;
        byte[] var2 = new byte[var1];
        System.arraycopy(arg0, 0, var2, 0, var1);
        return var2;
    }

    @ObfuscatedName("dw.z(B)[B")
    public abstract byte[] method2104();

    @ObfuscatedName("dw.j([BI)V")
    public abstract void method2103(byte[] arg0);
}
