package deob;

@ObfuscatedName("df")
public abstract class class118 {

    @ObfuscatedName("df.j")
    public static boolean field1984 = false;

    @ObfuscatedName("db.j([BZS)Ljava/lang/Object;")
    public static Object method2250(byte[] arg0, boolean arg1) {
        if (arg0 == null) {
            return null;
        }
        if (arg0.length > 136 && !field1984) {
            try {
                class124 var2 = new class124();
                var2.method2294(arg0);
                return var2;
            } catch (Throwable var7) {
                field1984 = true;
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

    @ObfuscatedName("dy.y(Ljava/lang/Object;ZI)[B")
    public static byte[] method2148(Object arg0, boolean arg1) {
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
        } else if (arg0 instanceof class118) {
            class118 var6 = (class118) arg0;
            return var6.method2287();
        } else {
            throw new IllegalArgumentException();
        }
    }

    @ObfuscatedName("df.x(I)[B")
    public abstract byte[] method2287();

    @ObfuscatedName("df.z([BB)V")
    public abstract void method2294(byte[] arg0);
}
