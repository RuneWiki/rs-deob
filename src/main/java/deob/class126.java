package deob;

@ObfuscatedName("dz")
public class class126 {

    public class126() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("c.g(J)V")
    public static final void method209(long arg0) {
        if (arg0 <= 0L) {
            return;
        }
        if (arg0 % 10L == 0L) {
            method1491(arg0 - 1L);
            method1491(1L);
        } else {
            method1491(arg0);
        }
    }

    @ObfuscatedName("bo.m(J)V")
    public static final void method1491(long arg0) {
        try {
            Thread.sleep(arg0);
        } catch (InterruptedException var3) {
        }
    }
}
