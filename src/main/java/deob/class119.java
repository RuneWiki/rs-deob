package deob;

@ObfuscatedName("dm")
public abstract class class119 {

    @ObfuscatedName("dm.d")
    public static boolean field1993 = false;

    @ObfuscatedName("t.d([BZB)Ljava/lang/Object;")
    public static Object method40(byte[] arg0, boolean arg1) {
        if (arg0 == null) {
            return null;
        }
        if (arg0.length > 136 && !field1993) {
            try {
                class125 var2 = new class125();
                var2.method2304(arg0);
                return var2;
            } catch (Throwable var7) {
                field1993 = true;
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

    @ObfuscatedName("dm.t([BI)V")
    public abstract void method2304(byte[] arg0);

    @ObfuscatedName("dm.a(B)[B")
    public abstract byte[] method2312();
}
