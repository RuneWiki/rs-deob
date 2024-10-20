package deob;

@ObfuscatedName("dl")
public abstract class class129 {

    @ObfuscatedName("dl.h")
    public static boolean field2085 = false;

    @ObfuscatedName("l.l([BZB)Ljava/lang/Object;")
    public static Object method99(byte[] arg0, boolean arg1) {
        if (arg0 == null) {
            return null;
        }
        if (arg0.length > 136 && !field2085) {
            try {
                class122 var2 = new class122();
                var2.method2383(arg0);
                return var2;
            } catch (Throwable var4) {
                field2085 = true;
            }
        }
        return arg1 ? method720(arg0) : arg0;
    }

    @ObfuscatedName("g.m(Ljava/lang/Object;ZB)[B")
    public static byte[] method52(Object arg0, boolean arg1) {
        if (arg0 == null) {
            return null;
        } else if (arg0 instanceof byte[]) {
            byte[] var2 = (byte[]) ((byte[]) arg0);
            return arg1 ? method720(var2) : var2;
        } else if (arg0 instanceof class129) {
            class129 var3 = (class129) arg0;
            return var3.method2384();
        } else {
            throw new IllegalArgumentException();
        }
    }

    @ObfuscatedName("au.j([BI)[B")
    public static byte[] method720(byte[] arg0) {
        int var1 = arg0.length;
        byte[] var2 = new byte[var1];
        System.arraycopy(arg0, 0, var2, 0, var1);
        return var2;
    }

    @ObfuscatedName("dl.i(B)[B")
    public abstract byte[] method2384();

    @ObfuscatedName("dl.h([BI)V")
    public abstract void method2383(byte[] arg0);
}
