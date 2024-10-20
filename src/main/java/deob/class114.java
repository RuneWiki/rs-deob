package deob;

@ObfuscatedName("dz")
public class class114 {

    public class114() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("h.k(J)V")
    public static final void method500(long arg0) {
        if (arg0 <= 0L) {
            return;
        }
        if (arg0 % 10L == 0L) {
            method589(arg0 - 1L);
            method589(1L);
        } else {
            method589(arg0);
        }
    }

    @ObfuscatedName("aj.b(J)V")
    public static final void method589(long arg0) {
        try {
            Thread.sleep(arg0);
        } catch (InterruptedException var3) {
        }
    }
}
