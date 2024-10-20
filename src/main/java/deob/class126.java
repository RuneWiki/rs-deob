package deob;

@ObfuscatedName("dy")
public class class126 {

    public class126() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("ab.b(J)V")
    public static final void method874(long arg0) {
        if (arg0 <= 0L) {
            return;
        }
        if (arg0 % 10L == 0L) {
            method48(arg0 - 1L);
            method48(1L);
        } else {
            method48(arg0);
        }
    }

    @ObfuscatedName("q.c(J)V")
    public static final void method48(long arg0) {
        try {
            Thread.sleep(arg0);
        } catch (InterruptedException var3) {
        }
    }
}
