package deob;

@ObfuscatedName("df")
public abstract class class119 {

    @ObfuscatedName("df.q")
    public static boolean field2002 = false;

    @ObfuscatedName("ap.q([BZB)Ljava/lang/Object;")
    public static Object method237(byte[] arg0, boolean arg1) {
        if (arg0 == null) {
            return null;
        }
        if (arg0.length > 136 && !field2002) {
            try {
                class125 var2 = new class125();
                var2.method2331(arg0);
                return var2;
            } catch (Throwable var4) {
                field2002 = true;
            }
        }
        return arg1 ? method783(arg0) : arg0;
    }

    @ObfuscatedName("j.c(Ljava/lang/Object;ZI)[B")
    public static byte[] method213(Object arg0, boolean arg1) {
        if (arg0 == null) {
            return null;
        } else if (arg0 instanceof byte[]) {
            byte[] var2 = (byte[]) ((byte[]) arg0);
            return arg1 ? method783(var2) : var2;
        } else if (arg0 instanceof class119) {
            class119 var3 = (class119) arg0;
            return var3.method2329();
        } else {
            throw new IllegalArgumentException();
        }
    }

    @ObfuscatedName("ai.p([BI)[B")
    public static byte[] method783(byte[] arg0) {
        int var1 = arg0.length;
        byte[] var2 = new byte[var1];
        System.arraycopy(arg0, 0, var2, 0, var1);
        return var2;
    }

    @ObfuscatedName("df.z(I)[B")
    public abstract byte[] method2329();

    @ObfuscatedName("df.m([BI)V")
    public abstract void method2331(byte[] arg0);
}
