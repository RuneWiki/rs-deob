package deob;

@ObfuscatedName("db")
public abstract class class119 {

    @ObfuscatedName("db.p")
    public static boolean field1993 = false;

    @ObfuscatedName("bt.p([BZI)Ljava/lang/Object;")
    public static Object method1425(byte[] arg0, boolean arg1) {
        if (arg0 == null) {
            return null;
        }
        if (arg0.length > 136 && !field1993) {
            try {
                class125 var2 = new class125();
                var2.method2403(arg0);
                return var2;
            } catch (Throwable var4) {
                field1993 = true;
            }
        }
        return arg1 ? method2075(arg0) : arg0;
    }

    @ObfuscatedName("dj.l(Ljava/lang/Object;ZB)[B")
    public static byte[] method2243(Object arg0, boolean arg1) {
        if (arg0 == null) {
            return null;
        } else if (arg0 instanceof byte[]) {
            byte[] var2 = (byte[]) ((byte[]) arg0);
            return arg1 ? method2075(var2) : var2;
        } else if (arg0 instanceof class119) {
            class119 var3 = (class119) arg0;
            return var3.method2402();
        } else {
            throw new IllegalArgumentException();
        }
    }

    @ObfuscatedName("cf.d([BI)[B")
    public static byte[] method2075(byte[] arg0) {
        int var1 = arg0.length;
        byte[] var2 = new byte[var1];
        System.arraycopy(arg0, 0, var2, 0, var1);
        return var2;
    }

    @ObfuscatedName("db.x(I)[B")
    public abstract byte[] method2402();

    @ObfuscatedName("db.o([BI)V")
    public abstract void method2403(byte[] arg0);
}
