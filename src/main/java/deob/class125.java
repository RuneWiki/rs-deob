package deob;

@ObfuscatedName("dr")
public abstract class class125 {

    @ObfuscatedName("dr.d")
    public static boolean field2022 = false;

    @ObfuscatedName("o.c([BZS)Ljava/lang/Object;")
    public static Object method161(byte[] arg0, boolean arg1) {
        if (arg0 == null) {
            return null;
        }
        if (arg0.length > 136 && !field2022) {
            try {
                class118 var2 = new class118();
                var2.method2306(arg0);
                return var2;
            } catch (Throwable var7) {
                field2022 = true;
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

    @ObfuscatedName("dr.y(B)[B")
    public abstract byte[] method2305();

    @ObfuscatedName("dr.d([BS)V")
    public abstract void method2306(byte[] arg0);
}
