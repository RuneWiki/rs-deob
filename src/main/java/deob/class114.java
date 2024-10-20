package deob;

@ObfuscatedName("dr")
public class class114 {

    public class114() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("ch.t(J)V")
    public static final void method2031(long arg0) {
        if (arg0 <= 0L) {
            return;
        }
        if (arg0 % 10L == 0L) {
            method68(arg0 - 1L);
            method68(1L);
        } else {
            method68(arg0);
        }
    }

    @ObfuscatedName("n.s(J)V")
    public static final void method68(long arg0) {
        try {
            Thread.sleep(arg0);
        } catch (InterruptedException var3) {
        }
    }
}
