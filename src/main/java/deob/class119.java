package deob;

@ObfuscatedName("do")
public abstract class class119 {

    @ObfuscatedName("do.g")
    public static boolean field1982 = false;

    @ObfuscatedName("ap.g([BZI)Ljava/lang/Object;")
    public static Object method802(byte[] arg0, boolean arg1) {
        if (arg0 == null) {
            return null;
        }
        if (arg0.length > 136 && !field1982) {
            try {
                class125 var2 = new class125();
                var2.method2401(arg0);
                return var2;
            } catch (Throwable var4) {
                field1982 = true;
            }
        }
        return arg1 ? method1299(arg0) : arg0;
    }

    @ObfuscatedName("ap.h(Ljava/lang/Object;ZB)[B")
    public static byte[] method797(Object arg0, boolean arg1) {
        if (arg0 == null) {
            return null;
        } else if (arg0 instanceof byte[]) {
            byte[] var2 = (byte[]) ((byte[]) arg0);
            return arg1 ? method1299(var2) : var2;
        } else if (arg0 instanceof class119) {
            class119 var3 = (class119) arg0;
            return var3.method2402();
        } else {
            throw new IllegalArgumentException();
        }
    }

    @ObfuscatedName("bg.s([BI)[B")
    public static byte[] method1299(byte[] arg0) {
        int var1 = arg0.length;
        byte[] var2 = new byte[var1];
        System.arraycopy(arg0, 0, var2, 0, var1);
        return var2;
    }

    @ObfuscatedName("do.p([BI)V")
    public abstract void method2401(byte[] arg0);

    @ObfuscatedName("do.o(I)[B")
    public abstract byte[] method2402();
}
