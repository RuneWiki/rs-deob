package deob;

@ObfuscatedName("dm")
public class class114 {

    public class114() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("v.e(J)V")
    public static final void method134(long arg0) {
        if (arg0 <= 0L) {
            return;
        }
        if (arg0 % 10L == 0L) {
            method78(arg0 - 1L);
            method78(1L);
        } else {
            method78(arg0);
        }
    }

    @ObfuscatedName("s.o(J)V")
    public static final void method78(long arg0) {
        try {
            Thread.sleep(arg0);
        } catch (InterruptedException var3) {
        }
    }
}
