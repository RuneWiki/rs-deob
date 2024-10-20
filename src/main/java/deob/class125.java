package deob;

@ObfuscatedName("dk")
public abstract class class125 {

    @ObfuscatedName("dk.q")
    public static boolean field2028 = false;

    @ObfuscatedName("dj.h([BZI)Ljava/lang/Object;")
    public static Object method2582(byte[] arg0, boolean arg1) {
        if (arg0 == null) {
            return null;
        }
        if (arg0.length > 136 && !field2028) {
            try {
                class118 var2 = new class118();
                var2.method2279(arg0);
                return var2;
            } catch (Throwable var4) {
                field2028 = true;
            }
        }
        return arg1 ? method850(arg0) : arg0;
    }

    @ObfuscatedName("cw.n(Ljava/lang/Object;ZS)[B")
    public static byte[] method2090(Object arg0, boolean arg1) {
        if (arg0 == null) {
            return null;
        } else if (arg0 instanceof byte[]) {
            byte[] var2 = (byte[]) ((byte[]) arg0);
            return arg1 ? method850(var2) : var2;
        } else if (arg0 instanceof class125) {
            class125 var3 = (class125) arg0;
            return var3.method2278();
        } else {
            throw new IllegalArgumentException();
        }
    }

    @ObfuscatedName("ah.j([BB)[B")
    public static byte[] method850(byte[] arg0) {
        int var1 = arg0.length;
        byte[] var2 = new byte[var1];
        System.arraycopy(arg0, 0, var2, 0, var1);
        return var2;
    }

    @ObfuscatedName("dk.z(I)[B")
    public abstract byte[] method2278();

    @ObfuscatedName("dk.q([BI)V")
    public abstract void method2279(byte[] arg0);
}
