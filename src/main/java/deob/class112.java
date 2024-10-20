package deob;

@ObfuscatedName("dl")
public abstract class class112 {

    @ObfuscatedName("dl.p")
    public static boolean field1877 = false;

    @ObfuscatedName("cm.l([BZI)Ljava/lang/Object;")
    public static Object method1970(byte[] arg0, boolean arg1) {
        if (arg0 == null) {
            return null;
        }
        if (arg0.length > 136 && !field1877) {
            try {
                class106 var2 = new class106();
                var2.method2120(arg0);
                return var2;
            } catch (Throwable var4) {
                field1877 = true;
            }
        }
        return arg1 ? method2389(arg0) : arg0;
    }

    @ObfuscatedName("as.f(Ljava/lang/Object;ZB)[B")
    public static byte[] method578(Object arg0, boolean arg1) {
        if (arg0 == null) {
            return null;
        } else if (arg0 instanceof byte[]) {
            byte[] var2 = (byte[]) ((byte[]) arg0);
            return arg1 ? method2389(var2) : var2;
        } else if (arg0 instanceof class112) {
            class112 var3 = (class112) arg0;
            return var3.method2118();
        } else {
            throw new IllegalArgumentException();
        }
    }

    @ObfuscatedName("dc.c([BI)[B")
    public static byte[] method2389(byte[] arg0) {
        int var1 = arg0.length;
        byte[] var2 = new byte[var1];
        System.arraycopy(arg0, 0, var2, 0, var1);
        return var2;
    }

    @ObfuscatedName("dl.p([BI)V")
    public abstract void method2120(byte[] arg0);

    @ObfuscatedName("dl.e(B)[B")
    public abstract byte[] method2118();
}
