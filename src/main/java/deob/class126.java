package deob;

@ObfuscatedName("dv")
public abstract class class126 {

    @ObfuscatedName("dv.j")
    public static boolean field2052 = false;

    @ObfuscatedName("ea.d([BZI)Ljava/lang/Object;")
    public static Object method2908(byte[] arg0, boolean arg1) {
        if (arg0 == null) {
            return null;
        }
        if (arg0.length > 136 && !field2052) {
            try {
                class119 var2 = new class119();
                var2.method2319(arg0);
                return var2;
            } catch (Throwable var4) {
                field2052 = true;
            }
        }
        return arg1 ? method1937(arg0) : arg0;
    }

    @ObfuscatedName("d.u(Ljava/lang/Object;ZS)[B")
    public static byte[] method40(Object arg0, boolean arg1) {
        if (arg0 == null) {
            return null;
        } else if (arg0 instanceof byte[]) {
            byte[] var2 = (byte[]) ((byte[]) arg0);
            return arg1 ? method1937(var2) : var2;
        } else if (arg0 instanceof class126) {
            class126 var3 = (class126) arg0;
            return var3.method2318();
        } else {
            throw new IllegalArgumentException();
        }
    }

    @ObfuscatedName("cg.o([BB)[B")
    public static byte[] method1937(byte[] arg0) {
        int var1 = arg0.length;
        byte[] var2 = new byte[var1];
        System.arraycopy(arg0, 0, var2, 0, var1);
        return var2;
    }

    @ObfuscatedName("dv.j([BI)V")
    public abstract void method2319(byte[] arg0);

    @ObfuscatedName("dv.s(I)[B")
    public abstract byte[] method2318();
}
