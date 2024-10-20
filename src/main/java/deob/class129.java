package deob;

@ObfuscatedName("dj")
public abstract class class129 {

    @ObfuscatedName("dj.z")
    public static boolean field2074 = false;

    @ObfuscatedName("ei.g([BZI)Ljava/lang/Object;")
    public static Object method2718(byte[] arg0, boolean arg1) {
        if (arg0 == null) {
            return null;
        }
        if (arg0.length > 136 && !field2074) {
            try {
                class122 var2 = new class122();
                var2.method2342(arg0);
                return var2;
            } catch (Throwable var7) {
                field2074 = true;
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

    @ObfuscatedName("cp.m(Ljava/lang/Object;ZI)[B")
    public static byte[] method1617(Object arg0, boolean arg1) {
        if (arg0 == null) {
            return null;
        } else if (arg0 instanceof byte[]) {
            byte[] var2 = (byte[]) ((byte[]) arg0);
            if (arg1) {
                int var3 = var2.length;
                byte[] var4 = new byte[var3];
                System.arraycopy(var2, 0, var4, 0, var3);
                return var4;
            } else {
                return var2;
            }
        } else if (arg0 instanceof class129) {
            class129 var6 = (class129) arg0;
            return var6.method2343();
        } else {
            throw new IllegalArgumentException();
        }
    }

    @ObfuscatedName("dj.s(I)[B")
    public abstract byte[] method2343();

    @ObfuscatedName("dj.z([BI)V")
    public abstract void method2342(byte[] arg0);
}
