package deob;

@ObfuscatedName("dh")
public class class127 {

    public class127() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("ck.f(J)V")
    public static final void method1962(long arg0) {
        if (arg0 <= 0L) {
            return;
        }
        if (arg0 % 10L == 0L) {
            method2304(arg0 - 1L);
            method2304(1L);
        } else {
            method2304(arg0);
        }
    }

    @ObfuscatedName("dg.s(J)V")
    public static final void method2304(long arg0) {
        try {
            Thread.sleep(arg0);
        } catch (InterruptedException var3) {
        }
    }
}
