package deob;

@ObfuscatedName("df")
public class class127 {

    public class127() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("cj.i(J)V")
    public static final void method1642(long arg0) {
        if (arg0 <= 0L) {
            return;
        }
        if (arg0 % 10L == 0L) {
            method2734(arg0 - 1L);
            method2734(1L);
        } else {
            method2734(arg0);
        }
    }

    @ObfuscatedName("eo.b(J)V")
    public static final void method2734(long arg0) {
        try {
            Thread.sleep(arg0);
        } catch (InterruptedException var3) {
        }
    }
}
