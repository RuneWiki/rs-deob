package deob;

@ObfuscatedName("dd")
public abstract class class126 {

    @ObfuscatedName("dd.h")
    public static boolean field2016 = false;

    @ObfuscatedName("b.i([BZI)Ljava/lang/Object;")
    public static Object method182(byte[] arg0, boolean arg1) {
        if (arg0 == null) {
            return null;
        }
        if (arg0.length > 136 && !field2016) {
            try {
                class119 var2 = new class119();
                var2.method2339(arg0);
                return var2;
            } catch (Throwable var4) {
                field2016 = true;
            }
        }
        return arg1 ? method2751(arg0) : arg0;
    }

    @ObfuscatedName("aq.c(Ljava/lang/Object;ZI)[B")
    public static byte[] method638(Object arg0, boolean arg1) {
        if (arg0 == null) {
            return null;
        } else if (arg0 instanceof byte[]) {
            byte[] var2 = (byte[]) ((byte[]) arg0);
            return arg1 ? method2751(var2) : var2;
        } else if (arg0 instanceof class126) {
            class126 var3 = (class126) arg0;
            return var3.method2338();
        } else {
            throw new IllegalArgumentException();
        }
    }

    @ObfuscatedName("ep.n([BI)[B")
    public static byte[] method2751(byte[] arg0) {
        int var1 = arg0.length;
        byte[] var2 = new byte[var1];
        System.arraycopy(arg0, 0, var2, 0, var1);
        return var2;
    }

    @ObfuscatedName("dd.h([BI)V")
    public abstract void method2339(byte[] arg0);

    @ObfuscatedName("dd.j(B)[B")
    public abstract byte[] method2338();
}
