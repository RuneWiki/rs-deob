package deob;

@ObfuscatedName("du")
public abstract class class119 {

    @ObfuscatedName("du.b")
    public static boolean field1990 = false;

    @ObfuscatedName("bt.b([BZI)Ljava/lang/Object;")
    public static Object method1331(byte[] arg0, boolean arg1) {
        if (arg0 == null) {
            return null;
        }
        if (arg0.length > 136 && !field1990) {
            try {
                class125 var2 = new class125();
                var2.method2348(arg0);
                return var2;
            } catch (Throwable var4) {
                field1990 = true;
            }
        }
        return arg1 ? method1367(arg0) : arg0;
    }

    @ObfuscatedName("ba.e(Ljava/lang/Object;ZI)[B")
    public static byte[] method1346(Object arg0, boolean arg1) {
        if (arg0 == null) {
            return null;
        } else if (arg0 instanceof byte[]) {
            byte[] var2 = (byte[]) ((byte[]) arg0);
            return arg1 ? method1367(var2) : var2;
        } else if (arg0 instanceof class119) {
            class119 var3 = (class119) arg0;
            return var3.method2347();
        } else {
            throw new IllegalArgumentException();
        }
    }

    @ObfuscatedName("bm.g([BI)[B")
    public static byte[] method1367(byte[] arg0) {
        int var1 = arg0.length;
        byte[] var2 = new byte[var1];
        System.arraycopy(arg0, 0, var2, 0, var1);
        return var2;
    }

    @ObfuscatedName("du.o(I)[B")
    public abstract byte[] method2347();

    @ObfuscatedName("du.a([BB)V")
    public abstract void method2348(byte[] arg0);
}
