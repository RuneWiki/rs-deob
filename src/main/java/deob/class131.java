package deob;

@ObfuscatedName("ey")
public class class131 {

    public class131() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("ap.a(J)V")
    public static final void method674(long arg0) {
        if (arg0 <= 0L) {
            return;
        }
        if (arg0 % 10L == 0L) {
            method2838(arg0 - 1L);
            method2838(1L);
        } else {
            method2838(arg0);
        }
    }

    @ObfuscatedName("eq.d(J)V")
    public static final void method2838(long arg0) {
        try {
            Thread.sleep(arg0);
        } catch (InterruptedException var3) {
        }
    }
}
