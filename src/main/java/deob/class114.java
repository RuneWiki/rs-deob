package deob;

@ObfuscatedName("dp")
public class class114 {

    public class114() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("fp.g(J)V")
    public static final void method2962(long arg0) {
        if (arg0 <= 0L) {
            return;
        }
        if (arg0 % 10L == 0L) {
            method500(arg0 - 1L);
            method500(1L);
        } else {
            method500(arg0);
        }
    }

    @ObfuscatedName("c.v(J)V")
    public static final void method500(long arg0) {
        try {
            Thread.sleep(arg0);
        } catch (InterruptedException var3) {
        }
    }
}
