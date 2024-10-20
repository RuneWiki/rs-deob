package deob;

@ObfuscatedName("dy")
public class class126 {

    public class126() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("x.q(J)V")
    public static final void method210(long arg0) {
        if (arg0 <= 0L) {
            return;
        }
        if (arg0 % 10L == 0L) {
            method2027(arg0 - 1L);
            method2027(1L);
        } else {
            method2027(arg0);
        }
    }

    @ObfuscatedName("cw.c(J)V")
    public static final void method2027(long arg0) {
        try {
            Thread.sleep(arg0);
        } catch (InterruptedException var3) {
        }
    }
}
