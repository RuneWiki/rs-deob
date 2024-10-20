package deob;

@ObfuscatedName("dc")
public abstract class class125 {

    @ObfuscatedName("dc.e")
    public static boolean field2031 = false;

    @ObfuscatedName("c.t([BZI)Ljava/lang/Object;")
    public static Object method181(byte[] arg0, boolean arg1) {
        if (arg0 == null) {
            return null;
        }
        if (arg0.length > 136 && !field2031) {
            try {
                class118 var2 = new class118();
                var2.method2366(arg0);
                return var2;
            } catch (Throwable var7) {
                field2031 = true;
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

    @ObfuscatedName("at.w(Ljava/lang/Object;ZB)[B")
    public static byte[] method1002(Object arg0, boolean arg1) {
        if (arg0 == null) {
            return null;
        } else if (arg0 instanceof byte[]) {
            byte[] var2 = (byte[]) ((byte[]) arg0);
            return arg1 ? method2782(var2) : var2;
        } else if (arg0 instanceof class125) {
            class125 var3 = (class125) arg0;
            return var3.method2365();
        } else {
            throw new IllegalArgumentException();
        }
    }

    @ObfuscatedName("ek.x([BI)[B")
    public static byte[] method2782(byte[] arg0) {
        int var1 = arg0.length;
        byte[] var2 = new byte[var1];
        System.arraycopy(arg0, 0, var2, 0, var1);
        return var2;
    }

    @ObfuscatedName("dc.l(I)[B")
    public abstract byte[] method2365();

    @ObfuscatedName("dc.e([BI)V")
    public abstract void method2366(byte[] arg0);
}
