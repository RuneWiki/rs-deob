package deob;

@ObfuscatedName("eb")
public class class131 {

    public class131() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("dd.f(J)V")
    public static final void method2276(long arg0) {
        if (arg0 <= 0L) {
            return;
        }
        if (arg0 % 10L == 0L) {
            method113(arg0 - 1L);
            method113(1L);
        } else {
            method113(arg0);
        }
    }

    @ObfuscatedName("w.e(J)V")
    public static final void method113(long arg0) {
        try {
            Thread.sleep(arg0);
        } catch (InterruptedException var3) {
        }
    }
}
