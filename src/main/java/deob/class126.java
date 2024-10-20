package deob;

@ObfuscatedName("dy")
public class class126 {

    public class126() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("bp.p(J)V")
    public static final void method1463(long arg0) {
        if (arg0 <= 0L) {
            return;
        }
        if (arg0 % 10L == 0L) {
            method46(arg0 - 1L);
            method46(1L);
        } else {
            method46(arg0);
        }
    }

    @ObfuscatedName("w.l(J)V")
    public static final void method46(long arg0) {
        try {
            Thread.sleep(arg0);
        } catch (InterruptedException var3) {
        }
    }
}
