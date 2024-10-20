package deob;

@ObfuscatedName("dg")
public abstract class class112 {

    @ObfuscatedName("dg.o")
    public static boolean field1885 = false;

    @ObfuscatedName("al.r([BZI)Ljava/lang/Object;")
    public static Object method598(byte[] arg0, boolean arg1) {
        if (arg0 == null) {
            return null;
        }
        if (arg0.length > 136 && !field1885) {
            try {
                class106 var2 = new class106();
                var2.method2047(arg0);
                return var2;
            } catch (Throwable var7) {
                field1885 = true;
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

    @ObfuscatedName("at.l(Ljava/lang/Object;ZB)[B")
    public static byte[] method797(Object arg0, boolean arg1) {
        if (arg0 == null) {
            return null;
        } else if (arg0 instanceof byte[]) {
            byte[] var2 = (byte[]) ((byte[]) arg0);
            return arg1 ? method98(var2) : var2;
        } else if (arg0 instanceof class112) {
            class112 var3 = (class112) arg0;
            return var3.method2046();
        } else {
            throw new IllegalArgumentException();
        }
    }

    @ObfuscatedName("x.s([BI)[B")
    public static byte[] method98(byte[] arg0) {
        int var1 = arg0.length;
        byte[] var2 = new byte[var1];
        System.arraycopy(arg0, 0, var2, 0, var1);
        return var2;
    }

    @ObfuscatedName("dg.e(B)[B")
    public abstract byte[] method2046();

    @ObfuscatedName("dg.o([BI)V")
    public abstract void method2047(byte[] arg0);
}
