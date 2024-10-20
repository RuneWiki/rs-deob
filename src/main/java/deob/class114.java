package deob;

@ObfuscatedName("dd")
public class class114 {

    public class114() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("cw.g(J)V")
    public static final void method1935(long arg0) {
        if (arg0 <= 0L) {
            return;
        }
        if (arg0 % 10L == 0L) {
            method139(arg0 - 1L);
            method139(1L);
        } else {
            method139(arg0);
        }
    }

    @ObfuscatedName("l.i(J)V")
    public static final void method139(long arg0) {
        try {
            Thread.sleep(arg0);
        } catch (InterruptedException var3) {
        }
    }
}
