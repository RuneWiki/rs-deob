package deob;

@ObfuscatedName("dk")
public class class127 {

    public class127() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("dn.j(J)V")
    public static final void method2202(long arg0) {
        if (arg0 <= 0L) {
            return;
        }
        if (arg0 % 10L != 0L) {
            try {
                Thread.sleep(arg0);
            } catch (InterruptedException var7) {
            }
            return;
        }
        long var2 = arg0 - 1L;
        try {
            Thread.sleep(var2);
        } catch (InterruptedException var9) {
        }
        try {
            Thread.sleep(1L);
        } catch (InterruptedException var8) {
        }
    }
}
