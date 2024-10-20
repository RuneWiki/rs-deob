package deob;

@ObfuscatedName("dj")
public abstract class class125 {

    @ObfuscatedName("dj.q")
    public static boolean field2017 = false;

    @ObfuscatedName("ag.s([BZI)Ljava/lang/Object;")
    public static Object method647(byte[] arg0, boolean arg1) {
        if (arg0 == null) {
            return null;
        }
        if (arg0.length > 136 && !field2017) {
            try {
                class118 var2 = new class118();
                var2.method2360(arg0);
                return var2;
            } catch (Throwable var4) {
                field2017 = true;
            }
        }
        return arg1 ? method2161(arg0) : arg0;
    }

    @ObfuscatedName("dq.k(Ljava/lang/Object;ZB)[B")
    public static byte[] method2311(Object arg0, boolean arg1) {
        if (arg0 == null) {
            return null;
        } else if (arg0 instanceof byte[]) {
            byte[] var2 = (byte[]) ((byte[]) arg0);
            return arg1 ? method2161(var2) : var2;
        } else if (arg0 instanceof class125) {
            class125 var3 = (class125) arg0;
            return var3.method2359();
        } else {
            throw new IllegalArgumentException();
        }
    }

    @ObfuscatedName("cv.b([BI)[B")
    public static byte[] method2161(byte[] arg0) {
        int var1 = arg0.length;
        byte[] var2 = new byte[var1];
        System.arraycopy(arg0, 0, var2, 0, var1);
        return var2;
    }

    @ObfuscatedName("dj.h(I)[B")
    public abstract byte[] method2359();

    @ObfuscatedName("dj.q([BB)V")
    public abstract void method2360(byte[] arg0);
}
