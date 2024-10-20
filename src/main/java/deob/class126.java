package deob;

@ObfuscatedName("dh")
public class class126 {

    public class126() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("dz.g(J)V")
    public static final void method2355(long arg0) {
        if (arg0 <= 0L) {
            return;
        }
        if (arg0 % 10L == 0L) {
            method266(arg0 - 1L);
            method266(1L);
        } else {
            method266(arg0);
        }
    }

    @ObfuscatedName("af.h(J)V")
    public static final void method266(long arg0) {
        try {
            Thread.sleep(arg0);
        } catch (InterruptedException var3) {
        }
    }
}
