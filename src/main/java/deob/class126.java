package deob;

@ObfuscatedName("dy")
public class class126 {

    public class126() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("ey.t(J)V")
    public static final void method3086(long arg0) {
        if (arg0 <= 0L) {
            return;
        }
        if (arg0 % 10L == 0L) {
            method1554(arg0 - 1L);
            method1554(1L);
        } else {
            method1554(arg0);
        }
    }

    @ObfuscatedName("bx.l(J)V")
    public static final void method1554(long arg0) {
        try {
            Thread.sleep(arg0);
        } catch (InterruptedException var3) {
        }
    }
}
