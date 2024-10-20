package deob;

@ObfuscatedName("ds")
public abstract class class119 {

    @ObfuscatedName("ds.t")
    public static boolean field2016 = false;

    @ObfuscatedName("x.l(Ljava/lang/Object;ZS)[B")
    public static byte[] method137(Object arg0, boolean arg1) {
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
            return var6.method2353();
        } else {
            throw new IllegalArgumentException();
        }
    }

    @ObfuscatedName("ds.c(B)[B")
    public abstract byte[] method2353();

    @ObfuscatedName("ds.d([BB)V")
    public abstract void method2354(byte[] arg0);
}
