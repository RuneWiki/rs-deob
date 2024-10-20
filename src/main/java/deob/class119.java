package deob;

@ObfuscatedName("di")
public class class119 {

    public class119() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("ax.b(J)V")
    public static final void method555(long arg0) {
        if (arg0 <= 0L) {
            return;
        }
        if (arg0 % 10L == 0L) {
            method2741(arg0 - 1L);
            method2741(1L);
        } else {
            method2741(arg0);
        }
    }

    @ObfuscatedName("et.e(J)V")
    public static final void method2741(long arg0) {
        try {
            Thread.sleep(arg0);
        } catch (InterruptedException var3) {
        }
    }
}
