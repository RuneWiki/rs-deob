package deob;

@ObfuscatedName("ds")
public abstract class class125 {

    @ObfuscatedName("ds.p")
    public static boolean field2017 = false;

    @ObfuscatedName("g.a([BZB)Ljava/lang/Object;")
    public static Object method576(byte[] arg0, boolean arg1) {
        if (arg0 == null) {
            return null;
        }
        if (arg0.length > 136 && !field2017) {
            try {
                class118 var2 = new class118();
                var2.method2336(arg0);
                return var2;
            } catch (Throwable var4) {
                field2017 = true;
            }
        }
        return arg1 ? method2662(arg0) : arg0;
    }

    @ObfuscatedName("ak.e(Ljava/lang/Object;ZB)[B")
    public static byte[] method624(Object arg0, boolean arg1) {
        if (arg0 == null) {
            return null;
        } else if (arg0 instanceof byte[]) {
            byte[] var2 = (byte[]) ((byte[]) arg0);
            return arg1 ? method2662(var2) : var2;
        } else if (arg0 instanceof class125) {
            class125 var3 = (class125) arg0;
            return var3.method2335();
        } else {
            throw new IllegalArgumentException();
        }
    }

    @ObfuscatedName("dh.b([BI)[B")
    public static byte[] method2662(byte[] arg0) {
        int var1 = arg0.length;
        byte[] var2 = new byte[var1];
        System.arraycopy(arg0, 0, var2, 0, var1);
        return var2;
    }

    @ObfuscatedName("ds.d(I)[B")
    public abstract byte[] method2335();

    @ObfuscatedName("ds.p([BI)V")
    public abstract void method2336(byte[] arg0);
}
