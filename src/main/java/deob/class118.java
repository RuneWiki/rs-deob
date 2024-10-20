package deob;

@ObfuscatedName("db")
public abstract class class118 {

    @ObfuscatedName("db.c")
    public static boolean field1972 = false;

    @ObfuscatedName("bb.c([BZB)Ljava/lang/Object;")
    public static Object method1297(byte[] arg0, boolean arg1) {
        if (arg0 == null) {
            return null;
        }
        if (arg0.length > 136 && !field1972) {
            try {
                class124 var2 = new class124();
                var2.method2234(arg0);
                return var2;
            } catch (Throwable var7) {
                field1972 = true;
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

    @ObfuscatedName("dn.j(Ljava/lang/Object;ZB)[B")
    public static byte[] method2195(Object arg0, boolean arg1) {
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
            return var6.method2235();
        } else {
            throw new IllegalArgumentException();
        }
    }

    @ObfuscatedName("db.y([BB)V")
    public abstract void method2234(byte[] arg0);

    @ObfuscatedName("db.f(B)[B")
    public abstract byte[] method2235();
}
