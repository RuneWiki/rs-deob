package deob;

@ObfuscatedName("df")
public abstract class class129 {

    @ObfuscatedName("df.d")
    public static boolean field2114 = false;

    @ObfuscatedName("dl.i([BZI)Ljava/lang/Object;")
    public static Object method2674(byte[] arg0, boolean arg1) {
        if (arg0 == null) {
            return null;
        }
        if (arg0.length > 136 && !field2114) {
            try {
                class122 var2 = new class122();
                var2.method2374(arg0);
                return var2;
            } catch (Throwable var4) {
                field2114 = true;
            }
        }
        return arg1 ? method180(arg0) : arg0;
    }

    @ObfuscatedName("an.g(Ljava/lang/Object;ZB)[B")
    public static byte[] method1017(Object arg0, boolean arg1) {
        if (arg0 == null) {
            return null;
        } else if (arg0 instanceof byte[]) {
            byte[] var2 = (byte[]) ((byte[]) arg0);
            return arg1 ? method180(var2) : var2;
        } else if (arg0 instanceof class129) {
            class129 var3 = (class129) arg0;
            return var3.method2372();
        } else {
            throw new IllegalArgumentException();
        }
    }

    @ObfuscatedName("b.m([BI)[B")
    public static byte[] method180(byte[] arg0) {
        int var1 = arg0.length;
        byte[] var2 = new byte[var1];
        System.arraycopy(arg0, 0, var2, 0, var1);
        return var2;
    }

    @ObfuscatedName("df.a(I)[B")
    public abstract byte[] method2372();

    @ObfuscatedName("df.d([BI)V")
    public abstract void method2374(byte[] arg0);
}
