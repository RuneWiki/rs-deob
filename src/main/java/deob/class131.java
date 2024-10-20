package deob;

@ObfuscatedName("eq")
public class class131 {

    public class131() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("gh.i(J)V")
    public static final void method3297(long arg0) {
        if (arg0 <= 0L) {
            return;
        }
        if (arg0 % 10L == 0L) {
            method2111(arg0 - 1L);
            method2111(1L);
        } else {
            method2111(arg0);
        }
    }

    @ObfuscatedName("ce.h(J)V")
    public static final void method2111(long arg0) {
        try {
            Thread.sleep(arg0);
        } catch (InterruptedException var3) {
        }
    }
}
