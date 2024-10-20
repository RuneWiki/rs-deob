package deob;

@ObfuscatedName("dc")
public abstract class class125 {

    @ObfuscatedName("dc.r")
    public static boolean field2035 = false;

    @ObfuscatedName("s.m([BZI)Ljava/lang/Object;")
    public static Object method52(byte[] arg0, boolean arg1) {
        if (arg0 == null) {
            return null;
        }
        if (arg0.length > 136 && !field2035) {
            try {
                class118 var2 = new class118();
                var2.method2323(arg0);
                return var2;
            } catch (Throwable var4) {
                field2035 = true;
            }
        }
        return arg1 ? method7(arg0) : arg0;
    }

    @ObfuscatedName("bm.j(Ljava/lang/Object;ZI)[B")
    public static byte[] method1560(Object arg0, boolean arg1) {
        if (arg0 == null) {
            return null;
        } else if (arg0 instanceof byte[]) {
            byte[] var2 = (byte[]) ((byte[]) arg0);
            return arg1 ? method7(var2) : var2;
        } else if (arg0 instanceof class125) {
            class125 var3 = (class125) arg0;
            return var3.method2322();
        } else {
            throw new IllegalArgumentException();
        }
    }

    @ObfuscatedName("a.n([BS)[B")
    public static byte[] method7(byte[] arg0) {
        int var1 = arg0.length;
        byte[] var2 = new byte[var1];
        System.arraycopy(arg0, 0, var2, 0, var1);
        return var2;
    }

    @ObfuscatedName("dc.a(I)[B")
    public abstract byte[] method2322();

    @ObfuscatedName("dc.r([BB)V")
    public abstract void method2323(byte[] arg0);
}
