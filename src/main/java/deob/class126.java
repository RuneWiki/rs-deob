package deob;

@ObfuscatedName("df")
public class class126 {

    public class126() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("s.a(J)V")
    public static final void method164(long arg0) {
        if (arg0 <= 0L) {
            return;
        }
        if (arg0 % 10L == 0L) {
            method2063(arg0 - 1L);
            method2063(1L);
        } else {
            method2063(arg0);
        }
    }

    @ObfuscatedName("cr.x(J)V")
    public static final void method2063(long arg0) {
        try {
            Thread.sleep(arg0);
        } catch (InterruptedException var3) {
        }
    }
}
