package deob;

@ObfuscatedName("dh")
public abstract class class114 {

    @ObfuscatedName("dh.j")
    public static boolean field1867 = false;

    @ObfuscatedName("f.d([BZI)Ljava/lang/Object;")
    public static Object method157(byte[] arg0, boolean arg1) {
        if (arg0 == null) {
            return null;
        }
        if (arg0.length > 136 && !field1867) {
            try {
                class107 var2 = new class107();
                var2.method2061(arg0);
                return var2;
            } catch (Throwable var4) {
                field1867 = true;
            }
        }
        return arg1 ? method557(arg0) : arg0;
    }

    @ObfuscatedName("bf.h(Ljava/lang/Object;ZI)[B")
    public static byte[] method1356(Object arg0, boolean arg1) {
        if (arg0 == null) {
            return null;
        } else if (arg0 instanceof byte[]) {
            byte[] var2 = (byte[]) ((byte[]) arg0);
            return arg1 ? method557(var2) : var2;
        } else if (arg0 instanceof class114) {
            class114 var3 = (class114) arg0;
            return var3.method2060();
        } else {
            throw new IllegalArgumentException();
        }
    }

    @ObfuscatedName("at.y([BI)[B")
    public static byte[] method557(byte[] arg0) {
        int var1 = arg0.length;
        byte[] var2 = new byte[var1];
        System.arraycopy(arg0, 0, var2, 0, var1);
        return var2;
    }

    @ObfuscatedName("dh.j([BB)V")
    public abstract void method2061(byte[] arg0);

    @ObfuscatedName("dh.g(I)[B")
    public abstract byte[] method2060();
}
