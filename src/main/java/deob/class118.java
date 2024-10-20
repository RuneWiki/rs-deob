package deob;

@ObfuscatedName("dx")
public abstract class class118 {

    @ObfuscatedName("dx.v")
    public static boolean field1993 = false;

    @ObfuscatedName("dk.v([BZB)Ljava/lang/Object;")
    public static Object method2402(byte[] arg0, boolean arg1) {
        if (arg0 == null) {
            return null;
        }
        if (arg0.length > 136 && !field1993) {
            try {
                class124 var2 = new class124();
                var2.method2366(arg0);
                return var2;
            } catch (Throwable var4) {
                field1993 = true;
            }
        }
        return arg1 ? method222(arg0) : arg0;
    }

    @ObfuscatedName("l.f(Ljava/lang/Object;ZI)[B")
    public static byte[] method109(Object arg0, boolean arg1) {
        if (arg0 == null) {
            return null;
        } else if (arg0 instanceof byte[]) {
            byte[] var2 = (byte[]) ((byte[]) arg0);
            return arg1 ? method222(var2) : var2;
        } else if (arg0 instanceof class118) {
            class118 var3 = (class118) arg0;
            return var3.method2365();
        } else {
            throw new IllegalArgumentException();
        }
    }

    @ObfuscatedName("w.n([BI)[B")
    public static byte[] method222(byte[] arg0) {
        int var1 = arg0.length;
        byte[] var2 = new byte[var1];
        System.arraycopy(arg0, 0, var2, 0, var1);
        return var2;
    }

    @ObfuscatedName("dx.c(B)[B")
    public abstract byte[] method2365();

    @ObfuscatedName("dx.r([BB)V")
    public abstract void method2366(byte[] arg0);
}
