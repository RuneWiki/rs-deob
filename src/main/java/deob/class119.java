package deob;

@ObfuscatedName("dd")
public abstract class class119 {

    @ObfuscatedName("dd.p")
    public static boolean field1999 = false;

    @ObfuscatedName("dl.p([BZI)Ljava/lang/Object;")
    public static Object method2249(byte[] arg0, boolean arg1) {
        if (arg0 == null) {
            return null;
        }
        if (arg0.length > 136 && !field1999) {
            try {
                class125 var2 = new class125();
                var2.method2400(arg0);
                return var2;
            } catch (Throwable var4) {
                field1999 = true;
            }
        }
        return arg1 ? method229(arg0) : arg0;
    }

    @ObfuscatedName("q.e(Ljava/lang/Object;ZB)[B")
    public static byte[] method125(Object arg0, boolean arg1) {
        if (arg0 == null) {
            return null;
        } else if (arg0 instanceof byte[]) {
            byte[] var2 = (byte[]) ((byte[]) arg0);
            return arg1 ? method229(var2) : var2;
        } else if (arg0 instanceof class119) {
            class119 var3 = (class119) arg0;
            return var3.method2389();
        } else {
            throw new IllegalArgumentException();
        }
    }

    @ObfuscatedName("d.a([BI)[B")
    public static byte[] method229(byte[] arg0) {
        int var1 = arg0.length;
        byte[] var2 = new byte[var1];
        System.arraycopy(arg0, 0, var2, 0, var1);
        return var2;
    }

    @ObfuscatedName("dd.h(I)[B")
    public abstract byte[] method2389();

    @ObfuscatedName("dd.y([BI)V")
    public abstract void method2400(byte[] arg0);
}
