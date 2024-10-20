package deob;

@ObfuscatedName("ec")
public class class131 {

    public class131() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("ey.m(J)V")
    public static final void method2828(long arg0) {
        if (arg0 <= 0L) {
            return;
        }
        if (arg0 % 10L == 0L) {
            method1010(arg0 - 1L);
            method1010(1L);
        } else {
            method1010(arg0);
        }
    }

    @ObfuscatedName("az.w(J)V")
    public static final void method1010(long arg0) {
        try {
            Thread.sleep(arg0);
        } catch (InterruptedException var3) {
        }
    }
}
