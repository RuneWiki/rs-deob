package deob;

@ObfuscatedName("df")
public abstract class class109 {

    @ObfuscatedName("df.k")
    public static boolean field1839 = false;

    @ObfuscatedName("cm.i([BZI)Ljava/lang/Object;")
    public static Object method1869(byte[] arg0, boolean arg1) {
        if (arg0 == null) {
            return null;
        }
        if (arg0.length > 136 && !field1839) {
            try {
                class103 var2 = new class103();
                var2.method2109(arg0);
                return var2;
            } catch (Throwable var7) {
                field1839 = true;
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

    @ObfuscatedName("ez.f(Ljava/lang/Object;ZI)[B")
    public static byte[] method2867(Object arg0, boolean arg1) {
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
        } else if (arg0 instanceof class109) {
            class109 var6 = (class109) arg0;
            return var6.method2111();
        } else {
            throw new IllegalArgumentException();
        }
    }

    @ObfuscatedName("df.m(B)[B")
    public abstract byte[] method2111();

    @ObfuscatedName("df.k([BI)V")
    public abstract void method2109(byte[] arg0);
}
