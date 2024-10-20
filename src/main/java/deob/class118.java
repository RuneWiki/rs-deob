package deob;

@ObfuscatedName("dv")
public class class118 {

    public class118() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("cs.a(J)V")
    public static final void method2072(long arg0) {
        if (arg0 <= 0L) {
            return;
        }
        if (arg0 % 10L == 0L) {
            method1012(arg0 - 1L);
            method1012(1L);
        } else {
            method1012(arg0);
        }
    }

    @ObfuscatedName("ap.v(J)V")
    public static final void method1012(long arg0) {
        try {
            Thread.sleep(arg0);
        } catch (InterruptedException var3) {
        }
    }
}
