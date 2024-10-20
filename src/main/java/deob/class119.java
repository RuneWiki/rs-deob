package deob;

@ObfuscatedName("dw")
public class class119 {

    public class119() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("fc.n(J)V")
    public static final void method3147(long arg0) {
        if (arg0 <= 0L) {
            return;
        }
        if (arg0 % 10L == 0L) {
            method533(arg0 - 1L);
            method533(1L);
        } else {
            method533(arg0);
        }
    }

    @ObfuscatedName("o.d(J)V")
    public static final void method533(long arg0) {
        try {
            Thread.sleep(arg0);
        } catch (InterruptedException var3) {
        }
    }
}
