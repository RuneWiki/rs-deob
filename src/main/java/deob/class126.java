package deob;

@ObfuscatedName("de")
public class class126 {

    public class126() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("ab.f(J)V")
    public static final void method815(long arg0) {
        if (arg0 <= 0L) {
            return;
        }
        if (arg0 % 10L == 0L) {
            method1415(arg0 - 1L);
            method1415(1L);
        } else {
            method1415(arg0);
        }
    }

    @ObfuscatedName("bz.t(J)V")
    public static final void method1415(long arg0) {
        try {
            Thread.sleep(arg0);
        } catch (InterruptedException var3) {
        }
    }
}
