package deob;

@ObfuscatedName("dz")
public abstract class class120 {

    @ObfuscatedName("dz.i")
    public static boolean field1999 = false;

    @ObfuscatedName("d.i([BZB)Ljava/lang/Object;")
    public static Object method39(byte[] arg0, boolean arg1) {
        if (arg0 == null) {
            return null;
        }
        if (arg0.length > 136 && !field1999) {
            try {
                class126 var2 = new class126();
                var2.method2386(arg0);
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

    @ObfuscatedName("p.b(Ljava/lang/Object;ZB)[B")
    public static byte[] method152(Object arg0, boolean arg1) {
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
        } else if (arg0 instanceof class120) {
            class120 var6 = (class120) arg0;
            return var6.method2387();
        } else {
            throw new IllegalArgumentException();
        }
    }

    @ObfuscatedName("dz.l([BI)V")
    public abstract void method2386(byte[] arg0);

    @ObfuscatedName("dz.r(B)[B")
    public abstract byte[] method2387();
}
