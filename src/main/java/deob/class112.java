package deob;

@ObfuscatedName("dg")
public abstract class class112 {

    @ObfuscatedName("dg.u")
    public static boolean field1885 = false;

    @ObfuscatedName("ag.l([BZI)Ljava/lang/Object;")
    public static Object method766(byte[] arg0, boolean arg1) {
        if (arg0 == null) {
            return null;
        }
        if (arg0.length > 136 && !field1885) {
            try {
                class106 var2 = new class106();
                var2.method2110(arg0);
                return var2;
            } catch (Throwable var4) {
                field1885 = true;
            }
        }
        return arg1 ? method113(arg0) : arg0;
    }

    @ObfuscatedName("av.k(Ljava/lang/Object;ZI)[B")
    public static byte[] method893(Object arg0, boolean arg1) {
        if (arg0 == null) {
            return null;
        } else if (arg0 instanceof byte[]) {
            byte[] var2 = (byte[]) ((byte[]) arg0);
            return arg1 ? method113(var2) : var2;
        } else if (arg0 instanceof class112) {
            class112 var3 = (class112) arg0;
            return var3.method2111();
        } else {
            throw new IllegalArgumentException();
        }
    }

    @ObfuscatedName("p.q([BB)[B")
    public static byte[] method113(byte[] arg0) {
        int var1 = arg0.length;
        byte[] var2 = new byte[var1];
        System.arraycopy(arg0, 0, var2, 0, var1);
        return var2;
    }

    @ObfuscatedName("dg.b(I)[B")
    public abstract byte[] method2111();

    @ObfuscatedName("dg.u([BI)V")
    public abstract void method2110(byte[] arg0);
}
