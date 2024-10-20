package deob;

@ObfuscatedName("dv")
public class class126 {

    public class126() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("j.p(J)V")
    public static final void method47(long arg0) {
        if (arg0 <= 0L) {
            return;
        }
        if (arg0 % 10L == 0L) {
            method129(arg0 - 1L);
            method129(1L);
        } else {
            method129(arg0);
        }
    }

    @ObfuscatedName("w.e(J)V")
    public static final void method129(long arg0) {
        try {
            Thread.sleep(arg0);
        } catch (InterruptedException var3) {
        }
    }
}
