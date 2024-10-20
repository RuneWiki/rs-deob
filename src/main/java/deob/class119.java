package deob;

@ObfuscatedName("ds")
public class class119 {

    public class119() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("dn.n(J)V")
    public static final void method2154(long arg0) {
        if (arg0 <= 0L) {
            return;
        }
        if (arg0 % 10L == 0L) {
            method891(arg0 - 1L);
            method891(1L);
        } else {
            method891(arg0);
        }
    }

    @ObfuscatedName("aa.g(J)V")
    public static final void method891(long arg0) {
        try {
            Thread.sleep(arg0);
        } catch (InterruptedException var3) {
        }
    }
}
