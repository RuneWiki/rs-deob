package deob;

@ObfuscatedName("dh")
public abstract class class125 {

    @ObfuscatedName("dh.f")
    public static boolean field2030 = false;

    @ObfuscatedName("aj.p([BZI)Ljava/lang/Object;")
    public static Object method724(byte[] arg0, boolean arg1) {
        if (arg0 == null) {
            return null;
        }
        if (arg0.length > 136 && !field2030) {
            try {
                class118 var2 = new class118();
                var2.method2328(arg0);
                return var2;
            } catch (Throwable var4) {
                field2030 = true;
            }
        }
        return arg1 ? method3105(arg0) : arg0;
    }

    @ObfuscatedName("af.j(Ljava/lang/Object;ZI)[B")
    public static byte[] method618(Object arg0, boolean arg1) {
        if (arg0 == null) {
            return null;
        } else if (arg0 instanceof byte[]) {
            byte[] var2 = (byte[]) ((byte[]) arg0);
            return arg1 ? method3105(var2) : var2;
        } else if (arg0 instanceof class125) {
            class125 var3 = (class125) arg0;
            return var3.method2330();
        } else {
            throw new IllegalArgumentException();
        }
    }

    @ObfuscatedName("fh.a([BB)[B")
    public static byte[] method3105(byte[] arg0) {
        int var1 = arg0.length;
        byte[] var2 = new byte[var1];
        System.arraycopy(arg0, 0, var2, 0, var1);
        return var2;
    }

    @ObfuscatedName("dh.v(B)[B")
    public abstract byte[] method2330();

    @ObfuscatedName("dh.f([BB)V")
    public abstract void method2328(byte[] arg0);
}
