package deob;

@ObfuscatedName("dj")
public class class128 {

    public class128() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("dv.b(J)V")
    public static final void method2289(long arg0) {
        if (arg0 <= 0L) {
            return;
        }
        if (arg0 % 10L == 0L) {
            method899(arg0 - 1L);
            method899(1L);
        } else {
            method899(arg0);
        }
    }

    @ObfuscatedName("av.g(J)V")
    public static final void method899(long arg0) {
        try {
            Thread.sleep(arg0);
        } catch (InterruptedException var3) {
        }
    }
}
