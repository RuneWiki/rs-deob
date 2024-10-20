package deob;

@ObfuscatedName("dz")
public abstract class class116 {

    @ObfuscatedName("dz.y")
    public static boolean field1883 = false;

    @ObfuscatedName("client.z([BZB)Ljava/lang/Object;")
    public static Object method405(byte[] arg0, boolean arg1) {
        if (arg0 == null) {
            return null;
        }
        if (arg0.length > 136 && !field1883) {
            try {
                class109 var2 = new class109();
                var2.method2103(arg0);
                return var2;
            } catch (Throwable var4) {
                field1883 = true;
            }
        }
        return arg1 ? method169(arg0) : arg0;
    }

    @ObfuscatedName("aw.o(Ljava/lang/Object;ZB)[B")
    public static byte[] method557(Object arg0, boolean arg1) {
        if (arg0 == null) {
            return null;
        } else if (arg0 instanceof byte[]) {
            byte[] var2 = (byte[]) ((byte[]) arg0);
            return arg1 ? method169(var2) : var2;
        } else if (arg0 instanceof class116) {
            class116 var3 = (class116) arg0;
            return var3.method2104();
        } else {
            throw new IllegalArgumentException();
        }
    }

    @ObfuscatedName("e.k([BI)[B")
    public static byte[] method169(byte[] arg0) {
        int var1 = arg0.length;
        byte[] var2 = new byte[var1];
        System.arraycopy(arg0, 0, var2, 0, var1);
        return var2;
    }

    @ObfuscatedName("dz.p(I)[B")
    public abstract byte[] method2104();

    @ObfuscatedName("dz.y([BI)V")
    public abstract void method2103(byte[] arg0);
}
