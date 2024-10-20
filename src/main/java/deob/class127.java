package deob;

@ObfuscatedName("dq")
public class class127 {

    public class127() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("dc.l(J)V")
    public static final void method2667(long arg0) {
        if (arg0 <= 0L) {
            return;
        }
        if (arg0 % 10L == 0L) {
            method157(arg0 - 1L);
            method157(1L);
        } else {
            method157(arg0);
        }
    }

    @ObfuscatedName("v.e(J)V")
    public static final void method157(long arg0) {
        try {
            Thread.sleep(arg0);
        } catch (InterruptedException var3) {
        }
    }
}
