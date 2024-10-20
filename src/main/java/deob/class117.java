package deob;

@ObfuscatedName("dk")
public abstract class class117 {

    @ObfuscatedName("dk.d")
    public static boolean field1934 = false;

    @ObfuscatedName("a.a([BZI)Ljava/lang/Object;")
    public static Object method104(byte[] arg0, boolean arg1) {
        if (arg0 == null) {
            return null;
        }
        if (arg0.length > 136 && !field1934) {
            try {
                class110 var2 = new class110();
                var2.method2203(arg0);
                return var2;
            } catch (Throwable var4) {
                field1934 = true;
            }
        }
        return arg1 ? method2716(arg0) : arg0;
    }

    @ObfuscatedName("n.h(Ljava/lang/Object;ZB)[B")
    public static byte[] method1(Object arg0, boolean arg1) {
        if (arg0 == null) {
            return null;
        } else if (arg0 instanceof byte[]) {
            byte[] var2 = (byte[]) ((byte[]) arg0);
            return arg1 ? method2716(var2) : var2;
        } else if (arg0 instanceof class117) {
            class117 var3 = (class117) arg0;
            return var3.method2204();
        } else {
            throw new IllegalArgumentException();
        }
    }

    @ObfuscatedName("eq.l([BB)[B")
    public static byte[] method2716(byte[] arg0) {
        int var1 = arg0.length;
        byte[] var2 = new byte[var1];
        System.arraycopy(arg0, 0, var2, 0, var1);
        return var2;
    }

    @ObfuscatedName("dk.n(B)[B")
    public abstract byte[] method2204();

    @ObfuscatedName("dk.d([BB)V")
    public abstract void method2203(byte[] arg0);
}
