package deob;

@ObfuscatedName("dg")
public class class128 {

    public class128() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("dy.w(J)V")
    public static final void method2158(long arg0) {
        if (arg0 <= 0L) {
            return;
        }
        if (arg0 % 10L == 0L) {
            method1201(arg0 - 1L);
            method1201(1L);
        } else {
            method1201(arg0);
        }
    }

    @ObfuscatedName("bp.x(J)V")
    public static final void method1201(long arg0) {
        try {
            Thread.sleep(arg0);
        } catch (InterruptedException var3) {
        }
    }
}
