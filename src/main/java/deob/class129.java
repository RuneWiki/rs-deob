package deob;

@ObfuscatedName("ds")
public abstract class class129 {

    @ObfuscatedName("ds.e")
    public static boolean field2093 = false;

    @ObfuscatedName("cg.c([BZB)Ljava/lang/Object;")
    public static Object method2113(byte[] arg0, boolean arg1) {
        if (arg0 == null) {
            return null;
        }
        if (arg0.length > 136 && !field2093) {
            try {
                class122 var2 = new class122();
                var2.method2377(arg0);
                return var2;
            } catch (Throwable var7) {
                field2093 = true;
            }
        }
        if (arg1) {
            int var4 = arg0.length;
            byte[] var5 = new byte[var4];
            System.arraycopy(arg0, 0, var5, 0, var4);
            return var5;
        } else {
            return arg0;
        }
    }

    @ObfuscatedName("n.w(Ljava/lang/Object;ZS)[B")
    public static byte[] method44(Object arg0, boolean arg1) {
        if (arg0 == null) {
            return null;
        } else if (arg0 instanceof byte[]) {
            byte[] var2 = (byte[]) ((byte[]) arg0);
            return arg1 ? method857(var2) : var2;
        } else if (arg0 instanceof class129) {
            class129 var3 = (class129) arg0;
            return var3.method2379();
        } else {
            throw new IllegalArgumentException();
        }
    }

    @ObfuscatedName("ag.l([BI)[B")
    public static byte[] method857(byte[] arg0) {
        int var1 = arg0.length;
        byte[] var2 = new byte[var1];
        System.arraycopy(arg0, 0, var2, 0, var1);
        return var2;
    }

    @ObfuscatedName("ds.f(B)[B")
    public abstract byte[] method2379();

    @ObfuscatedName("ds.e([BB)V")
    public abstract void method2377(byte[] arg0);
}
