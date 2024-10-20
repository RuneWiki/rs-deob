package deob;

@ObfuscatedName("ed")
public class class131 {

    public class131() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("dg.x(J)V")
    public static final void method2672(long arg0) {
        if (arg0 <= 0L) {
            return;
        }
        if (arg0 % 10L == 0L) {
            method570(arg0 - 1L);
            method570(1L);
        } else {
            method570(arg0);
        }
    }

    @ObfuscatedName("w.r(J)V")
    public static final void method570(long arg0) {
        try {
            Thread.sleep(arg0);
        } catch (InterruptedException var3) {
        }
    }
}
