package deob;

@ObfuscatedName("eh")
public class class131 {

    public class131() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("dq.e(J)V")
    public static final void method2735(long arg0) {
        if (arg0 <= 0L) {
            return;
        }
        if (arg0 % 10L == 0L) {
            method2328(arg0 - 1L);
            method2328(1L);
        } else {
            method2328(arg0);
        }
    }

    @ObfuscatedName("dj.l(J)V")
    public static final void method2328(long arg0) {
        try {
            Thread.sleep(arg0);
        } catch (InterruptedException var3) {
        }
    }
}
