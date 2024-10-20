package deob;

@ObfuscatedName("do")
public abstract class class125 {

    @ObfuscatedName("do.l")
    public static boolean field1999 = false;

    @ObfuscatedName("cv.p([BZI)Ljava/lang/Object;")
    public static Object method1818(byte[] arg0, boolean arg1) {
        if (arg0 == null) {
            return null;
        }
        if (arg0.length > 136 && !field1999) {
            try {
                class118 var2 = new class118();
                var2.method2357(arg0);
                return var2;
            } catch (Throwable var7) {
                field1999 = true;
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

    @ObfuscatedName("e.a(Ljava/lang/Object;ZB)[B")
    public static byte[] method119(Object arg0, boolean arg1) {
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
        } else if (arg0 instanceof class125) {
            class125 var6 = (class125) arg0;
            return var6.method2356();
        } else {
            throw new IllegalArgumentException();
        }
    }

    @ObfuscatedName("do.m(B)[B")
    public abstract byte[] method2356();

    @ObfuscatedName("do.l([BI)V")
    public abstract void method2357(byte[] arg0);
}
