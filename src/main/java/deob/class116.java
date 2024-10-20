package deob;

@ObfuscatedName("du")
public class class116 {

    public class116() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("f.g(J)V")
    public static final void method154(long arg0) {
        if (arg0 <= 0L) {
            return;
        }
        if (arg0 % 10L != 0L) {
            try {
                Thread.sleep(arg0);
            } catch (InterruptedException var6) {
            }
            return;
        }
        long var2 = arg0 - 1L;
        try {
            Thread.sleep(var2);
        } catch (InterruptedException var7) {
        }
        method791(1L);
    }

    @ObfuscatedName("ao.j(J)V")
    public static final void method791(long arg0) {
        try {
            Thread.sleep(arg0);
        } catch (InterruptedException var3) {
        }
    }
}
