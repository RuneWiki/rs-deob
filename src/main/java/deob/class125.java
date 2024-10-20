package deob;

@ObfuscatedName("dy")
public abstract class class125 {

    @ObfuscatedName("dy.m")
    public static boolean field2034 = false;

    @ObfuscatedName("af.l([BZI)Ljava/lang/Object;")
    public static Object method617(byte[] arg0, boolean arg1) {
        if (arg0 == null) {
            return null;
        }
        if (arg0.length > 136 && !field2034) {
            try {
                class118 var2 = new class118();
                var2.method2295(arg0);
                return var2;
            } catch (Throwable var4) {
                field2034 = true;
            }
        }
        return arg1 ? method2913(arg0) : arg0;
    }

    @ObfuscatedName("fj.v(Ljava/lang/Object;ZB)[B")
    public static byte[] method2948(Object arg0, boolean arg1) {
        if (arg0 == null) {
            return null;
        } else if (arg0 instanceof byte[]) {
            byte[] var2 = (byte[]) ((byte[]) arg0);
            return arg1 ? method2913(var2) : var2;
        } else if (arg0 instanceof class125) {
            class125 var3 = (class125) arg0;
            return var3.method2302();
        } else {
            throw new IllegalArgumentException();
        }
    }

    @ObfuscatedName("er.k([BB)[B")
    public static byte[] method2913(byte[] arg0) {
        int var1 = arg0.length;
        byte[] var2 = new byte[var1];
        System.arraycopy(arg0, 0, var2, 0, var1);
        return var2;
    }

    @ObfuscatedName("dy.m([BS)V")
    public abstract void method2295(byte[] arg0);

    @ObfuscatedName("dy.h(B)[B")
    public abstract byte[] method2302();
}
