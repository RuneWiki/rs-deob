package deob;

@ObfuscatedName("dm")
public class class127 {

    public class127() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("aw.i(J)V")
    public static final void method731(long arg0) {
        if (arg0 <= 0L) {
            return;
        }
        if (arg0 % 10L == 0L) {
            method2688(arg0 - 1L);
            method2688(1L);
        } else {
            method2688(arg0);
        }
    }

    @ObfuscatedName("ef.v(J)V")
    public static final void method2688(long arg0) {
        try {
            Thread.sleep(arg0);
        } catch (InterruptedException var3) {
        }
    }
}
