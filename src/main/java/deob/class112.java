package deob;

@ObfuscatedName("de")
public abstract class class112 {

    @ObfuscatedName("de.s")
    public static boolean field1873 = false;

    @ObfuscatedName("cf.n([BZB)Ljava/lang/Object;")
    public static Object method1934(byte[] arg0, boolean arg1) {
        if (arg0 == null) {
            return null;
        }
        if (arg0.length > 136 && !field1873) {
            try {
                class106 var2 = new class106();
                var2.method2082(arg0);
                return var2;
            } catch (Throwable var7) {
                field1873 = true;
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

    @ObfuscatedName("dh.v(Ljava/lang/Object;ZI)[B")
    public static byte[] method2374(Object arg0, boolean arg1) {
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
        } else if (arg0 instanceof class112) {
            class112 var6 = (class112) arg0;
            return var6.method2080();
        } else {
            throw new IllegalArgumentException();
        }
    }

    @ObfuscatedName("de.t(B)[B")
    public abstract byte[] method2080();

    @ObfuscatedName("de.s([BI)V")
    public abstract void method2082(byte[] arg0);
}
