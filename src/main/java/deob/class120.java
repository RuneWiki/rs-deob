package deob;

@ObfuscatedName("da")
public abstract class class120 {

    @ObfuscatedName("da.e")
    public static boolean field1995 = false;

    @ObfuscatedName("cc.e([BZI)Ljava/lang/Object;")
    public static Object method2131(byte[] arg0, boolean arg1) {
        if (arg0 == null) {
            return null;
        }
        if (arg0.length > 136 && !field1995) {
            try {
                class126 var2 = new class126();
                var2.method2373(arg0);
                return var2;
            } catch (Throwable var4) {
                field1995 = true;
            }
        }
        return arg1 ? method346(arg0) : arg0;
    }

    @ObfuscatedName("dv.i(Ljava/lang/Object;ZB)[B")
    public static byte[] method2327(Object arg0, boolean arg1) {
        if (arg0 == null) {
            return null;
        } else if (arg0 instanceof byte[]) {
            byte[] var2 = (byte[]) ((byte[]) arg0);
            return arg1 ? method346(var2) : var2;
        } else if (arg0 instanceof class120) {
            class120 var3 = (class120) arg0;
            return var3.method2381();
        } else {
            throw new IllegalArgumentException();
        }
    }

    @ObfuscatedName("client.k([BI)[B")
    public static byte[] method346(byte[] arg0) {
        int var1 = arg0.length;
        byte[] var2 = new byte[var1];
        System.arraycopy(arg0, 0, var2, 0, var1);
        return var2;
    }

    @ObfuscatedName("da.j([BI)V")
    public abstract void method2373(byte[] arg0);

    @ObfuscatedName("da.q(B)[B")
    public abstract byte[] method2381();
}
