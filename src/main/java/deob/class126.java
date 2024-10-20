package deob;

@ObfuscatedName("dh")
public abstract class class126 {

    @ObfuscatedName("dh.x")
    public static boolean field2047 = false;

    @ObfuscatedName("dq.c([BZI)Ljava/lang/Object;")
    public static Object method2294(byte[] arg0, boolean arg1) {
        if (arg0 == null) {
            return null;
        }
        if (arg0.length > 136 && !field2047) {
            try {
                class119 var2 = new class119();
                var2.method2342(arg0);
                return var2;
            } catch (Throwable var7) {
                field2047 = true;
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

    @ObfuscatedName("et.v(Ljava/lang/Object;ZB)[B")
    public static byte[] method2837(Object arg0, boolean arg1) {
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
        } else if (arg0 instanceof class126) {
            class126 var6 = (class126) arg0;
            return var6.method2343();
        } else {
            throw new IllegalArgumentException();
        }
    }

    @ObfuscatedName("dh.w(I)[B")
    public abstract byte[] method2343();

    @ObfuscatedName("dh.x([BI)V")
    public abstract void method2342(byte[] arg0);
}
