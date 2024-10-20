package deob;

@ObfuscatedName("dj")
public class class126 {

    public class126() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("ag.c(J)V")
    public static final void method577(long arg0) {
        if (arg0 <= 0L) {
            return;
        }
        if (arg0 % 10L == 0L) {
            method2115(arg0 - 1L);
            method2115(1L);
        } else {
            method2115(arg0);
        }
    }

    @ObfuscatedName("dt.q(J)V")
    public static final void method2115(long arg0) {
        try {
            Thread.sleep(arg0);
        } catch (InterruptedException var3) {
        }
    }
}
