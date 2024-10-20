package deob;

@ObfuscatedName("db")
public abstract class class118 {

    @ObfuscatedName("db.z")
    public static boolean field1971 = false;

    @ObfuscatedName("bn.z([BZI)Ljava/lang/Object;")
    public static Object method1472(byte[] arg0, boolean arg1) {
        if (arg0 == null) {
            return null;
        }
        if (arg0.length > 136 && !field1971) {
            try {
                class124 var2 = new class124();
                var2.method2348(arg0);
                return var2;
            } catch (Throwable var7) {
                field1971 = true;
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

    @ObfuscatedName("fi.h(Ljava/lang/Object;ZI)[B")
    public static byte[] method3141(Object arg0, boolean arg1) {
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
            return var6.method2346();
        } else {
            throw new IllegalArgumentException();
        }
    }

    @ObfuscatedName("db.c(I)[B")
    public abstract byte[] method2346();

    @ObfuscatedName("db.p([BI)V")
    public abstract void method2348(byte[] arg0);
}
