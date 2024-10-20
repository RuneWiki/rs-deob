package deob;

@ObfuscatedName("dm")
public class class125 {

    public class125() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("ei.v(J)V")
    public static final void method2683(long arg0) {
        if (arg0 <= 0L) {
            return;
        }
        if (arg0 % 10L != 0L) {
            method817(arg0);
            return;
        }
        method817(arg0 - 1L);
        try {
            Thread.sleep(1L);
        } catch (InterruptedException var3) {
        }
    }

    @ObfuscatedName("ai.f(J)V")
    public static final void method817(long arg0) {
        try {
            Thread.sleep(arg0);
        } catch (InterruptedException var3) {
        }
    }
}
