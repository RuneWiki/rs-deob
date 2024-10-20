package deob;

@ObfuscatedName("dr")
public abstract class class119 {

    @ObfuscatedName("dr.l")
    public static boolean field1978 = false;

    @ObfuscatedName("de.l([BZB)Ljava/lang/Object;")
    public static Object method2204(byte[] arg0, boolean arg1) {
        if (arg0 == null) {
            return null;
        }
        if (arg0.length > 136 && !field1978) {
            try {
                class125 var2 = new class125();
                var2.method2344(arg0);
                return var2;
            } catch (Throwable var7) {
                field1978 = true;
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

    @ObfuscatedName("dp.b(Ljava/lang/Object;ZI)[B")
    public static byte[] method2199(Object arg0, boolean arg1) {
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
        } else if (arg0 instanceof class119) {
            class119 var6 = (class119) arg0;
            return var6.method2343();
        } else {
            throw new IllegalArgumentException();
        }
    }

    @ObfuscatedName("dr.o(B)[B")
    public abstract byte[] method2343();

    @ObfuscatedName("dr.w([BB)V")
    public abstract void method2344(byte[] arg0);
}
