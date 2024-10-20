package deob;

@ObfuscatedName("dq")
public class class128 {

    public class128() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("y.a(J)V")
    public static final void method56(long arg0) {
        if (arg0 <= 0L) {
            return;
        }
        if (arg0 % 10L == 0L) {
            method3031(arg0 - 1L);
            method3031(1L);
        } else {
            method3031(arg0);
        }
    }

    @ObfuscatedName("es.w(J)V")
    public static final void method3031(long arg0) {
        try {
            Thread.sleep(arg0);
        } catch (InterruptedException var3) {
        }
    }
}
